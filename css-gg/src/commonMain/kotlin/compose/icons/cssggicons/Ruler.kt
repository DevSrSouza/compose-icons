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

public val CssGgIcons.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(name = "Ruler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 6.0f)
                curveTo(1.3432f, 6.0f, 0.0f, 7.3432f, 0.0f, 9.0f)
                verticalLineTo(16.0f)
                curveTo(0.0f, 17.6569f, 1.3432f, 19.0f, 3.0f, 19.0f)
                horizontalLineTo(21.0f)
                curveTo(22.6569f, 19.0f, 24.0f, 17.6569f, 24.0f, 16.0f)
                verticalLineTo(9.0f)
                curveTo(24.0f, 7.3432f, 22.6569f, 6.0f, 21.0f, 6.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(9.0f, 8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                curveTo(7.0f, 13.5523f, 6.5523f, 14.0f, 6.0f, 14.0f)
                curveTo(5.4477f, 14.0f, 5.0f, 13.5523f, 5.0f, 13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 8.0f, 2.0f, 8.4477f, 2.0f, 9.0f)
                verticalLineTo(16.0f)
                curveTo(2.0f, 16.5523f, 2.4477f, 17.0f, 3.0f, 17.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 17.0f, 22.0f, 16.5523f, 22.0f, 16.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 8.4477f, 21.5523f, 8.0f, 21.0f, 8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                curveTo(19.0f, 11.5523f, 18.5523f, 12.0f, 18.0f, 12.0f)
                curveTo(17.4477f, 12.0f, 17.0f, 11.5523f, 17.0f, 11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                curveTo(15.0f, 13.5523f, 14.5523f, 14.0f, 14.0f, 14.0f)
                curveTo(13.4477f, 14.0f, 13.0f, 13.5523f, 13.0f, 13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                curveTo(11.0f, 11.5523f, 10.5523f, 12.0f, 10.0f, 12.0f)
                curveTo(9.4477f, 12.0f, 9.0f, 11.5523f, 9.0f, 11.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
