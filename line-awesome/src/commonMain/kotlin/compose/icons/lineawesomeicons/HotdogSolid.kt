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

public val LineAwesomeIcons.HotdogSolid: ImageVector
    get() {
        if (_hotdogSolid != null) {
            return _hotdogSolid!!
        }
        _hotdogSolid = Builder(name = "HotdogSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.2188f, 4.0f)
                curveTo(22.9844f, 4.0f, 22.2539f, 4.4961f, 21.7188f, 5.3125f)
                curveTo(21.2305f, 5.2422f, 20.7617f, 5.1875f, 20.375f, 5.1875f)
                curveTo(19.125f, 5.1875f, 18.0586f, 5.8164f, 17.3125f, 6.625f)
                curveTo(16.5898f, 7.4063f, 16.1211f, 8.3594f, 15.7188f, 9.3125f)
                curveTo(15.7148f, 9.3164f, 15.6914f, 9.3086f, 15.6875f, 9.3125f)
                curveTo(14.6484f, 11.2656f, 13.543f, 13.832f, 9.7813f, 15.5938f)
                curveTo(6.9805f, 16.9141f, 5.6211f, 18.8438f, 5.2813f, 20.75f)
                curveTo(4.4883f, 21.2461f, 4.0f, 21.9805f, 4.0f, 23.3125f)
                curveTo(4.0f, 25.3906f, 5.5f, 26.5938f, 7.375f, 27.125f)
                curveTo(8.4375f, 28.2656f, 9.8594f, 29.0f, 11.625f, 29.0f)
                curveTo(14.6953f, 29.0f, 18.3008f, 26.9805f, 22.625f, 22.5f)
                lineTo(22.6563f, 22.5f)
                curveTo(27.4336f, 17.7188f, 29.0f, 13.7539f, 29.0f, 10.9375f)
                curveTo(29.0f, 9.1055f, 28.4922f, 7.8008f, 27.5313f, 7.1563f)
                curveTo(27.8086f, 4.8789f, 25.7109f, 4.0f, 24.2188f, 4.0f)
                close()
                moveTo(20.375f, 7.1875f)
                curveTo(20.5039f, 7.1875f, 20.6758f, 7.207f, 20.8438f, 7.2188f)
                curveTo(20.0352f, 9.4961f, 19.2148f, 12.6641f, 16.125f, 15.75f)
                curveTo(13.168f, 18.7734f, 10.0f, 19.3242f, 7.625f, 19.9063f)
                curveTo(8.082f, 19.0352f, 8.9609f, 18.1914f, 10.625f, 17.4063f)
                curveTo(14.9492f, 15.3789f, 16.457f, 12.1172f, 17.4375f, 10.2813f)
                curveTo(17.4609f, 10.25f, 17.4805f, 10.2188f, 17.5f, 10.1875f)
                curveTo(17.8594f, 9.3164f, 18.293f, 8.4961f, 18.7813f, 7.9688f)
                curveTo(19.2695f, 7.4414f, 19.7461f, 7.1875f, 20.375f, 7.1875f)
                close()
                moveTo(24.9688f, 9.0f)
                curveTo(25.4727f, 8.9766f, 26.043f, 9.0664f, 26.7188f, 9.3125f)
                curveTo(26.8594f, 9.6523f, 27.0f, 10.1641f, 27.0f, 10.9375f)
                curveTo(27.0f, 13.0078f, 25.8008f, 16.543f, 21.25f, 21.0938f)
                curveTo(21.2383f, 21.1055f, 21.2305f, 21.1133f, 21.2188f, 21.125f)
                curveTo(18.2578f, 24.1953f, 15.7383f, 25.8516f, 13.75f, 26.5625f)
                curveTo(11.418f, 26.4141f, 8.832f, 24.6172f, 17.875f, 18.0f)
                curveTo(21.5352f, 15.3242f, 21.4297f, 9.1758f, 24.9688f, 9.0f)
                close()
            }
        }
        .build()
        return _hotdogSolid!!
    }

private var _hotdogSolid: ImageVector? = null
