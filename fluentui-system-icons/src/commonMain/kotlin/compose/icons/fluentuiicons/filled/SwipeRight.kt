package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.SwipeRight: ImageVector
    get() {
        if (_swipeRight != null) {
            return _swipeRight!!
        }
        _swipeRight = Builder(name = "SwipeRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                curveTo(6.0f, 12.5523f, 6.4477f, 13.0f, 7.0f, 13.0f)
                horizontalLineTo(18.585f)
                lineTo(17.2929f, 14.2929f)
                curveTo(16.9324f, 14.6534f, 16.9047f, 15.2206f, 17.2097f, 15.6129f)
                lineTo(17.2929f, 15.7071f)
                curveTo(17.6534f, 16.0676f, 18.2206f, 16.0953f, 18.6129f, 15.7903f)
                lineTo(18.7071f, 15.7071f)
                lineTo(21.7071f, 12.7071f)
                curveTo(22.0676f, 12.3466f, 22.0953f, 11.7794f, 21.7903f, 11.3871f)
                lineTo(21.7071f, 11.2929f)
                lineTo(18.7071f, 8.2929f)
                curveTo(18.3166f, 7.9024f, 17.6834f, 7.9024f, 17.2929f, 8.2929f)
                curveTo(16.9324f, 8.6534f, 16.9047f, 9.2206f, 17.2097f, 9.6129f)
                lineTo(17.2929f, 9.7071f)
                lineTo(18.585f, 11.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 11.0f, 6.0f, 11.4477f, 6.0f, 12.0f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 14.7614f, 4.2386f, 17.0f, 7.0f, 17.0f)
                curveTo(9.0501f, 17.0f, 10.812f, 15.7662f, 11.5837f, 14.0005f)
                lineTo(9.872f, 14.0009f)
                curveTo(9.2395f, 14.9071f, 8.189f, 15.5f, 7.0f, 15.5f)
                curveTo(5.067f, 15.5f, 3.5f, 13.933f, 3.5f, 12.0f)
                curveTo(3.5f, 10.067f, 5.067f, 8.5f, 7.0f, 8.5f)
                curveTo(8.1894f, 8.5f, 9.2402f, 9.0933f, 9.8727f, 10.0001f)
                lineTo(11.5842f, 10.0005f)
                curveTo(10.8127f, 8.2343f, 9.0505f, 7.0f, 7.0f, 7.0f)
                curveTo(4.2386f, 7.0f, 2.0f, 9.2386f, 2.0f, 12.0f)
                close()
            }
        }
        .build()
        return _swipeRight!!
    }

private var _swipeRight: ImageVector? = null
