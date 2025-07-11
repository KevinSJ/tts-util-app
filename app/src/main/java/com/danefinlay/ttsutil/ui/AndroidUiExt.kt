/*
 * TTS Util
 *
 * Authors: Dane Finlay <dane@danefinlay.net>
 *
 * Copyright (C) 2019 Dane Finlay
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
 */

package com.danefinlay.ttsutil.ui

import androidx.core.text.HtmlCompat
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity

/**
 * Extension function for setting html link text.
 */
fun TextView.setLinkText(linkText: String) {
    movementMethod = LinkMovementMethod.getInstance()
    text = HtmlCompat.fromHtml(linkText, HtmlCompat.FROM_HTML_MODE_COMPACT)
}

/**
 * Activity extension function for finding a view by ID.
 *
 * This is basically an alias of findViewById().
 */
fun <T : View?> AppCompatActivity.find(@IdRes id: Int): T {
    return findViewById(id)
}
