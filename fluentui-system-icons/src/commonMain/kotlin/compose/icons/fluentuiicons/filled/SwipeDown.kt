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

public val FilledGroup.SwipeDown: ImageVector
    get() {
        if (_swipeDown != null) {
            return _swipeDown!!
        }
        _swipeDown = Builder(name = "SwipeDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(12.5523f, 6.0f, 13.0f, 6.4477f, 13.0f, 7.0f)
                verticalLineTo(18.585f)
                lineTo(14.2929f, 17.2929f)
                curveTo(14.6534f, 16.9324f, 15.2206f, 16.9047f, 15.6129f, 17.2097f)
                lineTo(15.7071f, 17.2929f)
                curveTo(16.0676f, 17.6534f, 16.0953f, 18.2206f, 15.7903f, 18.6129f)
                lineTo(15.7071f, 18.7071f)
                lineTo(12.7071f, 21.7071f)
                curveTo(12.3466f, 22.0676f, 11.7794f, 22.0953f, 11.3871f, 21.7903f)
                lineTo(11.2929f, 21.7071f)
                lineTo(8.2929f, 18.7071f)
                curveTo(7.9024f, 18.3166f, 7.9024f, 17.6834f, 8.2929f, 17.2929f)
                curveTo(8.6534f, 16.9324f, 9.2206f, 16.9047f, 9.6129f, 17.2097f)
                lineTo(9.7071f, 17.2929f)
                lineTo(11.0f, 18.585f)
                verticalLineTo(7.0f)
                curveTo(11.0f, 6.4477f, 11.4477f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(14.7614f, 2.0f, 17.0f, 4.2386f, 17.0f, 7.0f)
                curveTo(17.0f, 9.0501f, 15.7662f, 10.812f, 14.0005f, 11.5837f)
                lineTo(14.0009f, 9.872f)
                curveTo(14.9071f, 9.2395f, 15.5f, 8.189f, 15.5f, 7.0f)
                curveTo(15.5f, 5.067f, 13.933f, 3.5f, 12.0f, 3.5f)
                curveTo(10.067f, 3.5f, 8.5f, 5.067f, 8.5f, 7.0f)
                curveTo(8.5f, 8.1894f, 9.0933f, 9.2402f, 10.0001f, 9.8727f)
                lineTo(10.0005f, 11.5842f)
                curveTo(8.2343f, 10.8127f, 7.0f, 9.0505f, 7.0f, 7.0f)
                curveTo(7.0f, 4.2386f, 9.2386f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _swipeDown!!
    }

private var _swipeDown: ImageVector? = null
