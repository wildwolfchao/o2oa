/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.String;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.processplatform.core.entity.element.End.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Thu Dec 27 11:41:12 CST 2018")
public class End_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<End,String> afterArriveScript;
    public static volatile SingularAttribute<End,String> afterArriveScriptText;
    public static volatile SingularAttribute<End,String> afterExecuteScript;
    public static volatile SingularAttribute<End,String> afterExecuteScriptText;
    public static volatile SingularAttribute<End,String> afterInquireScript;
    public static volatile SingularAttribute<End,String> afterInquireScriptText;
    public static volatile SingularAttribute<End,String> alias;
    public static volatile SingularAttribute<End,Boolean> allowReroute;
    public static volatile SingularAttribute<End,Boolean> allowRerouteTo;
    public static volatile SingularAttribute<End,String> beforeArriveScript;
    public static volatile SingularAttribute<End,String> beforeArriveScriptText;
    public static volatile SingularAttribute<End,String> beforeExecuteScript;
    public static volatile SingularAttribute<End,String> beforeExecuteScriptText;
    public static volatile SingularAttribute<End,String> beforeInquireScript;
    public static volatile SingularAttribute<End,String> beforeInquireScriptText;
    public static volatile SingularAttribute<End,String> description;
    public static volatile SingularAttribute<End,String> extension;
    public static volatile SingularAttribute<End,String> form;
    public static volatile SingularAttribute<End,String> id;
    public static volatile SingularAttribute<End,String> name;
    public static volatile SingularAttribute<End,String> position;
    public static volatile SingularAttribute<End,String> process;
    public static volatile ListAttribute<End,String> readDataPathList;
    public static volatile SingularAttribute<End,String> readDuty;
    public static volatile ListAttribute<End,String> readGroupList;
    public static volatile ListAttribute<End,String> readIdentityList;
    public static volatile SingularAttribute<End,String> readScript;
    public static volatile SingularAttribute<End,String> readScriptText;
    public static volatile ListAttribute<End,String> readUnitList;
    public static volatile ListAttribute<End,String> reviewDataPathList;
    public static volatile SingularAttribute<End,String> reviewDuty;
    public static volatile ListAttribute<End,String> reviewGroupList;
    public static volatile ListAttribute<End,String> reviewIdentityList;
    public static volatile SingularAttribute<End,String> reviewScript;
    public static volatile SingularAttribute<End,String> reviewScriptText;
    public static volatile ListAttribute<End,String> reviewUnitList;
}
