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

public val SimpleIcons.Peerlist: ImageVector
    get() {
        if (_peerlist != null) {
            return _peerlist!!
        }
        _peerlist = Builder(name = "Peerlist", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(2.667f, 0.0f, 0.0f, 2.667f, 0.0f, 12.0f)
                reflectiveCurveToRelative(2.673f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -2.667f, 12.0f, -12.0f)
                reflectiveCurveTo(21.327f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(20.892f, 20.894f)
                curveToRelative(-1.57f, 1.569f, -4.247f, 2.249f, -8.892f, 2.249f)
                reflectiveCurveToRelative(-7.322f, -0.68f, -8.892f, -2.25f)
                curveTo(1.735f, 19.522f, 1.041f, 17.3f, 0.89f, 13.654f)
                arcTo(39.74f, 39.74f, 0.0f, false, true, 0.857f, 12.0f)
                curveToRelative(0.0f, -1.162f, 0.043f, -2.201f, 0.13f, -3.13f)
                curveToRelative(0.177f, -1.859f, 0.537f, -3.278f, 1.106f, -4.366f)
                curveToRelative(0.284f, -0.544f, 0.62f, -1.006f, 1.013f, -1.398f)
                reflectiveCurveToRelative(0.854f, -0.729f, 1.398f, -1.013f)
                curveTo(5.592f, 1.524f, 7.01f, 1.164f, 8.87f, 0.988f)
                curveTo(9.799f, 0.9f, 10.838f, 0.858f, 12.0f, 0.858f)
                curveToRelative(4.645f, 0.0f, 7.322f, 0.68f, 8.892f, 2.248f)
                curveToRelative(1.569f, 1.569f, 2.25f, 4.246f, 2.25f, 8.894f)
                reflectiveCurveToRelative(-0.681f, 7.325f, -2.25f, 8.894f)
                close()
                moveTo(20.538f, 3.46f)
                curveTo(19.064f, 1.986f, 16.51f, 1.357f, 12.0f, 1.357f)
                curveToRelative(-4.513f, 0.0f, -7.067f, 0.629f, -8.54f, 2.103f)
                curveTo(1.986f, 4.933f, 1.357f, 7.487f, 1.357f, 12.0f)
                curveToRelative(0.0f, 4.511f, 0.63f, 7.065f, 2.105f, 8.54f)
                curveTo(4.936f, 22.014f, 7.49f, 22.643f, 12.0f, 22.643f)
                reflectiveCurveToRelative(7.064f, -0.629f, 8.538f, -2.103f)
                curveToRelative(1.475f, -1.475f, 2.105f, -4.029f, 2.105f, -8.54f)
                reflectiveCurveToRelative(-0.63f, -7.065f, -2.105f, -8.54f)
                close()
                moveTo(14.25f, 16.49f)
                arcToRelative(6.097f, 6.097f, 0.0f, false, true, -2.442f, 0.59f)
                verticalLineToRelative(2.706f)
                lineTo(10.45f, 19.786f)
                verticalLineToRelative(0.357f)
                lineTo(6.429f, 20.143f)
                lineTo(6.429f, 5.57f)
                horizontalLineToRelative(0.357f)
                lineTo(6.786f, 4.214f)
                horizontalLineToRelative(5.676f)
                curveToRelative(3.565f, 0.0f, 6.467f, 2.81f, 6.467f, 6.262f)
                curveToRelative(0.0f, 2.852f, -1.981f, 5.26f, -4.68f, 6.013f)
                close()
                moveTo(12.462f, 7.762f)
                lineTo(10.45f, 7.762f)
                verticalLineToRelative(5.428f)
                horizontalLineToRelative(2.011f)
                curveToRelative(1.532f, 0.0f, 2.802f, -1.2f, 2.802f, -2.714f)
                reflectiveCurveToRelative(-1.27f, -2.714f, -2.802f, -2.714f)
                close()
                moveTo(13.363f, 12.113f)
                curveToRelative(0.117f, -0.239f, 0.186f, -0.502f, 0.186f, -0.78f)
                curveToRelative(0.0f, -1.01f, -0.855f, -1.857f, -1.945f, -1.857f)
                horizontalLineToRelative(-0.296f)
                lineTo(11.308f, 8.62f)
                horizontalLineToRelative(1.154f)
                curveToRelative(1.09f, 0.0f, 1.945f, 0.847f, 1.945f, 1.857f)
                curveToRelative(0.0f, 0.705f, -0.422f, 1.323f, -1.044f, 1.637f)
                close()
                moveTo(17.467f, 13.606f)
                curveToRelative(0.043f, -0.063f, 0.083f, -0.129f, 0.123f, -0.194f)
                arcToRelative(5.653f, 5.653f, 0.0f, false, false, 0.526f, -1.103f)
                arcToRelative(5.56f, 5.56f, 0.0f, false, false, 0.11f, -0.362f)
                curveToRelative(0.02f, -0.076f, 0.042f, -0.15f, 0.06f, -0.227f)
                arcToRelative(5.58f, 5.58f, 0.0f, false, false, 0.073f, -0.41f)
                curveToRelative(0.01f, -0.068f, 0.025f, -0.134f, 0.032f, -0.203f)
                curveToRelative(0.024f, -0.207f, 0.038f, -0.417f, 0.038f, -0.63f)
                curveToRelative(0.0f, -3.198f, -2.687f, -5.763f, -5.967f, -5.763f)
                lineTo(7.286f, 4.714f)
                verticalLineToRelative(14.572f)
                horizontalLineToRelative(4.022f)
                verticalLineToRelative(-3.048f)
                horizontalLineToRelative(1.154f)
                curveToRelative(1.43f, 0.0f, 2.747f, -0.488f, 3.778f, -1.303f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, false, 0.46f, -0.406f)
                curveToRelative(0.035f, -0.034f, 0.066f, -0.07f, 0.1f, -0.105f)
                curveToRelative(0.107f, -0.11f, 0.21f, -0.22f, 0.308f, -0.337f)
                curveToRelative(0.044f, -0.053f, 0.084f, -0.108f, 0.126f, -0.162f)
                curveToRelative(0.081f, -0.104f, 0.16f, -0.21f, 0.233f, -0.319f)
                close()
                moveTo(12.462f, 15.381f)
                lineTo(10.45f, 15.381f)
                verticalLineToRelative(3.048f)
                lineTo(8.143f, 18.429f)
                lineTo(8.143f, 5.57f)
                horizontalLineToRelative(4.319f)
                curveToRelative(2.837f, 0.0f, 5.11f, 2.211f, 5.11f, 4.905f)
                reflectiveCurveToRelative(-2.273f, 4.905f, -5.11f, 4.905f)
                close()
            }
        }
        .build()
        return _peerlist!!
    }

private var _peerlist: ImageVector? = null
