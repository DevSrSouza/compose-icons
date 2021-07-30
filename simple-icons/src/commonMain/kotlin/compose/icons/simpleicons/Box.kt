package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = Builder(name = "Box", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.959f, 5.523f)
                curveToRelative(-0.54f, 0.0f, -0.959f, 0.42f, -0.959f, 0.899f)
                verticalLineToRelative(7.549f)
                arcToRelative(4.59f, 4.59f, 0.0f, false, false, 4.613f, 4.494f)
                arcToRelative(4.717f, 4.717f, 0.0f, false, false, 4.135f, -2.457f)
                curveToRelative(0.779f, 1.438f, 2.337f, 2.457f, 4.074f, 2.457f)
                curveToRelative(2.577f, 0.0f, 4.674f, -2.037f, 4.674f, -4.613f)
                curveToRelative(0.06f, -2.457f, -2.037f, -4.495f, -4.613f, -4.495f)
                curveToRelative(-1.738f, 0.0f, -3.295f, 0.959f, -4.074f, 2.397f)
                curveToRelative(-0.78f, -1.438f, -2.338f, -2.397f, -4.135f, -2.397f)
                curveToRelative(-1.079f, 0.0f, -2.038f, 0.36f, -2.817f, 0.899f)
                lineTo(1.857f, 6.422f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, false, -0.898f, -0.899f)
                close()
                moveTo(17.602f, 9.26f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, false, -0.704f, 0.158f)
                curveToRelative(-0.36f, 0.3f, -0.479f, 0.899f, -0.18f, 1.318f)
                lineToRelative(2.397f, 3.116f)
                lineToRelative(-2.396f, 3.115f)
                curveToRelative(-0.3f, 0.42f, -0.24f, 0.96f, 0.18f, 1.26f)
                curveToRelative(0.419f, 0.3f, 1.016f, 0.298f, 1.316f, -0.122f)
                lineToRelative(2.039f, -2.636f)
                lineToRelative(2.096f, 2.697f)
                curveToRelative(0.3f, 0.36f, 0.899f, 0.419f, 1.318f, 0.12f)
                curveToRelative(0.36f, -0.3f, 0.42f, -0.84f, 0.121f, -1.259f)
                lineToRelative(-2.338f, -3.115f)
                lineToRelative(2.338f, -3.057f)
                curveToRelative(0.3f, -0.419f, 0.298f, -1.018f, -0.121f, -1.318f)
                curveToRelative(-0.48f, -0.3f, -1.019f, -0.24f, -1.318f, 0.18f)
                lineToRelative(-2.096f, 2.576f)
                lineToRelative(-2.04f, -2.695f)
                curveToRelative(-0.149f, -0.18f, -0.373f, -0.3f, -0.612f, -0.338f)
                close()
                moveTo(4.613f, 11.154f)
                curveToRelative(1.558f, 0.0f, 2.817f, 1.26f, 2.817f, 2.758f)
                curveToRelative(0.0f, 1.558f, -1.259f, 2.756f, -2.817f, 2.756f)
                curveToRelative(-1.558f, 0.0f, -2.816f, -1.198f, -2.816f, -2.756f)
                curveToRelative(0.0f, -1.498f, 1.258f, -2.758f, 2.816f, -2.758f)
                close()
                moveTo(12.883f, 11.154f)
                curveToRelative(1.558f, 0.0f, 2.816f, 1.26f, 2.816f, 2.758f)
                curveToRelative(-0.06f, 1.558f, -1.318f, 2.756f, -2.816f, 2.756f)
                curveToRelative(-1.558f, 0.0f, -2.817f, -1.198f, -2.817f, -2.756f)
                curveToRelative(0.0f, -1.498f, 1.259f, -2.758f, 2.817f, -2.758f)
                close()
            }
        }
        .build()
        return _box!!
    }

private var _box: ImageVector? = null
