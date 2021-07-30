package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.LogOff: ImageVector
    get() {
        if (_logOff != null) {
            return _logOff!!
        }
        _logOff = Builder(name = "LogOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0089f)
                curveTo(13.0002f, 3.4567f, 12.5527f, 3.0088f, 12.0004f, 3.0085f)
                curveTo(11.4481f, 3.0083f, 11.0002f, 3.4559f, 11.0f, 4.0082f)
                lineTo(10.9968f, 12.0116f)
                curveTo(10.9966f, 12.5639f, 11.4442f, 13.0118f, 11.9965f, 13.012f)
                curveTo(12.5487f, 13.0122f, 12.9966f, 12.5647f, 12.9968f, 12.0124f)
                lineTo(13.0f, 4.0089f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 12.9917f)
                curveTo(4.0f, 10.7826f, 4.8954f, 8.7826f, 6.3431f, 7.3349f)
                lineTo(7.7573f, 8.7491f)
                curveTo(6.6715f, 9.8349f, 6.0f, 11.3349f, 6.0f, 12.9917f)
                curveTo(6.0f, 16.3054f, 8.6863f, 18.9917f, 12.0f, 18.9917f)
                curveTo(15.3137f, 18.9917f, 18.0f, 16.3054f, 18.0f, 12.9917f)
                curveTo(18.0f, 11.3348f, 17.3284f, 9.8348f, 16.2426f, 8.749f)
                lineTo(17.6568f, 7.3348f)
                curveTo(19.1046f, 8.7825f, 20.0f, 10.7825f, 20.0f, 12.9917f)
                curveTo(20.0f, 17.41f, 16.4183f, 20.9917f, 12.0f, 20.9917f)
                curveTo(7.5817f, 20.9917f, 4.0f, 17.41f, 4.0f, 12.9917f)
                close()
            }
        }
        .build()
        return _logOff!!
    }

private var _logOff: ImageVector? = null
