package com.arcusys.learn.persistence.liferay.service.persistence;

import com.arcusys.learn.persistence.liferay.model.LFTincanLrsEndpoint;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the l f tincan lrs endpoint service. This utility wraps {@link LFTincanLrsEndpointPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFTincanLrsEndpointPersistence
 * @see LFTincanLrsEndpointPersistenceImpl
 * @generated
 */
public class LFTincanLrsEndpointUtil {
    private static LFTincanLrsEndpointPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(LFTincanLrsEndpoint lfTincanLrsEndpoint) {
        getPersistence().clearCache(lfTincanLrsEndpoint);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<LFTincanLrsEndpoint> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<LFTincanLrsEndpoint> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<LFTincanLrsEndpoint> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static LFTincanLrsEndpoint update(
        LFTincanLrsEndpoint lfTincanLrsEndpoint, boolean merge)
        throws SystemException {
        return getPersistence().update(lfTincanLrsEndpoint, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static LFTincanLrsEndpoint update(
        LFTincanLrsEndpoint lfTincanLrsEndpoint, boolean merge,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence()
                   .update(lfTincanLrsEndpoint, merge, serviceContext);
    }

    /**
    * Caches the l f tincan lrs endpoint in the entity cache if it is enabled.
    *
    * @param lfTincanLrsEndpoint the l f tincan lrs endpoint
    */
    public static void cacheResult(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsEndpoint lfTincanLrsEndpoint) {
        getPersistence().cacheResult(lfTincanLrsEndpoint);
    }

    /**
    * Caches the l f tincan lrs endpoints in the entity cache if it is enabled.
    *
    * @param lfTincanLrsEndpoints the l f tincan lrs endpoints
    */
    public static void cacheResult(
        java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsEndpoint> lfTincanLrsEndpoints) {
        getPersistence().cacheResult(lfTincanLrsEndpoints);
    }

    /**
    * Creates a new l f tincan lrs endpoint with the primary key. Does not add the l f tincan lrs endpoint to the database.
    *
    * @param id the primary key for the new l f tincan lrs endpoint
    * @return the new l f tincan lrs endpoint
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanLrsEndpoint create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the l f tincan lrs endpoint with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f tincan lrs endpoint
    * @return the l f tincan lrs endpoint that was removed
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsEndpointException if a l f tincan lrs endpoint with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanLrsEndpoint remove(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsEndpointException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(id);
    }

    public static com.arcusys.learn.persistence.liferay.model.LFTincanLrsEndpoint updateImpl(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsEndpoint lfTincanLrsEndpoint,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(lfTincanLrsEndpoint, merge);
    }

    /**
    * Returns the l f tincan lrs endpoint with the primary key or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsEndpointException} if it could not be found.
    *
    * @param id the primary key of the l f tincan lrs endpoint
    * @return the l f tincan lrs endpoint
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsEndpointException if a l f tincan lrs endpoint with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanLrsEndpoint findByPrimaryKey(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsEndpointException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the l f tincan lrs endpoint with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the l f tincan lrs endpoint
    * @return the l f tincan lrs endpoint, or <code>null</code> if a l f tincan lrs endpoint with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanLrsEndpoint fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the l f tincan lrs endpoints.
    *
    * @return the l f tincan lrs endpoints
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsEndpoint> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the l f tincan lrs endpoints.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f tincan lrs endpoints
    * @param end the upper bound of the range of l f tincan lrs endpoints (not inclusive)
    * @return the range of l f tincan lrs endpoints
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsEndpoint> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the l f tincan lrs endpoints.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f tincan lrs endpoints
    * @param end the upper bound of the range of l f tincan lrs endpoints (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of l f tincan lrs endpoints
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsEndpoint> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the l f tincan lrs endpoints from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of l f tincan lrs endpoints.
    *
    * @return the number of l f tincan lrs endpoints
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static LFTincanLrsEndpointPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (LFTincanLrsEndpointPersistence) PortletBeanLocatorUtil.locate(com.arcusys.learn.persistence.liferay.service.ClpSerializer.getServletContextName(),
                    LFTincanLrsEndpointPersistence.class.getName());

            ReferenceRegistry.registerReference(LFTincanLrsEndpointUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated
     */
    public void setPersistence(LFTincanLrsEndpointPersistence persistence) {
    }
}
