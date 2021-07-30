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

public val SimpleIcons.Sparkasse: ImageVector
    get() {
        if (_sparkasse != null) {
            return _sparkasse!!
        }
        _sparkasse = Builder(name = "Sparkasse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0602f, 12.3061f)
                verticalLineToRelative(1.8455f)
                horizontalLineToRelative(14.175f)
                verticalLineToRelative(6.7773f)
                curveToRelative(0.0296f, 1.6615f, -1.4064f, 3.1066f, -3.0705f, 3.0705f)
                lineTo(5.8352f, 23.9994f)
                curveToRelative(-1.6582f, 0.0306f, -3.1011f, -1.4121f, -3.0705f, -3.0705f)
                verticalLineToRelative(-1.225f)
                lineTo(16.908f, 19.7039f)
                verticalLineToRelative(-1.8455f)
                lineTo(2.7648f, 17.8584f)
                verticalLineToRelative(-6.7773f)
                curveToRelative(-0.0307f, -1.6579f, 1.4123f, -3.1012f, 3.0704f, -3.0704f)
                horizontalLineToRelative(12.3295f)
                curveToRelative(1.6641f, -0.0363f, 3.1f, 1.4095f, 3.0705f, 3.0705f)
                verticalLineToRelative(1.225f)
                lineTo(7.0602f, 12.3062f)
                close()
                moveTo(11.9843f, 6.1575f)
                curveToRelative(1.7003f, 0.0f, 3.0787f, -1.3784f, 3.0787f, -3.0787f)
                reflectiveCurveTo(13.6847f, 0.0f, 11.9843f, 0.0f)
                reflectiveCurveTo(8.9055f, 1.3784f, 8.9055f, 3.0788f)
                reflectiveCurveToRelative(1.3785f, 3.0787f, 3.0788f, 3.0787f)
                close()
            }
        }
        .build()
        return _sparkasse!!
    }

private var _sparkasse: ImageVector? = null
