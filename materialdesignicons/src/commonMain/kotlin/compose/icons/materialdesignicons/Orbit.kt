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

public val MaterialDesignIcons.Orbit: ImageVector
    get() {
        if (_orbit != null) {
            return _orbit!!
        }
        _orbit = Builder(name = "Orbit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.11f, 1.75f)
                curveTo(9.3f, 1.25f, 10.62f, 1.0f, 12.0f, 1.0f)
                curveTo(18.08f, 1.0f, 23.0f, 5.92f, 23.0f, 12.0f)
                curveTo(23.0f, 18.08f, 18.08f, 23.0f, 12.0f, 23.0f)
                curveTo(5.92f, 23.0f, 1.0f, 18.08f, 1.0f, 12.0f)
                curveTo(1.0f, 10.62f, 1.25f, 9.3f, 1.72f, 8.08f)
                curveTo(2.24f, 8.61f, 2.83f, 8.96f, 3.45f, 9.18f)
                curveTo(3.16f, 10.07f, 3.0f, 11.0f, 3.0f, 12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 21.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 21.0f, 12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 3.0f)
                curveTo(11.0f, 3.0f, 10.07f, 3.16f, 9.18f, 3.45f)
                curveTo(8.96f, 2.83f, 8.61f, 2.24f, 8.11f, 1.75f)
                moveTo(4.93f, 2.93f)
                curveTo(6.03f, 2.93f, 6.93f, 3.82f, 6.93f, 4.93f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.93f, 6.93f)
                curveTo(3.82f, 6.93f, 2.93f, 6.03f, 2.93f, 4.93f)
                curveTo(2.93f, 3.82f, 3.82f, 2.93f, 4.93f, 2.93f)
                moveTo(12.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _orbit!!
    }

private var _orbit: ImageVector? = null
