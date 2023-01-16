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

public val MaterialDesignIcons.LayersOffOutline: ImageVector
    get() {
        if (_layersOffOutline != null) {
            return _layersOffOutline!!
        }
        _layersOffOutline = Builder(name = "LayersOffOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.53f)
                lineTo(10.83f, 5.44f)
                lineTo(9.41f, 4.0f)
                lineTo(12.0f, 2.0f)
                lineTo(21.0f, 9.0f)
                lineTo(17.28f, 11.89f)
                lineTo(15.85f, 10.47f)
                lineTo(17.74f, 9.0f)
                lineTo(12.0f, 4.53f)
                moveTo(21.0f, 14.07f)
                lineTo(20.13f, 14.75f)
                lineTo(18.7f, 13.32f)
                lineTo(19.37f, 12.8f)
                lineTo(21.0f, 14.07f)
                moveTo(3.41f, 0.86f)
                lineTo(22.14f, 19.59f)
                lineTo(20.73f, 21.0f)
                lineTo(16.95f, 17.22f)
                lineTo(12.0f, 21.07f)
                lineTo(3.0f, 14.07f)
                lineTo(4.62f, 12.81f)
                lineTo(12.0f, 18.54f)
                lineTo(15.5f, 15.79f)
                lineTo(14.1f, 14.37f)
                lineTo(12.0f, 16.0f)
                lineTo(3.0f, 9.0f)
                lineTo(6.22f, 6.5f)
                lineTo(2.0f, 2.27f)
                lineTo(3.41f, 0.86f)
                moveTo(12.0f, 13.47f)
                lineTo(12.67f, 12.94f)
                lineTo(7.65f, 7.92f)
                lineTo(6.26f, 9.0f)
                lineTo(12.0f, 13.47f)
                close()
            }
        }
        .build()
        return _layersOffOutline!!
    }

private var _layersOffOutline: ImageVector? = null
