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

public val LineAwesomeIcons.Jsfiddle: ImageVector
    get() {
        if (_jsfiddle != null) {
            return _jsfiddle!!
        }
        _jsfiddle = Builder(name = "Jsfiddle", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.992f, 14.348f)
                curveTo(25.91f, 9.723f, 22.141f, 6.0f, 17.5f, 6.0f)
                curveTo(14.027f, 6.0f, 11.043f, 8.086f, 9.727f, 11.074f)
                curveTo(9.488f, 11.031f, 9.246f, 11.0f, 9.0f, 11.0f)
                curveTo(6.859f, 11.0f, 5.129f, 12.684f, 5.02f, 14.797f)
                curveTo(3.219f, 15.832f, 2.0f, 17.773f, 2.0f, 20.0f)
                curveTo(2.0f, 23.313f, 4.688f, 26.0f, 8.0f, 26.0f)
                lineTo(24.0f, 26.0f)
                curveTo(27.313f, 26.0f, 30.0f, 23.313f, 30.0f, 20.0f)
                curveTo(30.0f, 17.387f, 28.324f, 15.168f, 25.992f, 14.348f)
                close()
                moveTo(20.891f, 23.0f)
                curveTo(18.977f, 23.0f, 17.145f, 21.355f, 15.375f, 19.766f)
                curveTo(13.863f, 18.406f, 12.301f, 17.0f, 11.109f, 17.0f)
                curveTo(9.926f, 17.0f, 9.0f, 17.879f, 9.0f, 19.0f)
                curveTo(9.0f, 20.086f, 9.969f, 21.0f, 11.109f, 21.0f)
                curveTo(12.098f, 21.0f, 12.988f, 20.59f, 13.84f, 19.742f)
                lineTo(15.25f, 21.156f)
                curveTo(14.023f, 22.383f, 12.633f, 23.0f, 11.109f, 23.0f)
                curveTo(8.844f, 23.0f, 7.0f, 21.207f, 7.0f, 19.0f)
                curveTo(7.0f, 16.793f, 8.844f, 15.0f, 11.109f, 15.0f)
                curveTo(13.066f, 15.0f, 14.922f, 16.664f, 16.711f, 18.277f)
                curveTo(18.199f, 19.613f, 19.742f, 21.0f, 20.887f, 21.0f)
                curveTo(22.055f, 21.0f, 23.0f, 20.102f, 23.0f, 19.0f)
                curveTo(23.0f, 17.879f, 22.074f, 17.0f, 20.891f, 17.0f)
                curveTo(19.535f, 17.0f, 18.328f, 17.902f, 18.012f, 18.219f)
                lineTo(16.598f, 16.809f)
                curveTo(16.668f, 16.734f, 18.426f, 15.0f, 20.891f, 15.0f)
                curveTo(23.156f, 15.0f, 25.0f, 16.793f, 25.0f, 19.0f)
                curveTo(25.0f, 21.207f, 23.156f, 23.0f, 20.891f, 23.0f)
                close()
            }
        }
        .build()
        return _jsfiddle!!
    }

private var _jsfiddle: ImageVector? = null
