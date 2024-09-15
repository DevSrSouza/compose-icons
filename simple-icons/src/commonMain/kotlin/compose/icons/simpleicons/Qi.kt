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

public val SimpleIcons.Qi: ImageVector
    get() {
        if (_qi != null) {
            return _qi!!
        }
        _qi = Builder(name = "Qi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.574f, 0.0f)
                curveToRelative(-0.842f, 0.0f, -1.525f, 0.683f, -1.525f, 1.525f)
                curveToRelative(0.0f, 0.842f, 0.683f, 1.525f, 1.525f, 1.525f)
                reflectiveCurveToRelative(1.525f, -0.683f, 1.525f, -1.525f)
                curveTo(18.099f, 0.683f, 17.416f, 0.0f, 16.574f, 0.0f)
                close()
                moveTo(11.937f, 2.856f)
                curveToRelative(-1.71f, 0.012f, -3.426f, 0.597f, -4.839f, 1.783f)
                curveToRelative(-3.226f, 2.707f, -3.647f, 7.517f, -0.94f, 10.744f)
                curveToRelative(1.462f, 1.742f, 3.536f, 2.665f, 5.644f, 2.721f)
                curveToRelative(0.297f, 0.0f, 0.297f, 0.293f, 0.297f, 0.293f)
                verticalLineToRelative(2.65f)
                reflectiveCurveToRelative(0.0f, 2.762f, 2.657f, 2.953f)
                curveToRelative(0.295f, 0.01f, 0.295f, -0.295f, 0.295f, -0.295f)
                lineTo(15.05f, 3.786f)
                reflectiveCurveToRelative(0.0f, -0.294f, -0.295f, -0.415f)
                arcToRelative(7.665f, 7.665f, 0.0f, false, false, -2.818f, -0.515f)
                close()
                moveTo(16.685f, 4.518f)
                curveToRelative(-0.11f, -0.002f, -0.11f, 0.179f, -0.11f, 0.389f)
                verticalLineToRelative(11.147f)
                curveToRelative(0.0f, 0.294f, 0.0f, 0.527f, 0.295f, 0.295f)
                curveToRelative(0.01f, -0.009f, 0.021f, -0.018f, 0.032f, -0.027f)
                curveToRelative(3.227f, -2.707f, 3.647f, -7.517f, 0.94f, -10.744f)
                arcToRelative(7.593f, 7.593f, 0.0f, false, false, -0.971f, -0.966f)
                curveToRelative(-0.083f, -0.066f, -0.143f, -0.094f, -0.186f, -0.095f)
                close()
                moveTo(11.933f, 5.906f)
                curveToRelative(0.165f, 0.0f, 0.165f, 0.164f, 0.165f, 0.164f)
                verticalLineToRelative(8.82f)
                reflectiveCurveToRelative(0.0f, 0.164f, -0.165f, 0.164f)
                curveToRelative(-1.282f, -0.019f, -2.55f, -0.573f, -3.439f, -1.633f)
                curveToRelative(-1.625f, -1.936f, -1.372f, -4.822f, 0.564f, -6.446f)
                curveToRelative(0.84f, -0.705f, 1.858f, -1.055f, 2.875f, -1.069f)
                close()
            }
        }
        .build()
        return _qi!!
    }

private var _qi: ImageVector? = null
