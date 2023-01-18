package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.SwipeDown: ImageVector
    get() {
        if (_swipeDown != null) {
            return _swipeDown!!
        }
        _swipeDown = Builder(name = "SwipeDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.9966f)
                curveTo(12.3797f, 5.9966f, 12.6935f, 6.2786f, 12.7432f, 6.6443f)
                lineTo(12.75f, 6.746f)
                verticalLineTo(19.4403f)
                lineTo(14.9697f, 17.2237f)
                curveTo(15.2359f, 16.9576f, 15.6526f, 16.9335f, 15.9462f, 17.1511f)
                lineTo(16.0303f, 17.2237f)
                curveTo(16.2966f, 17.4897f, 16.3208f, 17.906f, 16.1029f, 18.1994f)
                lineTo(16.0303f, 18.2835f)
                lineTo(12.5303f, 21.7805f)
                curveTo(12.2641f, 22.0466f, 11.8474f, 22.0707f, 11.5538f, 21.8531f)
                lineTo(11.4697f, 21.7805f)
                lineTo(7.9697f, 18.2835f)
                curveTo(7.6768f, 17.9908f, 7.6768f, 17.5163f, 7.9697f, 17.2237f)
                curveTo(8.2359f, 16.9576f, 8.6526f, 16.9335f, 8.9462f, 17.1511f)
                lineTo(9.0303f, 17.2237f)
                lineTo(11.25f, 19.4403f)
                verticalLineTo(6.746f)
                curveTo(11.25f, 6.3321f, 11.5858f, 5.9966f, 12.0f, 5.9966f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(14.7614f, 2.0f, 17.0f, 4.2367f, 17.0f, 6.9958f)
                curveTo(17.0f, 9.1394f, 15.6488f, 10.9677f, 13.7509f, 11.6767f)
                lineTo(13.7507f, 10.0246f)
                curveTo(14.7965f, 9.4198f, 15.5f, 8.2899f, 15.5f, 6.9958f)
                curveTo(15.5f, 5.0644f, 13.933f, 3.4987f, 12.0f, 3.4987f)
                curveTo(10.067f, 3.4987f, 8.5f, 5.0644f, 8.5f, 6.9958f)
                curveTo(8.5f, 8.2903f, 9.204f, 9.4205f, 10.2502f, 10.0252f)
                lineTo(10.2501f, 11.6771f)
                curveTo(8.3517f, 10.9684f, 7.0f, 9.1398f, 7.0f, 6.9958f)
                curveTo(7.0f, 4.2367f, 9.2386f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _swipeDown!!
    }

private var _swipeDown: ImageVector? = null
