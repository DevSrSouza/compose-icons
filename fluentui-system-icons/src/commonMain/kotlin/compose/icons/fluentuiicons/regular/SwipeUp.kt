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

public val RegularGroup.SwipeUp: ImageVector
    get() {
        if (_swipeUp != null) {
            return _swipeUp!!
        }
        _swipeUp = Builder(name = "SwipeUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0034f)
                curveTo(12.3797f, 18.0034f, 12.6935f, 17.7214f, 12.7432f, 17.3557f)
                lineTo(12.75f, 17.254f)
                verticalLineTo(4.5597f)
                lineTo(14.9697f, 6.7763f)
                curveTo(15.2359f, 7.0423f, 15.6526f, 7.0665f, 15.9462f, 6.8489f)
                lineTo(16.0303f, 6.7763f)
                curveTo(16.2966f, 6.5103f, 16.3208f, 6.0939f, 16.1029f, 5.8006f)
                lineTo(16.0303f, 5.7165f)
                lineTo(12.5303f, 2.2195f)
                curveTo(12.2641f, 1.9534f, 11.8474f, 1.9293f, 11.5538f, 2.1469f)
                lineTo(11.4697f, 2.2195f)
                lineTo(7.9697f, 5.7165f)
                curveTo(7.6768f, 6.0092f, 7.6768f, 6.4837f, 7.9697f, 6.7763f)
                curveTo(8.2359f, 7.0423f, 8.6526f, 7.0665f, 8.9462f, 6.8489f)
                lineTo(9.0303f, 6.7763f)
                lineTo(11.25f, 4.5597f)
                verticalLineTo(17.254f)
                curveTo(11.25f, 17.6679f, 11.5858f, 18.0034f, 12.0f, 18.0034f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(14.7614f, 22.0f, 17.0f, 19.7633f, 17.0f, 17.0042f)
                curveTo(17.0f, 14.8606f, 15.6488f, 13.0323f, 13.7509f, 12.3233f)
                lineTo(13.7507f, 13.9754f)
                curveTo(14.7965f, 14.5802f, 15.5f, 15.7101f, 15.5f, 17.0042f)
                curveTo(15.5f, 18.9356f, 13.933f, 20.5013f, 12.0f, 20.5013f)
                curveTo(10.067f, 20.5013f, 8.5f, 18.9356f, 8.5f, 17.0042f)
                curveTo(8.5f, 15.7097f, 9.204f, 14.5795f, 10.2502f, 13.9748f)
                lineTo(10.2501f, 12.3229f)
                curveTo(8.3517f, 13.0316f, 7.0f, 14.8602f, 7.0f, 17.0042f)
                curveTo(7.0f, 19.7633f, 9.2386f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _swipeUp!!
    }

private var _swipeUp: ImageVector? = null
