package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Mathworks: VectorAsset
    get() {
        if (_mathworks != null) {
            return _mathworks!!
        }
        _mathworks = VectorAssetBuilder(name = "Mathworks", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.323f, 16.248f)
                curveTo(3.13f, 15.354f, 1.64f, 14.31f, 0.0f, 13.118f)
                lineToRelative(5.814f, -2.236f)
                lineToRelative(2.385f, 1.789f)
                curveToRelative(-1.789f, 2.087f, -2.981f, 2.832f, -3.876f, 3.578f)
                close()
                moveTo(20.273f, 9.988f)
                curveToRelative(-0.447f, -1.193f, -0.745f, -2.385f, -1.193f, -3.578f)
                curveToRelative(-0.447f, -1.342f, -0.894f, -2.534f, -1.64f, -3.578f)
                curveToRelative(-0.298f, -0.447f, -0.894f, -1.491f, -1.64f, -1.491f)
                curveToRelative(-0.149f, 0.0f, -0.298f, 0.149f, -0.447f, 0.149f)
                curveToRelative(-0.447f, 0.149f, -1.043f, 1.043f, -1.193f, 1.64f)
                curveToRelative(-0.447f, 0.745f, -1.342f, 1.938f, -1.938f, 2.683f)
                curveToRelative(-0.149f, 0.298f, -0.447f, 0.596f, -0.596f, 0.745f)
                curveToRelative(-0.447f, 0.298f, -0.894f, 0.745f, -1.491f, 1.043f)
                curveToRelative(-0.149f, 0.0f, -0.298f, 0.149f, -0.447f, 0.149f)
                curveToRelative(-0.447f, 0.0f, -0.745f, 0.298f, -1.043f, 0.447f)
                curveToRelative(-0.447f, 0.447f, -0.894f, 1.043f, -1.342f, 1.491f)
                curveToRelative(0.0f, 0.149f, -0.149f, 0.298f, -0.298f, 0.447f)
                lineToRelative(2.236f, 1.64f)
                curveToRelative(1.64f, -1.938f, 3.578f, -3.876f, 4.919f, -7.602f)
                curveToRelative(0.0f, 0.0f, -0.447f, 4.025f, -4.025f, 8.348f)
                curveToRelative(-2.236f, 2.534f, -4.025f, 3.876f, -4.323f, 4.174f)
                curveToRelative(0.0f, 0.0f, 0.596f, -0.149f, 1.193f, 0.149f)
                curveToRelative(1.193f, 0.447f, 1.789f, 2.087f, 2.236f, 3.279f)
                curveToRelative(0.298f, 0.894f, 0.745f, 1.64f, 1.043f, 2.534f)
                curveToRelative(1.193f, -0.298f, 1.938f, -0.745f, 2.683f, -1.491f)
                reflectiveCurveToRelative(1.491f, -1.64f, 2.236f, -2.385f)
                curveToRelative(1.342f, -1.64f, 2.981f, -3.727f, 5.068f, -2.683f)
                curveToRelative(0.298f, 0.149f, 0.745f, 0.447f, 0.894f, 0.596f)
                curveToRelative(0.447f, 0.298f, 0.745f, 0.596f, 1.193f, 1.043f)
                curveToRelative(0.745f, 0.596f, 1.043f, 1.043f, 1.64f, 1.342f)
                curveToRelative(-1.491f, -2.981f, -2.534f, -5.963f, -3.727f, -9.093f)
                close()
            }
        }
        .build()
        return _mathworks!!
    }

private var _mathworks: VectorAsset? = null
