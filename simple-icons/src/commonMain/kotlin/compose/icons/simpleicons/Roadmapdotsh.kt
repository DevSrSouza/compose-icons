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

public val SimpleIcons.Roadmapdotsh: ImageVector
    get() {
        if (_roadmapdotsh != null) {
            return _roadmapdotsh!!
        }
        _roadmapdotsh = Builder(name = "Roadmapdotsh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.693f, 0.0f)
                lineTo(3.307f, 0.0f)
                arcTo(3.307f, 3.307f, 0.0f, false, false, 0.0f, 3.307f)
                verticalLineToRelative(17.386f)
                arcTo(3.307f, 3.307f, 0.0f, false, false, 3.307f, 24.0f)
                horizontalLineToRelative(17.386f)
                arcTo(3.307f, 3.307f, 0.0f, false, false, 24.0f, 20.693f)
                lineTo(24.0f, 3.307f)
                arcTo(3.307f, 3.307f, 0.0f, false, false, 20.693f, 0.0f)
                close()
                moveTo(12.987f, 9.18f)
                curveToRelative(-0.349f, 0.031f, -0.689f, 0.078f, -1.021f, 0.142f)
                curveToRelative(-0.333f, 0.063f, -0.65f, 0.134f, -0.95f, 0.214f)
                arcToRelative(3.64f, 3.64f, 0.0f, false, false, -0.736f, 0.237f)
                verticalLineToRelative(8.097f)
                arcToRelative(5.522f, 5.522f, 0.0f, false, true, -0.76f, 0.143f)
                curveToRelative(-0.333f, 0.047f, -0.68f, 0.07f, -1.045f, 0.07f)
                arcToRelative(5.87f, 5.87f, 0.0f, false, true, -0.95f, -0.07f)
                arcToRelative(1.588f, 1.588f, 0.0f, false, true, -0.688f, -0.285f)
                arcToRelative(1.476f, 1.476f, 0.0f, false, true, -0.452f, -0.57f)
                curveToRelative(-0.095f, -0.253f, -0.142f, -0.578f, -0.142f, -0.974f)
                lineTo(6.243f, 9.061f)
                curveToRelative(0.0f, -0.364f, 0.063f, -0.673f, 0.19f, -0.926f)
                curveToRelative(0.142f, -0.27f, 0.34f, -0.507f, 0.594f, -0.713f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, 0.926f, -0.546f)
                arcToRelative(9.133f, 9.133f, 0.0f, false, true, 2.54f, -0.736f)
                arcToRelative(8.093f, 8.093f, 0.0f, false, true, 1.378f, -0.119f)
                curveToRelative(0.76f, 0.0f, 1.361f, 0.15f, 1.804f, 0.451f)
                curveToRelative(0.444f, 0.285f, 0.665f, 0.76f, 0.665f, 1.425f)
                curveToRelative(0.0f, 0.222f, -0.032f, 0.443f, -0.095f, 0.665f)
                arcToRelative(3.075f, 3.075f, 0.0f, false, true, -0.237f, 0.57f)
                curveToRelative(-0.341f, 0.0f, -0.682f, 0.016f, -1.021f, 0.047f)
                close()
                moveTo(18.1f, 17.633f)
                curveToRelative(-0.412f, 0.443f, -0.974f, 0.665f, -1.686f, 0.665f)
                reflectiveCurveToRelative(-1.274f, -0.222f, -1.686f, -0.665f)
                curveToRelative(-0.412f, -0.443f, -0.617f, -0.998f, -0.617f, -1.662f)
                curveToRelative(0.0f, -0.665f, 0.205f, -1.22f, 0.617f, -1.663f)
                curveToRelative(0.412f, -0.443f, 0.974f, -0.664f, 1.686f, -0.664f)
                reflectiveCurveToRelative(1.274f, 0.221f, 1.686f, 0.664f)
                curveToRelative(0.411f, 0.444f, 0.617f, 0.998f, 0.617f, 1.663f)
                curveToRelative(0.0f, 0.664f, -0.206f, 1.219f, -0.617f, 1.662f)
                close()
            }
        }
        .build()
        return _roadmapdotsh!!
    }

private var _roadmapdotsh: ImageVector? = null
