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
package org.eclipse.bpmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>User Task Implementation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpmn.BpmnPackage#getUserTaskImplementation()
 * @model extendedMetaData="name='tUserTaskImplementation'"
 * @generated
 */
public enum UserTaskImplementation implements Enumerator {
    /**
     * The '<em><b>Unspecified</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNSPECIFIED_VALUE
     * @generated
     * @ordered
     */
    UNSPECIFIED(0, "unspecified", "unspecified"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER(1, "other", "other"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Web Service</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WEB_SERVICE_VALUE
     * @generated
     * @ordered
     */
    WEB_SERVICE(2, "webService", "webService"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Human Task Web Service</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HUMAN_TASK_WEB_SERVICE_VALUE
     * @generated
     * @ordered
     */
    HUMAN_TASK_WEB_SERVICE(3, "humanTaskWebService", "humanTaskWebService"); //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>Unspecified</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Unspecified</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNSPECIFIED
     * @model name="unspecified"
     * @generated
     * @ordered
     */
    public static final int UNSPECIFIED_VALUE = 0;

    /**
     * The '<em><b>Other</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OTHER
     * @model name="other"
     * @generated
     * @ordered
     */
    public static final int OTHER_VALUE = 1;

    /**
     * The '<em><b>Web Service</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Web Service</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WEB_SERVICE
     * @model name="webService"
     * @generated
     * @ordered
     */
    public static final int WEB_SERVICE_VALUE = 2;

    /**
     * The '<em><b>Human Task Web Service</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Human Task Web Service</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HUMAN_TASK_WEB_SERVICE
     * @model name="humanTaskWebService"
     * @generated
     * @ordered
     */
    public static final int HUMAN_TASK_WEB_SERVICE_VALUE = 3;

    /**
     * An array of all the '<em><b>User Task Implementation</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final UserTaskImplementation[] VALUES_ARRAY = new UserTaskImplementation[] { UNSPECIFIED, OTHER, WEB_SERVICE, HUMAN_TASK_WEB_SERVICE, };

    /**
     * A public read-only list of all the '<em><b>User Task Implementation</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<UserTaskImplementation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>User Task Implementation</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static UserTaskImplementation get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            UserTaskImplementation result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>User Task Implementation</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static UserTaskImplementation getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            UserTaskImplementation result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>User Task Implementation</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static UserTaskImplementation get(int value) {
        switch (value) {
        case UNSPECIFIED_VALUE:
            return UNSPECIFIED;
        case OTHER_VALUE:
            return OTHER;
        case WEB_SERVICE_VALUE:
            return WEB_SERVICE;
        case HUMAN_TASK_WEB_SERVICE_VALUE:
            return HUMAN_TASK_WEB_SERVICE;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private UserTaskImplementation(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //UserTaskImplementation
