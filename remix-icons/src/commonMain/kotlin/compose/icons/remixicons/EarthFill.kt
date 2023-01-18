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

public val RemixIcons.EarthFill: ImageVector
    get() {
        if (_earthFill != null) {
            return _earthFill!!
        }
        _earthFill = Builder(name = "EarthFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(18.355f, 15.952f)
                verticalLineToRelative(-0.105f)
                curveToRelative(0.0f, -0.922f, 0.0f, -1.343f, -0.652f, -1.716f)
                arcToRelative(7.374f, 7.374f, 0.0f, false, false, -0.645f, -0.325f)
                curveToRelative(-0.367f, -0.167f, -0.61f, -0.276f, -0.938f, -0.756f)
                arcToRelative(12.014f, 12.014f, 0.0f, false, true, -0.116f, -0.172f)
                curveToRelative(-0.345f, -0.525f, -0.594f, -0.903f, -1.542f, -0.753f)
                curveToRelative(-1.865f, 0.296f, -2.003f, 0.624f, -2.085f, 1.178f)
                lineToRelative(-0.013f, 0.091f)
                curveToRelative(-0.121f, 0.81f, -0.143f, 1.082f, 0.195f, 1.437f)
                curveToRelative(1.265f, 1.327f, 2.023f, 2.284f, 2.253f, 2.844f)
                curveToRelative(0.112f, 0.273f, 0.4f, 1.1f, 0.202f, 1.918f)
                arcToRelative(8.185f, 8.185f, 0.0f, false, false, 3.151f, -2.237f)
                curveToRelative(0.11f, -0.374f, 0.19f, -0.84f, 0.19f, -1.404f)
                close()
                moveTo(12.0f, 3.833f)
                curveToRelative(-2.317f, 0.0f, -4.41f, 0.966f, -5.896f, 2.516f)
                curveToRelative(0.177f, 0.123f, 0.331f, 0.296f, 0.437f, 0.534f)
                curveToRelative(0.204f, 0.457f, 0.204f, 0.928f, 0.204f, 1.345f)
                curveToRelative(0.0f, 0.328f, 0.0f, 0.64f, 0.105f, 0.865f)
                curveToRelative(0.144f, 0.308f, 0.766f, 0.44f, 1.315f, 0.554f)
                curveToRelative(0.197f, 0.042f, 0.399f, 0.084f, 0.583f, 0.135f)
                curveToRelative(0.506f, 0.14f, 0.898f, 0.595f, 1.211f, 0.96f)
                curveToRelative(0.13f, 0.151f, 0.323f, 0.374f, 0.42f, 0.43f)
                curveToRelative(0.05f, -0.036f, 0.211f, -0.211f, 0.29f, -0.498f)
                curveToRelative(0.062f, -0.22f, 0.044f, -0.414f, -0.045f, -0.52f)
                curveToRelative(-0.56f, -0.66f, -0.529f, -1.93f, -0.356f, -2.399f)
                curveToRelative(0.272f, -0.739f, 1.122f, -0.684f, 1.744f, -0.644f)
                curveToRelative(0.232f, 0.015f, 0.45f, 0.03f, 0.614f, 0.009f)
                curveToRelative(0.622f, -0.078f, 0.814f, -1.025f, 0.949f, -1.21f)
                curveToRelative(0.292f, -0.4f, 1.186f, -1.003f, 1.74f, -1.375f)
                arcTo(8.138f, 8.138f, 0.0f, false, false, 12.0f, 3.833f)
                close()
            }
        }
        .build()
        return _earthFill!!
    }

private var _earthFill: ImageVector? = null
