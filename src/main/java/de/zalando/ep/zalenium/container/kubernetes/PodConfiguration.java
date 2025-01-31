package de.zalando.ep.zalenium.container.kubernetes;

import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.PodSecurityContext;
import io.fabric8.kubernetes.api.model.HostAlias;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.Quantity;
import io.fabric8.kubernetes.api.model.SecurityContext;
import io.fabric8.kubernetes.api.model.Toleration;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.fabric8.kubernetes.api.model.OwnerReference;
import io.fabric8.kubernetes.api.model.Pod;
import io.fabric8.kubernetes.client.KubernetesClient;

import java.util.List;
import java.util.Map;

@SuppressWarnings("WeakerAccess")
public class PodConfiguration {

    private KubernetesClient client;
    private String containerIdPrefix;
    private String image;
    private String imagePullPolicy;
    private String nodePort;
    private List<LocalObjectReference> imagePullSecrets;
    private List<EnvVar> envVars;
    private List<HostAlias> hostAliases;
    private Map<String, String> labels;
    private Map<VolumeMount, Volume> mountedSharedFoldersMap;
    private Map<String, Quantity> podLimits;
    private Map<String, Quantity> podRequests;
    private Map<String, String> nodeSelector;
    private List<Toleration> tolerations;
    private OwnerReference ownerReference;
    private PodSecurityContext podSecurityContext;
    private SecurityContext containerSecurityContext;
    private String schedulerName;

    private String persistentVolumeClaim;
    private String volumeMountPath;

    public String getNodePort() {
        return nodePort;
    }

    public void setNodePort(String nodePort) {
        this.nodePort = nodePort;
    }

    public void setOwner(Pod ownerPod) {
        this.ownerReference = new OwnerReference(ownerPod.getApiVersion(), false, true, ownerPod.getKind(), ownerPod.getMetadata().getName(), ownerPod.getMetadata().getUid());
    }
    public OwnerReference getOwnerRef() {
        return ownerReference;
    }

    public KubernetesClient getClient() {
        return client;
    }
    public void setClient(KubernetesClient client) {
        this.client = client;
    }
    public String getContainerIdPrefix() {
        return containerIdPrefix;
    }
    public void setContainerIdPrefix(String containerIdPrefix) {
        this.containerIdPrefix = containerIdPrefix;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getImagePullPolicy() {
        return imagePullPolicy;
    }
    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }
    public List<EnvVar> getEnvVars() {
        return envVars;
    }
    public List<LocalObjectReference> getImagePullSecrets() {
        return imagePullSecrets;
    }
    public void setImagePullSecrets(List<LocalObjectReference> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }
    public void setEnvVars(List<EnvVar> envVars) {
        this.envVars = envVars;
    }
    public Map<String, String> getLabels() {
        return labels;
    }
    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }
    public Map<String, Quantity> getPodLimits() {
        return podLimits;
    }
    public void setPodLimits(Map<String, Quantity> podLimits) {
        this.podLimits = podLimits;
    }
    public Map<String, Quantity> getPodRequests() {
        return podRequests;
    }
    public void setPodRequests(Map<String, Quantity> podRequests) {
        this.podRequests = podRequests;
    }
    public Map<VolumeMount, Volume> getMountedSharedFoldersMap() {
        return mountedSharedFoldersMap;
    }
    public void setMountedSharedFoldersMap(Map<VolumeMount, Volume> mountedSharedFoldersMap) {
        this.mountedSharedFoldersMap = mountedSharedFoldersMap;
    }
    public List<HostAlias> getHostAliases() {
        return hostAliases;
    }
    public void setHostAliases(List<HostAlias> hostAliases) {
        this.hostAliases = hostAliases;
    }
    public Map<String, String> getNodeSelector() {
        return nodeSelector;
    }
    public void setNodeSelector(final Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }
    public List<Toleration> getTolerations() {
        return tolerations;
    }
    public void setTolerations(final List<Toleration> tolerations) {
        this.tolerations = tolerations;
    }

	public PodSecurityContext getPodSecurityContext() {
		return podSecurityContext;
	}

	public void setPodSecurityContext(PodSecurityContext podSecurityContext) {
		this.podSecurityContext = podSecurityContext;
	}

    public SecurityContext getContainerSecurityContext() {
        return containerSecurityContext;
    }

    public void setContainerSecurityContext(SecurityContext containerSecurityContext) {
        this.containerSecurityContext = containerSecurityContext;
    }

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public String getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(String persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public String getVolumeMountPath() {
        return volumeMountPath;
    }

    public void setVolumeMountPath(String volumeMountPath) {
        this.volumeMountPath = volumeMountPath;
    }
}
