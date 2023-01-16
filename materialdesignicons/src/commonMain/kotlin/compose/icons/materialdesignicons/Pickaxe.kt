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

public val MaterialDesignIcons.Pickaxe: ImageVector
    get() {
        if (_pickaxe != null) {
            return _pickaxe!!
        }
        _pickaxe = Builder(name = "Pickaxe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.79f, 10.62f)
                lineTo(3.5f, 21.9f)
                lineTo(2.1f, 20.5f)
                lineTo(13.38f, 9.21f)
                lineTo(14.79f, 10.62f)
                moveTo(19.27f, 7.73f)
                lineTo(19.86f, 7.14f)
                lineTo(19.07f, 6.35f)
                lineTo(19.71f, 5.71f)
                lineTo(18.29f, 4.29f)
                lineTo(17.65f, 4.93f)
                lineTo(16.86f, 4.14f)
                lineTo(16.27f, 4.73f)
                curveTo(14.53f, 3.31f, 12.57f, 2.17f, 10.47f, 1.37f)
                lineTo(9.64f, 3.16f)
                curveTo(11.39f, 4.08f, 13.0f, 5.19f, 14.5f, 6.5f)
                lineTo(14.0f, 7.0f)
                lineTo(17.0f, 10.0f)
                lineTo(17.5f, 9.5f)
                curveTo(18.81f, 11.0f, 19.92f, 12.61f, 20.84f, 14.36f)
                lineTo(22.63f, 13.53f)
                curveTo(21.83f, 11.43f, 20.69f, 9.47f, 19.27f, 7.73f)
                close()
            }
        }
        .build()
        return _pickaxe!!
    }

private var _pickaxe: ImageVector? = null
