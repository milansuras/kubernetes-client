
package io.fabric8.verticalpodautoscaler.api.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.fabric8.verticalpodautoscaler.api.model.v1.ContainerResourcePolicy;
import io.fabric8.verticalpodautoscaler.api.model.v1.HistogramCheckpoint;
import io.fabric8.verticalpodautoscaler.api.model.v1.PodResourcePolicy;
import io.fabric8.verticalpodautoscaler.api.model.v1.PodUpdatePolicy;
import io.fabric8.verticalpodautoscaler.api.model.v1.RecommendedContainerResources;
import io.fabric8.verticalpodautoscaler.api.model.v1.RecommendedPodResources;
import io.fabric8.verticalpodautoscaler.api.model.v1.VerticalPodAutoscaler;
import io.fabric8.verticalpodautoscaler.api.model.v1.VerticalPodAutoscalerCheckpoint;
import io.fabric8.verticalpodautoscaler.api.model.v1.VerticalPodAutoscalerCheckpointList;
import io.fabric8.verticalpodautoscaler.api.model.v1.VerticalPodAutoscalerCheckpointSpec;
import io.fabric8.verticalpodautoscaler.api.model.v1.VerticalPodAutoscalerCheckpointStatus;
import io.fabric8.verticalpodautoscaler.api.model.v1.VerticalPodAutoscalerCondition;
import io.fabric8.verticalpodautoscaler.api.model.v1.VerticalPodAutoscalerList;
import io.fabric8.verticalpodautoscaler.api.model.v1.VerticalPodAutoscalerSpec;
import io.fabric8.verticalpodautoscaler.api.model.v1.VerticalPodAutoscalerStatus;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_ContainerResourcePolicy",
    "k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_HistogramCheckpoint",
    "k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_PodResourcePolicy",
    "k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_PodUpdatePolicy",
    "k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_RecommendedContainerResources",
    "k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_RecommendedPodResources",
    "k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscaler",
    "k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCheckpoint",
    "k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCheckpointList",
    "k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCheckpointSpec",
    "k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCheckpointStatus",
    "k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCondition",
    "k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerList",
    "k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerSpec",
    "k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerStatus"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class),
    @BuildableReference(EnvVar.class),
    @BuildableReference(ContainerPort.class),
    @BuildableReference(Volume.class),
    @BuildableReference(VolumeMount.class)
})
@Generated("jsonschema2pojo")
public class VerticalpodautoscalerSchema implements Editable<VerticalpodautoscalerSchemaBuilder>
{

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_ContainerResourcePolicy")
    private ContainerResourcePolicy k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1ContainerResourcePolicy;
    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_HistogramCheckpoint")
    private HistogramCheckpoint k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1HistogramCheckpoint;
    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_PodResourcePolicy")
    private PodResourcePolicy k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodResourcePolicy;
    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_PodUpdatePolicy")
    private PodUpdatePolicy k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodUpdatePolicy;
    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_RecommendedContainerResources")
    private RecommendedContainerResources k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedContainerResources;
    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_RecommendedPodResources")
    private RecommendedPodResources k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedPodResources;
    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscaler")
    private VerticalPodAutoscaler k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscaler;
    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCheckpoint")
    private VerticalPodAutoscalerCheckpoint k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpoint;
    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCheckpointList")
    private VerticalPodAutoscalerCheckpointList k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointList;
    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCheckpointSpec")
    private VerticalPodAutoscalerCheckpointSpec k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointSpec;
    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCheckpointStatus")
    private VerticalPodAutoscalerCheckpointStatus k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointStatus;
    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCondition")
    private VerticalPodAutoscalerCondition k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCondition;
    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerList")
    private VerticalPodAutoscalerList k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerList;
    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerSpec")
    private VerticalPodAutoscalerSpec k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerSpec;
    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerStatus")
    private VerticalPodAutoscalerStatus k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerStatus;

    /**
     * No args constructor for use in serialization
     * 
     */
    public VerticalpodautoscalerSchema() {
    }

    public VerticalpodautoscalerSchema(ContainerResourcePolicy k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1ContainerResourcePolicy, HistogramCheckpoint k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1HistogramCheckpoint, PodResourcePolicy k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodResourcePolicy, PodUpdatePolicy k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodUpdatePolicy, RecommendedContainerResources k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedContainerResources, RecommendedPodResources k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedPodResources, VerticalPodAutoscaler k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscaler, VerticalPodAutoscalerCheckpoint k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpoint, VerticalPodAutoscalerCheckpointList k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointList, VerticalPodAutoscalerCheckpointSpec k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointSpec, VerticalPodAutoscalerCheckpointStatus k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointStatus, VerticalPodAutoscalerCondition k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCondition, VerticalPodAutoscalerList k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerList, VerticalPodAutoscalerSpec k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerSpec, VerticalPodAutoscalerStatus k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerStatus) {
        super();
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1ContainerResourcePolicy = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1ContainerResourcePolicy;
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1HistogramCheckpoint = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1HistogramCheckpoint;
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodResourcePolicy = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodResourcePolicy;
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodUpdatePolicy = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodUpdatePolicy;
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedContainerResources = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedContainerResources;
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedPodResources = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedPodResources;
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscaler = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscaler;
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpoint = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpoint;
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointList = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointList;
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointSpec = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointSpec;
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointStatus = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointStatus;
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCondition = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCondition;
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerList = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerList;
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerSpec = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerSpec;
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerStatus = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerStatus;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_ContainerResourcePolicy")
    public ContainerResourcePolicy getK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1ContainerResourcePolicy() {
        return k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1ContainerResourcePolicy;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_ContainerResourcePolicy")
    public void setK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1ContainerResourcePolicy(ContainerResourcePolicy k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1ContainerResourcePolicy) {
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1ContainerResourcePolicy = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1ContainerResourcePolicy;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_HistogramCheckpoint")
    public HistogramCheckpoint getK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1HistogramCheckpoint() {
        return k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1HistogramCheckpoint;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_HistogramCheckpoint")
    public void setK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1HistogramCheckpoint(HistogramCheckpoint k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1HistogramCheckpoint) {
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1HistogramCheckpoint = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1HistogramCheckpoint;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_PodResourcePolicy")
    public PodResourcePolicy getK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodResourcePolicy() {
        return k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodResourcePolicy;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_PodResourcePolicy")
    public void setK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodResourcePolicy(PodResourcePolicy k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodResourcePolicy) {
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodResourcePolicy = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodResourcePolicy;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_PodUpdatePolicy")
    public PodUpdatePolicy getK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodUpdatePolicy() {
        return k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodUpdatePolicy;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_PodUpdatePolicy")
    public void setK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodUpdatePolicy(PodUpdatePolicy k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodUpdatePolicy) {
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodUpdatePolicy = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1PodUpdatePolicy;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_RecommendedContainerResources")
    public RecommendedContainerResources getK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedContainerResources() {
        return k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedContainerResources;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_RecommendedContainerResources")
    public void setK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedContainerResources(RecommendedContainerResources k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedContainerResources) {
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedContainerResources = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedContainerResources;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_RecommendedPodResources")
    public RecommendedPodResources getK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedPodResources() {
        return k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedPodResources;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_RecommendedPodResources")
    public void setK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedPodResources(RecommendedPodResources k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedPodResources) {
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedPodResources = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1RecommendedPodResources;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscaler")
    public VerticalPodAutoscaler getK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscaler() {
        return k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscaler;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscaler")
    public void setK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscaler(VerticalPodAutoscaler k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscaler) {
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscaler = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscaler;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCheckpoint")
    public VerticalPodAutoscalerCheckpoint getK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpoint() {
        return k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpoint;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCheckpoint")
    public void setK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpoint(VerticalPodAutoscalerCheckpoint k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpoint) {
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpoint = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpoint;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCheckpointList")
    public VerticalPodAutoscalerCheckpointList getK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointList() {
        return k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointList;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCheckpointList")
    public void setK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointList(VerticalPodAutoscalerCheckpointList k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointList) {
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointList = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointList;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCheckpointSpec")
    public VerticalPodAutoscalerCheckpointSpec getK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointSpec() {
        return k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointSpec;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCheckpointSpec")
    public void setK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointSpec(VerticalPodAutoscalerCheckpointSpec k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointSpec) {
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointSpec = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointSpec;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCheckpointStatus")
    public VerticalPodAutoscalerCheckpointStatus getK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointStatus() {
        return k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointStatus;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCheckpointStatus")
    public void setK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointStatus(VerticalPodAutoscalerCheckpointStatus k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointStatus) {
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointStatus = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCheckpointStatus;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCondition")
    public VerticalPodAutoscalerCondition getK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCondition() {
        return k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCondition;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerCondition")
    public void setK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCondition(VerticalPodAutoscalerCondition k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCondition) {
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCondition = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerCondition;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerList")
    public VerticalPodAutoscalerList getK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerList() {
        return k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerList;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerList")
    public void setK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerList(VerticalPodAutoscalerList k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerList) {
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerList = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerList;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerSpec")
    public VerticalPodAutoscalerSpec getK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerSpec() {
        return k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerSpec;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerSpec")
    public void setK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerSpec(VerticalPodAutoscalerSpec k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerSpec) {
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerSpec = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerSpec;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerStatus")
    public VerticalPodAutoscalerStatus getK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerStatus() {
        return k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerStatus;
    }

    @JsonProperty("k8s_io_autoscaler_vertical-pod-autoscaler_pkg_apis_autoscaling_k8s_io_v1_VerticalPodAutoscalerStatus")
    public void setK8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerStatus(VerticalPodAutoscalerStatus k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerStatus) {
        this.k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerStatus = k8sIoAutoscalerVerticalPodAutoscalerPkgApisAutoscalingK8sIoV1VerticalPodAutoscalerStatus;
    }

    @JsonIgnore
    public VerticalpodautoscalerSchemaBuilder edit() {
        return new VerticalpodautoscalerSchemaBuilder(this);
    }

    @JsonIgnore
    public VerticalpodautoscalerSchemaBuilder toBuilder() {
        return edit();
    }

}
