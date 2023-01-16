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

public val MaterialDesignIcons.HazardLights: ImageVector
    get() {
        if (_hazardLights != null) {
            return _hazardLights!!
        }
        _hazardLights = Builder(name = "HazardLights", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                lineTo(14.33f, 16.0f)
                horizontalLineTo(9.68f)
                lineTo(12.0f, 12.0f)
                moveTo(12.0f, 8.0f)
                lineTo(6.21f, 18.0f)
                horizontalLineTo(17.8f)
                lineTo(12.0f, 8.0f)
                moveTo(12.0f, 2.0f)
                lineTo(1.0f, 21.0f)
                horizontalLineTo(23.0f)
                lineTo(12.0f, 2.0f)
                moveTo(12.0f, 6.0f)
                lineTo(19.53f, 19.0f)
                horizontalLineTo(4.47f)
                lineTo(12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _hazardLights!!
    }

private var _hazardLights: ImageVector? = null
