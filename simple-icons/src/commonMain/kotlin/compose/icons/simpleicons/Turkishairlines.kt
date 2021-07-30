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

public val SimpleIcons.Turkishairlines: ImageVector
    get() {
        if (_turkishairlines != null) {
            return _turkishairlines!!
        }
        _turkishairlines = Builder(name = "Turkishairlines", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.168f, 13.988f)
                curveToRelative(0.272f, 1.623f, 0.86f, 3.115f, 1.69f, 4.423f)
                curveToRelative(3.095f, -0.863f, 5.817f, -2.495f, 6.785f, -6.132f)
                curveToRelative(1.065f, -4.003f, -0.15f, -8.199f, -3.057f, -10.422f)
                curveTo(1.626f, 4.364f, -0.657f, 9.077f, 0.168f, 13.988f)
                moveToRelative(23.664f, -3.975f)
                curveToRelative(1.098f, 6.534f, -3.308f, 12.722f, -9.844f, 13.819f)
                curveToRelative(-1.1f, 0.185f, -2.19f, 0.214f, -3.245f, 0.103f)
                arcToRelative(12.023f, 12.023f, 0.0f, false, true, -8.46f, -4.892f)
                lineToRelative(19.428f, -5.57f)
                curveToRelative(0.279f, -0.08f, 0.207f, -0.349f, -0.024f, -0.333f)
                lineToRelative(-8.145f, 0.569f)
                curveToRelative(1.148f, -1.108f, 2.021f, -2.467f, 1.915f, -4.345f)
                curveToRelative(-0.214f, -3.043f, -3.311f, -6.013f, -9.071f, -7.967f)
                arcToRelative(12.016f, 12.016f, 0.0f, false, true, 6.87f, -1.333f)
                curveToRelative(5.228f, 0.548f, 9.663f, 4.512f, 10.576f, 9.95f)
            }
        }
        .build()
        return _turkishairlines!!
    }

private var _turkishairlines: ImageVector? = null
