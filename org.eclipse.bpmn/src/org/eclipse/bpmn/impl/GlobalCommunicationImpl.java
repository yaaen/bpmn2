/**
 *  Copyright (c) 2000-2009, Intalio Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *  Contributors:
 *     Intalio Inc. - initial API and implementation
 *
 */
package org.eclipse.bpmn.impl;

import java.util.Collection;

import java.util.List;
import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.CorrelationKey;
import org.eclipse.bpmn.GlobalCommunication;
import org.eclipse.bpmn.MessageFlow;
import org.eclipse.bpmn.Participant;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.GlobalCommunicationImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.GlobalCommunicationImpl#getMessageFlow <em>Message Flow</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.GlobalCommunicationImpl#getCorrelationKey <em>Correlation Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalCommunicationImpl extends CallableElementImpl implements GlobalCommunication {
    /**
     * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipant()
     * @generated
     * @ordered
     */
    protected EList<Participant> participant;

    /**
     * The cached value of the '{@link #getMessageFlow() <em>Message Flow</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageFlow()
     * @generated
     * @ordered
     */
    protected EList<MessageFlow> messageFlow;

    /**
     * The cached value of the '{@link #getCorrelationKey() <em>Correlation Key</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorrelationKey()
     * @generated
     * @ordered
     */
    protected EList<CorrelationKey> correlationKey;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GlobalCommunicationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getGlobalCommunication();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Participant> getParticipant() {
        if (participant == null) {
            participant = new EObjectContainmentEList<Participant>(Participant.class, this, BpmnPackage.GLOBAL_COMMUNICATION__PARTICIPANT);
        }
        return participant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<MessageFlow> getMessageFlow() {
        if (messageFlow == null) {
            messageFlow = new EObjectContainmentEList<MessageFlow>(MessageFlow.class, this, BpmnPackage.GLOBAL_COMMUNICATION__MESSAGE_FLOW);
        }
        return messageFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<CorrelationKey> getCorrelationKey() {
        if (correlationKey == null) {
            correlationKey = new EObjectContainmentEList<CorrelationKey>(CorrelationKey.class, this, BpmnPackage.GLOBAL_COMMUNICATION__CORRELATION_KEY);
        }
        return correlationKey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case BpmnPackage.GLOBAL_COMMUNICATION__PARTICIPANT:
            return ((InternalEList<?>) getParticipant()).basicRemove(otherEnd, msgs);
        case BpmnPackage.GLOBAL_COMMUNICATION__MESSAGE_FLOW:
            return ((InternalEList<?>) getMessageFlow()).basicRemove(otherEnd, msgs);
        case BpmnPackage.GLOBAL_COMMUNICATION__CORRELATION_KEY:
            return ((InternalEList<?>) getCorrelationKey()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.GLOBAL_COMMUNICATION__PARTICIPANT:
            return getParticipant();
        case BpmnPackage.GLOBAL_COMMUNICATION__MESSAGE_FLOW:
            return getMessageFlow();
        case BpmnPackage.GLOBAL_COMMUNICATION__CORRELATION_KEY:
            return getCorrelationKey();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case BpmnPackage.GLOBAL_COMMUNICATION__PARTICIPANT:
            getParticipant().clear();
            getParticipant().addAll((Collection<? extends Participant>) newValue);
            return;
        case BpmnPackage.GLOBAL_COMMUNICATION__MESSAGE_FLOW:
            getMessageFlow().clear();
            getMessageFlow().addAll((Collection<? extends MessageFlow>) newValue);
            return;
        case BpmnPackage.GLOBAL_COMMUNICATION__CORRELATION_KEY:
            getCorrelationKey().clear();
            getCorrelationKey().addAll((Collection<? extends CorrelationKey>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case BpmnPackage.GLOBAL_COMMUNICATION__PARTICIPANT:
            getParticipant().clear();
            return;
        case BpmnPackage.GLOBAL_COMMUNICATION__MESSAGE_FLOW:
            getMessageFlow().clear();
            return;
        case BpmnPackage.GLOBAL_COMMUNICATION__CORRELATION_KEY:
            getCorrelationKey().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case BpmnPackage.GLOBAL_COMMUNICATION__PARTICIPANT:
            return participant != null && !participant.isEmpty();
        case BpmnPackage.GLOBAL_COMMUNICATION__MESSAGE_FLOW:
            return messageFlow != null && !messageFlow.isEmpty();
        case BpmnPackage.GLOBAL_COMMUNICATION__CORRELATION_KEY:
            return correlationKey != null && !correlationKey.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //GlobalCommunicationImpl
