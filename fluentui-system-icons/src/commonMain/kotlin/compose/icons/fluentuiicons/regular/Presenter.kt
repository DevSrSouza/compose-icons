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

public val RegularGroup.Presenter: ImageVector
    get() {
        if (_presenter != null) {
            return _presenter!!
        }
        _presenter = Builder(name = "Presenter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2449f, 12.9966f)
                curveTo(20.9537f, 12.9966f, 21.267f, 13.889f, 20.7137f, 14.3321f)
                lineTo(15.9958f, 18.1098f)
                verticalLineTo(19.7541f)
                curveTo(15.9958f, 20.9968f, 14.9884f, 22.0041f, 13.7458f, 22.0041f)
                horizontalLineTo(10.2504f)
                curveTo(9.0078f, 22.0041f, 8.0004f, 20.9968f, 8.0004f, 19.7541f)
                verticalLineTo(18.1099f)
                lineTo(3.2808f, 14.3322f)
                curveTo(2.7274f, 13.8892f, 3.0407f, 12.9966f, 3.7495f, 12.9966f)
                horizontalLineTo(20.2449f)
                close()
                moveTo(18.1083f, 14.4966f)
                horizontalLineTo(5.8867f)
                lineTo(9.2191f, 17.164f)
                curveTo(9.3969f, 17.3063f, 9.5004f, 17.5218f, 9.5004f, 17.7495f)
                verticalLineTo(19.7541f)
                curveTo(9.5004f, 20.1683f, 9.8362f, 20.5041f, 10.2504f, 20.5041f)
                horizontalLineTo(13.7458f)
                curveTo(14.16f, 20.5041f, 14.4958f, 20.1683f, 14.4958f, 19.7541f)
                verticalLineTo(17.7495f)
                curveTo(14.4958f, 17.5218f, 14.5993f, 17.3064f, 14.777f, 17.1641f)
                lineTo(18.1083f, 14.4966f)
                close()
                moveTo(8.7504f, 8.9995f)
                horizontalLineTo(15.2451f)
                curveTo(16.1633f, 8.9995f, 16.9163f, 9.7066f, 16.9893f, 10.606f)
                lineTo(16.9951f, 10.7495f)
                verticalLineTo(11.9995f)
                horizontalLineTo(15.4951f)
                verticalLineTo(10.7495f)
                curveTo(15.4951f, 10.6312f, 15.4129f, 10.5321f, 15.3025f, 10.5061f)
                lineTo(15.2451f, 10.4995f)
                horizontalLineTo(8.7504f)
                curveTo(8.6321f, 10.4995f, 8.533f, 10.5818f, 8.507f, 10.6922f)
                lineTo(8.5004f, 10.7495f)
                verticalLineTo(11.9995f)
                horizontalLineTo(7.0004f)
                verticalLineTo(10.7495f)
                curveTo(7.0004f, 9.8314f, 7.7076f, 9.0784f, 8.6069f, 9.0053f)
                lineTo(8.7504f, 8.9995f)
                horizontalLineTo(15.2451f)
                horizontalLineTo(8.7504f)
                close()
                moveTo(12.0004f, 2.0f)
                curveTo(13.6573f, 2.0f, 15.0004f, 3.3431f, 15.0004f, 5.0f)
                curveTo(15.0004f, 6.6568f, 13.6573f, 8.0f, 12.0004f, 8.0f)
                curveTo(10.3436f, 8.0f, 9.0004f, 6.6568f, 9.0004f, 5.0f)
                curveTo(9.0004f, 3.3431f, 10.3436f, 2.0f, 12.0004f, 2.0f)
                close()
                moveTo(12.0004f, 3.5f)
                curveTo(11.172f, 3.5f, 10.5004f, 4.1716f, 10.5004f, 5.0f)
                curveTo(10.5004f, 5.8284f, 11.172f, 6.5f, 12.0004f, 6.5f)
                curveTo(12.8289f, 6.5f, 13.5004f, 5.8284f, 13.5004f, 5.0f)
                curveTo(13.5004f, 4.1716f, 12.8289f, 3.5f, 12.0004f, 3.5f)
                close()
            }
        }
        .build()
        return _presenter!!
    }

private var _presenter: ImageVector? = null
