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

public val CssGgIcons.ViewMonth: ImageVector
    get() {
        if (_viewMonth != null) {
            return _viewMonth!!
        }
        _viewMonth = Builder(name = "ViewMonth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 8.0f)
                curveTo(2.0f, 6.3432f, 3.3431f, 5.0f, 5.0f, 5.0f)
                horizontalLineTo(19.0f)
                curveTo(20.6569f, 5.0f, 22.0f, 6.3432f, 22.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 17.6569f, 20.6569f, 19.0f, 19.0f, 19.0f)
                horizontalLineTo(5.0f)
                curveTo(3.3431f, 19.0f, 2.0f, 17.6569f, 2.0f, 16.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(17.0f, 7.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 7.0f, 20.0f, 7.4477f, 20.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(15.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(11.0f, 7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(7.0f, 7.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 7.0f, 4.0f, 7.4477f, 4.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(4.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(4.0f, 15.0f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 16.5523f, 4.4477f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(9.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(13.0f, 17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(17.0f, 17.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 17.0f, 20.0f, 16.5523f, 20.0f, 16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(20.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(15.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _viewMonth!!
    }

private var _viewMonth: ImageVector? = null
