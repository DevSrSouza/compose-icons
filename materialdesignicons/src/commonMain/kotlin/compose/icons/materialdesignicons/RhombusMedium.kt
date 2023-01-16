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

public val MaterialDesignIcons.RhombusMedium: ImageVector
    get() {
        if (_rhombusMedium != null) {
            return _rhombusMedium!!
        }
        _rhombusMedium = Builder(name = "RhombusMedium", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.46f)
                curveTo(11.72f, 6.46f, 11.44f, 6.56f, 11.22f, 6.78f)
                lineTo(6.78f, 11.22f)
                curveTo(6.35f, 11.65f, 6.35f, 12.35f, 6.78f, 12.78f)
                lineTo(11.22f, 17.22f)
                curveTo(11.65f, 17.65f, 12.35f, 17.65f, 12.78f, 17.22f)
                lineTo(17.22f, 12.78f)
                curveTo(17.65f, 12.35f, 17.65f, 11.65f, 17.22f, 11.22f)
                lineTo(12.78f, 6.78f)
                curveTo(12.56f, 6.56f, 12.28f, 6.46f, 12.0f, 6.46f)
                close()
            }
        }
        .build()
        return _rhombusMedium!!
    }

private var _rhombusMedium: ImageVector? = null
