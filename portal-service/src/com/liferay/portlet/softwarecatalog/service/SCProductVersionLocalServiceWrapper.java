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

package com.liferay.portlet.softwarecatalog.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link SCProductVersionLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       SCProductVersionLocalService
 * @generated
 */
public class SCProductVersionLocalServiceWrapper
	implements SCProductVersionLocalService,
		ServiceWrapper<SCProductVersionLocalService> {
	public SCProductVersionLocalServiceWrapper(
		SCProductVersionLocalService scProductVersionLocalService) {
		_scProductVersionLocalService = scProductVersionLocalService;
	}

	/**
	* Adds the s c product version to the database. Also notifies the appropriate model listeners.
	*
	* @param scProductVersion the s c product version
	* @return the s c product version that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.softwarecatalog.model.SCProductVersion addSCProductVersion(
		com.liferay.portlet.softwarecatalog.model.SCProductVersion scProductVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.addSCProductVersion(scProductVersion);
	}

	/**
	* Creates a new s c product version with the primary key. Does not add the s c product version to the database.
	*
	* @param productVersionId the primary key for the new s c product version
	* @return the new s c product version
	*/
	public com.liferay.portlet.softwarecatalog.model.SCProductVersion createSCProductVersion(
		long productVersionId) {
		return _scProductVersionLocalService.createSCProductVersion(productVersionId);
	}

	/**
	* Deletes the s c product version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param productVersionId the primary key of the s c product version
	* @return the s c product version that was removed
	* @throws PortalException if a s c product version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.softwarecatalog.model.SCProductVersion deleteSCProductVersion(
		long productVersionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.deleteSCProductVersion(productVersionId);
	}

	/**
	* Deletes the s c product version from the database. Also notifies the appropriate model listeners.
	*
	* @param scProductVersion the s c product version
	* @return the s c product version that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.softwarecatalog.model.SCProductVersion deleteSCProductVersion(
		com.liferay.portlet.softwarecatalog.model.SCProductVersion scProductVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.deleteSCProductVersion(scProductVersion);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _scProductVersionLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.softwarecatalog.model.impl.SCProductVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.softwarecatalog.model.impl.SCProductVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.liferay.portlet.softwarecatalog.model.SCProductVersion fetchSCProductVersion(
		long productVersionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.fetchSCProductVersion(productVersionId);
	}

	/**
	* Returns the s c product version with the primary key.
	*
	* @param productVersionId the primary key of the s c product version
	* @return the s c product version
	* @throws PortalException if a s c product version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.softwarecatalog.model.SCProductVersion getSCProductVersion(
		long productVersionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.getSCProductVersion(productVersionId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the s c product versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.softwarecatalog.model.impl.SCProductVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of s c product versions
	* @param end the upper bound of the range of s c product versions (not inclusive)
	* @return the range of s c product versions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portlet.softwarecatalog.model.SCProductVersion> getSCProductVersions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.getSCProductVersions(start, end);
	}

	/**
	* Returns the number of s c product versions.
	*
	* @return the number of s c product versions
	* @throws SystemException if a system exception occurred
	*/
	public int getSCProductVersionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.getSCProductVersionsCount();
	}

	/**
	* Updates the s c product version in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param scProductVersion the s c product version
	* @return the s c product version that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.softwarecatalog.model.SCProductVersion updateSCProductVersion(
		com.liferay.portlet.softwarecatalog.model.SCProductVersion scProductVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.updateSCProductVersion(scProductVersion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _scProductVersionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_scProductVersionLocalService.setBeanIdentifier(beanIdentifier);
	}

	public com.liferay.portlet.softwarecatalog.model.SCProductVersion addProductVersion(
		long userId, long productEntryId, java.lang.String version,
		java.lang.String changeLog, java.lang.String downloadPageURL,
		java.lang.String directDownloadURL, boolean testDirectDownloadURL,
		boolean repoStoreArtifact, long[] frameworkVersionIds,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.addProductVersion(userId,
			productEntryId, version, changeLog, downloadPageURL,
			directDownloadURL, testDirectDownloadURL, repoStoreArtifact,
			frameworkVersionIds, serviceContext);
	}

	public void deleteProductVersion(long productVersionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_scProductVersionLocalService.deleteProductVersion(productVersionId);
	}

	public void deleteProductVersion(
		com.liferay.portlet.softwarecatalog.model.SCProductVersion productVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		_scProductVersionLocalService.deleteProductVersion(productVersion);
	}

	public void deleteProductVersions(long productEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_scProductVersionLocalService.deleteProductVersions(productEntryId);
	}

	public com.liferay.portlet.softwarecatalog.model.SCProductVersion getProductVersion(
		long productVersionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.getProductVersion(productVersionId);
	}

	public com.liferay.portlet.softwarecatalog.model.SCProductVersion getProductVersionByDirectDownloadURL(
		java.lang.String directDownloadURL)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.getProductVersionByDirectDownloadURL(directDownloadURL);
	}

	public java.util.List<com.liferay.portlet.softwarecatalog.model.SCProductVersion> getProductVersions(
		long productEntryId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.getProductVersions(productEntryId,
			start, end);
	}

	public int getProductVersionsCount(long productEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.getProductVersionsCount(productEntryId);
	}

	public com.liferay.portlet.softwarecatalog.model.SCProductVersion updateProductVersion(
		long productVersionId, java.lang.String version,
		java.lang.String changeLog, java.lang.String downloadPageURL,
		java.lang.String directDownloadURL, boolean testDirectDownloadURL,
		boolean repoStoreArtifact, long[] frameworkVersionIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _scProductVersionLocalService.updateProductVersion(productVersionId,
			version, changeLog, downloadPageURL, directDownloadURL,
			testDirectDownloadURL, repoStoreArtifact, frameworkVersionIds);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SCProductVersionLocalService getWrappedSCProductVersionLocalService() {
		return _scProductVersionLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSCProductVersionLocalService(
		SCProductVersionLocalService scProductVersionLocalService) {
		_scProductVersionLocalService = scProductVersionLocalService;
	}

	public SCProductVersionLocalService getWrappedService() {
		return _scProductVersionLocalService;
	}

	public void setWrappedService(
		SCProductVersionLocalService scProductVersionLocalService) {
		_scProductVersionLocalService = scProductVersionLocalService;
	}

	private SCProductVersionLocalService _scProductVersionLocalService;
}