package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Mathworks: ImageVector
    get() {
        if (_mathworks != null) {
            return _mathworks!!
        }
        _mathworks = Builder(name = "Mathworks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.323f, 16.25f)
                curveTo(3.13f, 15.354f, 1.64f, 14.31f, 0.0f, 13.12f)
                lineToRelative(5.814f, -2.237f)
                lineToRelative(2.386f, 1.79f)
                curveToRelative(-1.79f, 2.086f, -2.982f, 2.831f, -3.877f, 3.577f)
                close()
                moveTo(20.275f, 9.989f)
                curveToRelative(-0.447f, -1.193f, -0.745f, -2.385f, -1.193f, -3.578f)
                curveToRelative(-0.447f, -1.343f, -0.894f, -2.535f, -1.64f, -3.579f)
                curveToRelative(-0.299f, -0.447f, -0.895f, -1.49f, -1.64f, -1.49f)
                curveToRelative(-0.15f, 0.0f, -0.299f, 0.148f, -0.448f, 0.148f)
                curveToRelative(-0.447f, 0.15f, -1.043f, 1.043f, -1.193f, 1.64f)
                curveToRelative(-0.447f, 0.745f, -1.342f, 1.938f, -1.938f, 2.683f)
                curveToRelative(-0.149f, 0.299f, -0.447f, 0.597f, -0.596f, 0.746f)
                curveToRelative(-0.447f, 0.298f, -0.894f, 0.745f, -1.491f, 1.043f)
                curveToRelative(-0.15f, 0.0f, -0.298f, 0.149f, -0.447f, 0.149f)
                curveToRelative(-0.447f, 0.0f, -0.745f, 0.298f, -1.043f, 0.447f)
                curveToRelative(-0.447f, 0.447f, -0.894f, 1.043f, -1.342f, 1.49f)
                curveToRelative(0.0f, 0.15f, -0.15f, 0.299f, -0.298f, 0.448f)
                lineToRelative(2.236f, 1.64f)
                curveToRelative(1.64f, -1.938f, 3.578f, -3.876f, 4.92f, -7.603f)
                curveToRelative(0.0f, 0.0f, -0.448f, 4.026f, -4.026f, 8.349f)
                curveToRelative(-2.236f, 2.534f, -4.025f, 3.876f, -4.324f, 4.174f)
                curveToRelative(0.0f, 0.0f, 0.597f, -0.149f, 1.194f, 0.15f)
                curveToRelative(1.193f, 0.446f, 1.789f, 2.087f, 2.236f, 3.279f)
                curveToRelative(0.298f, 0.894f, 0.745f, 1.64f, 1.043f, 2.534f)
                curveToRelative(1.193f, -0.298f, 1.938f, -0.745f, 2.683f, -1.491f)
                curveToRelative(0.745f, -0.746f, 1.491f, -1.64f, 2.236f, -2.385f)
                curveToRelative(1.342f, -1.64f, 2.982f, -3.728f, 5.069f, -2.684f)
                curveToRelative(0.298f, 0.15f, 0.745f, 0.447f, 0.894f, 0.596f)
                curveToRelative(0.447f, 0.298f, 0.745f, 0.596f, 1.193f, 1.043f)
                curveToRelative(0.745f, 0.597f, 1.043f, 1.044f, 1.64f, 1.343f)
                curveToRelative(-1.491f, -2.982f, -2.534f, -5.964f, -3.727f, -9.094f)
                close()
            }
        }
        .build()
        return _mathworks!!
    }

private var _mathworks: ImageVector? = null
