package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.NetworkStrengthOff: ImageVector
    get() {
        if (_networkStrengthOff != null) {
            return _networkStrengthOff!!
        }
        _networkStrengthOff = Builder(name = "NetworkStrengthOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 1.0f)
                lineTo(12.4f, 9.6f)
                lineTo(21.0f, 18.19f)
                moveTo(4.77f, 4.5f)
                lineTo(3.5f, 5.77f)
                lineTo(9.86f, 12.13f)
                lineTo(1.0f, 21.0f)
                horizontalLineTo(18.73f)
                lineTo(20.73f, 23.0f)
                lineTo(22.0f, 21.73f)
            }
        }
        .build()
        return _networkStrengthOff!!
    }

private var _networkStrengthOff: ImageVector? = null
