// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/controller.proto

package com.google.devtools.clouddebugger.v2;

public interface UpdateActiveBreakpointRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouddebugger.v2.UpdateActiveBreakpointRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Identifies the debuggee being debugged.
   * </pre>
   *
   * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The debuggeeId.
   */
  java.lang.String getDebuggeeId();
  /**
   * <pre>
   * Required. Identifies the debuggee being debugged.
   * </pre>
   *
   * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for debuggeeId.
   */
  com.google.protobuf.ByteString
      getDebuggeeIdBytes();

  /**
   * <pre>
   * Required. Updated breakpoint information.
   * The field `id` must be set.
   * The agent must echo all Breakpoint specification fields in the update.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the breakpoint field is set.
   */
  boolean hasBreakpoint();
  /**
   * <pre>
   * Required. Updated breakpoint information.
   * The field `id` must be set.
   * The agent must echo all Breakpoint specification fields in the update.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The breakpoint.
   */
  com.google.devtools.clouddebugger.v2.Breakpoint getBreakpoint();
  /**
   * <pre>
   * Required. Updated breakpoint information.
   * The field `id` must be set.
   * The agent must echo all Breakpoint specification fields in the update.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.devtools.clouddebugger.v2.BreakpointOrBuilder getBreakpointOrBuilder();
}