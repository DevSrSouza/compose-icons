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

public val FilledGroup.Presenter: ImageVector
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
                moveTo(8.7504f, 8.9995f)
                horizontalLineTo(15.2451f)
                curveTo(16.1633f, 8.9995f, 16.9163f, 9.7066f, 16.9893f, 10.606f)
                lineTo(16.9951f, 10.7495f)
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
            }
        }
        .build()
        return _presenter!!
    }

private var _presenter: ImageVector? = null
