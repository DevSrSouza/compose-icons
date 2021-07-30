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

public val CssGgIcons.TrashEmpty: ImageVector
    get() {
        if (_trashEmpty != null) {
            return _trashEmpty!!
        }
        _trashEmpty = Builder(name = "TrashEmpty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 6.0f)
                verticalLineTo(5.0f)
                curveTo(17.0f, 3.8954f, 16.1046f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(7.8954f, 3.0f, 7.0f, 3.8954f, 7.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 6.0f, 3.0f, 6.4477f, 3.0f, 7.0f)
                curveTo(3.0f, 7.5523f, 3.4477f, 8.0f, 4.0f, 8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                curveTo(5.0f, 20.6569f, 6.3432f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(17.6569f, 22.0f, 19.0f, 20.6569f, 19.0f, 19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 8.0f, 21.0f, 7.5523f, 21.0f, 7.0f)
                curveTo(21.0f, 6.4477f, 20.5523f, 6.0f, 20.0f, 6.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(15.0f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(17.0f, 8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                curveTo(7.0f, 19.5523f, 7.4477f, 20.0f, 8.0f, 20.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 20.0f, 17.0f, 19.5523f, 17.0f, 19.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _trashEmpty!!
    }

private var _trashEmpty: ImageVector? = null
