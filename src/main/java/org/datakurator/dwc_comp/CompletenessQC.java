/**
 * CompletenessQC.java
 *
 * Copyright 2017 President and Fellows of Harvard College
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.datakurator.dwc_comp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.datakurator.ffdq.annotations.*;
import org.datakurator.ffdq.api.DQResponse;
import org.datakurator.ffdq.model.report.ResultState;
import org.datakurator.ffdq.model.report.result.CompletenessValue;

/**
 * @author mole
 *
 */
@DQClass("cc4fb957-2a4f-443f-8631-7356162fbb2d")
public class CompletenessQC {

	private static final Log logger = LogFactory.getLog(CompletenessQC.class);

	@DQProvides("2f32a5b5-6649-43da-b820-5005dea846e0")
	public static DQResponse<CompletenessValue> isBasisOfRecordSingleRecordComplete(@DQParam("dwc:basisOfRecord") String basisOfRecord) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(basisOfRecord)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:basisOfRecord contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:basisOfRecord is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("497a42f1-3a03-4c00-aa40-89166bcf4ff3")
	public static DQResponse<CompletenessValue> isClassSingleRecordComplete(@DQParam("dwc:class") String phylclass) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(phylclass)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:class contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:class is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("c008761c-0421-4303-8c22-9fb531747836")
	public static DQResponse<CompletenessValue> isContinentSingleRecordComplete(@DQParam("dwc:continent") String continent) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(continent)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:continent contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:continent is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("27cf8f08-402d-4d88-8d87-98adfd32ac15")
	public static DQResponse<CompletenessValue> isCoordinatePrecisionSingleRecordComplete(@DQParam("dwc:coordinatePrecision") String coordinatePrecision) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(coordinatePrecision)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:coordinatePrecision contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:coordinatePrecision is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("3badf459-d7d2-476c-8618-26308b5638a3")
	public static DQResponse<CompletenessValue> isCoordinateUncertantyInMetersSingleRecordComplete(@DQParam("dwc:coordinateUncertantyInMeters") String coordinateUncertantyInMeters) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(coordinateUncertantyInMeters)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:coordinateUncertantyInMeters contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:coordinateUncertantyInMeters is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("77f3df14-6f9b-466a-be72-44b2cd3b84de")
	public static DQResponse<CompletenessValue> isCountrySingleRecordComplete(@DQParam("dwc:country") String country) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(country)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:country contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:country is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("026ff557-4d48-48e8-b9b8-5f8f26177b51")
	public static DQResponse<CompletenessValue> isCountryCodeSingleRecordComplete(@DQParam("dwc:countryCode") String countryCode) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(countryCode)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:countryCode contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:countryCode is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("9a9dda02-0f06-42ef-90b6-0367d589fb3a")
	public static DQResponse<CompletenessValue> isCountySingleRecordComplete(@DQParam("dwc:county") String county) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(county)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:county contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:county is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("5fe7e63e-2b33-40db-869d-d9946138bbec")
	public static DQResponse<CompletenessValue> isDataGeneralizationsSingleRecordComplete(@DQParam("dwc:dataGeneralizations") String dataGeneralizations) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(dataGeneralizations)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:dataGeneralizations contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:dataGeneralizations is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("9d149637-f3d5-4ceb-a077-79fa41857fee")
	public static DQResponse<CompletenessValue> isDateIdentifiedSingleRecordComplete(@DQParam("dwc:dateIdentified") String dateIdentified) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(dateIdentified)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:dateIdentified contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:dateIdentified is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("826500f7-05d4-4969-a0a8-91c41a2951ce")
	public static DQResponse<CompletenessValue> isDaySingleRecordComplete(@DQParam("dwc:day") String day) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(day)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:day contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:day is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("d275a0c3-e017-47e0-ad46-3301db0288cc")
	public static DQResponse<CompletenessValue> isDctermsLicenseSingleRecordComplete(@DQParam("dcterms:license") String dctermsLicense) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(dctermsLicense)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dcterms:license contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dcterms:license is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("35feec23-fa65-4dd7-ba17-3e9c02f1c03c")
	public static DQResponse<CompletenessValue> isDctermsModifiedSingleRecordComplete(@DQParam("dcterms:modified") String dctermsModified) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(dctermsModified)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dcterms:modified contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dcterms:modified is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("c287c6d9-7eb9-4af9-a9eb-96e5cd2be5eb")
	public static DQResponse<CompletenessValue> isDctermsTypeSingleRecordComplete(@DQParam("dcterms:type") String dctermsType) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(dctermsType)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dcterms:type contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dcterms:type is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("9357dd62-be48-4df1-b024-06a3d2551a79")
	public static DQResponse<CompletenessValue> isDecimalLatitudeSingleRecordComplete(@DQParam("dwc:decimalLatitude") String decimalLatitude) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(decimalLatitude)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:decimalLatitude contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:decimalLatitude is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("25823f44-d9dc-406d-ac5e-6a4d1f726f55")
	public static DQResponse<CompletenessValue> isDecimalLongitudeSingleRecordComplete(@DQParam("dwc:decimalLongitude") String decimalLongitude) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(decimalLongitude)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:decimalLongitude contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:decimalLongitude is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("6b1d1225-8a72-465a-9be5-7cb2b5323631")
	public static DQResponse<CompletenessValue> isDispositionSingleRecordComplete(@DQParam("dwc:disposition") String disposition) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(disposition)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:disposition contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:disposition is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("8e257987-dd37-4959-a250-061524cfcb03")
	public static DQResponse<CompletenessValue> isEndDayOfYearSingleRecordComplete(@DQParam("dwc:endDayOfYear") String endDayOfYear) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(endDayOfYear)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:endDayOfYear contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:endDayOfYear is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("197b673e-a1e0-4a9a-923d-8bde0be5d063")
	public static DQResponse<CompletenessValue> isEstablishmentMeansSingleRecordComplete(@DQParam("dwc:establishmentMeans") String establishmentMeans) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(establishmentMeans)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:establishmentMeans contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:establishmentMeans is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("ac109e78-ab36-4469-b12e-6190169987c6")
	public static DQResponse<CompletenessValue> isEventDateSingleRecordComplete(@DQParam("dwc:eventDate") String eventDate) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(eventDate)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:eventDate contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:eventDate is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("4fb70443-0796-4543-a254-251e4415f468")
	public static DQResponse<CompletenessValue> isEventTimeSingleRecordComplete(@DQParam("dwc:eventTime") String eventTime) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(eventTime)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:eventTime contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:eventTime is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("5a14e579-8789-4ea8-8de8-ec937033584e")
	public static DQResponse<CompletenessValue> isFamilySingleRecordComplete(@DQParam("dwc:family") String family) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(family)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:family contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:family is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("d54866ad-4cf7-4195-99c4-b241d799b470")
	public static DQResponse<CompletenessValue> isFootprintWKTSingleRecordComplete(@DQParam("dwc:footprintWKT") String footprintWKT) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(footprintWKT)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:footprintWKT contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:footprintWKT is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("19cd65d9-e924-4a44-9927-4ff825da4593")
	public static DQResponse<CompletenessValue> isGenusSingleRecordComplete(@DQParam("dwc:genus") String genus) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(genus)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:genus contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:genus is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("e5e5d6cd-a120-4910-9bf8-1e6de5605718")
	public static DQResponse<CompletenessValue> isGeodeticDatumSingleRecordComplete(@DQParam("dwc:geodeticDatum") String geodeticDatum) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(geodeticDatum)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:geodeticDatum contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:geodeticDatum is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("c7cfb176-234e-4e30-aab0-6730769dcb0a")
	public static DQResponse<CompletenessValue> isGeoreferenceDateSingleRecordComplete(@DQParam("dwc:georeferenceDate") String georeferenceDate) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(georeferenceDate)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:georeferenceDate contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:georeferenceDate is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("09c48400-dd82-42f1-a605-a2035be8eb9e")
	public static DQResponse<CompletenessValue> isGeoreferenceVerificationStatusSingleRecordComplete(@DQParam("dwc:georeferenceVerificationStatus") String georeferenceVerificationStatus) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(georeferenceVerificationStatus)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:georeferenceVerificationStatus contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:georeferenceVerificationStatus is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("00e014d3-2556-4cf7-a70a-dac35d7260d7")
	public static DQResponse<CompletenessValue> isHigherClassificationSingleRecordComplete(@DQParam("dwc:higherClassification") String higherClassification) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(higherClassification)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:higherClassification contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:higherClassification is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("4897044e-1453-4800-ba69-6a00e7e60e51")
	public static DQResponse<CompletenessValue> isHigherGeographySingleRecordComplete(@DQParam("dwc:higherGeography") String higherGeography) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(higherGeography)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:higherGeography contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:higherGeography is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("e7781304-5579-4827-aa37-704f67269b11")
	public static DQResponse<CompletenessValue> isIdentificationQualifierSingleRecordComplete(@DQParam("dwc:identificationQualifier") String identificationQualifier) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(identificationQualifier)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:identificationQualifier contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:identificationQualifier is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("ffb325a0-49c9-4e25-b42f-fac8db38dfd6")
	public static DQResponse<CompletenessValue> isIndividualCountSingleRecordComplete(@DQParam("dwc:individualCount") String individualCount) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(individualCount)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:individualCount contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:individualCount is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("b41020ce-3754-4021-902b-8b2a13bafd1a")
	public static DQResponse<CompletenessValue> isInfraspecificEpithetSingleRecordComplete(@DQParam("dwc:infraspecificEpithet") String infraspecificEpithet) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(infraspecificEpithet)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:infraspecificEpithet contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:infraspecificEpithet is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("84f78541-81a8-44a0-a650-ea6d0e18f18e")
	public static DQResponse<CompletenessValue> isIslandSingleRecordComplete(@DQParam("dwc:island") String island) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(island)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:island contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:island is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("458603eb-0ed1-443b-8a1b-99f44620d399")
	public static DQResponse<CompletenessValue> isIslandGroupSingleRecordComplete(@DQParam("dwc:islandGroup") String islandGroup) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(islandGroup)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:islandGroup contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:islandGroup is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("e83e093d-b28e-489a-acc6-5c8b0fb47a08")
	public static DQResponse<CompletenessValue> isKingdomSingleRecordComplete(@DQParam("dwc:kingdom") String kingdom) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(kingdom)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:kingdom contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:kingdom is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("e8b20ac3-e9c4-49cf-a816-d92faaa5faa7")
	public static DQResponse<CompletenessValue> isLifeStageSingleRecordComplete(@DQParam("dwc:lifeStage") String lifeStage) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(lifeStage)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:lifeStage contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:lifeStage is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("807a29e3-dd2c-4c2a-8c12-da97b1749f93")
	public static DQResponse<CompletenessValue> isLocalitySingleRecordComplete(@DQParam("dwc:locality") String locality) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(locality)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:locality contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:locality is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("e0814fc2-73db-4244-a538-fde458c904ec")
	public static DQResponse<CompletenessValue> isMaximumDepthInMetersSingleRecordComplete(@DQParam("dwc:maximumDepthInMeters") String maximumDepthInMeters) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(maximumDepthInMeters)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:maximumDepthInMeters contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:maximumDepthInMeters is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("e66c7d1f-1b3d-43a2-b3ab-9f45be0f7168")
	public static DQResponse<CompletenessValue> isMaximumElevationInMetersSingleRecordComplete(@DQParam("dwc:maximumElevationInMeters") String maximumElevationInMeters) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(maximumElevationInMeters)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:maximumElevationInMeters contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:maximumElevationInMeters is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("3f26b083-4b8b-409b-9036-ee1db7c49938")
	public static DQResponse<CompletenessValue> isMinimumDepthInMetersSingleRecordComplete(@DQParam("dwc:minimumDepthInMeters") String minimumDepthInMeters) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(minimumDepthInMeters)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:minimumDepthInMeters contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:minimumDepthInMeters is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("3b2d48b7-4949-4a03-833c-545c7ba6be49")
	public static DQResponse<CompletenessValue> isMinimumElevationInMetersSingleRecordComplete(@DQParam("dwc:minimumElevationInMeters") String minimumElevationInMeters) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(minimumElevationInMeters)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:minimumElevationInMeters contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:minimumElevationInMeters is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("d950775d-70e0-4106-8369-8d2a890fcb34")
	public static DQResponse<CompletenessValue> isMonthSingleRecordComplete(@DQParam("dwc:month") String month) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(month)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:month contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:month is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("bf0475a3-7ae0-4289-baa0-e890562d4560")
	public static DQResponse<CompletenessValue> isMunicipalitySingleRecordComplete(@DQParam("dwc:municipality") String municipality) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(municipality)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:municipality contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:municipality is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("806fe7e3-daf4-43bb-8f9c-29948c02e230")
	public static DQResponse<CompletenessValue> isNamePublishedInYearSingleRecordComplete(@DQParam("dwc:namePublishedInYear") String namePublishedInYear) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(namePublishedInYear)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:namePublishedInYear contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:namePublishedInYear is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("93d2dc26-3c55-49ae-aa77-cf9ff882cfa5")
	public static DQResponse<CompletenessValue> isOccurrenceIDSingleRecordComplete(@DQParam("dwc:occurrenceID") String occurrenceID) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(occurrenceID)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:occurrenceID contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:occurrenceID is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("e091d3a9-2bf4-4f4c-80a6-9aeaf9f8c700")
	public static DQResponse<CompletenessValue> isOccurrenceStatusSingleRecordComplete(@DQParam("dwc:occurrenceStatus") String occurrenceStatus) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(occurrenceStatus)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:occurrenceStatus contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:occurrenceStatus is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("1a77cdc6-adda-4132-8086-ad0618ca5b1f")
	public static DQResponse<CompletenessValue> isOrderSingleRecordComplete(@DQParam("dwc:order") String order) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(order)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:order contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:order is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("cba540ec-8176-4d73-b6e7-48da13c97559")
	public static DQResponse<CompletenessValue> isPhylumSingleRecordComplete(@DQParam("dwc:phylum") String phylum) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(phylum)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:phylum contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:phylum is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("65df1295-18eb-4e58-9f10-73b57883857f")
	public static DQResponse<CompletenessValue> isPreparationsSingleRecordComplete(@DQParam("dwc:preparations") String preparations) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(preparations)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:preparations contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:preparations is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("565a049b-9b51-48ba-83c2-ec3d6e9f5939")
	public static DQResponse<CompletenessValue> isRecordedBySingleRecordComplete(@DQParam("dwc:recordedBy") String recordedBy) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(recordedBy)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:recordedBy contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:recordedBy is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("35a8a879-04f0-48cc-a6f4-846c1917583b")
	public static DQResponse<CompletenessValue> isRecordNumberSingleRecordComplete(@DQParam("dwc:recordNumber") String recordNumber) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(recordNumber)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:recordNumber contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:recordNumber is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("9f641504-713b-4053-bf10-196fd0852819")
	public static DQResponse<CompletenessValue> isRelationshipOfResourceSingleRecordComplete(@DQParam("dwc:relationshipOfResource") String relationshipOfResource) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(relationshipOfResource)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:relationshipOfResource contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:relationshipOfResource is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("7a37cd18-a1b2-46ed-866c-c73e2347f6cb")
	public static DQResponse<CompletenessValue> isReproductiveConditionSingleRecordComplete(@DQParam("dwc:reproductiveCondition") String reproductiveCondition) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(reproductiveCondition)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:reproductiveCondition contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:reproductiveCondition is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("a0a7452d-ce1c-4b2e-9407-94221c60c44a")
	public static DQResponse<CompletenessValue> isScientificNameSingleRecordComplete(@DQParam("dwc:scientificName") String scientificName) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(scientificName)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:scientificName contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:scientificName is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("a2268d72-fb28-4656-9575-bd33a99420d9")
	public static DQResponse<CompletenessValue> isScientificNameAuthorshipSingleRecordComplete(@DQParam("dwc:scientificNameAuthorship") String scientificNameAuthorship) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(scientificNameAuthorship)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:scientificNameAuthorship contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:scientificNameAuthorship is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("aafde1a2-2846-47bc-afb4-199b3ebd355a")
	public static DQResponse<CompletenessValue> isSexSingleRecordComplete(@DQParam("dwc:sex") String sex) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(sex)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:sex contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:sex is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("9870a318-9377-4dd8-b0c2-805327057883")
	public static DQResponse<CompletenessValue> isSpecificEpithetSingleRecordComplete(@DQParam("dwc:specificEpithet") String specificEpithet) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(specificEpithet)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:specificEpithet contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:specificEpithet is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("d2fdb144-faa7-4687-9c52-9e3eba56472b")
	public static DQResponse<CompletenessValue> isStartDayOfYearSingleRecordComplete(@DQParam("dwc:startDayOfYear") String startDayOfYear) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(startDayOfYear)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:startDayOfYear contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:startDayOfYear is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("c020d212-f97d-46f9-8f60-ce85937d340f")
	public static DQResponse<CompletenessValue> isStateProvinceSingleRecordComplete(@DQParam("dwc:stateProvince") String stateProvince) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(stateProvince)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:stateProvince contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:stateProvince is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("ba82ef8a-ab57-4ceb-a1f6-25411fe7a89f")
	public static DQResponse<CompletenessValue> isSubgenusSingleRecordComplete(@DQParam("dwc:subgenus") String subgenus) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(subgenus)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:subgenus contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:subgenus is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("13b2314d-2203-416a-ac1f-1483282d6d2b")
	public static DQResponse<CompletenessValue> isTaxonRankSingleRecordComplete(@DQParam("dwc:taxonRank") String taxonRank) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(taxonRank)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:taxonRank contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:taxonRank is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("762921f7-6bad-4cbf-87d8-02b40dd389dd")
	public static DQResponse<CompletenessValue> isTypeStatusSingleRecordComplete(@DQParam("dwc:typeStatus") String typeStatus) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(typeStatus)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:typeStatus contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:typeStatus is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("c7a2d7c3-d070-4a04-b085-b0eacb434ff4")
	public static DQResponse<CompletenessValue> isVerbatimCoordinatesSingleRecordComplete(@DQParam("dwc:verbatimCoordinates") String verbatimCoordinates) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(verbatimCoordinates)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:verbatimCoordinates contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:verbatimCoordinates is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("45c96ed4-7ced-4160-9aa6-b2ba8d92b6ae")
	public static DQResponse<CompletenessValue> isVerbatimDepthSingleRecordComplete(@DQParam("dwc:verbatimDepth") String verbatimDepth) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(verbatimDepth)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:verbatimDepth contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:verbatimDepth is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("2be10ba0-fdcc-49ef-9da4-4d6f5f24e5bc")
	public static DQResponse<CompletenessValue> isVerbatimElevationSingleRecordComplete(@DQParam("dwc:verbatimElevation") String verbatimElevation) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(verbatimElevation)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:verbatimElevation contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:verbatimElevation is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("3faa9931-7787-49e7-a5bc-60bb67f385e7")
	public static DQResponse<CompletenessValue> isVerbatimEventDateSingleRecordComplete(@DQParam("dwc:verbatimEventDate") String verbatimEventDate) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(verbatimEventDate)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:verbatimEventDate contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:verbatimEventDate is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("f6cf6312-d98e-434c-be85-25ae91a45b7a")
	public static DQResponse<CompletenessValue> isVerbatimLatitudeSingleRecordComplete(@DQParam("dwc:verbatimLatitude") String verbatimLatitude) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(verbatimLatitude)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:verbatimLatitude contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:verbatimLatitude is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("5b5478c3-340b-4b43-80f6-ce20c3307023")
	public static DQResponse<CompletenessValue> isVerbatimLongitudeSingleRecordComplete(@DQParam("dwc:verbatimLongitude") String verbatimLongitude) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(verbatimLongitude)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:verbatimLongitude contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:verbatimLongitude is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("72709e74-e1fd-435c-9230-5be9446639f9")
	public static DQResponse<CompletenessValue> isVerbatimSRSSingleRecordComplete(@DQParam("dwc:verbatimSRS") String verbatimSRS) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(verbatimSRS)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:verbatimSRS contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:verbatimSRS is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("174c1bf3-9f54-4b9b-92b0-8611cb675f81")
	public static DQResponse<CompletenessValue> isVernacularNameSingleRecordComplete(@DQParam("dwc:vernacularName") String vernacularName) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(vernacularName)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:vernacularName contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:vernacularName is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("d0e9826f-72d2-408c-a071-1515d2204894")
	public static DQResponse<CompletenessValue> isWaterBodySingleRecordComplete(@DQParam("dwc:waterBody") String waterBody) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(waterBody)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:waterBody contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:waterBody is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


	@DQProvides("e139d0e5-9772-459a-bf2a-3c017f9fbdeb")
	public static DQResponse<CompletenessValue> isYearSingleRecordComplete(@DQParam("dwc:year") String year) {
		DQResponse<CompletenessValue> result = new DQResponse<>();
		result.setResultState(ResultState.NOT_RUN);
		if (CompletenessUtils.hasValue(year)) {
			result.setValue(CompletenessValue.COMPLETE);
			result.addComment("dwc:year contains a value (which may or may not be a valid value)");
		} else {
			result.setValue(CompletenessValue.NOT_COMPLETE);
			result.addComment("dwc:year is null, empty, or otherwise does not contain a value.");
		}
		result.setResultState(ResultState.RUN_HAS_RESULT);
		return result;
	}


}
