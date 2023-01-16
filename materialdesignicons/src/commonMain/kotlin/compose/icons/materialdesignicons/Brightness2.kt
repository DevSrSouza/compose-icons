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

public val MaterialDesignIcons.Brightness2: ImageVector
    get() {
        if (_brightness2 != null) {
            return _brightness2!!
        }
        _brightness2 = Builder(name = "Brightness2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                curveTo(8.18f, 2.0f, 6.47f, 2.5f, 5.0f, 3.35f)
                curveTo(8.0f, 5.08f, 10.0f, 8.3f, 10.0f, 12.0f)
                curveTo(10.0f, 15.7f, 8.0f, 18.92f, 5.0f, 20.65f)
                curveTo(6.47f, 21.5f, 8.18f, 22.0f, 10.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 20.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 10.0f, 2.0f)
                close()
            }
        }
        .build()
        return _brightness2!!
    }

private var _brightness2: ImageVector? = null
