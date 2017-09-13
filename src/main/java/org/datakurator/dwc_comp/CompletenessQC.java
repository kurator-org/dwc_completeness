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
import org.datakurator.dwc_comp.ffdq_imp.CompDQMeasurement;
import org.datakurator.ffdq.annotations.ActedUpon;
import org.datakurator.ffdq.annotations.Measure;
import org.datakurator.ffdq.annotations.Mechanism;
import org.datakurator.ffdq.annotations.PostEnhancement;
import org.datakurator.ffdq.annotations.PreEnhancement;
import org.datakurator.ffdq.annotations.Provides;
import org.datakurator.ffdq.annotations.Specification;
import org.datakurator.ffdq.api.EnumDQMeasurementResult;
import org.datakurator.ffdq.api.EnumDQResultState;

/**
 * @author mole
 *
 */
@Mechanism("Kurator: DWC Completness - CompletnessQC")
public class CompletenessQC {
	
	private static final Log logger = LogFactory.getLog(CompletenessQC.class);
	
    @Provides(value = "2f32a5b5-6649-43da-b820-5005dea846e0")
    @Measure(label = "MEASURE_BASISOFRECORD_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:basisOfRecord " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if basisOfRecord is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isBasisOfRecordSingleRecordComplete(@ActedUpon(value="basisOfRecord") String basisOfRecord) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(basisOfRecord)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:basisOfRecord contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:basisOfRecord is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "497a42f1-3a03-4c00-aa40-89166bcf4ff3")
    @Measure(label = "MEASURE_CLASS_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:class " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if class is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isClassSingleRecordComplete(@ActedUpon(value="class") String phylclass) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(phylclass)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:class contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:class is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "c008761c-0421-4303-8c22-9fb531747836")
    @Measure(label = "MEASURE_CONTINENT_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:continent " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if continent is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isContinentSingleRecordComplete(@ActedUpon(value="continent") String continent) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(continent)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:continent contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:continent is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "27cf8f08-402d-4d88-8d87-98adfd32ac15")
    @Measure(label = "MEASURE_COORDINATEPRECISION_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:coordinatePrecision " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if coordinatePrecision is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isCoordinatePrecisionSingleRecordComplete(@ActedUpon(value="coordinatePrecision") String coordinatePrecision) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(coordinatePrecision)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:coordinatePrecision contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:coordinatePrecision is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "3badf459-d7d2-476c-8618-26308b5638a3")
    @Measure(label = "MEASURE_COORDINATEUNCERTANTYINMETERS_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:coordinateUncertantyInMeters " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if coordinateUncertantyInMeters is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isCoordinateUncertantyInMetersSingleRecordComplete(@ActedUpon(value="coordinateUncertantyInMeters") String coordinateUncertantyInMeters) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(coordinateUncertantyInMeters)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:coordinateUncertantyInMeters contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:coordinateUncertantyInMeters is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "77f3df14-6f9b-466a-be72-44b2cd3b84de")
    @Measure(label = "MEASURE_COUNTRY_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:country " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if country is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isCountrySingleRecordComplete(@ActedUpon(value="country") String country) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(country)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:country contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:country is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "026ff557-4d48-48e8-b9b8-5f8f26177b51")
    @Measure(label = "MEASURE_COUNTRYCODE_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:countryCode " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if countryCode is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isCountryCodeSingleRecordComplete(@ActedUpon(value="countryCode") String countryCode) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(countryCode)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:countryCode contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:countryCode is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "9a9dda02-0f06-42ef-90b6-0367d589fb3a")
    @Measure(label = "MEASURE_COUNTY_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:county " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if county is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isCountySingleRecordComplete(@ActedUpon(value="county") String county) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(county)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:county contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:county is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "5fe7e63e-2b33-40db-869d-d9946138bbec")
    @Measure(label = "MEASURE_DATAGENERALIZATIONS_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:dataGeneralizations " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if dataGeneralizations is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isDataGeneralizationsSingleRecordComplete(@ActedUpon(value="dataGeneralizations") String dataGeneralizations) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(dataGeneralizations)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:dataGeneralizations contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:dataGeneralizations is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "9d149637-f3d5-4ceb-a077-79fa41857fee")
    @Measure(label = "MEASURE_DATEIDENTIFIED_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:dateIdentified " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if dateIdentified is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isDateIdentifiedSingleRecordComplete(@ActedUpon(value="dateIdentified") String dateIdentified) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(dateIdentified)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:dateIdentified contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:dateIdentified is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "826500f7-05d4-4969-a0a8-91c41a2951ce")
    @Measure(label = "MEASURE_DAY_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:day " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if day is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isDaySingleRecordComplete(@ActedUpon(value="day") String day) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(day)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:day contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:day is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "d275a0c3-e017-47e0-ad46-3301db0288cc")
    @Measure(label = "MEASURE_DCTERMS_LICENSE_SINGLE_COMPLETENESS", description = "Test to see whether a provided dcterms:license " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if dcterms:license is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isDctermsLicenseSingleRecordComplete(@ActedUpon(value="dcterms:license") String dctermsLicense) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(dctermsLicense)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dcterms:license contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dcterms:license is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "35feec23-fa65-4dd7-ba17-3e9c02f1c03c")
    @Measure(label = "MEASURE_DCTERMS_MODIFIED_SINGLE_COMPLETENESS", description = "Test to see whether a provided dcterms:modified " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if dcterms:modified is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isDctermsModifiedSingleRecordComplete(@ActedUpon(value="dcterms:modified") String dctermsModified) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(dctermsModified)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dcterms:modified contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dcterms:modified is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "c287c6d9-7eb9-4af9-a9eb-96e5cd2be5eb")
    @Measure(label = "MEASURE_DCTERMS_TYPE_SINGLE_COMPLETENESS", description = "Test to see whether a provided dcterms:type " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if dcterms:type is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isDctermsTypeSingleRecordComplete(@ActedUpon(value="dcterms:type") String dctermsType) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(dctermsType)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dcterms:type contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dcterms:type is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "9357dd62-be48-4df1-b024-06a3d2551a79")
    @Measure(label = "MEASURE_DECIMALLATITUDE_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:decimalLatitude " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if decimalLatitude is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isDecimalLatitudeSingleRecordComplete(@ActedUpon(value="decimalLatitude") String decimalLatitude) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(decimalLatitude)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:decimalLatitude contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:decimalLatitude is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "25823f44-d9dc-406d-ac5e-6a4d1f726f55")
    @Measure(label = "MEASURE_DECIMALLONGITUDE_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:decimalLongitude " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if decimalLongitude is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isDecimalLongitudeSingleRecordComplete(@ActedUpon(value="decimalLongitude") String decimalLongitude) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(decimalLongitude)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:decimalLongitude contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:decimalLongitude is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "6b1d1225-8a72-465a-9be5-7cb2b5323631")
    @Measure(label = "MEASURE_DISPOSITION_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:disposition " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if disposition is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isDispositionSingleRecordComplete(@ActedUpon(value="disposition") String disposition) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(disposition)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:disposition contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:disposition is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "8e257987-dd37-4959-a250-061524cfcb03")
    @Measure(label = "MEASURE_ENDDAYOFYEAR_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:endDayOfYear " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if endDayOfYear is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isEndDayOfYearSingleRecordComplete(@ActedUpon(value="endDayOfYear") String endDayOfYear) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(endDayOfYear)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:endDayOfYear contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:endDayOfYear is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "197b673e-a1e0-4a9a-923d-8bde0be5d063")
    @Measure(label = "MEASURE_ESTABLISHMENTMEANS_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:establishmentMeans " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if establishmentMeans is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isEstablishmentMeansSingleRecordComplete(@ActedUpon(value="establishmentMeans") String establishmentMeans) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(establishmentMeans)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:establishmentMeans contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:establishmentMeans is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "ac109e78-ab36-4469-b12e-6190169987c6")
    @Measure(label = "MEASURE_EVENTDATE_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:eventDate " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if eventDate is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isEventDateSingleRecordComplete(@ActedUpon(value="eventDate") String eventDate) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(eventDate)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:eventDate contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:eventDate is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "4fb70443-0796-4543-a254-251e4415f468")
    @Measure(label = "MEASURE_EVENTTIME_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:eventTime " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if eventTime is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isEventTimeSingleRecordComplete(@ActedUpon(value="eventTime") String eventTime) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(eventTime)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:eventTime contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:eventTime is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "5a14e579-8789-4ea8-8de8-ec937033584e")
    @Measure(label = "MEASURE_FAMILY_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:family " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if family is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isFamilySingleRecordComplete(@ActedUpon(value="family") String family) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(family)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:family contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:family is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "d54866ad-4cf7-4195-99c4-b241d799b470")
    @Measure(label = "MEASURE_FOOTPRINTWKT_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:footprintWKT " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if footprintWKT is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isFootprintWKTSingleRecordComplete(@ActedUpon(value="footprintWKT") String footprintWKT) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(footprintWKT)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:footprintWKT contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:footprintWKT is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "19cd65d9-e924-4a44-9927-4ff825da4593")
    @Measure(label = "MEASURE_GENUS_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:genus " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if genus is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isGenusSingleRecordComplete(@ActedUpon(value="genus") String genus) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(genus)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:genus contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:genus is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "e5e5d6cd-a120-4910-9bf8-1e6de5605718")
    @Measure(label = "MEASURE_GEODETICDATUM_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:geodeticDatum " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if geodeticDatum is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isGeodeticDatumSingleRecordComplete(@ActedUpon(value="geodeticDatum") String geodeticDatum) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(geodeticDatum)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:geodeticDatum contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:geodeticDatum is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "c7cfb176-234e-4e30-aab0-6730769dcb0a")
    @Measure(label = "MEASURE_GEOREFERENCEDATE_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:georeferenceDate " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if georeferenceDate is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isGeoreferenceDateSingleRecordComplete(@ActedUpon(value="georeferenceDate") String georeferenceDate) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(georeferenceDate)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:georeferenceDate contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:georeferenceDate is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "09c48400-dd82-42f1-a605-a2035be8eb9e")
    @Measure(label = "MEASURE_GEOREFERENCEVERIFICATIONSTATUS_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:georeferenceVerificationStatus " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if georeferenceVerificationStatus is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isGeoreferenceVerificationStatusSingleRecordComplete(@ActedUpon(value="georeferenceVerificationStatus") String georeferenceVerificationStatus) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(georeferenceVerificationStatus)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:georeferenceVerificationStatus contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:georeferenceVerificationStatus is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "00e014d3-2556-4cf7-a70a-dac35d7260d7")
    @Measure(label = "MEASURE_HIGHERCLASSIFICATION_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:higherClassification " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if higherClassification is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isHigherClassificationSingleRecordComplete(@ActedUpon(value="higherClassification") String higherClassification) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(higherClassification)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:higherClassification contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:higherClassification is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "4897044e-1453-4800-ba69-6a00e7e60e51")
    @Measure(label = "MEASURE_HIGHERGEOGRAPHY_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:higherGeography " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if higherGeography is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isHigherGeographySingleRecordComplete(@ActedUpon(value="higherGeography") String higherGeography) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(higherGeography)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:higherGeography contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:higherGeography is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "e7781304-5579-4827-aa37-704f67269b11")
    @Measure(label = "MEASURE_IDENTIFICATIONQUALIFIER_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:identificationQualifier " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if identificationQualifier is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isIdentificationQualifierSingleRecordComplete(@ActedUpon(value="identificationQualifier") String identificationQualifier) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(identificationQualifier)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:identificationQualifier contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:identificationQualifier is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "ffb325a0-49c9-4e25-b42f-fac8db38dfd6")
    @Measure(label = "MEASURE_INDIVIDUALCOUNT_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:individualCount " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if individualCount is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isIndividualCountSingleRecordComplete(@ActedUpon(value="individualCount") String individualCount) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(individualCount)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:individualCount contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:individualCount is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "b41020ce-3754-4021-902b-8b2a13bafd1a")
    @Measure(label = "MEASURE_INFRASPECIFICEPITHET_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:infraspecificEpithet " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if infraspecificEpithet is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isInfraspecificEpithetSingleRecordComplete(@ActedUpon(value="infraspecificEpithet") String infraspecificEpithet) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(infraspecificEpithet)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:infraspecificEpithet contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:infraspecificEpithet is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "84f78541-81a8-44a0-a650-ea6d0e18f18e")
    @Measure(label = "MEASURE_ISLAND_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:island " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if island is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isIslandSingleRecordComplete(@ActedUpon(value="island") String island) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(island)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:island contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:island is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "458603eb-0ed1-443b-8a1b-99f44620d399")
    @Measure(label = "MEASURE_ISLANDGROUP_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:islandGroup " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if islandGroup is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isIslandGroupSingleRecordComplete(@ActedUpon(value="islandGroup") String islandGroup) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(islandGroup)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:islandGroup contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:islandGroup is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "e83e093d-b28e-489a-acc6-5c8b0fb47a08")
    @Measure(label = "MEASURE_KINGDOM_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:kingdom " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if kingdom is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isKingdomSingleRecordComplete(@ActedUpon(value="kingdom") String kingdom) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(kingdom)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:kingdom contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:kingdom is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "e8b20ac3-e9c4-49cf-a816-d92faaa5faa7")
    @Measure(label = "MEASURE_LIFESTAGE_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:lifeStage " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if lifeStage is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isLifeStageSingleRecordComplete(@ActedUpon(value="lifeStage") String lifeStage) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(lifeStage)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:lifeStage contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:lifeStage is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "807a29e3-dd2c-4c2a-8c12-da97b1749f93")
    @Measure(label = "MEASURE_LOCALITY_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:locality " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if locality is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isLocalitySingleRecordComplete(@ActedUpon(value="locality") String locality) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(locality)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:locality contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:locality is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "e0814fc2-73db-4244-a538-fde458c904ec")
    @Measure(label = "MEASURE_MAXIMUMDEPTHINMETERS_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:maximumDepthInMeters " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if maximumDepthInMeters is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isMaximumDepthInMetersSingleRecordComplete(@ActedUpon(value="maximumDepthInMeters") String maximumDepthInMeters) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(maximumDepthInMeters)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:maximumDepthInMeters contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:maximumDepthInMeters is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "e66c7d1f-1b3d-43a2-b3ab-9f45be0f7168")
    @Measure(label = "MEASURE_MAXIMUMELEVATIONINMETERS_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:maximumElevationInMeters " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if maximumElevationInMeters is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isMaximumElevationInMetersSingleRecordComplete(@ActedUpon(value="maximumElevationInMeters") String maximumElevationInMeters) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(maximumElevationInMeters)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:maximumElevationInMeters contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:maximumElevationInMeters is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "3f26b083-4b8b-409b-9036-ee1db7c49938")
    @Measure(label = "MEASURE_MINIMUMDEPTHINMETERS_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:minimumDepthInMeters " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if minimumDepthInMeters is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isMinimumDepthInMetersSingleRecordComplete(@ActedUpon(value="minimumDepthInMeters") String minimumDepthInMeters) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(minimumDepthInMeters)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:minimumDepthInMeters contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:minimumDepthInMeters is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "3b2d48b7-4949-4a03-833c-545c7ba6be49")
    @Measure(label = "MEASURE_MINIMUMELEVATIONINMETERS_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:minimumElevationInMeters " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if minimumElevationInMeters is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isMinimumElevationInMetersSingleRecordComplete(@ActedUpon(value="minimumElevationInMeters") String minimumElevationInMeters) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(minimumElevationInMeters)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:minimumElevationInMeters contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:minimumElevationInMeters is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "d950775d-70e0-4106-8369-8d2a890fcb34")
    @Measure(label = "MEASURE_MONTH_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:month " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if month is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isMonthSingleRecordComplete(@ActedUpon(value="month") String month) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(month)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:month contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:month is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "bf0475a3-7ae0-4289-baa0-e890562d4560")
    @Measure(label = "MEASURE_MUNICIPALITY_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:municipality " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if municipality is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isMunicipalitySingleRecordComplete(@ActedUpon(value="municipality") String municipality) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(municipality)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:municipality contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:municipality is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "806fe7e3-daf4-43bb-8f9c-29948c02e230")
    @Measure(label = "MEASURE_NAMEPUBLISHEDINYEAR_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:namePublishedInYear " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if namePublishedInYear is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isNamePublishedInYearSingleRecordComplete(@ActedUpon(value="namePublishedInYear") String namePublishedInYear) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(namePublishedInYear)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:namePublishedInYear contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:namePublishedInYear is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "93d2dc26-3c55-49ae-aa77-cf9ff882cfa5")
    @Measure(label = "MEASURE_OCCURRENCEID_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:occurrenceID " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if occurrenceID is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isOccurrenceIDSingleRecordComplete(@ActedUpon(value="occurrenceID") String occurrenceID) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(occurrenceID)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:occurrenceID contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:occurrenceID is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "e091d3a9-2bf4-4f4c-80a6-9aeaf9f8c700")
    @Measure(label = "MEASURE_OCCURRENCESTATUS_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:occurrenceStatus " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if occurrenceStatus is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isOccurrenceStatusSingleRecordComplete(@ActedUpon(value="occurrenceStatus") String occurrenceStatus) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(occurrenceStatus)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:occurrenceStatus contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:occurrenceStatus is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "1a77cdc6-adda-4132-8086-ad0618ca5b1f")
    @Measure(label = "MEASURE_ORDER_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:order " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if order is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isOrderSingleRecordComplete(@ActedUpon(value="order") String order) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(order)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:order contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:order is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "cba540ec-8176-4d73-b6e7-48da13c97559")
    @Measure(label = "MEASURE_PHYLUM_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:phylum " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if phylum is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isPhylumSingleRecordComplete(@ActedUpon(value="phylum") String phylum) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(phylum)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:phylum contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:phylum is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "65df1295-18eb-4e58-9f10-73b57883857f")
    @Measure(label = "MEASURE_PREPARATIONS_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:preparations " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if preparations is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isPreparationsSingleRecordComplete(@ActedUpon(value="preparations") String preparations) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(preparations)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:preparations contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:preparations is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "565a049b-9b51-48ba-83c2-ec3d6e9f5939")
    @Measure(label = "MEASURE_RECORDEDBY_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:recordedBy " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if recordedBy is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isRecordedBySingleRecordComplete(@ActedUpon(value="recordedBy") String recordedBy) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(recordedBy)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:recordedBy contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:recordedBy is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "35a8a879-04f0-48cc-a6f4-846c1917583b")
    @Measure(label = "MEASURE_RECORDNUMBER_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:recordNumber " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if recordNumber is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isRecordNumberSingleRecordComplete(@ActedUpon(value="recordNumber") String recordNumber) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(recordNumber)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:recordNumber contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:recordNumber is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "9f641504-713b-4053-bf10-196fd0852819")
    @Measure(label = "MEASURE_RELATIONSHIPOFRESOURCE_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:relationshipOfResource " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if relationshipOfResource is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isRelationshipOfResourceSingleRecordComplete(@ActedUpon(value="relationshipOfResource") String relationshipOfResource) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(relationshipOfResource)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:relationshipOfResource contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:relationshipOfResource is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "7a37cd18-a1b2-46ed-866c-c73e2347f6cb")
    @Measure(label = "MEASURE_REPRODUCTIVECONDITION_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:reproductiveCondition " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if reproductiveCondition is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isReproductiveConditionSingleRecordComplete(@ActedUpon(value="reproductiveCondition") String reproductiveCondition) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(reproductiveCondition)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:reproductiveCondition contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:reproductiveCondition is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "a0a7452d-ce1c-4b2e-9407-94221c60c44a")
    @Measure(label = "MEASURE_SCIENTIFICNAME_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:scientificName " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if scientificName is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isScientificNameSingleRecordComplete(@ActedUpon(value="scientificName") String scientificName) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(scientificName)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:scientificName contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:scientificName is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "a2268d72-fb28-4656-9575-bd33a99420d9")
    @Measure(label = "MEASURE_SCIENTIFICNAMEAUTHORSHIP_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:scientificNameAuthorship " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if scientificNameAuthorship is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isScientificNameAuthorshipSingleRecordComplete(@ActedUpon(value="scientificNameAuthorship") String scientificNameAuthorship) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(scientificNameAuthorship)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:scientificNameAuthorship contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:scientificNameAuthorship is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "aafde1a2-2846-47bc-afb4-199b3ebd355a")
    @Measure(label = "MEASURE_SEX_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:sex " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if sex is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isSexSingleRecordComplete(@ActedUpon(value="sex") String sex) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(sex)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:sex contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:sex is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "9870a318-9377-4dd8-b0c2-805327057883")
    @Measure(label = "MEASURE_SPECIFICEPITHET_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:specificEpithet " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if specificEpithet is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isSpecificEpithetSingleRecordComplete(@ActedUpon(value="specificEpithet") String specificEpithet) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(specificEpithet)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:specificEpithet contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:specificEpithet is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "d2fdb144-faa7-4687-9c52-9e3eba56472b")
    @Measure(label = "MEASURE_STARTDAYOFYEAR_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:startDayOfYear " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if startDayOfYear is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isStartDayOfYearSingleRecordComplete(@ActedUpon(value="startDayOfYear") String startDayOfYear) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(startDayOfYear)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:startDayOfYear contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:startDayOfYear is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "c020d212-f97d-46f9-8f60-ce85937d340f")
    @Measure(label = "MEASURE_STATEPROVINCE_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:stateProvince " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if stateProvince is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isStateProvinceSingleRecordComplete(@ActedUpon(value="stateProvince") String stateProvince) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(stateProvince)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:stateProvince contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:stateProvince is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "ba82ef8a-ab57-4ceb-a1f6-25411fe7a89f")
    @Measure(label = "MEASURE_SUBGENUS_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:subgenus " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if subgenus is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isSubgenusSingleRecordComplete(@ActedUpon(value="subgenus") String subgenus) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(subgenus)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:subgenus contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:subgenus is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "13b2314d-2203-416a-ac1f-1483282d6d2b")
    @Measure(label = "MEASURE_TAXONRANK_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:taxonRank " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if taxonRank is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isTaxonRankSingleRecordComplete(@ActedUpon(value="taxonRank") String taxonRank) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(taxonRank)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:taxonRank contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:taxonRank is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "762921f7-6bad-4cbf-87d8-02b40dd389dd")
    @Measure(label = "MEASURE_TYPESTATUS_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:typeStatus " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if typeStatus is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isTypeStatusSingleRecordComplete(@ActedUpon(value="typeStatus") String typeStatus) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(typeStatus)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:typeStatus contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:typeStatus is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "c7a2d7c3-d070-4a04-b085-b0eacb434ff4")
    @Measure(label = "MEASURE_VERBATIMCOORDINATES_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:verbatimCoordinates " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if verbatimCoordinates is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isVerbatimCoordinatesSingleRecordComplete(@ActedUpon(value="verbatimCoordinates") String verbatimCoordinates) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(verbatimCoordinates)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:verbatimCoordinates contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:verbatimCoordinates is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "45c96ed4-7ced-4160-9aa6-b2ba8d92b6ae")
    @Measure(label = "MEASURE_VERBATIMDEPTH_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:verbatimDepth " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if verbatimDepth is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isVerbatimDepthSingleRecordComplete(@ActedUpon(value="verbatimDepth") String verbatimDepth) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(verbatimDepth)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:verbatimDepth contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:verbatimDepth is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "2be10ba0-fdcc-49ef-9da4-4d6f5f24e5bc")
    @Measure(label = "MEASURE_VERBATIMELEVATION_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:verbatimElevation " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if verbatimElevation is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isVerbatimElevationSingleRecordComplete(@ActedUpon(value="verbatimElevation") String verbatimElevation) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(verbatimElevation)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:verbatimElevation contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:verbatimElevation is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "3faa9931-7787-49e7-a5bc-60bb67f385e7")
    @Measure(label = "MEASURE_VERBATIMEVENTDATE_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:verbatimEventDate " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if verbatimEventDate is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isVerbatimEventDateSingleRecordComplete(@ActedUpon(value="verbatimEventDate") String verbatimEventDate) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(verbatimEventDate)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:verbatimEventDate contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:verbatimEventDate is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "f6cf6312-d98e-434c-be85-25ae91a45b7a")
    @Measure(label = "MEASURE_VERBATIMLATITUDE_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:verbatimLatitude " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if verbatimLatitude is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isVerbatimLatitudeSingleRecordComplete(@ActedUpon(value="verbatimLatitude") String verbatimLatitude) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(verbatimLatitude)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:verbatimLatitude contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:verbatimLatitude is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "5b5478c3-340b-4b43-80f6-ce20c3307023")
    @Measure(label = "MEASURE_VERBATIMLONGITUDE_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:verbatimLongitude " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if verbatimLongitude is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isVerbatimLongitudeSingleRecordComplete(@ActedUpon(value="verbatimLongitude") String verbatimLongitude) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(verbatimLongitude)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:verbatimLongitude contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:verbatimLongitude is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "72709e74-e1fd-435c-9230-5be9446639f9")
    @Measure(label = "MEASURE_VERBATIMSRS_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:verbatimSRS " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if verbatimSRS is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isVerbatimSRSSingleRecordComplete(@ActedUpon(value="verbatimSRS") String verbatimSRS) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(verbatimSRS)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:verbatimSRS contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:verbatimSRS is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "174c1bf3-9f54-4b9b-92b0-8611cb675f81")
    @Measure(label = "MEASURE_VERNACULARNAME_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:vernacularName " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if vernacularName is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isVernacularNameSingleRecordComplete(@ActedUpon(value="vernacularName") String vernacularName) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(vernacularName)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:vernacularName contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:vernacularName is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "d0e9826f-72d2-408c-a071-1515d2204894")
    @Measure(label = "MEASURE_WATERBODY_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:waterBody " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if waterBody is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isWaterBodySingleRecordComplete(@ActedUpon(value="waterBody") String waterBody) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(waterBody)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:waterBody contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:waterBody is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


    @Provides(value = "e139d0e5-9772-459a-bf2a-3c017f9fbdeb")
    @Measure(label = "MEASURE_YEAR_SINGLE_COMPLETENESS", description = "Test to see whether a provided dwc:year " + 
			"contains a non-empty value.  Does not test validity of a non-empty value.")
    @Specification(value = "NOT_COMPLETE if year is null, an empty string, contains only white space, contains only pipe characters '|', or contains only a string serialization interpeted as null, otherwise COMPLETE.")
    @PreEnhancement
    @PostEnhancement
    public static CompDQMeasurement isYearSingleRecordComplete(@ActedUpon(value="year") String year) {
    	CompDQMeasurement<EnumDQMeasurementResult> result = new CompDQMeasurement<EnumDQMeasurementResult>();
    	result.setResultState(EnumDQResultState.NOT_RUN);
    	if (CompletenessUtils.hasValue(year)) { 
    	    result.setValue(EnumDQMeasurementResult.COMPLETE);
    	    result.addComment("dwc:year contains a value (which may or may not be a valid value)");
    	} else { 
    	    result.setValue(EnumDQMeasurementResult.NOT_COMPLETE); 
    	    result.addComment("dwc:year is null, empty, or otherwise does not contain a value.");
    	}
    	result.setResultState(EnumDQResultState.RUN_HAS_RESULT);
    	return result;
    }


}
