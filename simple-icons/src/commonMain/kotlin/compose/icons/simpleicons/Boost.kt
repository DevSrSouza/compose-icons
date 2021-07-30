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

public val SimpleIcons.Boost: ImageVector
    get() {
        if (_boost != null) {
            return _boost!!
        }
        _boost = Builder(name = "Boost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.428f, 2.727f)
                lineToRelative(3.335f, 3.335f)
                curveToRelative(-0.486f, 0.07f, -0.903f, 0.276f, -1.32f, 0.624f)
                lineTo(0.886f, 12.383f)
                curveToRelative(-1.181f, 1.18f, -1.181f, 3.194f, 0.0f, 4.375f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, false, 1.598f, 0.834f)
                lineToRelative(17.088f, 3.681f)
                lineToRelative(-3.335f, -3.333f)
                curveToRelative(0.486f, -0.07f, 0.903f, -0.278f, 1.32f, -0.626f)
                lineToRelative(5.557f, -5.695f)
                curveToRelative(1.181f, -1.181f, 1.181f, -3.196f, 0.0f, -4.377f)
                arcToRelative(2.411f, 2.411f, 0.0f, false, false, -1.598f, -0.833f)
                close()
                moveTo(11.653f, 6.2f)
                curveToRelative(0.694f, 0.0f, 1.25f, 0.486f, 1.25f, 1.18f)
                curveToRelative(0.0f, 0.695f, -0.486f, 1.251f, -1.181f, 1.251f)
                curveToRelative(-0.695f, 0.0f, -1.25f, -0.485f, -1.25f, -1.18f)
                reflectiveCurveToRelative(0.555f, -1.251f, 1.18f, -1.251f)
                close()
                moveTo(13.163f, 9.992f)
                curveToRelative(0.049f, -0.006f, 0.088f, 0.046f, 0.088f, 0.098f)
                curveToRelative(-0.139f, 0.694f, -0.695f, 1.181f, -1.39f, 1.181f)
                curveToRelative(-0.694f, 0.0f, -1.32f, -0.487f, -1.46f, -1.112f)
                curveToRelative(0.0f, 0.0f, 0.002f, -0.07f, 0.071f, 0.0f)
                curveToRelative(0.487f, 0.278f, 0.972f, 0.348f, 1.32f, 0.278f)
                curveToRelative(0.346f, 0.0f, 0.833f, -0.07f, 1.32f, -0.416f)
                arcToRelative(0.092f, 0.092f, 0.0f, false, true, 0.05f, -0.029f)
                close()
                moveTo(13.886f, 12.503f)
                curveToRelative(0.058f, 0.013f, 0.06f, 0.106f, 0.06f, 0.158f)
                curveToRelative(-0.209f, 0.903f, -0.973f, 1.666f, -1.946f, 1.666f)
                arcToRelative(2.167f, 2.167f, 0.0f, false, true, -2.084f, -1.528f)
                curveToRelative(-0.07f, -0.07f, 0.0f, -0.138f, 0.138f, -0.138f)
                curveToRelative(0.695f, 0.347f, 1.39f, 0.416f, 1.877f, 0.416f)
                curveToRelative(0.486f, 0.0f, 1.18f, -0.14f, 1.875f, -0.556f)
                curveToRelative(0.035f, -0.017f, 0.06f, -0.022f, 0.08f, -0.018f)
                close()
                moveTo(14.483f, 15.521f)
                curveToRelative(0.049f, -0.013f, 0.087f, 0.09f, 0.087f, 0.195f)
                curveToRelative(-0.278f, 1.181f, -1.25f, 2.085f, -2.5f, 2.155f)
                curveToRelative(-1.251f, 0.0f, -2.293f, -0.835f, -2.57f, -1.946f)
                curveToRelative(0.0f, -0.139f, 0.068f, -0.278f, 0.207f, -0.209f)
                curveToRelative(0.834f, 0.486f, 1.737f, 0.556f, 2.362f, 0.556f)
                reflectiveCurveToRelative(1.529f, -0.208f, 2.362f, -0.694f)
                curveToRelative(0.018f, -0.035f, 0.036f, -0.053f, 0.052f, -0.057f)
                close()
            }
        }
        .build()
        return _boost!!
    }

private var _boost: ImageVector? = null
