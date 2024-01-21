package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandYarn: ImageVector
    get() {
        if (_brandYarn != null) {
            return _brandYarn!!
        }
        _brandYarn = Builder(name = "BrandYarn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.845f, 19.308f)
                curveToRelative(-1.268f, 0.814f, -2.41f, 1.254f, -3.845f, 1.692f)
                curveToRelative(-0.176f, 0.21f, -0.645f, 0.544f, -0.912f, 0.588f)
                arcToRelative(42.469f, 42.469f, 0.0f, false, true, -4.498f, 0.412f)
                curveToRelative(-0.812f, 0.006f, -1.31f, -0.214f, -1.447f, -0.554f)
                curveToRelative(-0.115f, -0.279f, 0.336f, -2.054f, 0.298f, -1.964f)
                curveToRelative(-0.157f, 0.392f, -0.575f, 1.287f, -0.997f, 1.72f)
                curveToRelative(-0.579f, 0.6f, -1.674f, 0.4f, -2.322f, 0.051f)
                curveToRelative(-0.71f, -0.386f, -0.07f, -1.28f, -0.346f, -1.267f)
                curveToRelative(-0.276f, 0.014f, -0.776f, -1.486f, -0.776f, -2.236f)
                curveToRelative(0.0f, -0.828f, 0.622f, -1.674f, 1.235f, -2.211f)
                arcToRelative(6.811f, 6.811f, 0.0f, false, true, 0.46f, -3.143f)
                arcToRelative(7.414f, 7.414f, 0.0f, false, true, 2.208f, -2.615f)
                reflectiveCurveToRelative(-1.353f, -1.534f, -0.849f, -2.912f)
                curveToRelative(0.328f, -0.902f, 0.46f, -0.895f, 0.567f, -0.935f)
                curveToRelative(0.38f, -0.12f, 0.727f, -0.33f, 1.013f, -0.612f)
                curveToRelative(0.78f, -0.88f, 1.96f, -1.438f, 3.116f, -1.322f)
                curveToRelative(0.0f, 0.0f, 0.781f, -2.43f, 1.533f, -1.936f)
                curveToRelative(0.415f, 0.653f, 0.671f, 1.218f, 0.967f, 1.936f)
                curveToRelative(0.0f, 0.0f, 1.15f, -0.7f, 1.25f, -0.5f)
                curveToRelative(0.514f, 1.398f, 0.487f, 3.204f, 0.211f, 4.67f)
                curveToRelative(-0.324f, 1.408f, -0.84f, 2.691f, -1.711f, 3.83f)
                curveToRelative(-0.094f, 0.16f, 0.98f, 0.705f, 1.722f, 2.812f)
                curveToRelative(0.686f, 1.928f, 0.278f, 2.438f, 0.278f, 2.688f)
                reflectiveCurveToRelative(0.716f, 0.144f, 2.296f, -0.855f)
                arcToRelative(5.848f, 5.848f, 0.0f, false, true, 2.984f, -1.145f)
                curveToRelative(0.735f, -0.066f, 0.988f, -0.035f, 1.22f, 1.0f)
                curveToRelative(0.232f, 1.035f, -0.346f, 1.406f, -0.744f, 1.506f)
                curveToRelative(0.0f, 0.0f, -2.09f, 0.675f, -2.911f, 1.302f)
                close()
            }
        }
        .build()
        return _brandYarn!!
    }

private var _brandYarn: ImageVector? = null
