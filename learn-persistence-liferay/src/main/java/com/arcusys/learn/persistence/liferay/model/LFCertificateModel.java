package com.arcusys.learn.persistence.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
* The base model interface for the LFCertificate service. Represents a row in the &quot;Learn_LFCertificate&quot; database table, with each column mapped to a property of this class.
*
* <p>
    * This interface and its corresponding implementation {@link com.arcusys.learn.persistence.liferay.model.impl.LFCertificateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arcusys.learn.persistence.liferay.model.impl.LFCertificateImpl}.
    * </p>
*
* @author Brian Wing Shun Chan
* @see LFCertificate
* @see com.arcusys.learn.persistence.liferay.model.impl.LFCertificateImpl
* @see com.arcusys.learn.persistence.liferay.model.impl.LFCertificateModelImpl
* @generated
*/
public interface LFCertificateModel extends BaseModel<LFCertificate> {
    /*
    * NOTE FOR DEVELOPERS:
    *
    * Never modify or reference this interface directly. All methods that expect a l f certificate model instance should use the {@link LFCertificate} interface instead.
    */

    /**
    * Returns the primary key of this l f certificate.
    *
    * @return the primary key of this l f certificate
    */
    public long getPrimaryKey();

    /**
    * Sets the primary key of this l f certificate.
    *
    * @param primaryKey the primary key of this l f certificate
    */
    public void setPrimaryKey(long primaryKey);

    /**
    * Returns the ID of this l f certificate.
    *
    * @return the ID of this l f certificate
    */
    public long getId();

    /**
        * Sets the ID of this l f certificate.
    *
    * @param id the ID of this l f certificate
    */
    public void setId(long id);

    /**
    * Returns the title of this l f certificate.
    *
    * @return the title of this l f certificate
    */
    @AutoEscape
    public String getTitle();

    /**
        * Sets the title of this l f certificate.
    *
    * @param title the title of this l f certificate
    */
    public void setTitle(String title);

    /**
    * Returns the description of this l f certificate.
    *
    * @return the description of this l f certificate
    */
    @AutoEscape
    public String getDescription();

    /**
        * Sets the description of this l f certificate.
    *
    * @param description the description of this l f certificate
    */
    public void setDescription(String description);

    /**
    * Returns the logo of this l f certificate.
    *
    * @return the logo of this l f certificate
    */
    @AutoEscape
    public String getLogo();

    /**
        * Sets the logo of this l f certificate.
    *
    * @param logo the logo of this l f certificate
    */
    public void setLogo(String logo);

    /**
    * Returns the is permanent of this l f certificate.
    *
    * @return the is permanent of this l f certificate
    */
    public Boolean getIsPermanent();

    /**
        * Sets the is permanent of this l f certificate.
    *
    * @param isPermanent the is permanent of this l f certificate
    */
    public void setIsPermanent(Boolean isPermanent);

    /**
    * Returns the publish badge of this l f certificate.
    *
    * @return the publish badge of this l f certificate
    */
    public Boolean getPublishBadge();

    /**
        * Sets the publish badge of this l f certificate.
    *
    * @param publishBadge the publish badge of this l f certificate
    */
    public void setPublishBadge(Boolean publishBadge);

    /**
    * Returns the short description of this l f certificate.
    *
    * @return the short description of this l f certificate
    */
    @AutoEscape
    public String getShortDescription();

    /**
        * Sets the short description of this l f certificate.
    *
    * @param shortDescription the short description of this l f certificate
    */
    public void setShortDescription(String shortDescription);

    public boolean isNew();

    public void setNew(boolean n);

    public boolean isCachedModel();

    public void setCachedModel(boolean cachedModel);

    public boolean isEscapedModel();

    public Serializable getPrimaryKeyObj();

    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    public ExpandoBridge getExpandoBridge();

    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    public Object clone();

    public int compareTo(LFCertificate lfCertificate);

    public int hashCode();

    public CacheModel<LFCertificate> toCacheModel();

    public LFCertificate toEscapedModel();

    public String toString();

    public String toXmlString();
}
