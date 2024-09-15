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

public val LineAwesomeIcons.Vine: ImageVector
    get() {
        if (_vine != null) {
            return _vine!!
        }
        _vine = Builder(name = "Vine", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.645f, 15.938f)
                curveTo(25.074f, 16.066f, 24.527f, 16.125f, 24.035f, 16.125f)
                curveTo(21.258f, 16.125f, 19.121f, 14.188f, 19.121f, 10.816f)
                curveTo(19.121f, 9.164f, 19.762f, 8.305f, 20.664f, 8.305f)
                curveTo(21.523f, 8.305f, 22.098f, 9.074f, 22.098f, 10.641f)
                curveTo(22.098f, 11.527f, 21.859f, 12.504f, 21.684f, 13.082f)
                curveTo(21.684f, 13.082f, 22.535f, 14.574f, 24.875f, 14.113f)
                curveTo(25.371f, 13.012f, 25.645f, 11.586f, 25.645f, 10.332f)
                curveTo(25.645f, 6.961f, 23.926f, 5.0f, 20.773f, 5.0f)
                curveTo(17.535f, 5.0f, 15.641f, 7.488f, 15.641f, 10.773f)
                curveTo(15.641f, 14.023f, 17.16f, 16.816f, 19.668f, 18.086f)
                curveTo(18.613f, 20.195f, 17.273f, 22.055f, 15.875f, 23.453f)
                curveTo(13.336f, 20.383f, 11.043f, 16.289f, 10.102f, 8.305f)
                lineTo(6.355f, 8.305f)
                curveTo(8.086f, 21.605f, 13.242f, 25.844f, 14.605f, 26.656f)
                curveTo(15.375f, 27.117f, 16.039f, 27.098f, 16.746f, 26.699f)
                curveTo(17.852f, 26.07f, 21.176f, 22.746f, 23.016f, 18.855f)
                curveTo(23.789f, 18.852f, 24.719f, 18.766f, 25.645f, 18.555f)
                close()
            }
        }
        .build()
        return _vine!!
    }

private var _vine: ImageVector? = null
