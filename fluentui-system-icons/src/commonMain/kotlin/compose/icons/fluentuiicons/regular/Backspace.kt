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

public val RegularGroup.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace = Builder(name = "Backspace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.75f, 4.0f)
                curveTo(20.483f, 4.0f, 21.8992f, 5.3565f, 21.9949f, 7.0656f)
                lineTo(22.0f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 18.483f, 20.6435f, 19.8992f, 18.9344f, 19.9949f)
                lineTo(18.75f, 20.0f)
                horizontalLineTo(10.2488f)
                curveTo(9.4847f, 20.0f, 8.7473f, 19.7308f, 8.1644f, 19.2436f)
                lineTo(8.0094f, 19.1053f)
                lineTo(3.0137f, 14.3553f)
                curveTo(1.7129f, 13.1185f, 1.661f, 11.0613f, 2.8978f, 9.7605f)
                lineTo(3.0137f, 9.6447f)
                lineTo(8.0094f, 4.8947f)
                curveTo(8.5631f, 4.3682f, 9.283f, 4.0552f, 10.0412f, 4.0066f)
                lineTo(10.2488f, 4.0f)
                horizontalLineTo(18.75f)
                close()
                moveTo(18.75f, 5.5f)
                horizontalLineTo(10.2488f)
                curveTo(9.856f, 5.5f, 9.4764f, 5.6321f, 9.1698f, 5.8723f)
                lineTo(9.0429f, 5.9818f)
                lineTo(4.0473f, 10.7318f)
                lineTo(3.9849f, 10.7941f)
                curveTo(3.3581f, 11.4534f, 3.3459f, 12.4733f, 3.9306f, 13.1463f)
                lineTo(4.0473f, 13.2682f)
                lineTo(9.0429f, 18.0182f)
                curveTo(9.3276f, 18.2889f, 9.6937f, 18.4547f, 10.0815f, 18.492f)
                lineTo(10.2488f, 18.5f)
                horizontalLineTo(18.75f)
                curveTo(19.6682f, 18.5f, 20.4212f, 17.7929f, 20.4942f, 16.8935f)
                lineTo(20.5f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(20.5f, 6.3318f, 19.7929f, 5.5788f, 18.8935f, 5.5058f)
                lineTo(18.75f, 5.5f)
                close()
                moveTo(11.4462f, 8.397f)
                lineTo(11.5303f, 8.4697f)
                lineTo(14.0001f, 10.939f)
                lineTo(16.4697f, 8.4697f)
                curveTo(16.7626f, 8.1768f, 17.2374f, 8.1768f, 17.5303f, 8.4697f)
                curveTo(17.7966f, 8.7359f, 17.8208f, 9.1526f, 17.6029f, 9.4462f)
                lineTo(17.5303f, 9.5303f)
                lineTo(15.0611f, 12.0f)
                lineTo(17.5303f, 14.4697f)
                curveTo(17.8232f, 14.7626f, 17.8232f, 15.2374f, 17.5303f, 15.5303f)
                curveTo(17.2641f, 15.7966f, 16.8474f, 15.8208f, 16.5538f, 15.6029f)
                lineTo(16.4697f, 15.5303f)
                lineTo(14.0001f, 13.061f)
                lineTo(11.5303f, 15.5303f)
                curveTo(11.2374f, 15.8232f, 10.7626f, 15.8232f, 10.4697f, 15.5303f)
                curveTo(10.2034f, 15.2641f, 10.1792f, 14.8474f, 10.397f, 14.5538f)
                lineTo(10.4697f, 14.4697f)
                lineTo(12.9391f, 12.0f)
                lineTo(10.4697f, 9.5303f)
                curveTo(10.1768f, 9.2374f, 10.1768f, 8.7626f, 10.4697f, 8.4697f)
                curveTo(10.7359f, 8.2034f, 11.1526f, 8.1792f, 11.4462f, 8.397f)
                close()
            }
        }
        .build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
