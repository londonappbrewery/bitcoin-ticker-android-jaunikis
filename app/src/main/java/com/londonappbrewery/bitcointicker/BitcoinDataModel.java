package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;


class BitcoinDataModel {


        // TODO: Declare the member variables here

        private String last;


        // TODO: Create a WeatherDataModel from a JSON:
        static  BitcoinDataModel fromJason(JSONObject jsonObject) throws JSONException {

                BitcoinDataModel bitcoinData = new BitcoinDataModel();
                bitcoinData.last = jsonObject.getString("last");

                return bitcoinData;

        }




        // TODO: Create getter methods for temperature, city, and icon name:


        String getPrice() {
            return last;
        }


    }