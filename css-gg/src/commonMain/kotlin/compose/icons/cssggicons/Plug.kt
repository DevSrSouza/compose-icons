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

public val CssGgIcons.Plug: ImageVector
    get() {
        if (_plug != null) {
            return _plug!!
        }
        _plug = Builder(name = "Plug", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 2.0f)
                curveTo(8.4477f, 2.0f, 8.0f, 2.4477f, 8.0f, 3.0f)
                verticalLineTo(5.0f)
                curveTo(8.0f, 5.5523f, 8.4477f, 6.0f, 9.0f, 6.0f)
                curveTo(9.5523f, 6.0f, 10.0f, 5.5523f, 10.0f, 5.0f)
                verticalLineTo(3.0f)
                curveTo(10.0f, 2.4477f, 9.5523f, 2.0f, 9.0f, 2.0f)
                close()
                moveTo(8.0f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                curveTo(16.0f, 13.2091f, 14.2091f, 15.0f, 12.0f, 15.0f)
                curveTo(9.7909f, 15.0f, 8.0f, 13.2091f, 8.0f, 11.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(13.0f, 16.917f)
                curveTo(15.8377f, 16.441f, 18.0f, 13.973f, 18.0f, 11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                curveTo(6.0f, 13.973f, 8.1623f, 16.441f, 11.0f, 16.917f)
                verticalLineTo(22.0f)
                curveTo(11.0f, 22.5523f, 11.4477f, 23.0f, 12.0f, 23.0f)
                curveTo(12.5523f, 23.0f, 13.0f, 22.5523f, 13.0f, 22.0f)
                verticalLineTo(16.917f)
                close()
                moveTo(14.0f, 3.0f)
                curveTo(14.0f, 2.4477f, 14.4477f, 2.0f, 15.0f, 2.0f)
                curveTo(15.5523f, 2.0f, 16.0f, 2.4477f, 16.0f, 3.0f)
                verticalLineTo(5.0f)
                curveTo(16.0f, 5.5523f, 15.5523f, 6.0f, 15.0f, 6.0f)
                curveTo(14.4477f, 6.0f, 14.0f, 5.5523f, 14.0f, 5.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _plug!!
    }

private var _plug: ImageVector? = null
