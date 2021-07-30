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

public val SimpleIcons.Semver: ImageVector
    get() {
        if (_semver != null) {
            return _semver!!
        }
        _semver = Builder(name = "Semver", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.357f, 9.024f)
                arcTo(12.07f, 12.07f, 0.0f, false, false, 2.97f, 19.867f)
                arcToRelative(12.051f, 12.051f, 0.0f, false, false, 10.38f, 4.063f)
                curveToRelative(7.768f, -0.703f, 13.086f, -9.799f, 9.517f, -16.8f)
                curveToRelative(-0.416f, -1.19f, -2.07f, -0.368f, -1.903f, 0.596f)
                curveToRelative(0.287f, 0.7f, 0.526f, 1.421f, 0.713f, 2.155f)
                arcToRelative(9.983f, 9.983f, 0.0f, false, true, -3.926f, 10.25f)
                arcToRelative(9.965f, 9.965f, 0.0f, false, true, -14.807f, -3.809f)
                arcTo(9.984f, 9.984f, 0.0f, false, true, 4.44f, 5.448f)
                arcToRelative(9.968f, 9.968f, 0.0f, false, true, 4.85f, -3.044f)
                arcToRelative(9.868f, 9.868f, 0.0f, false, true, 7.02f, 0.631f)
                arcToRelative(0.333f, 0.333f, 0.0f, false, true, 0.155f, 0.429f)
                lineToRelative(-3.962f, 10.62f)
                curveToRelative(-0.107f, 0.81f, -0.69f, 0.786f, -0.797f, 0.0f)
                lineToRelative(-2.38f, -7.37f)
                arcToRelative(1.572f, 1.572f, 0.0f, false, false, -0.773f, -0.988f)
                curveToRelative(-1.19f, -0.56f, -3.093f, 0.667f, -2.379f, 2.155f)
                lineToRelative(3.914f, 10.441f)
                curveToRelative(0.524f, 1.393f, 1.023f, 1.834f, 2.058f, 1.834f)
                reflectiveCurveToRelative(1.535f, -0.44f, 2.058f, -1.834f)
                lineTo(20.0f, 3.94f)
                arcToRelative(1.036f, 1.036f, 0.0f, false, false, -0.369f, -1.19f)
                curveTo(13.1f, -2.907f, 2.32f, 0.641f, 0.357f, 9.023f)
                close()
            }
        }
        .build()
        return _semver!!
    }

private var _semver: ImageVector? = null
