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

public val RegularGroup.SwipeRight: ImageVector
    get() {
        if (_swipeRight != null) {
            return _swipeRight!!
        }
        _swipeRight = Builder(name = "SwipeRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.9966f, 12.0f)
                curveTo(5.9966f, 12.3797f, 6.2786f, 12.6935f, 6.6443f, 12.7432f)
                lineTo(6.746f, 12.75f)
                horizontalLineTo(19.4403f)
                lineTo(17.2237f, 14.9697f)
                curveTo(16.9576f, 15.2359f, 16.9335f, 15.6526f, 17.1511f, 15.9462f)
                lineTo(17.2237f, 16.0303f)
                curveTo(17.4897f, 16.2966f, 17.906f, 16.3208f, 18.1994f, 16.1029f)
                lineTo(18.2835f, 16.0303f)
                lineTo(21.7805f, 12.5303f)
                curveTo(22.0466f, 12.2641f, 22.0707f, 11.8474f, 21.8531f, 11.5538f)
                lineTo(21.7805f, 11.4697f)
                lineTo(18.2835f, 7.9697f)
                curveTo(17.9908f, 7.6768f, 17.5163f, 7.6768f, 17.2237f, 7.9697f)
                curveTo(16.9576f, 8.2359f, 16.9335f, 8.6526f, 17.1511f, 8.9462f)
                lineTo(17.2237f, 9.0303f)
                lineTo(19.4403f, 11.25f)
                horizontalLineTo(6.746f)
                curveTo(6.3321f, 11.25f, 5.9966f, 11.5858f, 5.9966f, 12.0f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 14.7614f, 4.2367f, 17.0f, 6.9958f, 17.0f)
                curveTo(9.1394f, 17.0f, 10.9677f, 15.6488f, 11.6767f, 13.7509f)
                lineTo(10.0246f, 13.7507f)
                curveTo(9.4198f, 14.7965f, 8.2899f, 15.5f, 6.9958f, 15.5f)
                curveTo(5.0644f, 15.5f, 3.4987f, 13.933f, 3.4987f, 12.0f)
                curveTo(3.4987f, 10.067f, 5.0644f, 8.5f, 6.9958f, 8.5f)
                curveTo(8.2903f, 8.5f, 9.4205f, 9.204f, 10.0252f, 10.2502f)
                lineTo(11.6771f, 10.2501f)
                curveTo(10.9684f, 8.3517f, 9.1398f, 7.0f, 6.9958f, 7.0f)
                curveTo(4.2367f, 7.0f, 2.0f, 9.2386f, 2.0f, 12.0f)
                close()
            }
        }
        .build()
        return _swipeRight!!
    }

private var _swipeRight: ImageVector? = null
