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

public val RemixIcons.EarthLine: ImageVector
    get() {
        if (_earthLine != null) {
            return _earthLine!!
        }
        _earthLine = Builder(name = "EarthLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.235f, 6.453f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.817f, 12.944f)
                curveToRelative(0.115f, -0.75f, -0.137f, -1.47f, -0.24f, -1.722f)
                curveToRelative(-0.23f, -0.56f, -0.988f, -1.517f, -2.253f, -2.844f)
                curveToRelative(-0.338f, -0.355f, -0.316f, -0.628f, -0.195f, -1.437f)
                lineToRelative(0.013f, -0.091f)
                curveToRelative(0.082f, -0.554f, 0.22f, -0.882f, 2.085f, -1.178f)
                curveToRelative(0.948f, -0.15f, 1.197f, 0.228f, 1.542f, 0.753f)
                lineToRelative(0.116f, 0.172f)
                curveToRelative(0.328f, 0.48f, 0.571f, 0.59f, 0.938f, 0.756f)
                curveToRelative(0.165f, 0.075f, 0.37f, 0.17f, 0.645f, 0.325f)
                curveToRelative(0.652f, 0.373f, 0.652f, 0.794f, 0.652f, 1.716f)
                verticalLineToRelative(0.105f)
                curveToRelative(0.0f, 0.391f, -0.038f, 0.735f, -0.098f, 1.034f)
                arcToRelative(8.002f, 8.002f, 0.0f, false, false, -3.105f, -12.341f)
                curveToRelative(-0.553f, 0.373f, -1.312f, 0.902f, -1.577f, 1.265f)
                curveToRelative(-0.135f, 0.185f, -0.327f, 1.132f, -0.95f, 1.21f)
                curveToRelative(-0.162f, 0.02f, -0.381f, 0.006f, -0.613f, -0.009f)
                curveToRelative(-0.622f, -0.04f, -1.472f, -0.095f, -1.744f, 0.644f)
                curveToRelative(-0.173f, 0.468f, -0.203f, 1.74f, 0.356f, 2.4f)
                curveToRelative(0.09f, 0.105f, 0.107f, 0.3f, 0.046f, 0.519f)
                curveToRelative(-0.08f, 0.287f, -0.241f, 0.462f, -0.292f, 0.498f)
                curveToRelative(-0.096f, -0.056f, -0.288f, -0.279f, -0.419f, -0.43f)
                curveToRelative(-0.313f, -0.365f, -0.705f, -0.82f, -1.211f, -0.96f)
                curveToRelative(-0.184f, -0.051f, -0.386f, -0.093f, -0.583f, -0.135f)
                curveToRelative(-0.549f, -0.115f, -1.17f, -0.246f, -1.315f, -0.554f)
                curveToRelative(-0.106f, -0.226f, -0.105f, -0.537f, -0.105f, -0.865f)
                curveToRelative(0.0f, -0.417f, 0.0f, -0.888f, -0.204f, -1.345f)
                arcToRelative(1.276f, 1.276f, 0.0f, false, false, -0.306f, -0.43f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _earthLine!!
    }

private var _earthLine: ImageVector? = null
