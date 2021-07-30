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

public val SimpleIcons.Steamdb: ImageVector
    get() {
        if (_steamdb != null) {
            return _steamdb!!
        }
        _steamdb = Builder(name = "Steamdb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.981f, 0.0f)
                curveTo(5.72f, 0.0f, 0.581f, 2.231f, 0.02f, 5.081f)
                lineToRelative(6.675f, 1.257f)
                curveToRelative(0.544f, -0.17f, 1.162f, -0.244f, 1.8f, -0.244f)
                lineToRelative(3.131f, -1.875f)
                curveToRelative(-0.037f, -0.469f, 0.244f, -0.956f, 0.881f, -1.35f)
                curveToRelative(0.9f, -0.581f, 2.307f, -0.9f, 3.732f, -0.9f)
                arcToRelative(8.582f, 8.582f, 0.0f, false, true, 2.812f, 0.412f)
                curveToRelative(2.1f, 0.713f, 2.569f, 2.082f, 1.069f, 3.057f)
                curveToRelative(-0.956f, 0.618f, -2.494f, 0.937f, -4.013f, 0.9f)
                lineToRelative(-4.125f, 1.48f)
                curveToRelative(-0.037f, 0.3f, -0.243f, 0.582f, -0.637f, 0.845f)
                curveToRelative(-1.106f, 0.712f, -3.263f, 0.88f, -4.8f, 0.356f)
                curveToRelative(-0.675f, -0.225f, -1.125f, -0.563f, -1.313f, -0.9f)
                lineTo(0.47f, 7.2f)
                curveToRelative(0.431f, 0.675f, 1.125f, 1.294f, 2.025f, 1.838f)
                curveTo(0.938f, 9.938f, 0.0f, 11.062f, 0.0f, 12.28f)
                curveToRelative(0.0f, 1.2f, 0.9f, 2.307f, 2.419f, 3.206f)
                curveTo(0.9f, 16.37f, 0.0f, 17.476f, 0.0f, 18.675f)
                curveTo(0.0f, 21.619f, 5.363f, 24.0f, 12.0f, 24.0f)
                curveToRelative(6.619f, 0.0f, 12.0f, -2.381f, 12.0f, -5.325f)
                curveToRelative(0.0f, -1.2f, -0.9f, -2.306f, -2.419f, -3.188f)
                curveTo(23.1f, 14.588f, 24.0f, 13.482f, 24.0f, 12.282f)
                curveToRelative(0.0f, -1.219f, -0.938f, -2.362f, -2.512f, -3.262f)
                curveToRelative(1.556f, -0.956f, 2.493f, -2.138f, 2.493f, -3.413f)
                curveToRelative(0.0f, -3.093f, -5.381f, -5.606f, -12.0f, -5.606f)
                close()
                moveTo(16.256f, 2.663f)
                curveToRelative(-0.975f, 0.018f, -1.912f, 0.225f, -2.512f, 0.618f)
                curveToRelative(-1.031f, 0.675f, -0.713f, 1.594f, 0.712f, 2.082f)
                curveToRelative(1.425f, 0.487f, 3.394f, 0.337f, 4.425f, -0.338f)
                curveToRelative(1.032f, -0.675f, 0.713f, -1.594f, -0.712f, -2.062f)
                arcToRelative(6.376f, 6.376f, 0.0f, false, false, -1.913f, -0.282f)
                close()
                moveTo(16.313f, 2.981f)
                curveToRelative(1.387f, 0.0f, 2.493f, 0.525f, 2.493f, 1.163f)
                curveToRelative(0.0f, 0.637f, -1.106f, 1.162f, -2.493f, 1.162f)
                curveToRelative(-1.388f, 0.0f, -2.494f, -0.525f, -2.494f, -1.162f)
                curveToRelative(0.0f, -0.638f, 1.106f, -1.163f, 2.494f, -1.163f)
                close()
                moveTo(8.493f, 6.45f)
                curveToRelative(-0.3f, 0.019f, -0.58f, 0.038f, -0.862f, 0.075f)
                lineToRelative(1.707f, 0.319f)
                arcToRelative(2.03f, 0.94f, 0.0f, true, true, -1.52f, 1.744f)
                lineToRelative(-1.668f, -0.32f)
                curveToRelative(0.188f, 0.17f, 0.45f, 0.32f, 0.806f, 0.45f)
                curveToRelative(1.2f, 0.413f, 2.888f, 0.282f, 3.75f, -0.28f)
                curveToRelative(0.863f, -0.563f, 0.6f, -1.35f, -0.6f, -1.744f)
                curveToRelative(-0.487f, -0.169f, -1.068f, -0.244f, -1.612f, -0.244f)
                close()
                moveTo(20.437f, 9.563f)
                verticalLineToRelative(1.743f)
                curveToRelative(0.0f, 2.063f, -3.787f, 3.732f, -8.437f, 3.732f)
                curveToRelative(-4.669f, 0.0f, -8.437f, -1.67f, -8.437f, -3.732f)
                lineTo(3.563f, 9.581f)
                curveToRelative(2.156f, 0.994f, 5.137f, 1.613f, 8.418f, 1.613f)
                curveToRelative(3.3f, 0.0f, 6.3f, -0.619f, 8.475f, -1.631f)
                close()
                moveTo(20.437f, 16.05f)
                verticalLineToRelative(1.65f)
                curveToRelative(0.0f, 2.063f, -3.787f, 3.731f, -8.437f, 3.731f)
                curveToRelative(-4.669f, 0.0f, -8.437f, -1.668f, -8.437f, -3.731f)
                verticalLineToRelative(-1.65f)
                curveToRelative(2.175f, 0.956f, 5.137f, 1.538f, 8.437f, 1.538f)
                reflectiveCurveToRelative(6.281f, -0.582f, 8.438f, -1.538f)
                close()
            }
        }
        .build()
        return _steamdb!!
    }

private var _steamdb: ImageVector? = null
