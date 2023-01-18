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

public val FilledGroup.BatteryCharge: ImageVector
    get() {
        if (_batteryCharge != null) {
            return _batteryCharge!!
        }
        _batteryCharge = Builder(name = "BatteryCharge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.75f, 6.0f)
                horizontalLineTo(17.0f)
                curveTo(18.5977f, 6.0f, 19.9037f, 7.2489f, 19.9949f, 8.8237f)
                lineTo(20.0f, 9.0f)
                verticalLineTo(10.0f)
                lineTo(21.0006f, 10.0178f)
                curveTo(21.1827f, 10.0178f, 21.3535f, 10.0665f, 21.5006f, 10.1516f)
                curveTo(21.7663f, 10.3053f, 21.9548f, 10.5778f, 21.9933f, 10.8963f)
                lineTo(22.0006f, 11.0178f)
                verticalLineTo(13.0178f)
                curveTo(22.0006f, 13.3879f, 21.7995f, 13.7111f, 21.5006f, 13.884f)
                curveTo(21.3903f, 13.9479f, 21.2667f, 13.9912f, 21.1349f, 14.0089f)
                lineTo(21.0006f, 14.0178f)
                lineTo(20.0f, 14.0f)
                verticalLineTo(15.0f)
                curveTo(20.0f, 16.5977f, 18.7511f, 17.9037f, 17.1763f, 17.9949f)
                lineTo(17.0f, 18.0f)
                horizontalLineTo(7.9953f)
                curveTo(7.6156f, 18.0f, 7.3018f, 17.7178f, 7.2521f, 17.3518f)
                lineTo(7.2453f, 17.25f)
                verticalLineTo(12.75f)
                curveTo(7.2453f, 12.3703f, 7.5274f, 12.0565f, 7.8935f, 12.0068f)
                lineTo(7.9953f, 12.0f)
                horizontalLineTo(8.6226f)
                curveTo(9.3386f, 12.0f, 9.927f, 11.4537f, 9.9937f, 10.7553f)
                lineTo(10.0f, 10.6226f)
                verticalLineTo(6.75f)
                curveTo(10.0f, 6.3703f, 10.2822f, 6.0565f, 10.6482f, 6.0068f)
                lineTo(10.75f, 6.0f)
                horizontalLineTo(17.0f)
                horizontalLineTo(10.75f)
                close()
                moveTo(6.6451f, 4.0068f)
                lineTo(6.7469f, 4.0f)
                curveTo(7.1266f, 4.0f, 7.4404f, 4.2821f, 7.49f, 4.6482f)
                lineTo(7.4969f, 4.75f)
                lineTo(7.496f, 6.0f)
                horizontalLineTo(8.2535f)
                curveTo(8.6678f, 6.0f, 9.0035f, 6.3358f, 9.0035f, 6.75f)
                verticalLineTo(9.2488f)
                curveTo(9.0035f, 10.2153f, 8.22f, 10.9988f, 7.2536f, 10.9988f)
                lineTo(6.251f, 10.998f)
                lineTo(6.2518f, 17.2432f)
                curveTo(6.2518f, 17.6229f, 5.9696f, 17.9367f, 5.6035f, 17.9863f)
                lineTo(5.5018f, 17.9932f)
                curveTo(5.1221f, 17.9932f, 4.8083f, 17.711f, 4.7586f, 17.345f)
                lineTo(4.7518f, 17.2432f)
                lineTo(4.7518f, 10.998f)
                lineTo(3.75f, 10.9988f)
                curveTo(2.7835f, 10.9988f, 2.0f, 10.2153f, 2.0f, 9.2488f)
                verticalLineTo(6.75f)
                curveTo(2.0f, 6.3358f, 2.3358f, 6.0f, 2.75f, 6.0f)
                horizontalLineTo(3.501f)
                lineTo(3.5011f, 4.75f)
                curveTo(3.5011f, 4.3703f, 3.7832f, 4.0565f, 4.1493f, 4.0068f)
                lineTo(4.2511f, 4.0f)
                curveTo(4.6308f, 4.0f, 4.9446f, 4.2821f, 4.9942f, 4.6482f)
                lineTo(5.0011f, 4.75f)
                lineTo(5.001f, 6.0f)
                horizontalLineTo(5.996f)
                lineTo(5.9969f, 4.75f)
                curveTo(5.9969f, 4.3703f, 6.2791f, 4.0565f, 6.6451f, 4.0068f)
                lineTo(6.7469f, 4.0f)
                lineTo(6.6451f, 4.0068f)
                close()
            }
        }
        .build()
        return _batteryCharge!!
    }

private var _batteryCharge: ImageVector? = null
