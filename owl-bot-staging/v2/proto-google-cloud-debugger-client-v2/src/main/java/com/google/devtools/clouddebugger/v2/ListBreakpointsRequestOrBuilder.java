// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/debugger.proto

package com.google.devtools.clouddebugger.v2;

public interface ListBreakpointsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouddebugger.v2.ListBreakpointsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. ID of the debuggee whose breakpoints to list.
   * </pre>
   *
   * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The debuggeeId.
   */
  java.lang.String getDebuggeeId();
  /**
   * <pre>
   * Required. ID of the debuggee whose breakpoints to list.
   * </pre>
   *
   * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for debuggeeId.
   */
  com.google.protobuf.ByteString
      getDebuggeeIdBytes();

  /**
   * <pre>
   * When set to `true`, the response includes the list of breakpoints set by
   * any user. Otherwise, it includes only breakpoints set by the caller.
   * </pre>
   *
   * <code>bool include_all_users = 2;</code>
   * @return The includeAllUsers.
   */
  boolean getIncludeAllUsers();

  /**
   * <pre>
   * When set to `true`, the response includes active and inactive
   * breakpoints. Otherwise, it includes only active breakpoints.
   * </pre>
   *
   * <code>bool include_inactive = 3;</code>
   * @return The includeInactive.
   */
  boolean getIncludeInactive();

  /**
   * <pre>
   * When set, the response includes only breakpoints with the specified action.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.ListBreakpointsRequest.BreakpointActionValue action = 4;</code>
   * @return Whether the action field is set.
   */
  boolean hasAction();
  /**
   * <pre>
   * When set, the response includes only breakpoints with the specified action.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.ListBreakpointsRequest.BreakpointActionValue action = 4;</code>
   * @return The action.
   */
  com.google.devtools.clouddebugger.v2.ListBreakpointsRequest.BreakpointActionValue getAction();
  /**
   * <pre>
   * When set, the response includes only breakpoints with the specified action.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.ListBreakpointsRequest.BreakpointActionValue action = 4;</code>
   */
  com.google.devtools.clouddebugger.v2.ListBreakpointsRequest.BreakpointActionValueOrBuilder getActionOrBuilder();

  /**
   * <pre>
   * This field is deprecated. The following fields are always stripped out of
   * the result: `stack_frames`, `evaluated_expressions` and `variable_table`.
   * </pre>
   *
   * <code>bool strip_results = 5 [deprecated = true];</code>
   * @deprecated google.devtools.clouddebugger.v2.ListBreakpointsRequest.strip_results is deprecated.
   *     See google/devtools/clouddebugger/v2/debugger.proto;l=172
   * @return The stripResults.
   */
  @java.lang.Deprecated boolean getStripResults();

  /**
   * <pre>
   * A wait token that, if specified, blocks the call until the breakpoints
   * list has changed, or a server selected timeout has expired.  The value
   * should be set from the last response. The error code
   * `google.rpc.Code.ABORTED` (RPC) is returned on wait timeout, which
   * should be called again with the same `wait_token`.
   * </pre>
   *
   * <code>string wait_token = 6;</code>
   * @return The waitToken.
   */
  java.lang.String getWaitToken();
  /**
   * <pre>
   * A wait token that, if specified, blocks the call until the breakpoints
   * list has changed, or a server selected timeout has expired.  The value
   * should be set from the last response. The error code
   * `google.rpc.Code.ABORTED` (RPC) is returned on wait timeout, which
   * should be called again with the same `wait_token`.
   * </pre>
   *
   * <code>string wait_token = 6;</code>
   * @return The bytes for waitToken.
   */
  com.google.protobuf.ByteString
      getWaitTokenBytes();

  /**
   * <pre>
   * Required. The client version making the call.
   * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
   * </pre>
   *
   * <code>string client_version = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The clientVersion.
   */
  java.lang.String getClientVersion();
  /**
   * <pre>
   * Required. The client version making the call.
   * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
   * </pre>
   *
   * <code>string client_version = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for clientVersion.
   */
  com.google.protobuf.ByteString
      getClientVersionBytes();
}