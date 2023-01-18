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

public val FilledGroup.CallInbound: ImageVector
    get() {
        if (_callInbound != null) {
            return _callInbound!!
        }
        _callInbound = Builder(name = "CallInbound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3674f, 3.313f)
                lineTo(10.2271f, 5.3403f)
                curveTo(10.6018f, 6.2238f, 10.3939f, 7.2627f, 9.7131f, 7.9088f)
                lineTo(7.8188f, 9.7068f)
                curveTo(7.9357f, 10.7823f, 8.2972f, 11.8413f, 8.9033f, 12.8838f)
                curveTo(9.5095f, 13.9263f, 10.2665f, 14.7911f, 11.1744f, 15.4782f)
                lineTo(13.4496f, 14.7195f)
                curveTo(14.312f, 14.4319f, 15.2512f, 14.7624f, 15.7802f, 15.5396f)
                lineTo(17.0125f, 17.3502f)
                curveTo(17.6275f, 18.2536f, 17.5169f, 19.4999f, 16.7538f, 20.2659f)
                lineTo(15.9361f, 21.0869f)
                curveTo(15.1222f, 21.904f, 13.9597f, 22.2004f, 12.8843f, 21.8649f)
                curveTo(10.3454f, 21.073f, 8.0111f, 18.7218f, 5.8813f, 14.8113f)
                curveTo(3.7485f, 10.8951f, 2.9957f, 7.5725f, 3.6231f, 4.8435f)
                curveTo(3.8871f, 3.6952f, 4.7046f, 2.7807f, 5.7721f, 2.4396f)
                lineTo(6.8487f, 2.0956f)
                curveTo(7.8575f, 1.7733f, 8.9354f, 2.2942f, 9.3674f, 3.313f)
                close()
                moveTo(14.4982f, 8.4391f)
                lineTo(20.7188f, 2.2159f)
                curveTo(21.0116f, 1.9229f, 21.4865f, 1.9228f, 21.7794f, 2.2156f)
                curveTo(22.0458f, 2.4818f, 22.0701f, 2.8985f, 21.8523f, 3.1922f)
                lineTo(21.7797f, 3.2763f)
                lineTo(15.5592f, 9.4991f)
                lineTo(20.2503f, 9.4991f)
                curveTo(20.63f, 9.4991f, 20.9438f, 9.7813f, 20.9935f, 10.1473f)
                lineTo(21.0003f, 10.2491f)
                curveTo(21.0003f, 10.6288f, 20.7182f, 10.9426f, 20.3521f, 10.9923f)
                lineTo(20.2503f, 10.9991f)
                lineTo(13.6955f, 10.9984f)
                lineTo(13.5973f, 10.9849f)
                lineTo(13.502f, 10.9586f)
                lineTo(13.4341f, 10.9301f)
                curveTo(13.3559f, 10.8952f, 13.2829f, 10.8451f, 13.2186f, 10.7809f)
                lineTo(13.1779f, 10.7368f)
                lineTo(13.1529f, 10.7046f)
                lineTo(13.1054f, 10.636f)
                lineTo(13.0592f, 10.5445f)
                lineTo(13.0268f, 10.453f)
                lineTo(13.0105f, 10.3829f)
                lineTo(13.0006f, 10.3019f)
                lineTo(12.9988f, 10.2491f)
                verticalLineTo(3.7452f)
                curveTo(12.9988f, 3.331f, 13.3346f, 2.9952f, 13.7488f, 2.9952f)
                curveTo(14.1285f, 2.9952f, 14.4423f, 3.2774f, 14.492f, 3.6434f)
                lineTo(14.4988f, 3.7452f)
                lineTo(14.4982f, 8.4391f)
                lineTo(20.7188f, 2.2159f)
                lineTo(14.4982f, 8.4391f)
                close()
            }
        }
        .build()
        return _callInbound!!
    }

private var _callInbound: ImageVector? = null
