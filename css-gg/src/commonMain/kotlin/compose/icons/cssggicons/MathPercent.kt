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
                moveTo(16.2426f, 6.3432f)
                curveTo(16.6331f, 5.9527f, 17.2663f, 5.9527f, 17.6568f, 6.3432f)
                curveTo(18.0474f, 6.7337f, 18.0474f, 7.3669f, 17.6568f, 7.7574f)
                lineTo(7.7573f, 17.6569f)
                curveTo(7.3668f, 18.0474f, 6.7337f, 18.0474f, 6.3431f, 17.6569f)
                curveTo(5.9526f, 17.2664f, 5.9526f, 16.6332f, 6.3431f, 16.2427f)
                lineTo(16.2426f, 6.3432f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8787f, 9.8787f)
                curveTo(9.0976f, 10.6598f, 7.8313f, 10.6598f, 7.0502f, 9.8787f)
                curveTo(6.2692f, 9.0977f, 6.2692f, 7.8313f, 7.0502f, 7.0503f)
                curveTo(7.8313f, 6.2692f, 9.0976f, 6.2692f, 9.8787f, 7.0503f)
                curveTo(10.6597f, 7.8313f, 10.6597f, 9.0977f, 9.8787f, 9.8787f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1213f, 16.9498f)
                curveTo(14.9023f, 17.7308f, 16.1687f, 17.7308f, 16.9497f, 16.9498f)
                curveTo(17.7308f, 16.1687f, 17.7308f, 14.9024f, 16.9497f, 14.1214f)
                curveTo(16.1687f, 13.3403f, 14.9023f, 13.3403f, 14.1213f, 14.1214f)
                curveTo(13.3403f, 14.9024f, 13.3403f, 16.1687f, 14.1213f, 16.9498f)
                close()
            }
        }
        .build()
        return _mathPercent!!
    }

private var _mathPercent: ImageVector? = null
