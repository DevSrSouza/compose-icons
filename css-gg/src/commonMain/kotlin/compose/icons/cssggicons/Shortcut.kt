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

public val CssGgIcons.Shortcut: ImageVector
    get() {
        if (_shortcut != null) {
            return _shortcut!!
        }
        _shortcut = Builder(name = "Shortcut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1925f, 7.7071f)
                curveTo(15.8019f, 7.3166f, 15.1688f, 7.3166f, 14.7782f, 7.7071f)
                lineTo(7.7072f, 14.7782f)
                curveTo(7.3166f, 15.1687f, 7.3166f, 15.8019f, 7.7072f, 16.1924f)
                curveTo(8.0977f, 16.5829f, 8.7309f, 16.5829f, 9.1214f, 16.1924f)
                lineTo(16.1925f, 9.1213f)
                curveTo(16.583f, 8.7308f, 16.583f, 8.0976f, 16.1925f, 7.7071f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 4.3432f, 4.3432f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 3.0f, 21.0f, 4.3432f, 21.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.6569f, 19.6569f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 21.0f, 3.0f, 19.6569f, 3.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(6.0f, 5.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 5.0f, 19.0f, 5.4477f, 19.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(19.0f, 18.5523f, 18.5523f, 19.0f, 18.0f, 19.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 19.0f, 5.0f, 18.5523f, 5.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(5.0f, 5.4477f, 5.4477f, 5.0f, 6.0f, 5.0f)
                close()
            }
        }
        .build()
        return _shortcut!!
    }

private var _shortcut: ImageVector? = null
