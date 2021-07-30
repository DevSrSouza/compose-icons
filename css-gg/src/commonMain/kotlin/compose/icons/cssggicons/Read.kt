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
                curveTo(8.1046f, 14.0f, 9.0f, 13.1046f, 9.0f, 12.0f)
                curveTo(9.0f, 10.8954f, 8.1046f, 10.0f, 7.0f, 10.0f)
                curveTo(5.8954f, 10.0f, 5.0f, 10.8954f, 5.0f, 12.0f)
                curveTo(5.0f, 13.1046f, 5.8954f, 14.0f, 7.0f, 14.0f)
                close()
                moveTo(10.4649f, 10.0f)
                curveTo(9.7732f, 8.8044f, 8.4806f, 8.0f, 7.0f, 8.0f)
                curveTo(5.1362f, 8.0f, 3.5701f, 9.2748f, 3.126f, 11.0f)
                horizontalLineTo(2.0f)
                curveTo(1.4477f, 11.0f, 1.0f, 11.4477f, 1.0f, 12.0f)
                curveTo(1.0f, 12.5523f, 1.4477f, 13.0f, 2.0f, 13.0f)
                horizontalLineTo(3.126f)
                curveTo(3.5701f, 14.7252f, 5.1362f, 16.0f, 7.0f, 16.0f)
                curveTo(9.2091f, 16.0f, 11.0f, 14.2091f, 11.0f, 12.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 14.2091f, 14.7909f, 16.0f, 17.0f, 16.0f)
                curveTo(18.8638f, 16.0f, 20.4299f, 14.7252f, 20.874f, 13.0f)
                horizontalLineTo(22.0f)
                curveTo(22.5523f, 13.0f, 23.0f, 12.5523f, 23.0f, 12.0f)
                curveTo(23.0f, 11.4477f, 22.5523f, 11.0f, 22.0f, 11.0f)
                horizontalLineTo(20.874f)
                curveTo(20.4299f, 9.2748f, 18.8638f, 8.0f, 17.0f, 8.0f)
                curveTo(15.5194f, 8.0f, 14.2267f, 8.8044f, 13.5351f, 10.0f)
                horizontalLineTo(10.4649f)
                close()
                moveTo(15.0f, 12.0f)
                curveTo(15.0f, 13.1046f, 15.8954f, 14.0f, 17.0f, 14.0f)
                curveTo(18.1046f, 14.0f, 19.0f, 13.1046f, 19.0f, 12.0f)
                curveTo(19.0f, 10.8954f, 18.1046f, 10.0f, 17.0f, 10.0f)
                curveTo(15.8954f, 10.0f, 15.0f, 10.8954f, 15.0f, 12.0f)
                close()
            }
        }
        .build()
        return _read!!
    }

private var _read: ImageVector? = null
