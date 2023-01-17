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

public val SimpleIcons.Playwright: ImageVector
    get() {
        if (_playwright != null) {
            return _playwright!!
        }
        _playwright = Builder(name = "Playwright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.996f, 7.462f)
                curveToRelative(-0.056f, 0.837f, -0.257f, 2.135f, -0.716f, 3.85f)
                curveToRelative(-0.995f, 3.715f, -4.27f, 10.874f, -10.42f, 9.227f)
                curveToRelative(-6.15f, -1.65f, -5.407f, -9.487f, -4.412f, -13.201f)
                curveToRelative(0.46f, -1.716f, 0.934f, -2.94f, 1.305f, -3.694f)
                curveToRelative(0.42f, -0.853f, 0.846f, -0.289f, 1.815f, 0.523f)
                curveToRelative(0.684f, 0.573f, 2.41f, 1.791f, 5.011f, 2.488f)
                curveToRelative(2.601f, 0.697f, 4.706f, 0.506f, 5.583f, 0.352f)
                curveToRelative(1.245f, -0.219f, 1.897f, -0.494f, 1.834f, 0.455f)
                close()
                moveTo(14.189f, 11.325f)
                reflectiveCurveToRelative(-0.127f, -1.819f, -1.773f, -2.286f)
                curveToRelative(-1.644f, -0.467f, -2.613f, 1.04f, -2.613f, 1.04f)
                close()
                moveTo(18.247f, 15.864f)
                lineTo(10.478f, 13.692f)
                reflectiveCurveToRelative(0.446f, 2.306f, 3.338f, 3.153f)
                curveToRelative(2.862f, 0.836f, 4.43f, -0.98f, 4.43f, -0.981f)
                close()
                moveTo(20.948f, 13.354f)
                reflectiveCurveToRelative(-0.13f, -1.818f, -1.773f, -2.286f)
                curveToRelative(-1.644f, -0.469f, -2.612f, 1.038f, -2.612f, 1.038f)
                close()
                moveTo(8.57f, 18.23f)
                curveToRelative(-4.749f, 1.279f, -7.261f, -4.224f, -8.021f, -7.08f)
                curveTo(0.197f, 9.831f, 0.044f, 8.832f, 0.003f, 8.188f)
                curveToRelative(-0.047f, -0.73f, 0.455f, -0.52f, 1.415f, -0.354f)
                curveToRelative(0.677f, 0.118f, 2.3f, 0.261f, 4.308f, -0.28f)
                arcToRelative(11.28f, 11.28f, 0.0f, false, false, 2.41f, -0.956f)
                curveToRelative(-0.058f, 0.197f, -0.114f, 0.4f, -0.17f, 0.61f)
                curveToRelative(-0.433f, 1.618f, -0.827f, 4.055f, -0.632f, 6.426f)
                curveToRelative(-1.976f, 0.732f, -2.267f, 2.423f, -2.267f, 2.423f)
                lineToRelative(2.524f, -0.715f)
                curveToRelative(0.227f, 1.002f, 0.6f, 1.987f, 1.15f, 2.838f)
                arcToRelative(5.914f, 5.914f, 0.0f, false, true, -0.171f, 0.049f)
                close()
                moveTo(4.382f, 11.932f)
                curveToRelative(1.265f, -0.333f, 1.363f, -1.631f, 1.363f, -1.631f)
                lineToRelative(-3.374f, 0.888f)
                reflectiveCurveToRelative(0.745f, 1.076f, 2.01f, 0.743f)
                close()
            }
        }
        .build()
        return _playwright!!
    }

private var _playwright: ImageVector? = null
