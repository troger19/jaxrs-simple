package com.babel.swagger;

import org.apache.commons.io.IOUtils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Path("/swagger")
public class SwaggerEndpoint {

    @GET
    @Path("/resource")
    public String getResource() throws IOException {
        InputStream resourceAsStream = SwaggerEndpoint.class.getClassLoader().getResourceAsStream("swagger.json");
        return IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8.name());
    }

    @GET
    @Path("/text")
    public String getText() throws IOException {
        return "{\n" +
                "    \"swagger\": \"2.0\",\n" +
                "    \"info\": {\n" +
                "        \"version\": \"1.0\",\n" +
                "        \"title\": \"backend-ws\"\n" +
                "    },\n" +
                "    \"host\": \"localhost:8081/services/rest\",\n" +
                "    \"basePath\": \"/\",\n" +
                "    \"schemes\": [\n" +
                "        \"http\"\n" +
                "    ],\n" +
                "    \"paths\": {\n" +
                "        \"/vehicle/evaluate\": {\n" +
                "            \"post\": {\n" +
                "                \"consumes\": [\n" +
                "                    \"application/xml\"\n" +
                "                ],\n" +
                "                \"produces\": [\n" +
                "                    \"application/xml\"\n" +
                "                ],\n" +
                "                \"parameters\": [\n" +
                "                    {\n" +
                "                        \"name\": \"body\",\n" +
                "                        \"in\": \"body\",\n" +
                "                        \"required\": true,\n" +
                "                        \"schema\": {\n" +
                "                            \"$ref\": \"#/definitions/OcenenieVozidlaPoziadavka\"\n" +
                "                        }\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"responses\": {\n" +
                "                    \"200\": {\n" +
                "                        \"description\": \"OK\",\n" +
                "                        \"headers\": {\n" +
                "                        },\n" +
                "                        \"schema\": {\n" +
                "                            \"$ref\": \"#/definitions/OcenenieVozidlaOdpoved\"\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    },\n" +
                "    \"definitions\": {\n" +
                "        \"ClientIdentification\": {\n" +
                "            \"properties\": {\n" +
                "                \"name\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"meno\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"password\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"heslo\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"xml\": {\n" +
                "                \"name\": \"identifikaciaKlienta\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"MotorizaciaEuroTaxDto\": {\n" +
                "            \"properties\": {\n" +
                "                \"idEurotax\": {\n" +
                "                    \"type\": \"integer\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"com.emeldi.b2bservice.backend.schema.ocenenie.MotorizaciaEuroTaxDto\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"stupenVybavy\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"com.emeldi.b2bservice.backend.schema.ocenenie.MotorizaciaEuroTaxDto\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"cena\": {\n" +
                "                    \"type\": \"number\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"com.emeldi.b2bservice.backend.schema.ocenenie.MotorizaciaEuroTaxDto\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"palivo\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"com.emeldi.b2bservice.backend.schema.ocenenie.MotorizaciaEuroTaxDto\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"vykon\": {\n" +
                "                    \"type\": \"number\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"com.emeldi.b2bservice.backend.schema.ocenenie.MotorizaciaEuroTaxDto\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"objem\": {\n" +
                "                    \"type\": \"integer\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"com.emeldi.b2bservice.backend.schema.ocenenie.MotorizaciaEuroTaxDto\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"prevodovka\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"com.emeldi.b2bservice.backend.schema.ocenenie.MotorizaciaEuroTaxDto\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"xml\": {\n" +
                "                \"name\": \"com.emeldi.b2bservice.backend.schema.ocenenie.MotorizaciaEuroTaxDto\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"OcenenieVozidlaOdpoved\": {\n" +
                "            \"properties\": {\n" +
                "                \"status\": {\n" +
                "                    \"$ref\": \"#/definitions/Status\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"status\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"ecv\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"ecv\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"vin\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"vin\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"tp\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"tp\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"znacka\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"znacka\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"model\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"model\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"datumVyroby\": {\n" +
                "                    \"type\": \"object\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"datumVyroby\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"prevodovka\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"prevodovka\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"palivo\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"palivo\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"objem\": {\n" +
                "                    \"type\": \"integer\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"objem\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"vykon\": {\n" +
                "                    \"type\": \"number\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"vykon\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"stupenVybavy\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"stupenVybavy\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"cena\": {\n" +
                "                    \"type\": \"number\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"cena\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"idEurotax\": {\n" +
                "                    \"type\": \"integer\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"idEurotax\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"vozidloEuroTaxDtos\": {\n" +
                "                    \"type\": \"array\",\n" +
                "                    \"items\": {\n" +
                "                        \"$ref\": \"#/definitions/VozidloEuroTaxDto\"\n" +
                "                    },\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"vozidlo\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"xml\": {\n" +
                "                \"namespace\": \"com/emeldi/b2bservice/backend/schema/ocenenie\",\n" +
                "                \"name\": \"OcenenieVozidlaOdpoved\",\n" +
                "                \"prefix\": \"ns\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"OcenenieVozidlaPoziadavka\": {\n" +
                "            \"properties\": {\n" +
                "                \"clientIdentification\": {\n" +
                "                    \"$ref\": \"#/definitions/ClientIdentification\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"identifikaciaKlienta\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"productIdentification\": {\n" +
                "                    \"$ref\": \"#/definitions/ProductIdentification\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"identifikaciaProduktu\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"ecv\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"ecv\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"vin\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"vin\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"tp\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"tp\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"znacka\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"znacka\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"model\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"model\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"palivo\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"palivo\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"datumVyroby\": {\n" +
                "                    \"type\": \"object\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"datumVyroby\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"prevodovka\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"prevodovka\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"objem\": {\n" +
                "                    \"type\": \"integer\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"objem\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"vykon\": {\n" +
                "                    \"type\": \"integer\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"vykon\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"stupenVybavy\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"stupenVybavy\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"xml\": {\n" +
                "                \"namespace\": \"com/emeldi/b2bservice/backend/schema/ocenenie\",\n" +
                "                \"name\": \"OcenenieVozidlaPoziadavka\",\n" +
                "                \"prefix\": \"ns\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"ProductIdentification\": {\n" +
                "            \"properties\": {\n" +
                "                \"idProd\": {\n" +
                "                    \"type\": \"integer\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"idProd\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"idMaProd\": {\n" +
                "                    \"type\": \"integer\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"idMAProd\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"referenceDate\": {\n" +
                "                    \"type\": \"object\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"referencnyDatum\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"xml\": {\n" +
                "                \"name\": \"identifikaciaProduktu\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"Status\": {\n" +
                "            \"properties\": {\n" +
                "                \"kod\": {\n" +
                "                    \"type\": \"integer\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"kod\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"text\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"text\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"xml\": {\n" +
                "                \"name\": \"status\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"VozidloEuroTaxDto\": {\n" +
                "            \"properties\": {\n" +
                "                \"znacka\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"znacka\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"vozidloModelEuroTaxDtos\": {\n" +
                "                    \"type\": \"array\",\n" +
                "                    \"items\": {\n" +
                "                        \"$ref\": \"#/definitions/VozidloModelEuroTaxDto\"\n" +
                "                    },\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"model\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"xml\": {\n" +
                "                \"name\": \"vozidloSKP\",\n" +
                "                \"prefix\": \"ns\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"VozidloModelEuroTaxDto\": {\n" +
                "            \"properties\": {\n" +
                "                \"motorizacia\": {\n" +
                "                    \"type\": \"array\",\n" +
                "                    \"items\": {\n" +
                "                        \"$ref\": \"#/definitions/MotorizaciaEuroTaxDto\"\n" +
                "                    },\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"com.emeldi.b2bservice.backend.schema.ocenenie.VozidloModelEuroTaxDto\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"nazov\": {\n" +
                "                    \"type\": \"string\",\n" +
                "                    \"xml\": {\n" +
                "                        \"name\": \"com.emeldi.b2bservice.backend.schema.ocenenie.VozidloModelEuroTaxDto\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"xml\": {\n" +
                "                \"name\": \"com.emeldi.b2bservice.backend.schema.ocenenie.VozidloModelEuroTaxDto\"\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }

}