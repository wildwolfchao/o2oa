/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.query.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import com.x.base.core.entity.dataitem.ItemCategory;
import com.x.base.core.entity.dataitem.ItemPrimitiveType;
import com.x.base.core.entity.dataitem.ItemStringValueType;
import com.x.base.core.entity.dataitem.ItemType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.query.core.entity.Item.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Thu Dec 27 11:39:59 CST 2018")
public class Item_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Item,Boolean> booleanValue;
    public static volatile SingularAttribute<Item,String> bundle;
    public static volatile SingularAttribute<Item,Date> dateTimeValue;
    public static volatile SingularAttribute<Item,Date> dateValue;
    public static volatile SingularAttribute<Item,String> id;
    public static volatile SingularAttribute<Item,ItemCategory> itemCategory;
    public static volatile SingularAttribute<Item,ItemPrimitiveType> itemPrimitiveType;
    public static volatile SingularAttribute<Item,ItemStringValueType> itemStringValueType;
    public static volatile SingularAttribute<Item,ItemType> itemType;
    public static volatile SingularAttribute<Item,Double> numberValue;
    public static volatile SingularAttribute<Item,String> path0;
    public static volatile SingularAttribute<Item,Integer> path0Location;
    public static volatile SingularAttribute<Item,String> path1;
    public static volatile SingularAttribute<Item,Integer> path1Location;
    public static volatile SingularAttribute<Item,String> path2;
    public static volatile SingularAttribute<Item,Integer> path2Location;
    public static volatile SingularAttribute<Item,String> path3;
    public static volatile SingularAttribute<Item,Integer> path3Location;
    public static volatile SingularAttribute<Item,String> path4;
    public static volatile SingularAttribute<Item,Integer> path4Location;
    public static volatile SingularAttribute<Item,String> path5;
    public static volatile SingularAttribute<Item,Integer> path5Location;
    public static volatile SingularAttribute<Item,String> path6;
    public static volatile SingularAttribute<Item,Integer> path6Location;
    public static volatile SingularAttribute<Item,String> path7;
    public static volatile SingularAttribute<Item,Integer> path7Location;
    public static volatile SingularAttribute<Item,String> stringLongValue;
    public static volatile SingularAttribute<Item,String> stringShortValue;
    public static volatile SingularAttribute<Item,Date> timeValue;
}
