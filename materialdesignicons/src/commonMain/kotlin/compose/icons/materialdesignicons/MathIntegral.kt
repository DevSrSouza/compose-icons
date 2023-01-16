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

public val MaterialDesignIcons.MathIntegral: ImageVector
    get() {
        if (_mathIntegral != null) {
            return _mathIntegral!!
        }
        _mathIntegral = Builder(name = "MathIntegral", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 19.1f)
                curveTo(11.3f, 20.2f, 10.9f, 21.0f, 10.2f, 21.5f)
                curveTo(9.5f, 22.0f, 8.6f, 22.1f, 7.5f, 21.9f)
                curveTo(7.1f, 21.8f, 6.3f, 21.7f, 6.0f, 21.5f)
                lineTo(6.5f, 20.0f)
                curveTo(6.8f, 20.1f, 7.4f, 20.3f, 7.7f, 20.3f)
                curveTo(8.8f, 20.5f, 9.4f, 20.0f, 9.6f, 18.8f)
                lineTo(12.0f, 5.2f)
                curveTo(12.2f, 4.0f, 12.7f, 3.2f, 13.4f, 2.6f)
                curveTo(14.1f, 2.1f, 15.1f, 1.9f, 16.2f, 2.1f)
                curveTo(16.6f, 2.2f, 17.4f, 2.3f, 18.0f, 2.6f)
                lineTo(17.5f, 4.0f)
                curveTo(17.3f, 3.9f, 16.6f, 3.8f, 16.3f, 3.7f)
                curveTo(15.0f, 3.5f, 14.3f, 4.1f, 14.0f, 5.6f)
                lineTo(11.5f, 19.1f)
                close()
            }
        }
        .build()
        return _mathIntegral!!
    }

private var _mathIntegral: ImageVector? = null
