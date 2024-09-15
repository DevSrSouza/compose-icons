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

public val CssGgIcons.PinAlt: ImageVector
    get() {
        if (_pinAlt != null) {
            return _pinAlt!!
        }
        _pinAlt = Builder(name = "PinAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                curveTo(13.105f, 11.0f, 14.0f, 10.105f, 14.0f, 9.0f)
                curveTo(14.0f, 7.895f, 13.105f, 7.0f, 12.0f, 7.0f)
                curveTo(10.895f, 7.0f, 10.0f, 7.895f, 10.0f, 9.0f)
                curveTo(10.0f, 10.105f, 10.895f, 11.0f, 12.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 9.0f)
                curveTo(18.0f, 11.973f, 15.838f, 14.441f, 13.0f, 14.917f)
                verticalLineTo(20.0f)
                curveTo(13.0f, 20.552f, 12.552f, 21.0f, 12.0f, 21.0f)
                curveTo(11.448f, 21.0f, 11.0f, 20.552f, 11.0f, 20.0f)
                verticalLineTo(14.917f)
                curveTo(8.162f, 14.441f, 6.0f, 11.973f, 6.0f, 9.0f)
                curveTo(6.0f, 5.686f, 8.686f, 3.0f, 12.0f, 3.0f)
                curveTo(15.314f, 3.0f, 18.0f, 5.686f, 18.0f, 9.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(14.209f, 13.0f, 16.0f, 11.209f, 16.0f, 9.0f)
                curveTo(16.0f, 6.791f, 14.209f, 5.0f, 12.0f, 5.0f)
                curveTo(9.791f, 5.0f, 8.0f, 6.791f, 8.0f, 9.0f)
                curveTo(8.0f, 11.209f, 9.791f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _pinAlt!!
    }

private var _pinAlt: ImageVector? = null
