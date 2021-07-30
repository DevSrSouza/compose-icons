package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 16.0f)
                curveTo(14.2091f, 16.0f, 16.0f, 14.2091f, 16.0f, 12.0f)
                curveTo(16.0f, 9.7909f, 14.2091f, 8.0f, 12.0f, 8.0f)
                curveTo(9.7909f, 8.0f, 8.0f, 9.7909f, 8.0f, 12.0f)
                curveTo(8.0f, 14.2091f, 9.7909f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(15.3137f, 18.0f, 18.0f, 15.3137f, 18.0f, 12.0f)
                curveTo(18.0f, 8.6863f, 15.3137f, 6.0f, 12.0f, 6.0f)
                curveTo(8.6863f, 6.0f, 6.0f, 8.6863f, 6.0f, 12.0f)
                curveTo(6.0f, 15.3137f, 8.6863f, 18.0f, 12.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 0.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0619f)
                curveTo(12.6724f, 4.021f, 12.3387f, 4.0f, 12.0f, 4.0f)
                curveTo(11.6613f, 4.0f, 11.3276f, 4.021f, 11.0f, 4.0619f)
                verticalLineTo(0.0f)
                close()
                moveTo(7.0943f, 5.6802f)
                lineTo(4.2217f, 2.8076f)
                lineTo(2.8075f, 4.2218f)
                lineTo(5.6801f, 7.0944f)
                curveTo(6.0907f, 6.5662f, 6.5661f, 6.0908f, 7.0943f, 5.6802f)
                close()
                moveTo(4.0619f, 11.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0619f)
                curveTo(4.021f, 12.6724f, 4.0f, 12.3387f, 4.0f, 12.0f)
                curveTo(4.0f, 11.6613f, 4.021f, 11.3276f, 4.0619f, 11.0f)
                close()
                moveTo(5.6801f, 16.9056f)
                lineTo(2.8075f, 19.7782f)
                lineTo(4.2217f, 21.1924f)
                lineTo(7.0943f, 18.3198f)
                curveTo(6.5661f, 17.9092f, 6.0907f, 17.4338f, 5.6801f, 16.9056f)
                close()
                moveTo(11.0f, 19.9381f)
                verticalLineTo(24.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.9381f)
                curveTo(12.6724f, 19.979f, 12.3387f, 20.0f, 12.0f, 20.0f)
                curveTo(11.6613f, 20.0f, 11.3276f, 19.979f, 11.0f, 19.9381f)
                close()
                moveTo(16.9056f, 18.3199f)
                lineTo(19.7781f, 21.1924f)
                lineTo(21.1923f, 19.7782f)
                lineTo(18.3198f, 16.9057f)
                curveTo(17.9092f, 17.4339f, 17.4338f, 17.9093f, 16.9056f, 18.3199f)
                close()
                moveTo(19.9381f, 13.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.9381f)
                curveTo(19.979f, 11.3276f, 20.0f, 11.6613f, 20.0f, 12.0f)
                curveTo(20.0f, 12.3387f, 19.979f, 12.6724f, 19.9381f, 13.0f)
                close()
                moveTo(18.3198f, 7.0943f)
                lineTo(21.1923f, 4.2218f)
                lineTo(19.7781f, 2.8076f)
                lineTo(16.9056f, 5.6801f)
                curveTo(17.4338f, 6.0907f, 17.9092f, 6.5661f, 18.3198f, 7.0943f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
