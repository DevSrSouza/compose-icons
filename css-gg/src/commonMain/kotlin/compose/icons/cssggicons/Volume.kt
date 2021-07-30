package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.Volume: ImageVector
    get() {
        if (_volume != null) {
            return _volume!!
        }
        _volume = Builder(name = "Volume", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveTo(24.0f, 16.4183f, 20.4183f, 20.0f, 16.0f, 20.0f)
                verticalLineTo(18.0f)
                curveTo(19.3137f, 18.0f, 22.0f, 15.3137f, 22.0f, 12.0f)
                curveTo(22.0f, 8.6863f, 19.3137f, 6.0f, 16.0f, 6.0f)
                verticalLineTo(4.0f)
                curveTo(20.4183f, 4.0f, 24.0f, 7.5817f, 24.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 14.2091f, 18.2091f, 16.0f, 16.0f, 16.0f)
                verticalLineTo(14.0f)
                curveTo(17.1046f, 14.0f, 18.0f, 13.1046f, 18.0f, 12.0f)
                curveTo(18.0f, 10.8954f, 17.1046f, 10.0f, 16.0f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(18.2091f, 8.0f, 20.0f, 9.7909f, 20.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 16.0f)
                lineTo(15.0f, 20.0f)
                verticalLineTo(4.0f)
                lineTo(9.0f, 8.0f)
                horizontalLineTo(5.0f)
                curveTo(2.7909f, 8.0f, 1.0f, 9.7909f, 1.0f, 12.0f)
                curveTo(1.0f, 14.2091f, 2.7909f, 16.0f, 5.0f, 16.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(5.0f, 10.0f)
                horizontalLineTo(9.0f)
                lineTo(13.0f, 7.5f)
                verticalLineTo(16.5f)
                lineTo(9.0f, 14.0f)
                horizontalLineTo(5.0f)
                curveTo(3.8954f, 14.0f, 3.0f, 13.1046f, 3.0f, 12.0f)
                curveTo(3.0f, 10.8954f, 3.8954f, 10.0f, 5.0f, 10.0f)
                close()
            }
        }
        .build()
        return _volume!!
    }

private var _volume: ImageVector? = null
