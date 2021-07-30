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

public val CssGgIcons.PinBottom: ImageVector
    get() {
        if (_pinBottom != null) {
            return _pinBottom!!
        }
        _pinBottom = Builder(name = "PinBottom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                curveTo(13.1046f, 11.0f, 14.0f, 10.1046f, 14.0f, 9.0f)
                curveTo(14.0f, 7.8954f, 13.1046f, 7.0f, 12.0f, 7.0f)
                curveTo(10.8954f, 7.0f, 10.0f, 7.8954f, 10.0f, 9.0f)
                curveTo(10.0f, 10.1046f, 10.8954f, 11.0f, 12.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 9.0f)
                curveTo(18.0f, 11.973f, 15.8377f, 14.441f, 13.0f, 14.917f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 20.0f, 17.0f, 20.4477f, 17.0f, 21.0f)
                curveTo(17.0f, 21.5523f, 16.5523f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 22.0f, 7.0f, 21.5523f, 7.0f, 21.0f)
                curveTo(7.0f, 20.4477f, 7.4477f, 20.0f, 8.0f, 20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.917f)
                curveTo(8.1623f, 14.441f, 6.0f, 11.973f, 6.0f, 9.0f)
                curveTo(6.0f, 5.6863f, 8.6863f, 3.0f, 12.0f, 3.0f)
                curveTo(15.3137f, 3.0f, 18.0f, 5.6863f, 18.0f, 9.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(14.2091f, 13.0f, 16.0f, 11.2091f, 16.0f, 9.0f)
                curveTo(16.0f, 6.7909f, 14.2091f, 5.0f, 12.0f, 5.0f)
                curveTo(9.7909f, 5.0f, 8.0f, 6.7909f, 8.0f, 9.0f)
                curveTo(8.0f, 11.2091f, 9.7909f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _pinBottom!!
    }

private var _pinBottom: ImageVector? = null
