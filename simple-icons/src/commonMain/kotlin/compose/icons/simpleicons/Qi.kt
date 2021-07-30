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
                moveTo(16.5742f, 0.0f)
                curveToRelative(-0.8422f, 0.0f, -1.525f, 0.6826f, -1.525f, 1.5247f)
                curveToRelative(0.0f, 0.8424f, 0.6828f, 1.525f, 1.525f, 1.525f)
                reflectiveCurveToRelative(1.5247f, -0.6826f, 1.5247f, -1.525f)
                curveTo(18.0989f, 0.6826f, 17.4164f, 0.0f, 16.5742f, 0.0f)
                close()
                moveTo(11.9371f, 2.856f)
                curveToRelative(-1.7103f, 0.0124f, -3.4264f, 0.5973f, -4.8392f, 1.7828f)
                curveToRelative(-3.2263f, 2.7071f, -3.6471f, 7.5175f, -0.94f, 10.7439f)
                curveToRelative(1.4616f, 1.7419f, 3.5365f, 2.6653f, 5.6439f, 2.7208f)
                curveToRelative(0.2966f, 0.0f, 0.2966f, 0.293f, 0.2966f, 0.293f)
                verticalLineToRelative(2.65f)
                reflectiveCurveToRelative(2.0E-4f, 2.7624f, 2.6567f, 2.9532f)
                curveToRelative(0.2952f, 0.0103f, 0.2953f, -0.295f, 0.2953f, -0.295f)
                lineTo(15.0504f, 3.7857f)
                reflectiveCurveToRelative(0.0f, -0.2943f, -0.295f, -0.415f)
                arcToRelative(7.665f, 7.665f, 0.0f, false, false, -2.8183f, -0.5147f)
                close()
                moveTo(16.685f, 4.518f)
                curveToRelative(-0.1097f, -0.0016f, -0.1097f, 0.1789f, -0.1097f, 0.3891f)
                verticalLineToRelative(11.1466f)
                curveToRelative(0.0f, 0.2941f, 0.0f, 0.5266f, 0.2948f, 0.2954f)
                curveToRelative(0.0104f, -0.009f, 0.0211f, -0.0175f, 0.0318f, -0.0266f)
                curveToRelative(3.2265f, -2.707f, 3.6474f, -7.5175f, 0.94f, -10.7437f)
                arcToRelative(7.5925f, 7.5925f, 0.0f, false, false, -0.9713f, -0.9659f)
                curveToRelative(-0.083f, -0.0656f, -0.1427f, -0.0941f, -0.1856f, -0.0948f)
                close()
                moveTo(11.9335f, 5.9065f)
                curveToRelative(0.165f, 0.0f, 0.165f, 0.1642f, 0.165f, 0.1642f)
                verticalLineToRelative(8.8198f)
                reflectiveCurveToRelative(0.0f, 0.1644f, -0.165f, 0.1644f)
                curveToRelative(-1.2823f, -0.0192f, -2.5496f, -0.5735f, -3.4386f, -1.633f)
                curveToRelative(-1.6245f, -1.936f, -1.3719f, -4.8217f, 0.5639f, -6.4464f)
                curveToRelative(0.8395f, -0.7046f, 1.8582f, -1.0549f, 2.8747f, -1.069f)
                close()
            }
        }
        .build()
        return _qi!!
    }

private var _qi: ImageVector? = null
