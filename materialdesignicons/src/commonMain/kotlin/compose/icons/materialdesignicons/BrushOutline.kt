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

public val MaterialDesignIcons.BrushOutline: ImageVector
    get() {
        if (_brushOutline != null) {
            return _brushOutline!!
        }
        _brushOutline = Builder(name = "BrushOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 16.0f)
                curveTo(7.55f, 16.0f, 8.0f, 16.45f, 8.0f, 17.0f)
                curveTo(8.0f, 18.1f, 7.1f, 19.0f, 6.0f, 19.0f)
                curveTo(5.83f, 19.0f, 5.67f, 19.0f, 5.5f, 18.95f)
                curveTo(5.81f, 18.4f, 6.0f, 17.74f, 6.0f, 17.0f)
                curveTo(6.0f, 16.45f, 6.45f, 16.0f, 7.0f, 16.0f)
                moveTo(18.67f, 3.0f)
                curveTo(18.41f, 3.0f, 18.16f, 3.1f, 17.96f, 3.29f)
                lineTo(9.0f, 12.25f)
                lineTo(11.75f, 15.0f)
                lineTo(20.71f, 6.04f)
                curveTo(21.1f, 5.65f, 21.1f, 5.0f, 20.71f, 4.63f)
                lineTo(19.37f, 3.29f)
                curveTo(19.17f, 3.09f, 18.92f, 3.0f, 18.67f, 3.0f)
                moveTo(7.0f, 14.0f)
                curveTo(5.34f, 14.0f, 4.0f, 15.34f, 4.0f, 17.0f)
                curveTo(4.0f, 18.31f, 2.84f, 19.0f, 2.0f, 19.0f)
                curveTo(2.92f, 20.22f, 4.5f, 21.0f, 6.0f, 21.0f)
                curveTo(8.21f, 21.0f, 10.0f, 19.21f, 10.0f, 17.0f)
                curveTo(10.0f, 15.34f, 8.66f, 14.0f, 7.0f, 14.0f)
                close()
            }
        }
        .build()
        return _brushOutline!!
    }

private var _brushOutline: ImageVector? = null
