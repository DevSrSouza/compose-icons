package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Speakap: ImageVector
    get() {
        if (_speakap != null) {
            return _speakap!!
        }
        _speakap = Builder(name = "Speakap", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.395f, 3.0f)
                curveTo(8.561f, 3.0f, 3.0f, 8.588f, 3.0f, 15.457f)
                curveTo(3.0f, 22.197f, 8.0f, 29.0f, 19.168f, 29.0f)
                curveTo(21.981f, 29.0f, 25.77f, 27.921f, 25.93f, 27.875f)
                lineTo(28.0f, 27.281f)
                lineTo(26.285f, 25.971f)
                curveTo(25.66f, 25.493f, 24.949f, 24.897f, 24.199f, 24.217f)
                curveTo(26.494f, 21.899f, 27.789f, 18.769f, 27.789f, 15.457f)
                curveTo(27.789f, 8.588f, 22.229f, 3.0f, 15.395f, 3.0f)
                close()
                moveTo(15.395f, 5.0f)
                curveTo(21.127f, 5.0f, 25.789f, 9.691f, 25.789f, 15.457f)
                curveTo(25.789f, 18.236f, 24.721f, 20.847f, 22.779f, 22.809f)
                lineTo(21.309f, 24.295f)
                lineTo(22.857f, 25.697f)
                curveTo(23.122f, 25.937f, 23.383f, 26.169f, 23.637f, 26.389f)
                curveTo(22.352f, 26.677f, 20.588f, 27.0f, 19.168f, 27.0f)
                curveTo(8.711f, 27.0f, 5.0f, 20.782f, 5.0f, 15.457f)
                curveTo(5.0f, 9.691f, 9.663f, 5.0f, 15.395f, 5.0f)
                close()
                moveTo(16.246f, 9.002f)
                curveTo(13.666f, 8.951f, 11.519f, 10.397f, 11.479f, 12.936f)
                curveTo(11.469f, 13.498f, 11.489f, 14.752f, 12.924f, 15.645f)
                curveTo(14.621f, 16.698f, 17.19f, 16.699f, 17.16f, 18.215f)
                curveTo(17.14f, 19.269f, 15.866f, 19.489f, 15.264f, 19.479f)
                curveTo(15.113f, 19.479f, 13.767f, 19.46f, 12.914f, 18.266f)
                lineTo(10.947f, 20.363f)
                curveTo(12.332f, 21.698f, 13.849f, 21.978f, 15.063f, 21.998f)
                curveTo(15.564f, 22.008f, 19.811f, 22.009f, 19.881f, 18.004f)
                curveTo(19.891f, 17.221f, 19.779f, 16.048f, 18.455f, 15.215f)
                curveTo(16.769f, 14.151f, 14.271f, 14.251f, 14.301f, 12.766f)
                curveTo(14.321f, 11.621f, 15.825f, 11.51f, 16.146f, 11.52f)
                curveTo(16.166f, 11.52f, 17.462f, 11.53f, 18.104f, 12.373f)
                lineTo(20.002f, 10.355f)
                curveTo(19.53f, 9.913f, 18.424f, 9.032f, 16.246f, 9.002f)
                close()
            }
        }
        .build()
        return _speakap!!
    }

private var _speakap: ImageVector? = null
