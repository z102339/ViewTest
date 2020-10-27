package com.lancet.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {


    private long max;

    String data = "[\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 3\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 3\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 3\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 3\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 6\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 6\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 5\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 5\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 6\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 3\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 5\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 7\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 6\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 1\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 5\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 1\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 5\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 4\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 0\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 3\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 7\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 7\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 4\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 1\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 4\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 3\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 6\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 0\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 6\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 7\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 7\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 1\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 5\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 6\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 0\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 1\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 6\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 6\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 7\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 5\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 3\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 5\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 0\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 4\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 4\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 4\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 7\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 6\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 7\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 5\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 7\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 4\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 0\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 1\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 7\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 7\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 5\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 7\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 0\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 6\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 4\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 3\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 6\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 6\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 5\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 6\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 4\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 5\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 3\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 4\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 5\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 4\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 0\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 3\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 4\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 4\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 2\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 5\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 2\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 1\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 7\n" +
            "    }\n" +
            "  ],\n" +
            "  [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"commits\": 7\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"commits\": 6\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"commits\": 4\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"commits\": 5\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"commits\": 3\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"commits\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"commits\": 5\n" +
            "    }\n" +
            "  ]\n" +
            "]";

    private volatile List<List<DayCommit>> dayCommitsColumns=new ArrayList<>();
    private DayCommitsView dayCommitsView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dayCommitsView = findViewById(R.id.daycommitsView);
        ExecutorService executorService=Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    JSONArray jsonArray = new JSONArray(data);
                    JSONArray commitOfWeek;
                    for(int i=0;i<jsonArray.length();i++){
                        commitOfWeek= (JSONArray) jsonArray.get(i);
                        List<DayCommit>  dayCommits=new ArrayList<>();
                        for(int j=0;j<commitOfWeek.length();j++){
                            JSONObject jsonObject = commitOfWeek.getJSONObject(j);
                            int id = jsonObject.getInt("id");
                            long commits = jsonObject.getLong("commits");
                            max = Math.max(max, commits);
                            DayCommit dayCommit = new DayCommit();
                            dayCommit.setId(id);
                            dayCommit.setCommits(commits);
                            dayCommits.add(dayCommit);
                        }
                        dayCommitsColumns.add(dayCommits);
                    }

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            renderView();
                        }
                    });


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });



    }


    private void renderView() {
        dayCommitsView.setDayCommits(dayCommitsColumns,max);
    }


}
