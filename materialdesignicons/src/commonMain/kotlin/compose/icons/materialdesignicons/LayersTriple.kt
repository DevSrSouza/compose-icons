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

public val MaterialDesignIcons.LayersTriple: ImageVector
    get() {
        if (_layersTriple != null) {
            return _layersTriple!!
        }
        _layersTriple = Builder(name = "LayersTriple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(3.0f, 7.0f)
                lineTo(4.63f, 8.27f)
                lineTo(12.0f, 14.0f)
                lineTo(19.36f, 8.27f)
                lineTo(21.0f, 7.0f)
                lineTo(12.0f, 0.0f)
                moveTo(19.37f, 10.73f)
                lineTo(12.0f, 16.47f)
                lineTo(4.62f, 10.74f)
                lineTo(3.0f, 12.0f)
                lineTo(12.0f, 19.0f)
                lineTo(21.0f, 12.0f)
                lineTo(19.37f, 10.73f)
                moveTo(19.37f, 15.73f)
                lineTo(12.0f, 21.47f)
                lineTo(4.62f, 15.74f)
                lineTo(3.0f, 17.0f)
                lineTo(12.0f, 24.0f)
                lineTo(21.0f, 17.0f)
                lineTo(19.37f, 15.73f)
                close()
            }
        }
        .build()
        return _layersTriple!!
    }

private var _layersTriple: ImageVector? = null
