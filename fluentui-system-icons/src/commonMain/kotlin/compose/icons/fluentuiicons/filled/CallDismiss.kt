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

public val FilledGroup.CallDismiss: ImageVector
    get() {
        if (_callDismiss != null) {
            return _callDismiss!!
        }
        _callDismiss = Builder(name = "CallDismiss", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7806f, 2.2197f)
                curveTo(22.0735f, 2.5126f, 22.0735f, 2.9874f, 21.7806f, 3.2803f)
                lineTo(18.5609f, 6.5f)
                lineTo(21.7806f, 9.7197f)
                curveTo(22.0735f, 10.0126f, 22.0735f, 10.4874f, 21.7806f, 10.7803f)
                curveTo(21.4877f, 11.0732f, 21.0128f, 11.0732f, 20.7199f, 10.7803f)
                lineTo(17.5002f, 7.5607f)
                lineTo(14.2806f, 10.7803f)
                curveTo(13.9877f, 11.0732f, 13.5128f, 11.0732f, 13.2199f, 10.7803f)
                curveTo(12.927f, 10.4874f, 12.927f, 10.0126f, 13.2199f, 9.7197f)
                lineTo(16.4396f, 6.5f)
                lineTo(13.2199f, 3.2803f)
                curveTo(12.927f, 2.9874f, 12.927f, 2.5126f, 13.2199f, 2.2197f)
                curveTo(13.5128f, 1.9268f, 13.9877f, 1.9268f, 14.2806f, 2.2197f)
                lineTo(17.5002f, 5.4393f)
                lineTo(20.7199f, 2.2197f)
                curveTo(21.0128f, 1.9268f, 21.4877f, 1.9268f, 21.7806f, 2.2197f)
                close()
                moveTo(9.3674f, 3.3123f)
                lineTo(10.2271f, 5.3397f)
                curveTo(10.6018f, 6.2231f, 10.3939f, 7.262f, 9.7131f, 7.9082f)
                lineTo(7.8188f, 9.7062f)
                curveTo(7.9357f, 10.7816f, 8.2972f, 11.8406f, 8.9033f, 12.8832f)
                curveTo(9.5095f, 13.9257f, 10.2665f, 14.7905f, 11.1744f, 15.4776f)
                lineTo(13.4496f, 14.7189f)
                curveTo(14.312f, 14.4313f, 15.2512f, 14.7618f, 15.7802f, 15.539f)
                lineTo(17.0125f, 17.3495f)
                curveTo(17.6275f, 18.2529f, 17.5169f, 19.4993f, 16.7538f, 20.2653f)
                lineTo(15.9361f, 21.0862f)
                curveTo(15.1222f, 21.9033f, 13.9597f, 22.1997f, 12.8843f, 21.8643f)
                curveTo(10.3454f, 21.0723f, 8.0111f, 18.7211f, 5.8813f, 14.8107f)
                curveTo(3.7485f, 10.8945f, 2.9957f, 7.5719f, 3.6231f, 4.8429f)
                curveTo(3.8871f, 3.6946f, 4.7046f, 2.7801f, 5.7721f, 2.439f)
                lineTo(6.8487f, 2.095f)
                curveTo(7.8575f, 1.7726f, 8.9354f, 2.2936f, 9.3674f, 3.3123f)
                close()
            }
        }
        .build()
        return _callDismiss!!
    }

private var _callDismiss: ImageVector? = null
