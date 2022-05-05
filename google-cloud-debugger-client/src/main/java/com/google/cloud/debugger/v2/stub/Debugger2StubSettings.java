/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.debugger.v2.stub;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest;
import com.google.devtools.clouddebugger.v2.GetBreakpointRequest;
import com.google.devtools.clouddebugger.v2.GetBreakpointResponse;
import com.google.devtools.clouddebugger.v2.ListBreakpointsRequest;
import com.google.devtools.clouddebugger.v2.ListBreakpointsResponse;
import com.google.devtools.clouddebugger.v2.ListDebuggeesRequest;
import com.google.devtools.clouddebugger.v2.ListDebuggeesResponse;
import com.google.devtools.clouddebugger.v2.SetBreakpointRequest;
import com.google.devtools.clouddebugger.v2.SetBreakpointResponse;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link Debugger2Stub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (clouddebugger.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of setBreakpoint to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * Debugger2StubSettings.Builder debugger2SettingsBuilder = Debugger2StubSettings.newBuilder();
 * debugger2SettingsBuilder
 *     .setBreakpointSettings()
 *     .setRetrySettings(
 *         debugger2SettingsBuilder
 *             .setBreakpointSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * Debugger2StubSettings debugger2Settings = debugger2SettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class Debugger2StubSettings extends StubSettings<Debugger2StubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/cloud_debugger")
          .build();

  private final UnaryCallSettings<SetBreakpointRequest, SetBreakpointResponse>
      setBreakpointSettings;
  private final UnaryCallSettings<GetBreakpointRequest, GetBreakpointResponse>
      getBreakpointSettings;
  private final UnaryCallSettings<DeleteBreakpointRequest, Empty> deleteBreakpointSettings;
  private final UnaryCallSettings<ListBreakpointsRequest, ListBreakpointsResponse>
      listBreakpointsSettings;
  private final UnaryCallSettings<ListDebuggeesRequest, ListDebuggeesResponse>
      listDebuggeesSettings;

  /** Returns the object with the settings used for calls to setBreakpoint. */
  public UnaryCallSettings<SetBreakpointRequest, SetBreakpointResponse> setBreakpointSettings() {
    return setBreakpointSettings;
  }

  /** Returns the object with the settings used for calls to getBreakpoint. */
  public UnaryCallSettings<GetBreakpointRequest, GetBreakpointResponse> getBreakpointSettings() {
    return getBreakpointSettings;
  }

  /** Returns the object with the settings used for calls to deleteBreakpoint. */
  public UnaryCallSettings<DeleteBreakpointRequest, Empty> deleteBreakpointSettings() {
    return deleteBreakpointSettings;
  }

  /** Returns the object with the settings used for calls to listBreakpoints. */
  public UnaryCallSettings<ListBreakpointsRequest, ListBreakpointsResponse>
      listBreakpointsSettings() {
    return listBreakpointsSettings;
  }

  /** Returns the object with the settings used for calls to listDebuggees. */
  public UnaryCallSettings<ListDebuggeesRequest, ListDebuggeesResponse> listDebuggeesSettings() {
    return listDebuggeesSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public Debugger2Stub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcDebugger2Stub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "clouddebugger.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "clouddebugger.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(Debugger2StubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected Debugger2StubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    setBreakpointSettings = settingsBuilder.setBreakpointSettings().build();
    getBreakpointSettings = settingsBuilder.getBreakpointSettings().build();
    deleteBreakpointSettings = settingsBuilder.deleteBreakpointSettings().build();
    listBreakpointsSettings = settingsBuilder.listBreakpointsSettings().build();
    listDebuggeesSettings = settingsBuilder.listDebuggeesSettings().build();
  }

  /** Builder for Debugger2StubSettings. */
  public static class Builder extends StubSettings.Builder<Debugger2StubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<SetBreakpointRequest, SetBreakpointResponse>
        setBreakpointSettings;
    private final UnaryCallSettings.Builder<GetBreakpointRequest, GetBreakpointResponse>
        getBreakpointSettings;
    private final UnaryCallSettings.Builder<DeleteBreakpointRequest, Empty>
        deleteBreakpointSettings;
    private final UnaryCallSettings.Builder<ListBreakpointsRequest, ListBreakpointsResponse>
        listBreakpointsSettings;
    private final UnaryCallSettings.Builder<ListDebuggeesRequest, ListDebuggeesResponse>
        listDebuggeesSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_0_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "retry_policy_1_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.UNAVAILABLE, StatusCode.Code.DEADLINE_EXCEEDED)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(600000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(600000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("no_retry_0_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(600000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(600000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("retry_policy_1_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      setBreakpointSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getBreakpointSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteBreakpointSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listBreakpointsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listDebuggeesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              setBreakpointSettings,
              getBreakpointSettings,
              deleteBreakpointSettings,
              listBreakpointsSettings,
              listDebuggeesSettings);
      initDefaults(this);
    }

    protected Builder(Debugger2StubSettings settings) {
      super(settings);

      setBreakpointSettings = settings.setBreakpointSettings.toBuilder();
      getBreakpointSettings = settings.getBreakpointSettings.toBuilder();
      deleteBreakpointSettings = settings.deleteBreakpointSettings.toBuilder();
      listBreakpointsSettings = settings.listBreakpointsSettings.toBuilder();
      listDebuggeesSettings = settings.listDebuggeesSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              setBreakpointSettings,
              getBreakpointSettings,
              deleteBreakpointSettings,
              listBreakpointsSettings,
              listDebuggeesSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .setBreakpointSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .getBreakpointSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .deleteBreakpointSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .listBreakpointsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .listDebuggeesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to setBreakpoint. */
    public UnaryCallSettings.Builder<SetBreakpointRequest, SetBreakpointResponse>
        setBreakpointSettings() {
      return setBreakpointSettings;
    }

    /** Returns the builder for the settings used for calls to getBreakpoint. */
    public UnaryCallSettings.Builder<GetBreakpointRequest, GetBreakpointResponse>
        getBreakpointSettings() {
      return getBreakpointSettings;
    }

    /** Returns the builder for the settings used for calls to deleteBreakpoint. */
    public UnaryCallSettings.Builder<DeleteBreakpointRequest, Empty> deleteBreakpointSettings() {
      return deleteBreakpointSettings;
    }

    /** Returns the builder for the settings used for calls to listBreakpoints. */
    public UnaryCallSettings.Builder<ListBreakpointsRequest, ListBreakpointsResponse>
        listBreakpointsSettings() {
      return listBreakpointsSettings;
    }

    /** Returns the builder for the settings used for calls to listDebuggees. */
    public UnaryCallSettings.Builder<ListDebuggeesRequest, ListDebuggeesResponse>
        listDebuggeesSettings() {
      return listDebuggeesSettings;
    }

    @Override
    public Debugger2StubSettings build() throws IOException {
      return new Debugger2StubSettings(this);
    }
  }
}
