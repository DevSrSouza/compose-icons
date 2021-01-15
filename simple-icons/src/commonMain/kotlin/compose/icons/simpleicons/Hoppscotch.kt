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

public val SimpleIcons.Hoppscotch: ImageVector
    get() {
        if (_hoppscotch != null) {
            return _hoppscotch!!
        }
        _hoppscotch = Builder(name = "Hoppscotch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.119f, 5.505f)
                arcToRelative(4.786f, 4.786f, 0.0f, false, false, -4.016f, -4.254f)
                curveToRelative(-2.188f, -0.342f, -4.256f, 0.854f, -5.128f, 2.786f)
                curveToRelative(-4.494f, -0.278f, -7.784f, 0.257f, -7.966f, 1.47f)
                curveToRelative(-0.17f, 1.041f, 1.992f, 2.32f, 5.383f, 3.362f)
                lineToRelative(0.001f, 0.006f)
                curveTo(5.308f, 8.841f, 0.333f, 22.807f, 0.333f, 22.807f)
                horizontalLineToRelative(18.803f)
                reflectiveCurveToRelative(-1.145f, -11.966f, -1.316f, -11.966f)
                curveToRelative(3.539f, 0.051f, 6.0f, -0.496f, 6.172f, -1.539f)
                curveToRelative(0.178f, -1.188f, -2.662f, -2.682f, -6.873f, -3.797f)
                close()
                moveTo(16.744f, 6.858f)
                curveToRelative(-0.035f, 0.274f, -0.309f, 0.479f, -0.582f, 0.427f)
                reflectiveCurveToRelative(-0.479f, -0.308f, -0.428f, -0.581f)
                curveToRelative(0.053f, -0.273f, 0.309f, -0.479f, 0.582f, -0.427f)
                reflectiveCurveToRelative(0.479f, 0.307f, 0.428f, 0.581f)
                close()
                moveTo(11.582f, 5.695f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, true, 0.786f, -0.564f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, true, 0.564f, 0.787f)
                arcToRelative(0.715f, 0.715f, 0.0f, false, true, -0.786f, 0.564f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, true, -0.564f, -0.787f)
                close()
                moveTo(7.633f, 5.422f)
                curveToRelative(0.051f, -0.274f, 0.307f, -0.479f, 0.581f, -0.427f)
                reflectiveCurveToRelative(0.479f, 0.308f, 0.427f, 0.581f)
                curveToRelative(-0.034f, 0.273f, -0.308f, 0.461f, -0.581f, 0.427f)
                curveToRelative(-0.273f, -0.051f, -0.478f, -0.308f, -0.427f, -0.581f)
                close()
                moveTo(17.154f, 10.841f)
                curveToRelative(-0.119f, 0.684f, -2.701f, 0.871f, -5.778f, 0.376f)
                curveToRelative(-3.077f, -0.495f, -5.47f, -1.453f, -5.368f, -2.153f)
                curveToRelative(0.068f, -0.377f, 0.854f, -0.599f, 2.051f, -0.65f)
                curveToRelative(-0.358f, 0.067f, -0.58f, 0.204f, -0.614f, 0.376f)
                curveToRelative(-0.085f, 0.512f, 1.744f, 1.247f, 4.068f, 1.623f)
                curveToRelative(2.342f, 0.359f, 4.29f, 0.24f, 4.375f, -0.291f)
                curveToRelative(0.018f, -0.17f, -0.154f, -0.375f, -0.479f, -0.563f)
                curveToRelative(1.13f, 0.426f, 1.814f, 0.872f, 1.745f, 1.282f)
                close()
            }
        }
        .build()
        return _hoppscotch!!
    }

private var _hoppscotch: ImageVector? = null
