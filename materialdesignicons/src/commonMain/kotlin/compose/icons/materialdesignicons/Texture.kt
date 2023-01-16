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

public val MaterialDesignIcons.Texture: ImageVector
    get() {
        if (_texture != null) {
            return _texture!!
        }
        _texture = Builder(name = "Texture", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.29f, 21.0f)
                horizontalLineTo(12.12f)
                lineTo(21.0f, 12.12f)
                verticalLineTo(9.29f)
                moveTo(19.0f, 21.0f)
                curveTo(19.55f, 21.0f, 20.05f, 20.78f, 20.41f, 20.41f)
                curveTo(20.78f, 20.05f, 21.0f, 19.55f, 21.0f, 19.0f)
                verticalLineTo(17.0f)
                lineTo(17.0f, 21.0f)
                moveTo(5.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(7.0f)
                lineTo(7.0f, 3.0f)
                moveTo(11.88f, 3.0f)
                lineTo(3.0f, 11.88f)
                verticalLineTo(14.71f)
                lineTo(14.71f, 3.0f)
                moveTo(19.5f, 3.08f)
                lineTo(3.08f, 19.5f)
                curveTo(3.17f, 19.85f, 3.35f, 20.16f, 3.59f, 20.41f)
                curveTo(3.84f, 20.65f, 4.15f, 20.83f, 4.5f, 20.92f)
                lineTo(20.93f, 4.5f)
                curveTo(20.74f, 3.8f, 20.2f, 3.26f, 19.5f, 3.08f)
                close()
            }
        }
        .build()
        return _texture!!
    }

private var _texture: ImageVector? = null
