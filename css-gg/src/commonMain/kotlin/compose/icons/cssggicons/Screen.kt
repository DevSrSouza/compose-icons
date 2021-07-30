package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Screen: ImageVector
    get() {
        if (_screen != null) {
            return _screen!!
        }
        _screen = Builder(name = "Screen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 17.0f)
                horizontalLineTo(4.0f)
                curveTo(2.3431f, 17.0f, 1.0f, 15.6569f, 1.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 4.3432f, 2.3431f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(21.6569f, 3.0f, 23.0f, 4.3432f, 23.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(23.0f, 15.6569f, 21.6569f, 17.0f, 20.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 19.0f, 17.0f, 19.4477f, 17.0f, 20.0f)
                curveTo(17.0f, 20.5523f, 16.5523f, 21.0f, 16.0f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 21.0f, 7.0f, 20.5523f, 7.0f, 20.0f)
                curveTo(7.0f, 19.4477f, 7.4477f, 19.0f, 8.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(4.0f, 5.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 5.0f, 21.0f, 5.4477f, 21.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 14.5523f, 20.5523f, 15.0f, 20.0f, 15.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 15.0f, 3.0f, 14.5523f, 3.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 5.4477f, 3.4477f, 5.0f, 4.0f, 5.0f)
                close()
            }
        }
        .build()
        return _screen!!
    }

private var _screen: ImageVector? = null
