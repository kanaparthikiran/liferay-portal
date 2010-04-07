/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.journal.lar;

import com.liferay.portal.lar.PortletDataContext;
import com.liferay.portlet.journal.model.JournalArticle;

/**
 * <a href="JournalCreationStrategy.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * An interface defining how newly created content should be added to the
 * Journal when imported from a LAR file. A class implementing this interface
 * should be specified in <i>portal.properties</i> under the
 * <b>journal.lar.creation.strategy</b> property.
 * </p>
 *
 * @author Joel Kozikowski
 */
public interface JournalCreationStrategy {

	/**
	 * Constant returned by getAuthorUserId() that
	 * indicates the default portlet data import user id strategy that should be
	 * used to determine the user id.
	 */
	public static final long USE_DEFAULT_USER_ID_STRATEGY = 0;

	/**
	 * Constant returned by getTransformedContent() to indicate that the article
	 * text should remained unchanged.
	 */
	public static final String ARTICLE_CONTENT_UNCHANGED = null;

	/**
	 * Returns the author's user id to assign to newly created content. If zero
	 * is returned, the default user id import strategy will determine the
	 * author id.
	 *
	 * @return the author's user id or USE_DEFAULT_USER_ID_STRATEGY to use the
	 *		   default user id strategy
	 */
	public long getAuthorUserId(PortletDataContext context, Object journalObj)
		throws Exception;

	/**
	 * Gives the content creation strategy an opportunity to transform the
	 * content before the new article is saved to the database. Possible use
	 * cases include using Velocity to merge in community specific values into
	 * the text. Returns the new content to assign to the article. If null is
	 * returned, the article content will be added unchanged.
	 *
	 * @return the transformed content to save in the database or
	 *		   ARTICLE_CONTENT_UNCHANGED if the content should be added
	 *		   unchanged
	 */
	public String getTransformedContent(
			PortletDataContext context, JournalArticle newArticle)
		throws Exception;

	/**
	 * Returns true if the default community permissions should be added when
	 * the specified journalObj is created.
	 *
	 * @return true if default community permissions should be added to the
	 *		   specified journalObj
	 */
	public boolean addCommunityPermissions(
			PortletDataContext context, Object journalObj)
		throws Exception;

	/**
	 * Returns true if the default guest permissions should be added when the
	 * specified journalObj is created.
	 *
	 * @return true if default guest permissions should be added to the
	 *		   specified journalObj
	 */
	public boolean addGuestPermissions(
			PortletDataContext context, Object journalObj)
		throws Exception;

}