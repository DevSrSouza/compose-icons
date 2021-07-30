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
                moveTo(25.6445f, 15.9375f)
                curveTo(25.0742f, 16.0664f, 24.5273f, 16.125f, 24.0352f, 16.125f)
                curveTo(21.2578f, 16.125f, 19.1211f, 14.1875f, 19.1211f, 10.8164f)
                curveTo(19.1211f, 9.1641f, 19.7617f, 8.3047f, 20.6641f, 8.3047f)
                curveTo(21.5234f, 8.3047f, 22.0977f, 9.0742f, 22.0977f, 10.6406f)
                curveTo(22.0977f, 11.5273f, 21.8594f, 12.5039f, 21.6836f, 13.082f)
                curveTo(21.6836f, 13.082f, 22.5352f, 14.5742f, 24.875f, 14.1133f)
                curveTo(25.3711f, 13.0117f, 25.6445f, 11.5859f, 25.6445f, 10.332f)
                curveTo(25.6445f, 6.9609f, 23.9258f, 5.0f, 20.7734f, 5.0f)
                curveTo(17.5352f, 5.0f, 15.6406f, 7.4883f, 15.6406f, 10.7734f)
                curveTo(15.6406f, 14.0234f, 17.1602f, 16.8164f, 19.668f, 18.0859f)
                curveTo(18.6133f, 20.1953f, 17.2734f, 22.0547f, 15.875f, 23.4531f)
                curveTo(13.3359f, 20.3828f, 11.043f, 16.2891f, 10.1016f, 8.3047f)
                lineTo(6.3555f, 8.3047f)
                curveTo(8.0859f, 21.6055f, 13.2422f, 25.8438f, 14.6055f, 26.6563f)
                curveTo(15.375f, 27.1172f, 16.0391f, 27.0977f, 16.7461f, 26.6992f)
                curveTo(17.8516f, 26.0703f, 21.1758f, 22.7461f, 23.0156f, 18.8555f)
                curveTo(23.7891f, 18.8516f, 24.7188f, 18.7656f, 25.6445f, 18.5547f)
                close()
            }
        }
        .build()
        return _vine!!
    }

private var _vine: ImageVector? = null
