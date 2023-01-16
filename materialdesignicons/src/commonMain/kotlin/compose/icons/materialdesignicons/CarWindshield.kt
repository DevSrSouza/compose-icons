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

public val MaterialDesignIcons.CarWindshield: ImageVector
    get() {
        if (_carWindshield != null) {
            return _carWindshield!!
        }
        _carWindshield = Builder(name = "CarWindshield", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.63f, 15.5f)
                lineTo(20.21f, 5.85f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.14f, 5.1f)
                curveTo(17.8f, 5.24f, 14.14f, 5.5f, 12.0f, 5.5f)
                reflectiveCurveTo(6.2f, 5.24f, 4.86f, 5.1f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.79f, 5.85f)
                lineTo(1.37f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.55f, 17.36f)
                arcTo(61.5f, 61.5f, 0.0f, false, false, 12.0f, 18.0f)
                arcTo(61.5f, 61.5f, 0.0f, false, false, 21.45f, 17.36f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.63f, 15.5f)
                close()
            }
        }
        .build()
        return _carWindshield!!
    }

private var _carWindshield: ImageVector? = null
