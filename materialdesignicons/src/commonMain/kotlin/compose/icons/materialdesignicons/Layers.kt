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

public val MaterialDesignIcons.Layers: ImageVector
    get() {
        if (_layers != null) {
            return _layers!!
        }
        _layers = Builder(name = "Layers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                lineTo(19.36f, 10.27f)
                lineTo(21.0f, 9.0f)
                lineTo(12.0f, 2.0f)
                lineTo(3.0f, 9.0f)
                lineTo(4.63f, 10.27f)
                moveTo(12.0f, 18.54f)
                lineTo(4.62f, 12.81f)
                lineTo(3.0f, 14.07f)
                lineTo(12.0f, 21.07f)
                lineTo(21.0f, 14.07f)
                lineTo(19.37f, 12.8f)
                lineTo(12.0f, 18.54f)
                close()
            }
        }
        .build()
        return _layers!!
    }

private var _layers: ImageVector? = null
