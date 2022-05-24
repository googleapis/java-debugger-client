/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/debugger.proto

package com.google.devtools.clouddebugger.v2;

public interface GetBreakpointResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouddebugger.v2.GetBreakpointResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Complete breakpoint state.
   * The fields `id` and `location` are guaranteed to be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
   *
   * @return Whether the breakpoint field is set.
   */
  boolean hasBreakpoint();
  /**
   *
   *
   * <pre>
   * Complete breakpoint state.
   * The fields `id` and `location` are guaranteed to be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
   *
   * @return The breakpoint.
   */
  com.google.devtools.clouddebugger.v2.Breakpoint getBreakpoint();
  /**
   *
   *
   * <pre>
   * Complete breakpoint state.
   * The fields `id` and `location` are guaranteed to be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
   */
  com.google.devtools.clouddebugger.v2.BreakpointOrBuilder getBreakpointOrBuilder();
}