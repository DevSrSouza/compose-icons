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

public val MaterialDesignIcons.SeedOutline: ImageVector
    get() {
        if (_seedOutline != null) {
            return _seedOutline!!
        }
        _seedOutline = Builder(name = "SeedOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2f, 5.0f)
                verticalLineTo(5.0f)
                curveTo(17.8f, 5.0f, 18.4f, 5.0f, 18.9f, 5.1f)
                curveTo(19.1f, 7.4f, 19.1f, 12.0f, 16.4f, 15.2f)
                curveTo(14.4f, 17.7f, 11.0f, 19.0f, 6.4f, 19.0f)
                curveTo(6.0f, 19.0f, 5.5f, 19.0f, 5.1f, 19.0f)
                curveTo(4.9f, 14.4f, 5.8f, 10.8f, 7.9f, 8.5f)
                curveTo(10.4f, 5.6f, 14.4f, 5.0f, 17.2f, 5.0f)
                moveTo(17.2f, 3.0f)
                curveTo(11.7f, 3.0f, 1.6f, 5.1f, 3.2f, 20.8f)
                curveTo(4.3f, 20.9f, 5.4f, 21.0f, 6.4f, 21.0f)
                curveTo(24.3f, 21.0f, 20.7f, 3.3f, 20.7f, 3.3f)
                curveTo(20.7f, 3.3f, 19.3f, 3.0f, 17.2f, 3.0f)
                moveTo(17.0f, 7.0f)
                curveTo(7.0f, 7.0f, 7.0f, 17.0f, 7.0f, 17.0f)
                curveTo(11.0f, 9.0f, 17.0f, 7.0f, 17.0f, 7.0f)
                close()
            }
        }
        .build()
        return _seedOutline!!
    }

private var _seedOutline: ImageVector? = null
