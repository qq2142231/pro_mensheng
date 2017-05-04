/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/4/28 13:56:17                           */
/*==============================================================*/


drop table if exists chapter;

drop table if exists course;

drop table if exists courseList;

drop table if exists courseNotice;

drop table if exists courseNoticeStudent;

drop table if exists courseType;

drop table if exists exam;

drop table if exists focusList;

drop table if exists formInformation;

drop table if exists homework;

drop table if exists note;

drop table if exists noteComment;

drop table if exists question;

drop table if exists questionType;

drop table if exists section;

drop table if exists student;

drop table if exists teacher;

drop table if exists testPaper;

drop table if exists videoDetail;

drop table if exists workSubmit;

/*==============================================================*/
/* Table: chapter                                               */
/*==============================================================*/
create table chapter
(
   chapterId            int not null,
   courseId             int,
   chapterName          varchar(255),
   briefInfo            varchar(1000),
   primary key (chapterId)
);

/*==============================================================*/
/* Table: course                                                */
/*==============================================================*/
create table course
(
   courseId             int not null,
   teacherId            int,
   ctypeId              int,
   courseName           varchar(255),
   description          varchar(3000),
   courseware           varchar(255),
   picture              varchar(255),
   hour                 char(5),
   stu_num              int,
   ass_criteria         varchar(255),
   courseReference      varchar(255),
   certificate_info     varchar(255),
   intro_video          varchar(255),
   evaluation           int,
   primary key (courseId)
);

/*==============================================================*/
/* Table: courseList                                            */
/*==============================================================*/
create table courseList
(
   stuId                int not null,
   courseId             int not null,
   createtime           datetime,
   studytime            datetime,
   progress             int,
   evaluate             varchar(255),
   eva_content          varchar(255),
   eva_time             datetime,
   primary key (stuId, courseId)
);

/*==============================================================*/
/* Table: courseNotice                                          */
/*==============================================================*/
create table courseNotice
(
   courseId             int,
   noticeId             int not null,
   teacherId            int,
   content              varchar(3000),
   noticeTime           datetime,
   file                 varchar(255),
   primary key (noticeId)
);

/*==============================================================*/
/* Table: courseNoticeStudent                                   */
/*==============================================================*/
create table courseNoticeStudent
(
   noticeId             int not null,
   stuId                int not null,
   primary key (noticeId, stuId)
);

/*==============================================================*/
/* Table: courseType                                            */
/*==============================================================*/
create table courseType
(
   ctypeId              int not null,
   ctypeName            varchar(255),
   isCharge             boolean,
   isLive               boolean,
   isPublic             boolean,
   password             varchar(255),
   primary key (ctypeId)
);

/*==============================================================*/
/* Table: exam                                                  */
/*==============================================================*/
create table exam
(
   examId               int not null,
   stuId                int,
   remarks              varchar(255),
   weight               float,
   examDate             datetime,
   correctRate          float,
   beginTime            datetime,
   endTime              datetime,
   grade                float,
   examType             varchar(10),
   primary key (examId)
);

/*==============================================================*/
/* Table: focusList                                             */
/*==============================================================*/
create table focusList
(
   teacherId            int not null,
   stuId                int not null,
   primary key (teacherId, stuId)
);

/*==============================================================*/
/* Table: formInformation                                       */
/*==============================================================*/
create table formInformation
(
   courseId             int not null,
   stuId                int not null,
   teacherId            int not null,
   content              varchar(1000),
   formTime             datetime,
   identity             varchar(10),
   area                 varchar(10),
   like_num             int,
   primary key (courseId, stuId, teacherId)
);

/*==============================================================*/
/* Table: homework                                              */
/*==============================================================*/
create table homework
(
   homeworkId           int not null,
   teacherId            int,
   chapterId            int,
   sectionId            int,
   homeworkName         varchar(255),
   content              varchar(3000),
   correctAns           varchar(3000),
   releasetime          datetime,
   file                 varchar(255),
   primary key (homeworkId)
);

/*==============================================================*/
/* Table: note                                                  */
/*==============================================================*/
create table note
(
   noteId               int not null,
   stuId                int not null,
   sectionId            int not null,
   content              varchar(1000),
   noteTime             datetime,
   isPublic             bool,
   like_num             int,
   primary key (noteId)
);

/*==============================================================*/
/* Table: noteComment                                           */
/*==============================================================*/
create table noteComment
(
   stuId                int not null,
   teacherId            int not null,
   noteId               int not null,
   content              varchar(255),
   commentTime          datetime,
   like_num             int,
   primary key (stuId, teacherId, noteId)
);

/*==============================================================*/
/* Table: question                                              */
/*==============================================================*/
create table question
(
   questionId           int not null,
   sectionId            int,
   qtypeId              int,
   teacherId            int,
   content              varchar(1000),
   score                float,
   correctAns           varchar(1000),
   primary key (questionId)
);

/*==============================================================*/
/* Table: questionType                                          */
/*==============================================================*/
create table questionType
(
   qtypeId              int not null,
   qtypeName            varchar(255),
   primary key (qtypeId)
);

/*==============================================================*/
/* Table: section                                               */
/*==============================================================*/
create table section
(
   sectionId            int not null,
   chapterId            int,
   sectionName          varchar(255),
   briefInfo            varchar(1000),
   video                varchar(255),
   primary key (sectionId)
);

/*==============================================================*/
/* Table: student                                               */
/*==============================================================*/
create table student
(
   stuId                int not null,
   nickname             varchar(255),
   telephone            varchar(255),
   email                varchar(255),
   picture              varchar(255),
   certified_identity   varchar(255),
   identity             varchar(255),
   realname             varchar(255),
   lastdegree           varchar(255),
   address              varchar(255),
   gender               char(5),
   profession           varchar(255),
   birthday             datetime,
   description          varchar(3000),
   numbering            int,
   money                int,
   isOpen               boolean,
   course_num           int,
   isAssistant          boolean,
   isSquadleader        boolean,
   overall_result       float,
   study_situation      varchar(255),
   hasCertificate       boolean,
   password             varchar(30),
   primary key (stuId)
);

/*==============================================================*/
/* Table: teacher                                               */
/*==============================================================*/
create table teacher
(
   teacherId            int not null,
   teacherName          varchar(255),
   profession           varchar(255),
   description          varchar(3000),
   affi_units           varchar(255),
   job_title            varchar(255),
   photo                varchar(255),
   focus_num            int,
   password             varchar(30),
   primary key (teacherId)
);

/*==============================================================*/
/* Table: testPaper                                             */
/*==============================================================*/
create table testPaper
(
   examId               int not null,
   questionId           int not null,
   primary key (examId, questionId)
);

/*==============================================================*/
/* Table: videoDetail                                           */
/*==============================================================*/
create table videoDetail
(
   sectionId            int not null,
   stuId                int not null,
   last_watch_time      datetime,
   watch_times          int,
   total_time           int,
   last_watch_videotime varchar(12),
   primary key (sectionId, stuId)
);

/*==============================================================*/
/* Table: workSubmit                                            */
/*==============================================================*/
create table workSubmit
(
   homeworkId           int not null,
   stuId                int not null,
   submission           varchar(3000),
   subtime              datetime,
   subfile              varchar(255),
   result               float,
   primary key (homeworkId, stuId)
);

alter table chapter add constraint FK_Reference_16 foreign key (courseId)
      references course (courseId) on delete restrict on update restrict;

alter table course add constraint FK_Reference_35 foreign key (ctypeId)
      references courseType (ctypeId) on delete restrict on update restrict;

alter table course add constraint FK_Reference_9 foreign key (teacherId)
      references teacher (teacherId) on delete restrict on update restrict;

alter table courseList add constraint FK_Reference_4 foreign key (courseId)
      references course (courseId) on delete restrict on update restrict;

alter table courseList add constraint FK_Reference_5 foreign key (stuId)
      references student (stuId) on delete restrict on update restrict;

alter table courseNotice add constraint FK_Reference_3 foreign key (courseId)
      references course (courseId) on delete restrict on update restrict;

alter table courseNotice add constraint FK_Reference_8 foreign key (teacherId)
      references teacher (teacherId) on delete restrict on update restrict;

alter table courseNoticeStudent add constraint FK_Reference_6 foreign key (noticeId)
      references courseNotice (noticeId) on delete restrict on update restrict;

alter table courseNoticeStudent add constraint FK_Reference_7 foreign key (stuId)
      references student (stuId) on delete restrict on update restrict;

alter table exam add constraint FK_Reference_30 foreign key (stuId)
      references student (stuId) on delete restrict on update restrict;

alter table focusList add constraint FK_Reference_10 foreign key (teacherId)
      references teacher (teacherId) on delete restrict on update restrict;

alter table focusList add constraint FK_Reference_11 foreign key (stuId)
      references student (stuId) on delete restrict on update restrict;

alter table formInformation add constraint FK_Reference_22 foreign key (stuId)
      references student (stuId) on delete restrict on update restrict;

alter table formInformation add constraint FK_Reference_23 foreign key (courseId)
      references course (courseId) on delete restrict on update restrict;

alter table formInformation add constraint FK_Reference_24 foreign key (teacherId)
      references teacher (teacherId) on delete restrict on update restrict;

alter table homework add constraint FK_Reference_12 foreign key (teacherId)
      references teacher (teacherId) on delete restrict on update restrict;

alter table homework add constraint FK_Reference_15 foreign key (chapterId)
      references chapter (chapterId) on delete restrict on update restrict;

alter table homework add constraint FK_Reference_18 foreign key (sectionId)
      references section (sectionId) on delete restrict on update restrict;

alter table note add constraint FK_Reference_25 foreign key (sectionId)
      references section (sectionId) on delete restrict on update restrict;

alter table note add constraint FK_Reference_26 foreign key (stuId)
      references student (stuId) on delete restrict on update restrict;

alter table noteComment add constraint FK_Reference_27 foreign key (noteId)
      references note (noteId) on delete restrict on update restrict;

alter table noteComment add constraint FK_Reference_28 foreign key (stuId)
      references student (stuId) on delete restrict on update restrict;

alter table noteComment add constraint FK_Reference_29 foreign key (teacherId)
      references teacher (teacherId) on delete restrict on update restrict;

alter table question add constraint FK_Reference_33 foreign key (sectionId)
      references section (sectionId) on delete restrict on update restrict;

alter table question add constraint FK_Reference_34 foreign key (qtypeId)
      references questionType (qtypeId) on delete restrict on update restrict;

alter table question add constraint FK_Reference_36 foreign key (teacherId)
      references teacher (teacherId) on delete restrict on update restrict;

alter table section add constraint FK_Reference_17 foreign key (chapterId)
      references chapter (chapterId) on delete restrict on update restrict;

alter table testPaper add constraint FK_Reference_31 foreign key (examId)
      references exam (examId) on delete restrict on update restrict;

alter table testPaper add constraint FK_Reference_32 foreign key (questionId)
      references question (questionId) on delete restrict on update restrict;

alter table videoDetail add constraint FK_Reference_19 foreign key (sectionId)
      references section (sectionId) on delete restrict on update restrict;

alter table videoDetail add constraint FK_Reference_20 foreign key (stuId)
      references student (stuId) on delete restrict on update restrict;

alter table workSubmit add constraint FK_Reference_13 foreign key (homeworkId)
      references homework (homeworkId) on delete restrict on update restrict;

alter table workSubmit add constraint FK_Reference_14 foreign key (stuId)
      references student (stuId) on delete restrict on update restrict;

