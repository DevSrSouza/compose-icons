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

public val MaterialDesignIcons.MathIntegralBox: ImageVector
    get() {
        if (_mathIntegralBox != null) {
            return _mathIntegralBox!!
        }
        _mathIntegralBox = Builder(name = "MathIntegralBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(15.9f, 6.9f)
                curveTo(15.9f, 6.9f, 15.2f, 6.6f, 14.9f, 6.6f)
                curveTo(14.3f, 6.5f, 13.9f, 6.7f, 13.7f, 7.7f)
                lineTo(12.0f, 16.8f)
                curveTo(11.8f, 17.6f, 11.5f, 18.2f, 11.0f, 18.6f)
                curveTo(10.6f, 18.9f, 10.2f, 19.0f, 9.7f, 19.0f)
                curveTo(8.9f, 19.0f, 7.7f, 18.5f, 7.7f, 18.5f)
                lineTo(8.2f, 17.1f)
                curveTo(8.2f, 17.1f, 9.0f, 17.4f, 9.2f, 17.4f)
                curveTo(9.5f, 17.5f, 9.7f, 17.4f, 9.9f, 17.3f)
                curveTo(10.1f, 17.2f, 10.2f, 16.9f, 10.3f, 16.6f)
                lineTo(11.9f, 7.4f)
                curveTo(12.0f, 6.6f, 12.4f, 6.0f, 12.9f, 5.5f)
                curveTo(13.5f, 5.1f, 14.2f, 5.0f, 15.0f, 5.1f)
                curveTo(15.7f, 5.2f, 16.5f, 5.6f, 16.5f, 5.6f)
                lineTo(15.9f, 6.9f)
                close()
            }
        }
        .build()
        return _mathIntegralBox!!
    }

private var _mathIntegralBox: ImageVector? = null
