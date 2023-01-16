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

public val MaterialDesignIcons.LayersOff: ImageVector
    get() {
        if (_layersOff != null) {
            return _layersOff!!
        }
        _layersOff = Builder(name = "LayersOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.27f, 1.0f)
                lineTo(2.0f, 2.27f)
                lineTo(6.22f, 6.5f)
                lineTo(3.0f, 9.0f)
                lineTo(4.63f, 10.27f)
                lineTo(12.0f, 16.0f)
                lineTo(14.1f, 14.37f)
                lineTo(15.53f, 15.8f)
                lineTo(12.0f, 18.54f)
                lineTo(4.63f, 12.81f)
                lineTo(3.0f, 14.07f)
                lineTo(12.0f, 21.07f)
                lineTo(16.95f, 17.22f)
                lineTo(20.73f, 21.0f)
                lineTo(22.0f, 19.73f)
                lineTo(3.27f, 1.0f)
                moveTo(19.36f, 10.27f)
                lineTo(21.0f, 9.0f)
                lineTo(12.0f, 2.0f)
                lineTo(9.09f, 4.27f)
                lineTo(16.96f, 12.15f)
                lineTo(19.36f, 10.27f)
                moveTo(19.81f, 15.0f)
                lineTo(21.0f, 14.07f)
                lineTo(19.57f, 12.64f)
                lineTo(18.38f, 13.56f)
                lineTo(19.81f, 15.0f)
                close()
            }
        }
        .build()
        return _layersOff!!
    }

private var _layersOff: ImageVector? = null
