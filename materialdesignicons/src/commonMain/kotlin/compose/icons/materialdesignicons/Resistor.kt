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

public val MaterialDesignIcons.Resistor: ImageVector
    get() {
        if (_resistor != null) {
            return _resistor!!
        }
        _resistor = Builder(name = "Resistor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 11.0f)
                horizontalLineTo(7.0f)
                lineTo(10.07f, 15.35f)
                lineTo(13.11f, 4.0f)
                lineTo(18.0f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                lineTo(13.93f, 8.65f)
                lineTo(10.89f, 20.0f)
                lineTo(6.0f, 13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _resistor!!
    }

private var _resistor: ImageVector? = null
