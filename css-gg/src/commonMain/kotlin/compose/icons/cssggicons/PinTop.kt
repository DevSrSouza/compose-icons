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
                curveTo(13.1046f, 14.0f, 14.0f, 14.8954f, 14.0f, 16.0f)
                curveTo(14.0f, 17.1046f, 13.1046f, 18.0f, 12.0f, 18.0f)
                curveTo(10.8954f, 18.0f, 10.0f, 17.1046f, 10.0f, 16.0f)
                curveTo(10.0f, 14.8954f, 10.8954f, 14.0f, 12.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 5.0f)
                curveTo(7.4477f, 5.0f, 7.0f, 4.5523f, 7.0f, 4.0f)
                curveTo(7.0f, 3.4477f, 7.4477f, 3.0f, 8.0f, 3.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 3.0f, 17.0f, 3.4477f, 17.0f, 4.0f)
                curveTo(17.0f, 4.5523f, 16.5523f, 5.0f, 16.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.083f)
                curveTo(15.8377f, 10.559f, 18.0f, 13.027f, 18.0f, 16.0f)
                curveTo(18.0f, 19.3137f, 15.3137f, 22.0f, 12.0f, 22.0f)
                curveTo(8.6863f, 22.0f, 6.0f, 19.3137f, 6.0f, 16.0f)
                curveTo(6.0f, 13.027f, 8.1623f, 10.559f, 11.0f, 10.083f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(14.2091f, 12.0f, 16.0f, 13.7909f, 16.0f, 16.0f)
                curveTo(16.0f, 18.2091f, 14.2091f, 20.0f, 12.0f, 20.0f)
                curveTo(9.7909f, 20.0f, 8.0f, 18.2091f, 8.0f, 16.0f)
                curveTo(8.0f, 13.7909f, 9.7909f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _pinTop!!
    }

private var _pinTop: ImageVector? = null
