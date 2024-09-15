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

public val CssGgIcons.PinTop: ImageVector
    get() {
        if (_pinTop != null) {
            return _pinTop!!
        }
        _pinTop = Builder(name = "PinTop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                curveTo(13.105f, 14.0f, 14.0f, 14.895f, 14.0f, 16.0f)
                curveTo(14.0f, 17.105f, 13.105f, 18.0f, 12.0f, 18.0f)
                curveTo(10.895f, 18.0f, 10.0f, 17.105f, 10.0f, 16.0f)
                curveTo(10.0f, 14.895f, 10.895f, 14.0f, 12.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 5.0f)
                curveTo(7.448f, 5.0f, 7.0f, 4.552f, 7.0f, 4.0f)
                curveTo(7.0f, 3.448f, 7.448f, 3.0f, 8.0f, 3.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 3.0f, 17.0f, 3.448f, 17.0f, 4.0f)
                curveTo(17.0f, 4.552f, 16.552f, 5.0f, 16.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.083f)
                curveTo(15.838f, 10.559f, 18.0f, 13.027f, 18.0f, 16.0f)
                curveTo(18.0f, 19.314f, 15.314f, 22.0f, 12.0f, 22.0f)
                curveTo(8.686f, 22.0f, 6.0f, 19.314f, 6.0f, 16.0f)
                curveTo(6.0f, 13.027f, 8.162f, 10.559f, 11.0f, 10.083f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(14.209f, 12.0f, 16.0f, 13.791f, 16.0f, 16.0f)
                curveTo(16.0f, 18.209f, 14.209f, 20.0f, 12.0f, 20.0f)
                curveTo(9.791f, 20.0f, 8.0f, 18.209f, 8.0f, 16.0f)
                curveTo(8.0f, 13.791f, 9.791f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _pinTop!!
    }

private var _pinTop: ImageVector? = null
