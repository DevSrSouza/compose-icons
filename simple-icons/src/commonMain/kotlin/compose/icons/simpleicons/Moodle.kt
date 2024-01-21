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

public val SimpleIcons.Moodle: ImageVector
    get() {
        if (_moodle != null) {
            return _moodle!!
        }
        _moodle = Builder(name = "Moodle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.3726f, 0.0f, 0.0f, 5.3726f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.3726f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.3726f, 12.0f, -12.0f)
                reflectiveCurveTo(18.6274f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.1348f, 5.7402f)
                lineTo(13.1699f, 5.8632f)
                lineTo(10.4336f, 7.8535f)
                curveToRelative(0.3694f, 0.2606f, 0.7968f, 0.609f, 1.0078f, 0.8438f)
                lineToRelative(0.0762f, 0.1035f)
                curveToRelative(-1.2878f, 2.2571f, -3.737f, 3.0557f, -6.3164f, 2.1816f)
                lineToRelative(0.0195f, -0.1601f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.0784f, -0.5679f, -0.0962f, -1.0524f, -0.0585f, -1.463f)
                curveToRelative(-0.7507f, -0.003f, -1.5298f, -0.0402f, -2.2832f, -0.0663f)
                lineToRelative(-0.5157f, 0.0175f)
                curveToRelative(-0.0994f, 0.8449f, -0.0351f, 2.135f, -0.0254f, 2.3223f)
                curveToRelative(0.3492f, 1.2819f, 0.2977f, 2.2907f, 0.295f, 3.5293f)
                curveToRelative(-0.4134f, -1.0028f, -0.8995f, -2.097f, -0.416f, -3.4668f)
                lineToRelative(-0.0098f, -0.3183f)
                curveToRelative(-7.0E-4f, -0.0143f, -0.0683f, -1.1532f, 0.037f, -2.0625f)
                lineToRelative(-0.4081f, 0.0136f)
                lineToRelative(-0.0371f, -0.1191f)
                curveTo(5.7922f, 6.8402f, 8.5032f, 6.218f, 13.1348f, 5.7402f)
                close()
                moveTo(14.7578f, 8.2539f)
                curveToRelative(1.2202f, 0.0f, 2.1885f, 0.2691f, 2.9043f, 0.8066f)
                curveToRelative(0.8138f, 0.601f, 1.2207f, 1.4866f, 1.2207f, 2.6582f)
                verticalLineToRelative(5.6856f)
                horizontalLineToRelative(-2.7344f)
                verticalLineToRelative(-5.3691f)
                curveToRelative(0.0f, -1.1225f, -0.4634f, -1.6836f, -1.3906f, -1.6836f)
                curveToRelative(-0.9278f, 0.0f, -1.3906f, 0.561f, -1.3906f, 1.6836f)
                verticalLineToRelative(5.3691f)
                horizontalLineToRelative(-2.7344f)
                verticalLineToRelative(-5.3691f)
                curveToRelative(0.0f, -0.5183f, -0.0986f, -0.9144f, -0.293f, -1.1934f)
                curveToRelative(0.6172f, -0.435f, 1.1534f, -1.0124f, 1.5723f, -1.7246f)
                curveToRelative(0.0297f, 0.029f, 0.0597f, 0.0574f, 0.0879f, 0.0879f)
                curveToRelative(0.5044f, -0.6349f, 1.4233f, -0.9512f, 2.7578f, -0.9512f)
                close()
                moveTo(5.1484f, 11.4883f)
                curveToRelative(0.932f, 0.3f, 1.8614f, 0.393f, 2.7364f, 0.287f)
                arcToRelative(3.5455f, 3.5455f, 0.0f, false, false, -0.0098f, 0.2599f)
                verticalLineToRelative(5.3691f)
                lineTo(5.1426f, 17.4043f)
                verticalLineToRelative(-5.6855f)
                curveToRelative(0.0f, -0.0787f, 0.0022f, -0.1544f, 0.0058f, -0.2305f)
                close()
            }
        }
        .build()
        return _moodle!!
    }

private var _moodle: ImageVector? = null
