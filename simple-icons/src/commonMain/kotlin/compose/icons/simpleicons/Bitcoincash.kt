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

public val SimpleIcons.Bitcoincash: ImageVector
    get() {
        if (_bitcoincash != null) {
            return _bitcoincash!!
        }
        _bitcoincash = Builder(name = "Bitcoincash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.828f)
                lineTo(0.0f, 0.022f)
                horizontalLineToRelative(8.745f)
                arcTo(12.43f, 12.43f, 0.0f, false, false, 0.0f, 8.828f)
                close()
                moveTo(15.255f, 0.022f)
                arcTo(12.43f, 12.43f, 0.0f, false, true, 24.0f, 8.828f)
                lineTo(24.0f, 0.022f)
                horizontalLineToRelative(-8.745f)
                close()
                moveTo(15.255f, 23.978f)
                lineTo(24.0f, 23.978f)
                verticalLineToRelative(-8.806f)
                arcToRelative(12.43f, 12.43f, 0.0f, false, true, -8.745f, 8.806f)
                close()
                moveTo(0.0f, 15.172f)
                verticalLineToRelative(8.806f)
                horizontalLineToRelative(8.745f)
                arcTo(12.43f, 12.43f, 0.0f, false, true, 0.0f, 15.172f)
                close()
                moveTo(12.0f, 22.189f)
                curveTo(6.373f, 22.189f, 1.811f, 17.627f, 1.811f, 12.0f)
                reflectiveCurveTo(6.373f, 1.811f, 12.0f, 1.811f)
                reflectiveCurveTo(22.189f, 6.373f, 22.189f, 12.0f)
                reflectiveCurveTo(17.627f, 22.189f, 12.0f, 22.189f)
                close()
                moveTo(16.815f, 12.574f)
                curveToRelative(-0.029f, -0.065f, -0.028f, -0.135f, -0.056f, -0.203f)
                curveToRelative(-0.12f, -0.4f, -0.357f, -0.755f, -0.68f, -1.018f)
                arcToRelative(2.519f, 2.519f, 0.0f, false, false, -0.434f, -0.285f)
                curveToRelative(-0.006f, -0.005f, -0.015f, -0.008f, -0.021f, -0.012f)
                arcToRelative(2.902f, 2.902f, 0.0f, false, false, -0.93f, -0.294f)
                arcToRelative(2.59f, 2.59f, 0.0f, false, false, 0.249f, -0.313f)
                curveToRelative(0.089f, -0.134f, 0.173f, -0.274f, 0.236f, -0.423f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.14f, -0.344f, 0.172f, -0.722f, 0.094f, -1.085f)
                curveToRelative(-0.022f, -0.059f, -0.031f, -0.124f, -0.057f, -0.182f)
                arcToRelative(1.847f, 1.847f, 0.0f, false, false, -0.605f, -0.906f)
                arcToRelative(2.403f, 2.403f, 0.0f, false, false, -0.391f, -0.254f)
                verticalLineToRelative(-0.001f)
                lineToRelative(-0.021f, -0.012f)
                curveToRelative(-0.556f, -0.289f, -1.263f, -0.376f, -1.975f, -0.194f)
                lineToRelative(-0.185f, 0.048f)
                lineToRelative(-0.469f, -1.821f)
                lineToRelative(-1.084f, 0.278f)
                lineToRelative(0.465f, 1.815f)
                lineToRelative(-0.867f, 0.223f)
                lineToRelative(-0.467f, -1.809f)
                lineToRelative(-1.085f, 0.278f)
                lineTo(9.0f, 8.219f)
                lineToRelative(-2.237f, 0.575f)
                lineToRelative(0.298f, 1.157f)
                lineToRelative(0.901f, -0.231f)
                arcToRelative(0.556f, 0.556f, 0.0f, false, true, 0.679f, 0.4f)
                verticalLineToRelative(0.001f)
                lineToRelative(1.251f, 4.867f)
                arcToRelative(0.372f, 0.372f, 0.0f, false, true, -0.268f, 0.453f)
                lineToRelative(-0.79f, 0.203f)
                lineToRelative(0.046f, 1.375f)
                lineToRelative(2.234f, -0.574f)
                lineToRelative(0.473f, 1.812f)
                lineToRelative(1.084f, -0.279f)
                lineToRelative(-0.467f, -1.816f)
                lineToRelative(0.867f, -0.223f)
                lineToRelative(0.467f, 1.816f)
                lineToRelative(1.084f, -0.279f)
                lineToRelative(-0.468f, -1.823f)
                lineToRelative(0.451f, -0.117f)
                curveToRelative(0.802f, -0.206f, 1.45f, -0.676f, 1.842f, -1.262f)
                curveToRelative(0.099f, -0.152f, 0.188f, -0.315f, 0.262f, -0.48f)
                curveToRelative(0.157f, -0.387f, 0.194f, -0.812f, 0.106f, -1.22f)
                close()
                moveTo(13.103f, 10.451f)
                curveToRelative(0.052f, -0.07f, 0.1f, -0.143f, 0.134f, -0.224f)
                arcToRelative(0.942f, 0.942f, 0.0f, false, false, 0.062f, -0.576f)
                curveToRelative(-0.012f, -0.031f, -0.015f, -0.065f, -0.029f, -0.096f)
                arcToRelative(0.942f, 0.942f, 0.0f, false, false, -0.331f, -0.475f)
                arcToRelative(1.625f, 1.625f, 0.0f, false, false, -0.224f, -0.132f)
                arcToRelative(1.642f, 1.642f, 0.0f, false, false, -1.105f, -0.086f)
                curveToRelative(-0.252f, 0.066f, -1.017f, 0.258f, -1.202f, 0.305f)
                lineToRelative(0.568f, 2.203f)
                curveToRelative(0.185f, -0.048f, 0.948f, -0.248f, 1.201f, -0.312f)
                curveToRelative(0.4f, -0.102f, 0.727f, -0.328f, 0.926f, -0.607f)
                close()
                moveTo(14.655f, 12.925f)
                curveToRelative(-0.01f, -0.036f, -0.014f, -0.068f, -0.029f, -0.101f)
                arcToRelative(0.963f, 0.963f, 0.0f, false, false, -0.382f, -0.511f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, false, -0.262f, -0.142f)
                curveToRelative(-0.36f, -0.154f, -0.826f, -0.188f, -1.3f, -0.066f)
                curveToRelative(-0.299f, 0.077f, -1.206f, 0.305f, -1.425f, 0.362f)
                lineToRelative(0.616f, 2.395f)
                curveToRelative(0.22f, -0.056f, 1.124f, -0.293f, 1.423f, -0.37f)
                curveToRelative(0.475f, -0.122f, 0.865f, -0.376f, 1.107f, -0.685f)
                arcToRelative(2.33f, 2.33f, 0.0f, false, false, 0.166f, -0.252f)
                arcToRelative(0.973f, 0.973f, 0.0f, false, false, 0.086f, -0.63f)
                close()
            }
        }
        .build()
        return _bitcoincash!!
    }

private var _bitcoincash: ImageVector? = null
