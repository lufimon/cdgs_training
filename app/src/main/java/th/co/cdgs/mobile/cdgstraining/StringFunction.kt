package th.co.cdgs.mobile.cdgstraining

import android.text.Editable

fun String.toEditable(): Editable =  Editable.Factory.getInstance().newEditable(this)