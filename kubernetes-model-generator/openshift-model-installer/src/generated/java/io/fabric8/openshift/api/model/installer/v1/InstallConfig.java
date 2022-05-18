
package io.fabric8.openshift.api.model.installer.v1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "additionalTrustBundle",
    "baseDomain",
    "bootstrapInPlace",
    "compute",
    "controlPlane",
    "credentialsMode",
    "fips",
    "imageContentSources",
    "networking",
    "platform",
    "proxy",
    "publish",
    "pullSecret",
    "sshKey"
})
@ToString
@EqualsAndHashCode
@Setter
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
@Version("v1")
@Group("install.openshift.io")
public class InstallConfig implements HasMetadata, Namespaced
{

    @JsonProperty("additionalTrustBundle")
    private String additionalTrustBundle;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("apiVersion")
    private String apiVersion = "install.openshift.io/v1";
    @JsonProperty("baseDomain")
    private String baseDomain;
    @JsonProperty("bootstrapInPlace")
    private BootstrapInPlace bootstrapInPlace;
    @JsonProperty("compute")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<MachinePool> compute = new ArrayList<MachinePool>();
    @JsonProperty("controlPlane")
    private MachinePool controlPlane;
    @JsonProperty("credentialsMode")
    private String credentialsMode;
    @JsonProperty("fips")
    private Boolean fips;
    @JsonProperty("imageContentSources")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<ImageContentSource> imageContentSources = new ArrayList<ImageContentSource>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kind")
    private String kind = "InstallConfig";
    @JsonProperty("metadata")
    @JsonInclude(value = JsonInclude.Include.CUSTOM, valueFilter = io.fabric8.kubernetes.api.model.ObjectMeta.class)
    private io.fabric8.kubernetes.api.model.ObjectMeta metadata = new io.fabric8.kubernetes.api.model.ObjectMeta();
    @JsonProperty("networking")
    private Networking networking;
    @JsonProperty("platform")
    private Platform platform;
    @JsonProperty("proxy")
    private Proxy proxy;
    @JsonProperty("publish")
    private String publish;
    @JsonProperty("pullSecret")
    private String pullSecret;
    @JsonProperty("sshKey")
    private String sshKey;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public InstallConfig() {
    }

    /**
     * 
     * @param metadata
     * @param credentialsMode
     * @param kind
     * @param fips
     * @param networking
     * @param platform
     * @param compute
     * @param proxy
     * @param apiVersion
     * @param controlPlane
     * @param imageContentSources
     * @param baseDomain
     * @param sshKey
     * @param publish
     * @param bootstrapInPlace
     * @param additionalTrustBundle
     * @param pullSecret
     */
    public InstallConfig(String additionalTrustBundle, String apiVersion, String baseDomain, BootstrapInPlace bootstrapInPlace, List<MachinePool> compute, MachinePool controlPlane, String credentialsMode, Boolean fips, List<ImageContentSource> imageContentSources, String kind, io.fabric8.kubernetes.api.model.ObjectMeta metadata, Networking networking, Platform platform, Proxy proxy, String publish, String pullSecret, String sshKey) {
        super();
        this.additionalTrustBundle = additionalTrustBundle;
        this.apiVersion = apiVersion;
        this.baseDomain = baseDomain;
        this.bootstrapInPlace = bootstrapInPlace;
        this.compute = compute;
        this.controlPlane = controlPlane;
        this.credentialsMode = credentialsMode;
        this.fips = fips;
        this.imageContentSources = imageContentSources;
        this.kind = kind;
        this.metadata = metadata;
        this.networking = networking;
        this.platform = platform;
        this.proxy = proxy;
        this.publish = publish;
        this.pullSecret = pullSecret;
        this.sshKey = sshKey;
    }

    @JsonProperty("additionalTrustBundle")
    public String getAdditionalTrustBundle() {
        return additionalTrustBundle;
    }

    @JsonProperty("additionalTrustBundle")
    public void setAdditionalTrustBundle(String additionalTrustBundle) {
        this.additionalTrustBundle = additionalTrustBundle;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    @JsonProperty("baseDomain")
    public String getBaseDomain() {
        return baseDomain;
    }

    @JsonProperty("baseDomain")
    public void setBaseDomain(String baseDomain) {
        this.baseDomain = baseDomain;
    }

    @JsonProperty("bootstrapInPlace")
    public BootstrapInPlace getBootstrapInPlace() {
        return bootstrapInPlace;
    }

    @JsonProperty("bootstrapInPlace")
    public void setBootstrapInPlace(BootstrapInPlace bootstrapInPlace) {
        this.bootstrapInPlace = bootstrapInPlace;
    }

    @JsonProperty("compute")
    public List<MachinePool> getCompute() {
        return compute;
    }

    @JsonProperty("compute")
    public void setCompute(List<MachinePool> compute) {
        this.compute = compute;
    }

    @JsonProperty("controlPlane")
    public MachinePool getControlPlane() {
        return controlPlane;
    }

    @JsonProperty("controlPlane")
    public void setControlPlane(MachinePool controlPlane) {
        this.controlPlane = controlPlane;
    }

    @JsonProperty("credentialsMode")
    public String getCredentialsMode() {
        return credentialsMode;
    }

    @JsonProperty("credentialsMode")
    public void setCredentialsMode(String credentialsMode) {
        this.credentialsMode = credentialsMode;
    }

    @JsonProperty("fips")
    public Boolean getFips() {
        return fips;
    }

    @JsonProperty("fips")
    public void setFips(Boolean fips) {
        this.fips = fips;
    }

    @JsonProperty("imageContentSources")
    public List<ImageContentSource> getImageContentSources() {
        return imageContentSources;
    }

    @JsonProperty("imageContentSources")
    public void setImageContentSources(List<ImageContentSource> imageContentSources) {
        this.imageContentSources = imageContentSources;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("metadata")
    public io.fabric8.kubernetes.api.model.ObjectMeta getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(io.fabric8.kubernetes.api.model.ObjectMeta metadata) {
        this.metadata = metadata;
    }

    @JsonProperty("networking")
    public Networking getNetworking() {
        return networking;
    }

    @JsonProperty("networking")
    public void setNetworking(Networking networking) {
        this.networking = networking;
    }

    @JsonProperty("platform")
    public Platform getPlatform() {
        return platform;
    }

    @JsonProperty("platform")
    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    @JsonProperty("proxy")
    public Proxy getProxy() {
        return proxy;
    }

    @JsonProperty("proxy")
    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    @JsonProperty("publish")
    public String getPublish() {
        return publish;
    }

    @JsonProperty("publish")
    public void setPublish(String publish) {
        this.publish = publish;
    }

    @JsonProperty("pullSecret")
    public String getPullSecret() {
        return pullSecret;
    }

    @JsonProperty("pullSecret")
    public void setPullSecret(String pullSecret) {
        this.pullSecret = pullSecret;
    }

    @JsonProperty("sshKey")
    public String getSshKey() {
        return sshKey;
    }

    @JsonProperty("sshKey")
    public void setSshKey(String sshKey) {
        this.sshKey = sshKey;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
