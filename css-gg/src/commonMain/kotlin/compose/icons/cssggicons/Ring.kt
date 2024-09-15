package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.Ring: ImageVector
    get() {
        if (_ring != null) {
            return _ring!!
        }
        _ring = Builder(name = "Ring", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.343f, 3.686f)
                curveTo(6.832f, 3.197f, 7.367f, 2.785f, 7.936f, 2.45f)
                curveTo(10.435f, 0.973f, 13.565f, 0.973f, 16.065f, 2.45f)
                curveTo(16.633f, 2.785f, 17.169f, 3.197f, 17.657f, 3.686f)
                lineTo(12.0f, 9.343f)
                lineTo(6.343f, 3.686f)
                close()
                moveTo(12.0f, 6.514f)
                lineTo(9.413f, 3.927f)
                curveTo(11.045f, 3.148f, 12.956f, 3.148f, 14.587f, 3.927f)
                lineTo(12.0f, 6.514f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.658f)
                curveTo(2.0f, 9.527f, 3.439f, 6.732f, 5.692f, 4.898f)
                lineTo(7.115f, 6.322f)
                curveTo(5.22f, 7.784f, 4.0f, 10.078f, 4.0f, 12.658f)
                curveTo(4.0f, 17.076f, 7.582f, 20.658f, 12.0f, 20.658f)
                curveTo(16.418f, 20.658f, 20.0f, 17.076f, 20.0f, 12.658f)
                curveTo(20.0f, 10.078f, 18.78f, 7.785f, 16.885f, 6.322f)
                lineTo(18.308f, 4.898f)
                curveTo(20.561f, 6.732f, 22.0f, 9.527f, 22.0f, 12.658f)
                curveTo(22.0f, 18.18f, 17.523f, 22.658f, 12.0f, 22.658f)
                curveTo(6.477f, 22.658f, 2.0f, 18.18f, 2.0f, 12.658f)
                close()
            }
        }
        .build()
        return _ring!!
    }

private var _ring: ImageVector? = null
