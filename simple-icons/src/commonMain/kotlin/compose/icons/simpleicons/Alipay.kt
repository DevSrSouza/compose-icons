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

public val SimpleIcons.Alipay: ImageVector
    get() {
        if (_alipay != null) {
            return _alipay!!
        }
        _alipay = Builder(name = "Alipay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.695f, 15.07f)
                curveToRelative(3.426f, 1.158f, 4.203f, 1.22f, 4.203f, 1.22f)
                verticalLineTo(3.846f)
                curveToRelative(0.0f, -2.124f, -1.705f, -3.845f, -3.81f, -3.845f)
                horizontalLineTo(3.914f)
                curveTo(1.808f, 0.001f, 0.102f, 1.722f, 0.102f, 3.846f)
                verticalLineToRelative(16.31f)
                curveToRelative(0.0f, 2.123f, 1.706f, 3.845f, 3.813f, 3.845f)
                horizontalLineToRelative(16.173f)
                curveToRelative(2.105f, 0.0f, 3.81f, -1.722f, 3.81f, -3.845f)
                verticalLineToRelative(-0.157f)
                reflectiveCurveToRelative(-6.19f, -2.602f, -9.315f, -4.119f)
                curveToRelative(-2.096f, 2.602f, -4.8f, 4.181f, -7.607f, 4.181f)
                curveToRelative(-4.75f, 0.0f, -6.361f, -4.19f, -4.112f, -6.949f)
                curveToRelative(0.49f, -0.602f, 1.324f, -1.175f, 2.617f, -1.497f)
                curveToRelative(2.025f, -0.502f, 5.247f, 0.313f, 8.266f, 1.317f)
                arcToRelative(16.796f, 16.796f, 0.0f, false, false, 1.341f, -3.302f)
                horizontalLineTo(5.781f)
                verticalLineToRelative(-0.952f)
                horizontalLineToRelative(4.799f)
                verticalLineTo(6.975f)
                horizontalLineTo(4.77f)
                verticalLineToRelative(-0.953f)
                horizontalLineToRelative(5.81f)
                verticalLineTo(3.591f)
                reflectiveCurveToRelative(0.0f, -0.409f, 0.411f, -0.409f)
                horizontalLineToRelative(2.347f)
                verticalLineToRelative(2.84f)
                horizontalLineToRelative(5.744f)
                verticalLineToRelative(0.951f)
                horizontalLineToRelative(-5.744f)
                verticalLineToRelative(1.704f)
                horizontalLineToRelative(4.69f)
                arcToRelative(19.453f, 19.453f, 0.0f, false, true, -1.986f, 5.06f)
                curveToRelative(1.424f, 0.52f, 2.702f, 1.011f, 3.654f, 1.333f)
                moveToRelative(-13.81f, -2.032f)
                curveToRelative(-0.596f, 0.06f, -1.71f, 0.325f, -2.321f, 0.869f)
                curveToRelative(-1.83f, 1.608f, -0.735f, 4.55f, 2.968f, 4.55f)
                curveToRelative(2.151f, 0.0f, 4.301f, -1.388f, 5.99f, -3.61f)
                curveToRelative(-2.403f, -1.182f, -4.438f, -2.028f, -6.637f, -1.809f)
            }
        }
        .build()
        return _alipay!!
    }

private var _alipay: ImageVector? = null
