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

public val SimpleIcons.Opennebula: ImageVector
    get() {
        if (_opennebula != null) {
            return _opennebula!!
        }
        _opennebula = Builder(name = "Opennebula", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.458f, 20.15f)
                verticalLineToRelative(3.453f)
                reflectiveCurveToRelative(-0.007f, 0.206f, -0.087f, 0.283f)
                arcToRelative(0.382f, 0.382f, 0.0f, false, true, -0.294f, 0.113f)
                curveToRelative(-3.859f, -0.005f, -7.718f, -0.01f, -11.577f, -0.003f)
                curveToRelative(-1.576f, -0.005f, -3.25f, -0.173f, -4.532f, -1.117f)
                curveToRelative(-0.074f, -0.08f, -0.485f, -0.289f, -0.188f, -0.259f)
                arcToRelative(91.722f, 91.722f, 0.0f, false, false, 14.367f, -1.92f)
                arcToRelative(92.308f, 92.308f, 0.0f, false, false, 2.31f, -0.55f)
                close()
                moveTo(3.272f, 20.964f)
                curveToRelative(0.206f, 0.302f, 0.36f, 0.766f, 0.71f, 0.898f)
                curveToRelative(5.88f, -0.29f, 11.76f, -1.083f, 17.476f, -2.536f)
                verticalLineToRelative(-3.391f)
                curveToRelative(-2.437f, 1.16f, -4.983f, 2.097f, -7.558f, 2.87f)
                arcToRelative(64.756f, 64.756f, 0.0f, false, true, -10.628f, 2.16f)
                close()
                moveTo(2.612f, 19.078f)
                curveToRelative(0.06f, 0.387f, 0.158f, 0.751f, 0.299f, 1.127f)
                curveToRelative(6.167f, -0.726f, 12.276f, -2.236f, 17.925f, -4.864f)
                curveToRelative(0.207f, -0.098f, 0.414f, -0.198f, 0.62f, -0.298f)
                verticalLineToRelative(-3.278f)
                curveToRelative(-4.392f, 2.987f, -9.392f, 4.986f, -14.503f, 6.329f)
                curveToRelative(-1.438f, 0.363f, -2.876f, 0.74f, -4.341f, 0.984f)
                close()
                moveTo(13.462f, 12.386f)
                curveToRelative(-3.178f, 1.803f, -6.578f, 3.195f, -10.067f, 4.238f)
                curveToRelative(-0.257f, 0.14f, -0.734f, 0.086f, -0.732f, 0.469f)
                arcToRelative(5.21f, 5.21f, 0.0f, false, false, -0.12f, 1.18f)
                curveToRelative(5.668f, -1.085f, 11.252f, -2.89f, 16.283f, -5.793f)
                arcToRelative(34.33f, 34.33f, 0.0f, false, false, 2.632f, -1.685f)
                lineTo(21.458f, 5.899f)
                curveToRelative(-2.213f, 2.657f, -5.019f, 4.774f, -7.997f, 6.487f)
                close()
                moveTo(20.905f, 0.126f)
                curveToRelative(-0.963f, 0.413f, -4.859f, 2.33f, -5.443f, 4.875f)
                curveToRelative(-0.236f, 0.323f, -0.596f, -0.08f, -0.854f, -0.163f)
                curveToRelative(-2.209f, -1.091f, -5.008f, -0.736f, -6.9f, 0.872f)
                curveTo(5.82f, 7.238f, 4.782f, 9.976f, 5.65f, 12.348f)
                curveToRelative(0.136f, 0.279f, 0.277f, 0.653f, -0.018f, 0.883f)
                curveToRelative(-0.35f, 0.243f, -0.743f, 0.419f, -1.05f, 0.728f)
                curveToRelative(-0.625f, 0.527f, -1.17f, 1.204f, -1.5f, 1.926f)
                curveToRelative(5.184f, -1.574f, 10.26f, -3.834f, 14.504f, -7.283f)
                curveToRelative(1.423f, -1.183f, 2.757f, -2.503f, 3.87f, -3.982f)
                lineTo(21.456f, 0.083f)
                curveToRelative(-0.073f, -0.154f, -0.296f, -0.067f, -0.551f, 0.043f)
                close()
            }
        }
        .build()
        return _opennebula!!
    }

private var _opennebula: ImageVector? = null
