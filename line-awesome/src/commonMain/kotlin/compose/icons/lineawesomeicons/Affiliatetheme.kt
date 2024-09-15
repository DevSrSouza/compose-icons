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

public val LineAwesomeIcons.Affiliatetheme: ImageVector
    get() {
        if (_affiliatetheme != null) {
            return _affiliatetheme!!
        }
        _affiliatetheme = Builder(name = "Affiliatetheme", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.104f, 5.0f)
                curveTo(10.237f, 5.016f, 7.376f, 6.95f, 5.037f, 9.955f)
                curveTo(2.158f, 13.654f, 1.147f, 17.559f, 2.781f, 18.695f)
                curveTo(4.415f, 19.821f, 8.084f, 17.733f, 10.963f, 14.035f)
                curveTo(13.842f, 10.336f, 14.853f, 6.433f, 13.219f, 5.307f)
                curveTo(12.912f, 5.096f, 12.534f, 4.996f, 12.104f, 5.0f)
                close()
                moveTo(29.984f, 11.0f)
                curveTo(26.183f, 17.359f, 20.088f, 20.542f, 16.359f, 18.266f)
                curveTo(15.075f, 17.48f, 14.285f, 15.815f, 13.994f, 14.0f)
                curveTo(12.018f, 17.66f, 8.208f, 20.903f, 4.0f, 22.0f)
                curveTo(6.681f, 25.188f, 10.838f, 27.0f, 15.314f, 27.0f)
                curveTo(23.401f, 27.0f, 29.961f, 20.378f, 29.961f, 12.201f)
                curveTo(29.971f, 11.742f, 30.027f, 11.437f, 29.984f, 11.0f)
                close()
            }
        }
        .build()
        return _affiliatetheme!!
    }

private var _affiliatetheme: ImageVector? = null
