/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.report.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.report.core.entity.Report_R_CreateTime.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Thu Dec 27 11:41:25 CST 2018")
public class Report_R_CreateTime_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Report_R_CreateTime,String> id;
    public static volatile SingularAttribute<Report_R_CreateTime,String> lastDayReportId;
    public static volatile SingularAttribute<Report_R_CreateTime,Date> lastDayReportTime;
    public static volatile SingularAttribute<Report_R_CreateTime,String> lastMonthReportId;
    public static volatile SingularAttribute<Report_R_CreateTime,Date> lastMonthReportTime;
    public static volatile SingularAttribute<Report_R_CreateTime,String> lastWeekReportId;
    public static volatile SingularAttribute<Report_R_CreateTime,Date> lastWeekReportTime;
    public static volatile SingularAttribute<Report_R_CreateTime,Date> nextDayReportTime;
    public static volatile SingularAttribute<Report_R_CreateTime,Date> nextMonthReportTime;
    public static volatile SingularAttribute<Report_R_CreateTime,Date> nextWeekReportTime;
}
