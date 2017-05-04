/* Copyright 2016 Michael Sladoje and Mike Schälchli. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
==============================================================================*/

package azzam.fyp.facerecognitionlibrary.Recognition;

import org.opencv.core.Mat;

public interface Recognition {
    public static final int TRAINING = 0;
    public static final int RECOGNITION = 1;
    public static final int KNN = 0;
    public static final int SVM = 1;

    boolean train();
    String recognize(Mat img, String expectedLabel);
    void saveTestData();
    void saveToFile();
    void loadFromFile();
    void addImage(Mat img, String label, boolean featuresAlreadyExtracted);
    Mat getFeatureVector(Mat img);
}