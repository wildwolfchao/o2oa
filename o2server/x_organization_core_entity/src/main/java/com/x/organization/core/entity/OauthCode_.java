/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.organization.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.String;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.organization.core.entity.OauthCode.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Thu Dec 27 11:41:00 CST 2018")
public class OauthCode_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<OauthCode,String> clientId;
    public static volatile SingularAttribute<OauthCode,String> id;
    public static volatile SingularAttribute<OauthCode,String> person;
    public static volatile SingularAttribute<OauthCode,String> scope;
}
