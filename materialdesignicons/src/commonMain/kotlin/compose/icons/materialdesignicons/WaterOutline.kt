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

public val MaterialDesignIcons.WaterOutline: ImageVector
    get() {
        if (_waterOutline != null) {
            return _waterOutline!!
        }
        _waterOutline = Builder(name = "WaterOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.77f)
                lineTo(11.25f, 4.61f)
                curveTo(11.25f, 4.61f, 9.97f, 6.06f, 8.68f, 7.94f)
                curveTo(7.39f, 9.82f, 6.0f, 12.07f, 6.0f, 14.23f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 20.23f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 18.0f, 14.23f)
                curveTo(18.0f, 12.07f, 16.61f, 9.82f, 15.32f, 7.94f)
                curveTo(14.03f, 6.06f, 12.75f, 4.61f, 12.75f, 4.61f)
                lineTo(12.0f, 3.77f)
                moveTo(12.0f, 6.9f)
                curveTo(12.44f, 7.42f, 12.84f, 7.85f, 13.68f, 9.07f)
                curveTo(14.89f, 10.83f, 16.0f, 13.07f, 16.0f, 14.23f)
                curveTo(16.0f, 16.45f, 14.22f, 18.23f, 12.0f, 18.23f)
                curveTo(9.78f, 18.23f, 8.0f, 16.45f, 8.0f, 14.23f)
                curveTo(8.0f, 13.07f, 9.11f, 10.83f, 10.32f, 9.07f)
                curveTo(11.16f, 7.85f, 11.56f, 7.42f, 12.0f, 6.9f)
                close()
            }
        }
        .build()
        return _waterOutline!!
    }

private var _waterOutline: ImageVector? = null
