package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.FirefoxFill: ImageVector
    get() {
        if (_firefoxFill != null) {
            return _firefoxFill!!
        }
        _firefoxFill = Builder(name = "FirefoxFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                curveToRelative(0.0f, -1.464f, 0.314f, -2.854f, 0.88f, -4.106f)
                curveToRelative(0.466f, -0.939f, 1.233f, -1.874f, 1.85f, -2.194f)
                curveToRelative(-0.653f, 1.283f, -0.973f, 2.54f, -1.04f, 3.383f)
                curveToRelative(0.454f, -1.5f, 1.315f, -2.757f, 2.52f, -3.644f)
                curveToRelative(2.066f, -1.519f, 4.848f, -1.587f, 5.956f, -0.62f)
                curveToRelative(-2.056f, 0.707f, -4.296f, 3.548f, -3.803f, 6.876f)
                curveToRelative(0.08f, 0.55f, 0.245f, 1.084f, 0.489f, 1.582f)
                curveToRelative(-0.384f, -1.01f, -0.418f, -2.433f, 0.202f, -3.358f)
                curveToRelative(0.692f, -1.03f, 1.678f, -1.248f, 2.206f, -1.136f)
                curveToRelative(-0.208f, -0.044f, -0.668f, 0.836f, -0.736f, 0.991f)
                curveToRelative(-0.173f, 0.394f, -0.259f, 0.82f, -0.251f, 1.25f)
                arcToRelative(3.395f, 3.395f, 0.0f, false, false, 1.03f, 2.38f)
                curveToRelative(1.922f, 1.871f, 5.023f, 1.135f, 6.412f, -1.002f)
                curveToRelative(0.953f, -1.471f, 1.069f, -3.968f, -0.155f, -5.952f)
                arcToRelative(6.915f, 6.915f, 0.0f, false, false, -1.084f, -1.32f)
                curveToRelative(-1.85f, -1.766f, -4.48f, -2.57f, -6.982f, -2.205f)
                curveToRelative(-1.106f, 0.177f, -2.047f, 0.496f, -2.824f, 0.956f)
                curveTo(7.755f, 2.798f, 9.91f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _firefoxFill!!
    }

private var _firefoxFill: ImageVector? = null
