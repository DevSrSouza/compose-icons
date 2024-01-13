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

public val SimpleIcons.R: ImageVector
    get() {
        if (_r != null) {
            return _r!!
        }
        _r = Builder(name = "R", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.746f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 3.599f, -12.0f, 8.037f)
                curveToRelative(0.0f, 3.897f, 4.144f, 7.144f, 9.64f, 7.88f)
                lineTo(9.64f, 16.26f)
                curveToRelative(-2.924f, -0.915f, -4.925f, -2.755f, -4.925f, -4.877f)
                curveToRelative(0.0f, -3.035f, 4.084f, -5.494f, 9.12f, -5.494f)
                curveToRelative(5.038f, 0.0f, 8.757f, 1.683f, 8.757f, 5.494f)
                curveToRelative(0.0f, 1.976f, -0.999f, 3.379f, -2.662f, 4.272f)
                curveToRelative(0.09f, 0.066f, 0.174f, 0.128f, 0.258f, 0.216f)
                curveToRelative(0.169f, 0.149f, 0.25f, 0.363f, 0.372f, 0.544f)
                curveToRelative(2.128f, -1.45f, 3.44f, -3.437f, 3.44f, -5.631f)
                curveToRelative(0.0f, -4.44f, -5.373f, -8.038f, -12.0f, -8.038f)
                close()
                moveTo(9.889f, 7.736f)
                verticalLineToRelative(13.516f)
                lineToRelative(4.093f, -0.002f)
                lineToRelative(-0.002f, -5.291f)
                horizontalLineToRelative(1.1f)
                curveToRelative(0.225f, 0.0f, 0.321f, 0.066f, 0.549f, 0.25f)
                curveToRelative(0.272f, 0.22f, 0.715f, 0.982f, 0.715f, 0.982f)
                lineToRelative(2.164f, 4.063f)
                lineToRelative(4.627f, -0.002f)
                lineToRelative(-2.864f, -4.826f)
                reflectiveCurveToRelative(-0.086f, -0.193f, -0.265f, -0.383f)
                arcToRelative(2.22f, 2.22f, 0.0f, false, false, -0.582f, -0.416f)
                curveToRelative(-0.422f, -0.214f, -1.149f, -0.434f, -1.149f, -0.434f)
                reflectiveCurveToRelative(3.578f, -0.264f, 3.578f, -3.826f)
                curveToRelative(0.0f, -3.562f, -3.744f, -3.63f, -3.744f, -3.63f)
                close()
                moveTo(14.016f, 10.666f)
                lineToRelative(2.478f, 0.002f)
                reflectiveCurveToRelative(1.149f, -0.062f, 1.149f, 1.127f)
                curveToRelative(0.0f, 1.165f, -1.149f, 1.17f, -1.149f, 1.17f)
                horizontalLineToRelative(-2.478f)
                close()
                moveTo(15.77f, 16.785f)
                curveToRelative(-0.494f, 0.049f, -1.012f, 0.079f, -1.54f, 0.088f)
                verticalLineToRelative(1.807f)
                arcToRelative(16.622f, 16.622f, 0.0f, false, false, 2.37f, -0.473f)
                lineToRelative(-0.471f, -0.891f)
                reflectiveCurveToRelative(-0.108f, -0.183f, -0.248f, -0.394f)
                curveToRelative(-0.039f, -0.054f, -0.08f, -0.098f, -0.111f, -0.137f)
                close()
            }
        }
        .build()
        return _r!!
    }

private var _r: ImageVector? = null
