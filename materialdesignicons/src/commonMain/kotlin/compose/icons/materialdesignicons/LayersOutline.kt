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

public val MaterialDesignIcons.LayersOutline: ImageVector
    get() {
        if (_layersOutline != null) {
            return _layersOutline!!
        }
        _layersOutline = Builder(name = "LayersOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.54f)
                lineTo(19.37f, 12.8f)
                lineTo(21.0f, 14.07f)
                lineTo(12.0f, 21.07f)
                lineTo(3.0f, 14.07f)
                lineTo(4.62f, 12.81f)
                lineTo(12.0f, 18.54f)
                moveTo(12.0f, 16.0f)
                lineTo(3.0f, 9.0f)
                lineTo(12.0f, 2.0f)
                lineTo(21.0f, 9.0f)
                lineTo(12.0f, 16.0f)
                moveTo(12.0f, 4.53f)
                lineTo(6.26f, 9.0f)
                lineTo(12.0f, 13.47f)
                lineTo(17.74f, 9.0f)
                lineTo(12.0f, 4.53f)
                close()
            }
        }
        .build()
        return _layersOutline!!
    }

private var _layersOutline: ImageVector? = null
