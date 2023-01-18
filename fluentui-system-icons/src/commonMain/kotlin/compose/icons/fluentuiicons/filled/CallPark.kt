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

public val FilledGroup.CallPark: ImageVector
    get() {
        if (_callPark != null) {
            return _callPark!!
        }
        _callPark = Builder(name = "CallPark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3674f, 3.3126f)
                lineTo(10.2271f, 5.3399f)
                curveTo(10.6018f, 6.2234f, 10.3939f, 7.2623f, 9.7131f, 7.9084f)
                lineTo(7.8188f, 9.7064f)
                curveTo(7.9357f, 10.7819f, 8.2972f, 11.8409f, 8.9033f, 12.8834f)
                curveTo(9.5095f, 13.9259f, 10.2665f, 14.7907f, 11.1744f, 15.4778f)
                lineTo(13.4496f, 14.7191f)
                curveTo(14.312f, 14.4315f, 15.2512f, 14.762f, 15.7802f, 15.5392f)
                lineTo(17.0125f, 17.3498f)
                curveTo(17.6275f, 18.2532f, 17.5169f, 19.4995f, 16.7538f, 20.2655f)
                lineTo(15.9361f, 21.0865f)
                curveTo(15.1222f, 21.9036f, 13.9597f, 22.2f, 12.8843f, 21.8645f)
                curveTo(10.3454f, 21.0726f, 8.0111f, 18.7214f, 5.8813f, 14.8109f)
                curveTo(3.7485f, 10.8947f, 2.9957f, 7.5721f, 3.6231f, 4.8431f)
                curveTo(3.8871f, 3.6948f, 4.7046f, 2.7803f, 5.7721f, 2.4392f)
                lineTo(6.8487f, 2.0952f)
                curveTo(7.8575f, 1.7729f, 8.9354f, 2.2938f, 9.3674f, 3.3126f)
                close()
                moveTo(14.7503f, 2.0f)
                horizontalLineTo(17.2464f)
                curveTo(19.6359f, 2.0f, 21.0003f, 3.1355f, 21.0003f, 5.25f)
                curveTo(21.0003f, 7.2944f, 19.7248f, 8.4226f, 17.4818f, 8.4931f)
                lineTo(17.2464f, 8.4966f)
                lineTo(15.5003f, 8.4966f)
                verticalLineTo(11.2561f)
                curveTo(15.5003f, 11.6703f, 15.1645f, 12.0061f, 14.7503f, 12.0061f)
                curveTo(14.3706f, 12.0061f, 14.0568f, 11.724f, 14.0072f, 11.3579f)
                lineTo(14.0003f, 11.2561f)
                verticalLineTo(2.75f)
                curveTo(14.0003f, 2.3703f, 14.2825f, 2.0565f, 14.6486f, 2.0069f)
                lineTo(14.7503f, 2.0f)
                horizontalLineTo(17.2464f)
                horizontalLineTo(14.7503f)
                close()
                moveTo(17.2464f, 3.5f)
                horizontalLineTo(15.5003f)
                verticalLineTo(6.9967f)
                lineTo(17.2472f, 6.9966f)
                curveTo(18.8627f, 6.9984f, 19.5003f, 6.4685f, 19.5003f, 5.25f)
                curveTo(19.5003f, 4.0819f, 18.9142f, 3.5455f, 17.4433f, 3.5028f)
                lineTo(17.2464f, 3.5f)
                close()
            }
        }
        .build()
        return _callPark!!
    }

private var _callPark: ImageVector? = null
