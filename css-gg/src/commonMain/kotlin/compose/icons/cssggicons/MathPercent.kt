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

public val CssGgIcons.MathPercent: ImageVector
    get() {
        if (_mathPercent != null) {
            return _mathPercent!!
        }
        _mathPercent = Builder(name = "MathPercent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.243f, 6.343f)
                curveTo(16.633f, 5.953f, 17.266f, 5.953f, 17.657f, 6.343f)
                curveTo(18.047f, 6.734f, 18.047f, 7.367f, 17.657f, 7.757f)
                lineTo(7.757f, 17.657f)
                curveTo(7.367f, 18.047f, 6.734f, 18.047f, 6.343f, 17.657f)
                curveTo(5.953f, 17.266f, 5.953f, 16.633f, 6.343f, 16.243f)
                lineTo(16.243f, 6.343f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.879f, 9.879f)
                curveTo(9.098f, 10.66f, 7.831f, 10.66f, 7.05f, 9.879f)
                curveTo(6.269f, 9.098f, 6.269f, 7.831f, 7.05f, 7.05f)
                curveTo(7.831f, 6.269f, 9.098f, 6.269f, 9.879f, 7.05f)
                curveTo(10.66f, 7.831f, 10.66f, 9.098f, 9.879f, 9.879f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.121f, 16.95f)
                curveTo(14.902f, 17.731f, 16.169f, 17.731f, 16.95f, 16.95f)
                curveTo(17.731f, 16.169f, 17.731f, 14.902f, 16.95f, 14.121f)
                curveTo(16.169f, 13.34f, 14.902f, 13.34f, 14.121f, 14.121f)
                curveTo(13.34f, 14.902f, 13.34f, 16.169f, 14.121f, 16.95f)
                close()
            }
        }
        .build()
        return _mathPercent!!
    }

private var _mathPercent: ImageVector? = null
