// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.implementation.DurationSerializer;
import com.azure.resourcemanager.servicebus.models.EntityStatus;
import com.azure.resourcemanager.servicebus.models.MessageCountDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.Duration;
import java.time.OffsetDateTime;

/** Description of subscription resource. */
@JsonFlatten
@Fluent
public class SBSubscriptionInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SBSubscriptionInner.class);

    /*
     * Number of messages.
     */
    @JsonProperty(value = "properties.messageCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long messageCount;

    /*
     * Exact time the message was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * Last time there was a receive request to this subscription.
     */
    @JsonProperty(value = "properties.accessedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime accessedAt;

    /*
     * The exact time the message was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /*
     * Message count details
     */
    @JsonProperty(value = "properties.countDetails", access = JsonProperty.Access.WRITE_ONLY)
    private MessageCountDetails countDetails;

    /*
     * ISO 8061 lock duration timespan for the subscription. The default value
     * is 1 minute.
     */
    @JsonProperty(value = "properties.lockDuration")
    @JsonSerialize(using = DurationSerializer.class)
    private Duration lockDuration;

    /*
     * Value indicating if a subscription supports the concept of sessions.
     */
    @JsonProperty(value = "properties.requiresSession")
    private Boolean requiresSession;

    /*
     * ISO 8061 Default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent
     * to Service Bus. This is the default value used when TimeToLive is not
     * set on a message itself.
     */
    @JsonProperty(value = "properties.defaultMessageTimeToLive")
    @JsonSerialize(using = DurationSerializer.class)
    private Duration defaultMessageTimeToLive;

    /*
     * Value that indicates whether a subscription has dead letter support on
     * filter evaluation exceptions.
     */
    @JsonProperty(value = "properties.deadLetteringOnFilterEvaluationExceptions")
    private Boolean deadLetteringOnFilterEvaluationExceptions;

    /*
     * Value that indicates whether a subscription has dead letter support when
     * a message expires.
     */
    @JsonProperty(value = "properties.deadLetteringOnMessageExpiration")
    private Boolean deadLetteringOnMessageExpiration;

    /*
     * ISO 8601 timeSpan structure that defines the duration of the duplicate
     * detection history. The default value is 10 minutes.
     */
    @JsonProperty(value = "properties.duplicateDetectionHistoryTimeWindow")
    @JsonSerialize(using = DurationSerializer.class)
    private Duration duplicateDetectionHistoryTimeWindow;

    /*
     * Number of maximum deliveries.
     */
    @JsonProperty(value = "properties.maxDeliveryCount")
    private Integer maxDeliveryCount;

    /*
     * Enumerates the possible values for the status of a messaging entity.
     */
    @JsonProperty(value = "properties.status")
    private EntityStatus status;

    /*
     * Value that indicates whether server-side batched operations are enabled.
     */
    @JsonProperty(value = "properties.enableBatchedOperations")
    private Boolean enableBatchedOperations;

    /*
     * ISO 8061 timeSpan idle interval after which the topic is automatically
     * deleted. The minimum duration is 5 minutes.
     */
    @JsonProperty(value = "properties.autoDeleteOnIdle")
    @JsonSerialize(using = DurationSerializer.class)
    private Duration autoDeleteOnIdle;

    /*
     * Queue/Topic name to forward the messages
     */
    @JsonProperty(value = "properties.forwardTo")
    private String forwardTo;

    /*
     * Queue/Topic name to forward the Dead Letter message
     */
    @JsonProperty(value = "properties.forwardDeadLetteredMessagesTo")
    private String forwardDeadLetteredMessagesTo;

    /**
     * Get the messageCount property: Number of messages.
     *
     * @return the messageCount value.
     */
    public Long messageCount() {
        return this.messageCount;
    }

    /**
     * Get the createdAt property: Exact time the message was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the accessedAt property: Last time there was a receive request to this subscription.
     *
     * @return the accessedAt value.
     */
    public OffsetDateTime accessedAt() {
        return this.accessedAt;
    }

    /**
     * Get the updatedAt property: The exact time the message was updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the countDetails property: Message count details.
     *
     * @return the countDetails value.
     */
    public MessageCountDetails countDetails() {
        return this.countDetails;
    }

    /**
     * Get the lockDuration property: ISO 8061 lock duration timespan for the subscription. The default value is 1
     * minute.
     *
     * @return the lockDuration value.
     */
    public Duration lockDuration() {
        return this.lockDuration;
    }

    /**
     * Set the lockDuration property: ISO 8061 lock duration timespan for the subscription. The default value is 1
     * minute.
     *
     * @param lockDuration the lockDuration value to set.
     * @return the SBSubscriptionInner object itself.
     */
    public SBSubscriptionInner withLockDuration(Duration lockDuration) {
        this.lockDuration = lockDuration;
        return this;
    }

    /**
     * Get the requiresSession property: Value indicating if a subscription supports the concept of sessions.
     *
     * @return the requiresSession value.
     */
    public Boolean requiresSession() {
        return this.requiresSession;
    }

    /**
     * Set the requiresSession property: Value indicating if a subscription supports the concept of sessions.
     *
     * @param requiresSession the requiresSession value to set.
     * @return the SBSubscriptionInner object itself.
     */
    public SBSubscriptionInner withRequiresSession(Boolean requiresSession) {
        this.requiresSession = requiresSession;
        return this;
    }

    /**
     * Get the defaultMessageTimeToLive property: ISO 8061 Default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent to Service Bus. This is the default value
     * used when TimeToLive is not set on a message itself.
     *
     * @return the defaultMessageTimeToLive value.
     */
    public Duration defaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive;
    }

    /**
     * Set the defaultMessageTimeToLive property: ISO 8061 Default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent to Service Bus. This is the default value
     * used when TimeToLive is not set on a message itself.
     *
     * @param defaultMessageTimeToLive the defaultMessageTimeToLive value to set.
     * @return the SBSubscriptionInner object itself.
     */
    public SBSubscriptionInner withDefaultMessageTimeToLive(Duration defaultMessageTimeToLive) {
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        return this;
    }

    /**
     * Get the deadLetteringOnFilterEvaluationExceptions property: Value that indicates whether a subscription has dead
     * letter support on filter evaluation exceptions.
     *
     * @return the deadLetteringOnFilterEvaluationExceptions value.
     */
    public Boolean deadLetteringOnFilterEvaluationExceptions() {
        return this.deadLetteringOnFilterEvaluationExceptions;
    }

    /**
     * Set the deadLetteringOnFilterEvaluationExceptions property: Value that indicates whether a subscription has dead
     * letter support on filter evaluation exceptions.
     *
     * @param deadLetteringOnFilterEvaluationExceptions the deadLetteringOnFilterEvaluationExceptions value to set.
     * @return the SBSubscriptionInner object itself.
     */
    public SBSubscriptionInner withDeadLetteringOnFilterEvaluationExceptions(
        Boolean deadLetteringOnFilterEvaluationExceptions) {
        this.deadLetteringOnFilterEvaluationExceptions = deadLetteringOnFilterEvaluationExceptions;
        return this;
    }

    /**
     * Get the deadLetteringOnMessageExpiration property: Value that indicates whether a subscription has dead letter
     * support when a message expires.
     *
     * @return the deadLetteringOnMessageExpiration value.
     */
    public Boolean deadLetteringOnMessageExpiration() {
        return this.deadLetteringOnMessageExpiration;
    }

    /**
     * Set the deadLetteringOnMessageExpiration property: Value that indicates whether a subscription has dead letter
     * support when a message expires.
     *
     * @param deadLetteringOnMessageExpiration the deadLetteringOnMessageExpiration value to set.
     * @return the SBSubscriptionInner object itself.
     */
    public SBSubscriptionInner withDeadLetteringOnMessageExpiration(Boolean deadLetteringOnMessageExpiration) {
        this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
        return this;
    }

    /**
     * Get the duplicateDetectionHistoryTimeWindow property: ISO 8601 timeSpan structure that defines the duration of
     * the duplicate detection history. The default value is 10 minutes.
     *
     * @return the duplicateDetectionHistoryTimeWindow value.
     */
    public Duration duplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow;
    }

    /**
     * Set the duplicateDetectionHistoryTimeWindow property: ISO 8601 timeSpan structure that defines the duration of
     * the duplicate detection history. The default value is 10 minutes.
     *
     * @param duplicateDetectionHistoryTimeWindow the duplicateDetectionHistoryTimeWindow value to set.
     * @return the SBSubscriptionInner object itself.
     */
    public SBSubscriptionInner withDuplicateDetectionHistoryTimeWindow(Duration duplicateDetectionHistoryTimeWindow) {
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
        return this;
    }

    /**
     * Get the maxDeliveryCount property: Number of maximum deliveries.
     *
     * @return the maxDeliveryCount value.
     */
    public Integer maxDeliveryCount() {
        return this.maxDeliveryCount;
    }

    /**
     * Set the maxDeliveryCount property: Number of maximum deliveries.
     *
     * @param maxDeliveryCount the maxDeliveryCount value to set.
     * @return the SBSubscriptionInner object itself.
     */
    public SBSubscriptionInner withMaxDeliveryCount(Integer maxDeliveryCount) {
        this.maxDeliveryCount = maxDeliveryCount;
        return this;
    }

    /**
     * Get the status property: Enumerates the possible values for the status of a messaging entity.
     *
     * @return the status value.
     */
    public EntityStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Enumerates the possible values for the status of a messaging entity.
     *
     * @param status the status value to set.
     * @return the SBSubscriptionInner object itself.
     */
    public SBSubscriptionInner withStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the enableBatchedOperations property: Value that indicates whether server-side batched operations are
     * enabled.
     *
     * @return the enableBatchedOperations value.
     */
    public Boolean enableBatchedOperations() {
        return this.enableBatchedOperations;
    }

    /**
     * Set the enableBatchedOperations property: Value that indicates whether server-side batched operations are
     * enabled.
     *
     * @param enableBatchedOperations the enableBatchedOperations value to set.
     * @return the SBSubscriptionInner object itself.
     */
    public SBSubscriptionInner withEnableBatchedOperations(Boolean enableBatchedOperations) {
        this.enableBatchedOperations = enableBatchedOperations;
        return this;
    }

    /**
     * Get the autoDeleteOnIdle property: ISO 8061 timeSpan idle interval after which the topic is automatically
     * deleted. The minimum duration is 5 minutes.
     *
     * @return the autoDeleteOnIdle value.
     */
    public Duration autoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }

    /**
     * Set the autoDeleteOnIdle property: ISO 8061 timeSpan idle interval after which the topic is automatically
     * deleted. The minimum duration is 5 minutes.
     *
     * @param autoDeleteOnIdle the autoDeleteOnIdle value to set.
     * @return the SBSubscriptionInner object itself.
     */
    public SBSubscriptionInner withAutoDeleteOnIdle(Duration autoDeleteOnIdle) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        return this;
    }

    /**
     * Get the forwardTo property: Queue/Topic name to forward the messages.
     *
     * @return the forwardTo value.
     */
    public String forwardTo() {
        return this.forwardTo;
    }

    /**
     * Set the forwardTo property: Queue/Topic name to forward the messages.
     *
     * @param forwardTo the forwardTo value to set.
     * @return the SBSubscriptionInner object itself.
     */
    public SBSubscriptionInner withForwardTo(String forwardTo) {
        this.forwardTo = forwardTo;
        return this;
    }

    /**
     * Get the forwardDeadLetteredMessagesTo property: Queue/Topic name to forward the Dead Letter message.
     *
     * @return the forwardDeadLetteredMessagesTo value.
     */
    public String forwardDeadLetteredMessagesTo() {
        return this.forwardDeadLetteredMessagesTo;
    }

    /**
     * Set the forwardDeadLetteredMessagesTo property: Queue/Topic name to forward the Dead Letter message.
     *
     * @param forwardDeadLetteredMessagesTo the forwardDeadLetteredMessagesTo value to set.
     * @return the SBSubscriptionInner object itself.
     */
    public SBSubscriptionInner withForwardDeadLetteredMessagesTo(String forwardDeadLetteredMessagesTo) {
        this.forwardDeadLetteredMessagesTo = forwardDeadLetteredMessagesTo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (countDetails() != null) {
            countDetails().validate();
        }
    }
}