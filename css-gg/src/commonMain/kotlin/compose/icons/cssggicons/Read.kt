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

public val CssGgIcons.Read: ImageVector
    get() {
        if (_read != null) {
            return _read!!
        }
        _read = Builder(name = "Read", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 14.0f)
                curveTo(8.105f, 14.0f, 9.0f, 13.105f, 9.0f, 12.0f)
                curveTo(9.0f, 10.895f, 8.105f, 10.0f, 7.0f, 10.0f)
                curveTo(5.895f, 10.0f, 5.0f, 10.895f, 5.0f, 12.0f)
                curveTo(5.0f, 13.105f, 5.895f, 14.0f, 7.0f, 14.0f)
                close()
                moveTo(10.465f, 10.0f)
                curveTo(9.773f, 8.804f, 8.481f, 8.0f, 7.0f, 8.0f)
                curveTo(5.136f, 8.0f, 3.57f, 9.275f, 3.126f, 11.0f)
                horizontalLineTo(2.0f)
                curveTo(1.448f, 11.0f, 1.0f, 11.448f, 1.0f, 12.0f)
                curveTo(1.0f, 12.552f, 1.448f, 13.0f, 2.0f, 13.0f)
                horizontalLineTo(3.126f)
                curveTo(3.57f, 14.725f, 5.136f, 16.0f, 7.0f, 16.0f)
                curveTo(9.209f, 16.0f, 11.0f, 14.209f, 11.0f, 12.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 14.209f, 14.791f, 16.0f, 17.0f, 16.0f)
                curveTo(18.864f, 16.0f, 20.43f, 14.725f, 20.874f, 13.0f)
                horizontalLineTo(22.0f)
                curveTo(22.552f, 13.0f, 23.0f, 12.552f, 23.0f, 12.0f)
                curveTo(23.0f, 11.448f, 22.552f, 11.0f, 22.0f, 11.0f)
                horizontalLineTo(20.874f)
                curveTo(20.43f, 9.275f, 18.864f, 8.0f, 17.0f, 8.0f)
                curveTo(15.519f, 8.0f, 14.227f, 8.804f, 13.535f, 10.0f)
                horizontalLineTo(10.465f)
                close()
                moveTo(15.0f, 12.0f)
                curveTo(15.0f, 13.105f, 15.895f, 14.0f, 17.0f, 14.0f)
                curveTo(18.105f, 14.0f, 19.0f, 13.105f, 19.0f, 12.0f)
                curveTo(19.0f, 10.895f, 18.105f, 10.0f, 17.0f, 10.0f)
                curveTo(15.895f, 10.0f, 15.0f, 10.895f, 15.0f, 12.0f)
                close()
            }
        }
        .build()
        return _read!!
    }

private var _read: ImageVector? = null
