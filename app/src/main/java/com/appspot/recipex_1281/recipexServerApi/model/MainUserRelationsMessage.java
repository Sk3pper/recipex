/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-05-27 16:00:31 UTC)
 * on 2016-07-06 at 19:30:55 UTC 
 * Modify at your own risk.
 */

package com.appspot.recipex_1281.recipexServerApi.model;

/**
 * Message to return User's relation informations Summary: This message class is intended to return
 * informations about the current relation status between two Users. Attributes: is_relative =
 * Boolean value to tell if there's a relative relation is_relative_request = Boolean value to tell
 * if there are relative requests is_pc_physician = Boolean value to tell if there's a pc physician
 * relation is_pc_physician_request = Boolean value to tell if there are pc physician requests
 * is_visiting_nurse = Boolean value to tell if there's a visiting nurse relation
 * is_visiting_nurse_request = Boolean value to tell if there are visiting nurse requests
 * is_caregiver = Boolean value to tell if there's a caregiver relation is_caregiver_request =
 * Boolean value to tell if there are caregiver requests is_patient = Boolean value to tell if
 * there's a patient relation is_patient_request = Boolean value to tell if there are patient
 * requests profile_mail = E-mail of the Requested User response = DefaultResponseMessage containing
 * the response
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the recipexServerApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MainUserRelationsMessage extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("is_caregiver")
  private java.lang.Boolean isCaregiver;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("is_caregiver_request")
  private java.lang.Boolean isCaregiverRequest;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("is_patient")
  private java.lang.Boolean isPatient;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("is_patient_request")
  private java.lang.Boolean isPatientRequest;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("is_pc_physician")
  private java.lang.Boolean isPcPhysician;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("is_pc_physician_request")
  private java.lang.Boolean isPcPhysicianRequest;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("is_relative")
  private java.lang.Boolean isRelative;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("is_relative_request")
  private java.lang.Boolean isRelativeRequest;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("is_visiting_nurse")
  private java.lang.Boolean isVisitingNurse;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("is_visiting_nurse_request")
  private java.lang.Boolean isVisitingNurseRequest;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("profile_mail")
  private java.lang.String profileMail;

  /**
   * A generic response message Summary: This message class is intended for returning a generic
   * response. Attributes: code = HTTP code of the response [REQUIRED] message = Text message of the
   * response [REQUIRED] doOperation = Boolean value to determine if there's an operation to do
   * according to the response payload = Optional textual payload of the response user =
   * RegisterUserMessage of a related invocation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MainDefaultResponseMessage response;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsCaregiver() {
    return isCaregiver;
  }

  /**
   * @param isCaregiver isCaregiver or {@code null} for none
   */
  public MainUserRelationsMessage setIsCaregiver(java.lang.Boolean isCaregiver) {
    this.isCaregiver = isCaregiver;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsCaregiverRequest() {
    return isCaregiverRequest;
  }

  /**
   * @param isCaregiverRequest isCaregiverRequest or {@code null} for none
   */
  public MainUserRelationsMessage setIsCaregiverRequest(java.lang.Boolean isCaregiverRequest) {
    this.isCaregiverRequest = isCaregiverRequest;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsPatient() {
    return isPatient;
  }

  /**
   * @param isPatient isPatient or {@code null} for none
   */
  public MainUserRelationsMessage setIsPatient(java.lang.Boolean isPatient) {
    this.isPatient = isPatient;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsPatientRequest() {
    return isPatientRequest;
  }

  /**
   * @param isPatientRequest isPatientRequest or {@code null} for none
   */
  public MainUserRelationsMessage setIsPatientRequest(java.lang.Boolean isPatientRequest) {
    this.isPatientRequest = isPatientRequest;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsPcPhysician() {
    return isPcPhysician;
  }

  /**
   * @param isPcPhysician isPcPhysician or {@code null} for none
   */
  public MainUserRelationsMessage setIsPcPhysician(java.lang.Boolean isPcPhysician) {
    this.isPcPhysician = isPcPhysician;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsPcPhysicianRequest() {
    return isPcPhysicianRequest;
  }

  /**
   * @param isPcPhysicianRequest isPcPhysicianRequest or {@code null} for none
   */
  public MainUserRelationsMessage setIsPcPhysicianRequest(java.lang.Boolean isPcPhysicianRequest) {
    this.isPcPhysicianRequest = isPcPhysicianRequest;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsRelative() {
    return isRelative;
  }

  /**
   * @param isRelative isRelative or {@code null} for none
   */
  public MainUserRelationsMessage setIsRelative(java.lang.Boolean isRelative) {
    this.isRelative = isRelative;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsRelativeRequest() {
    return isRelativeRequest;
  }

  /**
   * @param isRelativeRequest isRelativeRequest or {@code null} for none
   */
  public MainUserRelationsMessage setIsRelativeRequest(java.lang.Boolean isRelativeRequest) {
    this.isRelativeRequest = isRelativeRequest;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsVisitingNurse() {
    return isVisitingNurse;
  }

  /**
   * @param isVisitingNurse isVisitingNurse or {@code null} for none
   */
  public MainUserRelationsMessage setIsVisitingNurse(java.lang.Boolean isVisitingNurse) {
    this.isVisitingNurse = isVisitingNurse;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsVisitingNurseRequest() {
    return isVisitingNurseRequest;
  }

  /**
   * @param isVisitingNurseRequest isVisitingNurseRequest or {@code null} for none
   */
  public MainUserRelationsMessage setIsVisitingNurseRequest(java.lang.Boolean isVisitingNurseRequest) {
    this.isVisitingNurseRequest = isVisitingNurseRequest;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getProfileMail() {
    return profileMail;
  }

  /**
   * @param profileMail profileMail or {@code null} for none
   */
  public MainUserRelationsMessage setProfileMail(java.lang.String profileMail) {
    this.profileMail = profileMail;
    return this;
  }

  /**
   * A generic response message Summary: This message class is intended for returning a generic
   * response. Attributes: code = HTTP code of the response [REQUIRED] message = Text message of the
   * response [REQUIRED] doOperation = Boolean value to determine if there's an operation to do
   * according to the response payload = Optional textual payload of the response user =
   * RegisterUserMessage of a related invocation
   * @return value or {@code null} for none
   */
  public MainDefaultResponseMessage getResponse() {
    return response;
  }

  /**
   * A generic response message Summary: This message class is intended for returning a generic
   * response. Attributes: code = HTTP code of the response [REQUIRED] message = Text message of the
   * response [REQUIRED] doOperation = Boolean value to determine if there's an operation to do
   * according to the response payload = Optional textual payload of the response user =
   * RegisterUserMessage of a related invocation
   * @param response response or {@code null} for none
   */
  public MainUserRelationsMessage setResponse(MainDefaultResponseMessage response) {
    this.response = response;
    return this;
  }

  @Override
  public MainUserRelationsMessage set(String fieldName, Object value) {
    return (MainUserRelationsMessage) super.set(fieldName, value);
  }

  @Override
  public MainUserRelationsMessage clone() {
    return (MainUserRelationsMessage) super.clone();
  }

}
