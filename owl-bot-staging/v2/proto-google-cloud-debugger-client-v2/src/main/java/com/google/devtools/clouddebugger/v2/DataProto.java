// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/data.proto

package com.google.devtools.clouddebugger.v2;

public final class DataProto {
  private DataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_clouddebugger_v2_FormatMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_FormatMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_clouddebugger_v2_StatusMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_StatusMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_clouddebugger_v2_SourceLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_SourceLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_clouddebugger_v2_Variable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_Variable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_clouddebugger_v2_StackFrame_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_StackFrame_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_clouddebugger_v2_Breakpoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_Breakpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_clouddebugger_v2_Breakpoint_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_Breakpoint_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_clouddebugger_v2_Debuggee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_Debuggee_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_clouddebugger_v2_Debuggee_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouddebugger_v2_Debuggee_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/devtools/clouddebugger/v2/data." +
      "proto\022 google.devtools.clouddebugger.v2\032" +
      ".google/devtools/source/v1/source_contex" +
      "t.proto\032\037google/protobuf/timestamp.proto" +
      "\032\036google/protobuf/wrappers.proto\032\034google" +
      "/api/annotations.proto\"3\n\rFormatMessage\022" +
      "\016\n\006format\030\001 \001(\t\022\022\n\nparameters\030\002 \003(\t\"\344\002\n\r" +
      "StatusMessage\022\020\n\010is_error\030\001 \001(\010\022L\n\trefer" +
      "s_to\030\002 \001(\01629.google.devtools.clouddebugg" +
      "er.v2.StatusMessage.Reference\022D\n\013descrip" +
      "tion\030\003 \001(\0132/.google.devtools.clouddebugg" +
      "er.v2.FormatMessage\"\254\001\n\tReference\022\017\n\013UNS" +
      "PECIFIED\020\000\022\036\n\032BREAKPOINT_SOURCE_LOCATION" +
      "\020\003\022\030\n\024BREAKPOINT_CONDITION\020\004\022\031\n\025BREAKPOI" +
      "NT_EXPRESSION\020\007\022\022\n\016BREAKPOINT_AGE\020\010\022\021\n\rV" +
      "ARIABLE_NAME\020\005\022\022\n\016VARIABLE_VALUE\020\006\"<\n\016So" +
      "urceLocation\022\014\n\004path\030\001 \001(\t\022\014\n\004line\030\002 \001(\005" +
      "\022\016\n\006column\030\003 \001(\005\"\351\001\n\010Variable\022\014\n\004name\030\001 " +
      "\001(\t\022\r\n\005value\030\002 \001(\t\022\014\n\004type\030\006 \001(\t\022;\n\007memb" +
      "ers\030\003 \003(\0132*.google.devtools.clouddebugge" +
      "r.v2.Variable\0224\n\017var_table_index\030\004 \001(\0132\033" +
      ".google.protobuf.Int32Value\022?\n\006status\030\005 " +
      "\001(\0132/.google.devtools.clouddebugger.v2.S" +
      "tatusMessage\"\335\001\n\nStackFrame\022\020\n\010function\030" +
      "\001 \001(\t\022B\n\010location\030\002 \001(\01320.google.devtool" +
      "s.clouddebugger.v2.SourceLocation\022=\n\targ" +
      "uments\030\003 \003(\0132*.google.devtools.clouddebu" +
      "gger.v2.Variable\022:\n\006locals\030\004 \003(\0132*.googl" +
      "e.devtools.clouddebugger.v2.Variable\"\227\007\n" +
      "\nBreakpoint\022\n\n\002id\030\001 \001(\t\022C\n\006action\030\r \001(\0162" +
      "3.google.devtools.clouddebugger.v2.Break" +
      "point.Action\022B\n\010location\030\002 \001(\01320.google." +
      "devtools.clouddebugger.v2.SourceLocation" +
      "\022\021\n\tcondition\030\003 \001(\t\022\023\n\013expressions\030\004 \003(\t" +
      "\022\032\n\022log_message_format\030\016 \001(\t\022H\n\tlog_leve" +
      "l\030\017 \001(\01625.google.devtools.clouddebugger." +
      "v2.Breakpoint.LogLevel\022\026\n\016is_final_state" +
      "\030\005 \001(\010\022/\n\013create_time\030\013 \001(\0132\032.google.pro" +
      "tobuf.Timestamp\022.\n\nfinal_time\030\014 \001(\0132\032.go" +
      "ogle.protobuf.Timestamp\022\022\n\nuser_email\030\020 " +
      "\001(\t\022?\n\006status\030\n \001(\0132/.google.devtools.cl" +
      "ouddebugger.v2.StatusMessage\022B\n\014stack_fr" +
      "ames\030\007 \003(\0132,.google.devtools.clouddebugg" +
      "er.v2.StackFrame\022I\n\025evaluated_expression" +
      "s\030\010 \003(\0132*.google.devtools.clouddebugger." +
      "v2.Variable\022B\n\016variable_table\030\t \003(\0132*.go" +
      "ogle.devtools.clouddebugger.v2.Variable\022" +
      "H\n\006labels\030\021 \003(\01328.google.devtools.cloudd" +
      "ebugger.v2.Breakpoint.LabelsEntry\032-\n\013Lab" +
      "elsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001" +
      "\"\036\n\006Action\022\013\n\007CAPTURE\020\000\022\007\n\003LOG\020\001\",\n\010LogL" +
      "evel\022\010\n\004INFO\020\000\022\013\n\007WARNING\020\001\022\t\n\005ERROR\020\002\"\337" +
      "\003\n\010Debuggee\022\n\n\002id\030\001 \001(\t\022\017\n\007project\030\002 \001(\t" +
      "\022\022\n\nuniquifier\030\003 \001(\t\022\023\n\013description\030\004 \001(" +
      "\t\022\023\n\013is_inactive\030\005 \001(\010\022\025\n\ragent_version\030" +
      "\006 \001(\t\022\023\n\013is_disabled\030\007 \001(\010\022?\n\006status\030\010 \001" +
      "(\0132/.google.devtools.clouddebugger.v2.St" +
      "atusMessage\022A\n\017source_contexts\030\t \003(\0132(.g" +
      "oogle.devtools.source.v1.SourceContext\022Q" +
      "\n\023ext_source_contexts\030\r \003(\01320.google.dev" +
      "tools.source.v1.ExtendedSourceContextB\002\030" +
      "\001\022F\n\006labels\030\013 \003(\01326.google.devtools.clou" +
      "ddebugger.v2.Debuggee.LabelsEntry\032-\n\013Lab" +
      "elsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001" +
      "B\331\001\n$com.google.devtools.clouddebugger.v" +
      "2B\tDataProtoP\001ZMgoogle.golang.org/genpro" +
      "to/googleapis/devtools/clouddebugger/v2;" +
      "clouddebugger\370\001\001\252\002\030Google.Cloud.Debugger" +
      ".V2\312\002\030Google\\Cloud\\Debugger\\V2\352\002\033Google:" +
      ":Cloud::Debugger::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.devtools.source.v1.SourceContextProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_devtools_clouddebugger_v2_FormatMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_clouddebugger_v2_FormatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_clouddebugger_v2_FormatMessage_descriptor,
        new java.lang.String[] { "Format", "Parameters", });
    internal_static_google_devtools_clouddebugger_v2_StatusMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_clouddebugger_v2_StatusMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_clouddebugger_v2_StatusMessage_descriptor,
        new java.lang.String[] { "IsError", "RefersTo", "Description", });
    internal_static_google_devtools_clouddebugger_v2_SourceLocation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_clouddebugger_v2_SourceLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_clouddebugger_v2_SourceLocation_descriptor,
        new java.lang.String[] { "Path", "Line", "Column", });
    internal_static_google_devtools_clouddebugger_v2_Variable_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_clouddebugger_v2_Variable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_clouddebugger_v2_Variable_descriptor,
        new java.lang.String[] { "Name", "Value", "Type", "Members", "VarTableIndex", "Status", });
    internal_static_google_devtools_clouddebugger_v2_StackFrame_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_clouddebugger_v2_StackFrame_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_clouddebugger_v2_StackFrame_descriptor,
        new java.lang.String[] { "Function", "Location", "Arguments", "Locals", });
    internal_static_google_devtools_clouddebugger_v2_Breakpoint_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_devtools_clouddebugger_v2_Breakpoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_clouddebugger_v2_Breakpoint_descriptor,
        new java.lang.String[] { "Id", "Action", "Location", "Condition", "Expressions", "LogMessageFormat", "LogLevel", "IsFinalState", "CreateTime", "FinalTime", "UserEmail", "Status", "StackFrames", "EvaluatedExpressions", "VariableTable", "Labels", });
    internal_static_google_devtools_clouddebugger_v2_Breakpoint_LabelsEntry_descriptor =
      internal_static_google_devtools_clouddebugger_v2_Breakpoint_descriptor.getNestedTypes().get(0);
    internal_static_google_devtools_clouddebugger_v2_Breakpoint_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_clouddebugger_v2_Breakpoint_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_devtools_clouddebugger_v2_Debuggee_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_devtools_clouddebugger_v2_Debuggee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_clouddebugger_v2_Debuggee_descriptor,
        new java.lang.String[] { "Id", "Project", "Uniquifier", "Description", "IsInactive", "AgentVersion", "IsDisabled", "Status", "SourceContexts", "ExtSourceContexts", "Labels", });
    internal_static_google_devtools_clouddebugger_v2_Debuggee_LabelsEntry_descriptor =
      internal_static_google_devtools_clouddebugger_v2_Debuggee_descriptor.getNestedTypes().get(0);
    internal_static_google_devtools_clouddebugger_v2_Debuggee_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_clouddebugger_v2_Debuggee_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.devtools.source.v1.SourceContextProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
