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

public val SimpleIcons.Talend: ImageVector
    get() {
        if (_talend != null) {
            return _talend!!
        }
        _talend = Builder(name = "Talend", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.875f, 0.025f)
                curveToRelative(-0.41f, 0.043f, -1.233f, 0.19f, -1.795f, 0.324f)
                curveToRelative(-0.653f, 0.156f, -1.099f, 0.303f, -1.856f, 0.632f)
                arcTo(11.96f, 11.96f, 0.0f, false, false, 0.974f, 7.23f)
                curveTo(0.531f, 8.25f, 0.367f, 8.817f, 0.12f, 10.166f)
                curveToRelative(-0.117f, 0.61f, -0.121f, 0.722f, -0.121f, 1.838f)
                reflectiveCurveToRelative(0.004f, 1.228f, 0.121f, 1.838f)
                curveToRelative(0.247f, 1.349f, 0.411f, 1.915f, 0.852f, 2.936f)
                arcToRelative(11.96f, 11.96f, 0.0f, false, false, 6.251f, 6.249f)
                curveToRelative(1.021f, 0.441f, 1.588f, 0.605f, 2.937f, 0.852f)
                curveToRelative(0.61f, 0.117f, 0.723f, 0.121f, 1.839f, 0.121f)
                reflectiveCurveToRelative(1.229f, -0.004f, 1.839f, -0.121f)
                curveToRelative(1.35f, -0.247f, 1.916f, -0.41f, 2.937f, -0.852f)
                arcToRelative(11.96f, 11.96f, 0.0f, false, false, 6.25f, -6.249f)
                curveToRelative(0.442f, -1.02f, 0.606f, -1.587f, 0.853f, -2.936f)
                curveToRelative(0.117f, -0.61f, 0.121f, -0.722f, 0.121f, -1.838f)
                reflectiveCurveToRelative(-0.004f, -1.228f, -0.121f, -1.838f)
                curveToRelative(-0.247f, -1.35f, -0.411f, -1.916f, -0.852f, -2.936f)
                curveToRelative(-1.315f, -3.062f, -3.842f, -5.415f, -7.06f, -6.582f)
                curveTo(15.513f, 0.483f, 14.764f, 0.302f, 13.95f, 0.15f)
                curveToRelative(-0.645f, -0.12f, -0.822f, -0.134f, -1.735f, -0.147f)
                curveToRelative(-0.558f, -0.008f, -1.163f, 0.0f, -1.34f, 0.022f)
                close()
                moveTo(12.411f, 5.365f)
                lineTo(12.519f, 5.469f)
                verticalLineToRelative(2.859f)
                horizontalLineToRelative(2.293f)
                lineToRelative(0.073f, 0.117f)
                curveToRelative(0.139f, 0.212f, 0.06f, 0.735f, -0.134f, 0.934f)
                curveToRelative(-0.069f, 0.065f, -0.194f, 0.073f, -1.155f, 0.073f)
                horizontalLineToRelative(-1.081f)
                lineToRelative(0.013f, 3.49f)
                curveToRelative(0.013f, 3.174f, 0.021f, 3.516f, 0.09f, 3.715f)
                curveToRelative(0.148f, 0.445f, 0.364f, 0.597f, 0.831f, 0.592f)
                curveToRelative(0.329f, 0.0f, 0.597f, -0.064f, 1.224f, -0.302f)
                curveToRelative(0.381f, -0.139f, 0.411f, -0.143f, 0.485f, -0.078f)
                curveToRelative(0.1f, 0.09f, 0.26f, 0.424f, 0.26f, 0.536f)
                curveToRelative(0.0f, 0.143f, -0.347f, 0.398f, -0.926f, 0.68f)
                curveToRelative(-0.922f, 0.444f, -1.661f, 0.613f, -2.47f, 0.557f)
                curveToRelative(-1.519f, -0.104f, -2.367f, -0.614f, -2.678f, -1.617f)
                curveToRelative(-0.087f, -0.277f, -0.09f, -0.398f, -0.104f, -3.931f)
                lineToRelative(-0.013f, -3.642f)
                horizontalLineToRelative(-0.554f)
                curveToRelative(-0.618f, 0.0f, -0.679f, -0.026f, -0.722f, -0.311f)
                curveToRelative(-0.035f, -0.203f, 0.1f, -0.342f, 0.459f, -0.467f)
                arcToRelative(6.057f, 6.057f, 0.0f, false, false, 2.496f, -1.717f)
                curveToRelative(0.354f, -0.415f, 0.48f, -0.601f, 0.748f, -1.116f)
                curveToRelative(0.125f, -0.237f, 0.272f, -0.467f, 0.32f, -0.506f)
                arcToRelative(0.318f, 0.318f, 0.0f, false, true, 0.437f, 0.03f)
                close()
            }
        }
        .build()
        return _talend!!
    }

private var _talend: ImageVector? = null
