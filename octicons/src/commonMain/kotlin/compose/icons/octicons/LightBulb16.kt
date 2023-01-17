package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.LightBulb16: ImageVector
    get() {
        if (_lightBulb16 != null) {
            return _lightBulb16!!
        }
        _lightBulb16 = Builder(name = "LightBulb16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 1.5f)
                curveToRelative(-2.363f, 0.0f, -4.0f, 1.69f, -4.0f, 3.75f)
                curveToRelative(0.0f, 0.984f, 0.424f, 1.625f, 0.984f, 2.304f)
                lineToRelative(0.214f, 0.253f)
                curveToRelative(0.223f, 0.264f, 0.47f, 0.556f, 0.673f, 0.848f)
                curveToRelative(0.284f, 0.411f, 0.537f, 0.896f, 0.621f, 1.49f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.484f, 0.211f)
                curveToRelative(-0.04f, -0.282f, -0.163f, -0.547f, -0.37f, -0.847f)
                arcToRelative(8.456f, 8.456f, 0.0f, false, false, -0.542f, -0.68f)
                curveToRelative(-0.084f, -0.1f, -0.173f, -0.205f, -0.268f, -0.32f)
                curveTo(3.201f, 7.75f, 2.5f, 6.766f, 2.5f, 5.25f)
                curveTo(2.5f, 2.31f, 4.863f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(5.5f, 2.31f, 5.5f, 5.25f)
                curveToRelative(0.0f, 1.516f, -0.701f, 2.5f, -1.328f, 3.259f)
                curveToRelative(-0.095f, 0.115f, -0.184f, 0.22f, -0.268f, 0.319f)
                curveToRelative(-0.207f, 0.245f, -0.383f, 0.453f, -0.541f, 0.681f)
                curveToRelative(-0.208f, 0.3f, -0.33f, 0.565f, -0.37f, 0.847f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.485f, -0.212f)
                curveToRelative(0.084f, -0.593f, 0.337f, -1.078f, 0.621f, -1.489f)
                curveToRelative(0.203f, -0.292f, 0.45f, -0.584f, 0.673f, -0.848f)
                curveToRelative(0.075f, -0.088f, 0.147f, -0.173f, 0.213f, -0.253f)
                curveToRelative(0.561f, -0.679f, 0.985f, -1.32f, 0.985f, -2.304f)
                curveToRelative(0.0f, -2.06f, -1.637f, -3.75f, -4.0f, -3.75f)
                close()
                moveTo(5.75f, 12.0f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(6.0f, 15.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        .build()
        return _lightBulb16!!
    }

private var _lightBulb16: ImageVector? = null
