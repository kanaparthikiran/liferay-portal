<%--
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ include file="/html/portlet/asset_publisher/init.jsp" %>

<%
if (mergeUrlTags || mergeLayoutTags) {
	String[] compilerTagNames = new String[0];

	if (mergeUrlTags) {
		compilerTagNames = ParamUtil.getParameterValues(request, "tags");
	}

	if (mergeLayoutTags) {
		Set<String> layoutTagNames = AssetUtil.getLayoutTagNames(request);

		if (!layoutTagNames.isEmpty()) {
			compilerTagNames = ArrayUtil.append(compilerTagNames, layoutTagNames.toArray(new String[layoutTagNames.size()]));
		}
	}

	String titleEntry = null;

	if ((compilerTagNames != null) && (compilerTagNames.length > 0)) {
		String[] newAssetTagNames = ArrayUtil.append(allAssetTagNames, compilerTagNames);

		allAssetTagNames = ArrayUtil.distinct(newAssetTagNames, new StringComparator());

		long[] allAssetTagIds = AssetTagLocalServiceUtil.getTagIds(scopeGroupId, allAssetTagNames);

		assetEntryQuery.setAllTagIds(allAssetTagIds);

		titleEntry = compilerTagNames[compilerTagNames.length - 1];
	}

	String portletTitle = HtmlUtil.unescape(portletDisplay.getTitle());

	portletTitle = AssetUtil.substituteTagPropertyVariables(scopeGroupId, titleEntry, portletTitle);

	renderResponse.setTitle(portletTitle);
}
else {
	allAssetTagNames = ArrayUtil.distinct(allAssetTagNames, new StringComparator());
}

for (String curAssetTagName : allAssetTagNames) {
	try {
		AssetTag assetTag = AssetTagLocalServiceUtil.getTag(scopeGroupId, curAssetTagName);

		AssetTagProperty journalTemplateIdProperty = AssetTagPropertyLocalServiceUtil.getTagProperty(assetTag.getTagId(), "journal-template-id");

		String journalTemplateId = journalTemplateIdProperty.getValue();

		request.setAttribute(WebKeys.JOURNAL_TEMPLATE_ID, journalTemplateId);

		break;
	}
	catch (NoSuchTagException nste) {
	}
	catch (NoSuchTagPropertyException nstpe) {
	}
}

if (enableTagBasedNavigation && selectionStyle.equals("manual") && ((assetEntryQuery.getAllCategoryIds().length > 0) || (assetEntryQuery.getAllTagIds().length > 0))) {
	selectionStyle = "dynamic";
}

Group scopeGroup = themeDisplay.getScopeGroup();
%>

<c:if test="<%= (scopeGroup != null) && (!scopeGroup.hasStagingGroup() || scopeGroup.isStagingGroup()) && !portletName.equals(PortletKeys.RELATED_ASSETS) %>">

	<%
	for (long groupId : groupIds) {
	%>

		<div class="lfr-meta-actions add-asset-selector">
			<%@ include file="/html/portlet/asset_publisher/add_asset.jspf" %>
		</div>

	<%
	}
	%>

</c:if>

<%
PortletURL portletURL = renderResponse.createRenderURL();

SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, delta, portletURL, null, null);

if (!paginationType.equals("none")) {
	searchContainer.setDelta(delta);
	searchContainer.setDeltaConfigurable(false);
}
%>

<c:if test="<%= showMetadataDescriptions %>">
	<liferay-ui:categorization-filter
		assetType="content"
		portletURL="<%= portletURL %>"
	/>
</c:if>

<%
long portletDisplayDDMTemplateId = PortletDisplayTemplateUtil.getPortletDisplayTemplateDDMTemplateId(themeDisplay, displayStyle);

Map<String, Object> contextObjects = new HashMap<String, Object>();

contextObjects.put(PortletDisplayTemplateConstants.ASSET_PUBLISHER_HELPER, AssetPublisherHelperUtil.getAssetPublisherHelper());
%>

<c:choose>
	<c:when test='<%= selectionStyle.equals("dynamic") %>'>
		<%@ include file="/html/portlet/asset_publisher/view_dynamic_list.jspf" %>
	</c:when>
	<c:when test='<%= selectionStyle.equals("manual") %>'>
		<%@ include file="/html/portlet/asset_publisher/view_manual.jspf" %>
	</c:when>
</c:choose>

<c:if test='<%= !paginationType.equals("none") && (searchContainer.getTotal() > searchContainer.getResults().size()) %>'>
	<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" type="<%= paginationType %>" />
</c:if>

<c:if test="<%= enableRSS %>">
	<liferay-portlet:resourceURL varImpl="rssURL">
		<portlet:param name="struts_action" value="/asset_publisher/rss" />
	</liferay-portlet:resourceURL>

	<div class="subscribe">
		<liferay-ui:rss resourceURL="<%= rssURL %>" />
	</div>
</c:if>

<%!
private static Log _log = LogFactoryUtil.getLog("portal-web.docroot.html.portlet.asset_publisher.view_jsp");
%>