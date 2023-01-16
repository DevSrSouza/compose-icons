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

public val MaterialDesignIcons.Spa: ImageVector
    get() {
        if (_spa != null) {
            return _spa!!
        }
        _spa = Builder(name = "Spa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 9.63f)
                curveTo(15.31f, 6.84f, 14.18f, 4.12f, 12.06f, 2.0f)
                curveTo(9.92f, 4.14f, 8.74f, 6.86f, 8.5f, 9.63f)
                curveTo(9.79f, 10.31f, 10.97f, 11.19f, 12.0f, 12.26f)
                curveTo(13.03f, 11.2f, 14.21f, 10.32f, 15.5f, 9.63f)
                moveTo(12.0f, 15.45f)
                curveTo(9.85f, 12.17f, 6.18f, 10.0f, 2.0f, 10.0f)
                curveTo(2.0f, 20.0f, 11.32f, 21.89f, 12.0f, 22.0f)
                curveTo(12.68f, 21.88f, 22.0f, 20.0f, 22.0f, 10.0f)
                curveTo(17.82f, 10.0f, 14.15f, 12.17f, 12.0f, 15.45f)
                close()
            }
        }
        .build()
        return _spa!!
    }

private var _spa: ImageVector? = null
