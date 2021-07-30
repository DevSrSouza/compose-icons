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

public val CssGgIcons.Toolbox: ImageVector
    get() {
        if (_toolbox != null) {
            return _toolbox!!
        }
        _toolbox = Builder(name = "Toolbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 5.5f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 5.5f, 22.0f, 6.3954f, 22.0f, 7.5f)
                verticalLineTo(19.5f)
                curveTo(22.0f, 20.6046f, 21.1046f, 21.5f, 20.0f, 21.5f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 21.5f, 2.0f, 20.6046f, 2.0f, 19.5f)
                verticalLineTo(7.5f)
                curveTo(2.0f, 6.3954f, 2.8954f, 5.5f, 4.0f, 5.5f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 3.8431f, 8.3432f, 2.5f, 10.0f, 2.5f)
                horizontalLineTo(14.0f)
                curveTo(15.6569f, 2.5f, 17.0f, 3.8431f, 17.0f, 5.5f)
                close()
                moveTo(14.0f, 4.5f)
                horizontalLineTo(10.0f)
                curveTo(9.4477f, 4.5f, 9.0f, 4.9477f, 9.0f, 5.5f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 4.9477f, 14.5523f, 4.5f, 14.0f, 4.5f)
                close()
                moveTo(20.0f, 7.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.5f)
                close()
                moveTo(4.0f, 19.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.5f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
