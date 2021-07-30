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

public val SimpleIcons.Overcast: ImageVector
    get() {
        if (_overcast != null) {
            return _overcast!!
        }
        _overcast = Builder(name = "Overcast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.389f, 24.018f, 0.017f, 18.671f, 0.0f, 12.061f)
                lineTo(0.0f, 12.0f)
                curveTo(0.0f, 5.35f, 5.351f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.35f, 12.0f, 12.0f)
                curveToRelative(0.0f, 6.649f, -5.351f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 19.249f)
                lineToRelative(0.9f, -0.899f)
                lineToRelative(-0.9f, -3.45f)
                lineToRelative(-0.9f, 3.45f)
                lineToRelative(0.9f, 0.899f)
                close()
                moveTo(10.85f, 19.199f)
                lineTo(10.4f, 20.9f)
                lineToRelative(1.05f, -1.052f)
                lineToRelative(-0.6f, -0.649f)
                close()
                moveTo(13.15f, 19.199f)
                lineToRelative(-0.6f, 0.601f)
                lineToRelative(1.05f, 1.051f)
                lineToRelative(-0.45f, -1.652f)
                close()
                moveTo(14.0f, 22.301f)
                lineTo(12.0f, 20.3f)
                lineToRelative(-2.0f, 2.001f)
                curveToRelative(0.65f, 0.1f, 1.3f, 0.199f, 2.0f, 0.199f)
                reflectiveCurveToRelative(1.35f, -0.05f, 2.0f, -0.199f)
                close()
                moveTo(12.0f, 1.5f)
                curveTo(6.201f, 1.5f, 1.5f, 6.201f, 1.5f, 12.0f)
                curveToRelative(-0.008f, 4.468f, 2.825f, 8.446f, 7.051f, 9.899f)
                lineToRelative(2.25f, -8.35f)
                curveToRelative(-0.511f, -0.372f, -0.809f, -0.968f, -0.801f, -1.6f)
                curveToRelative(0.0f, -1.101f, 0.9f, -2.001f, 2.0f, -2.001f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.001f)
                curveToRelative(0.0f, 0.649f, -0.301f, 1.2f, -0.801f, 1.6f)
                lineToRelative(2.25f, 8.35f)
                curveToRelative(4.227f, -1.453f, 7.06f, -5.432f, 7.051f, -9.899f)
                curveToRelative(0.0f, -5.799f, -4.701f, -10.5f, -10.5f, -10.5f)
                close()
                moveTo(18.85f, 17.2f)
                curveToRelative(-0.255f, 0.319f, -0.714f, 0.385f, -1.049f, 0.15f)
                curveToRelative(-0.313f, -0.207f, -0.4f, -0.628f, -0.194f, -0.941f)
                curveToRelative(0.014f, -0.021f, 0.028f, -0.04f, 0.044f, -0.06f)
                curveToRelative(0.0f, 0.0f, 1.35f, -1.799f, 1.35f, -4.35f)
                reflectiveCurveToRelative(-1.35f, -4.35f, -1.35f, -4.35f)
                curveToRelative(-0.239f, -0.289f, -0.198f, -0.719f, 0.091f, -0.957f)
                curveToRelative(0.02f, -0.016f, 0.039f, -0.031f, 0.06f, -0.044f)
                curveToRelative(0.335f, -0.235f, 0.794f, -0.169f, 1.049f, 0.15f)
                curveToRelative(0.1f, 0.101f, 1.65f, 2.15f, 1.65f, 5.2f)
                reflectiveCurveTo(18.949f, 17.1f, 18.85f, 17.2f)
                close()
                moveTo(15.199f, 15.25f)
                curveToRelative(-0.3f, -0.3f, -0.249f, -0.85f, 0.051f, -1.15f)
                curveToRelative(0.0f, 0.0f, 0.75f, -0.799f, 0.75f, -2.1f)
                reflectiveCurveToRelative(-0.75f, -2.051f, -0.75f, -2.1f)
                curveToRelative(-0.3f, -0.301f, -0.3f, -0.801f, -0.051f, -1.15f)
                curveToRelative(0.232f, -0.303f, 0.666f, -0.357f, 0.969f, -0.125f)
                curveToRelative(0.029f, 0.022f, 0.056f, 0.047f, 0.082f, 0.074f)
                curveTo(16.301f, 8.75f, 17.5f, 10.0f, 17.5f, 12.0f)
                reflectiveCurveToRelative(-1.199f, 3.25f, -1.25f, 3.301f)
                curveToRelative(-0.301f, 0.299f, -0.75f, 0.25f, -1.051f, -0.051f)
                close()
                moveTo(8.801f, 15.25f)
                curveToRelative(-0.301f, 0.301f, -0.75f, 0.35f, -1.051f, 0.051f)
                curveTo(7.699f, 15.199f, 6.5f, 14.0f, 6.5f, 12.0f)
                reflectiveCurveToRelative(1.199f, -3.199f, 1.25f, -3.301f)
                curveToRelative(0.301f, -0.299f, 0.801f, -0.299f, 1.051f, 0.051f)
                curveToRelative(0.3f, 0.3f, 0.249f, 0.85f, -0.051f, 1.15f)
                curveToRelative(0.0f, 0.049f, -0.75f, 0.799f, -0.75f, 2.1f)
                reflectiveCurveToRelative(0.75f, 2.1f, 0.75f, 2.1f)
                curveToRelative(0.3f, 0.3f, 0.351f, 0.799f, 0.051f, 1.15f)
                close()
                moveTo(6.199f, 17.351f)
                curveToRelative(-0.335f, 0.234f, -0.794f, 0.169f, -1.05f, -0.15f)
                curveTo(5.051f, 17.1f, 3.5f, 15.05f, 3.5f, 12.0f)
                reflectiveCurveToRelative(1.551f, -5.1f, 1.649f, -5.2f)
                curveToRelative(0.256f, -0.319f, 0.715f, -0.386f, 1.05f, -0.15f)
                curveToRelative(0.313f, 0.206f, 0.4f, 0.628f, 0.194f, 0.941f)
                curveToRelative(-0.013f, 0.02f, -0.028f, 0.04f, -0.043f, 0.059f)
                curveTo(6.35f, 7.65f, 5.0f, 9.449f, 5.0f, 12.0f)
                reflectiveCurveToRelative(1.35f, 4.35f, 1.35f, 4.35f)
                curveToRelative(0.25f, 0.3f, 0.15f, 0.75f, -0.151f, 1.001f)
                close()
            }
        }
        .build()
        return _overcast!!
    }

private var _overcast: ImageVector? = null
