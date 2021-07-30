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

public val CssGgIcons.CornerDoubleUpRight: ImageVector
    get() {
        if (_cornerDoubleUpRight != null) {
            return _cornerDoubleUpRight!!
        }
        _cornerDoubleUpRight = Builder(name = "CornerDoubleUpRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7495f, 7.7837f)
                lineTo(16.1638f, 6.3695f)
                lineTo(20.4064f, 10.6121f)
                lineTo(16.1637f, 14.8547f)
                lineTo(14.7495f, 13.4405f)
                lineTo(17.5779f, 10.6121f)
                lineTo(14.7495f, 7.7837f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5068f, 13.4405f)
                lineTo(11.9211f, 14.8547f)
                lineTo(16.1637f, 10.6121f)
                lineTo(11.9211f, 6.3695f)
                lineTo(10.5069f, 7.7837f)
                lineTo(12.3537f, 9.6305f)
                lineTo(7.5937f, 9.6305f)
                curveTo(5.3845f, 9.6305f, 3.5937f, 11.4214f, 3.5937f, 13.6305f)
                lineTo(3.5937f, 17.6305f)
                lineTo(5.5937f, 17.6305f)
                lineTo(5.5937f, 13.6305f)
                curveTo(5.5937f, 12.5259f, 6.4891f, 11.6305f, 7.5937f, 11.6305f)
                lineTo(12.3169f, 11.6305f)
                lineTo(10.5068f, 13.4405f)
                close()
            }
        }
        .build()
        return _cornerDoubleUpRight!!
    }

private var _cornerDoubleUpRight: ImageVector? = null
