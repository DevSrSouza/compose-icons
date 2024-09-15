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

public val CssGgIcons.ViewList: ImageVector
    get() {
        if (_viewList != null) {
            return _viewList!!
        }
        _viewList = Builder(name = "ViewList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 5.0f)
                curveTo(3.343f, 5.0f, 2.0f, 6.343f, 2.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(2.0f, 17.657f, 3.343f, 19.0f, 5.0f, 19.0f)
                horizontalLineTo(19.0f)
                curveTo(20.657f, 19.0f, 22.0f, 17.657f, 22.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 6.343f, 20.657f, 5.0f, 19.0f, 5.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(7.0f, 7.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 7.0f, 4.0f, 7.448f, 4.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(9.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                curveTo(20.0f, 7.448f, 19.552f, 7.0f, 19.0f, 7.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(7.0f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(9.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(7.0f, 15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 16.552f, 4.448f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(9.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                curveTo(20.0f, 16.552f, 19.552f, 17.0f, 19.0f, 17.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _viewList!!
    }

private var _viewList: ImageVector? = null
