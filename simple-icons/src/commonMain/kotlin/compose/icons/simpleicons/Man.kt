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

public val SimpleIcons.Man: ImageVector
    get() {
        if (_man != null) {
            return _man!!
        }
        _man = Builder(name = "Man", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.979f, 14.943f)
                horizontalLineToRelative(2.05f)
                lineTo(15.46f, 18.7f)
                horizontalLineToRelative(-2.054f)
                lineToRelative(-0.263f, -0.409f)
                horizontalLineToRelative(-2.278f)
                lineToRelative(-0.264f, 0.41f)
                lineTo(8.548f, 18.701f)
                close()
                moveTo(12.004f, 16.511f)
                lineToRelative(-0.458f, 0.711f)
                horizontalLineToRelative(0.916f)
                lineToRelative(-0.458f, -0.712f)
                close()
                moveTo(0.0f, 17.372f)
                curveTo(0.0f, 10.704f, 5.372f, 5.3f, 12.0f, 5.3f)
                reflectiveCurveToRelative(12.0f, 5.405f, 12.0f, 12.073f)
                curveToRelative(0.0f, 0.449f, -0.024f, 0.892f, -0.072f, 1.328f)
                lineTo(22.58f, 18.701f)
                curveToRelative(0.054f, -0.435f, 0.082f, -0.878f, 0.082f, -1.328f)
                curveToRelative(0.0f, -5.924f, -4.774f, -10.726f, -10.662f, -10.726f)
                curveToRelative(-5.889f, 0.0f, -10.661f, 4.802f, -10.661f, 10.726f)
                curveToRelative(0.0f, 0.45f, 0.027f, 0.893f, 0.08f, 1.328f)
                lineTo(0.073f, 18.701f)
                arcTo(12.254f, 12.274f, 0.0f, false, true, 0.0f, 17.372f)
                close()
                moveTo(2.237f, 14.942f)
                horizontalLineToRelative(1.83f)
                lineToRelative(1.22f, 1.228f)
                lineToRelative(1.22f, -1.227f)
                horizontalLineToRelative(1.831f)
                lineTo(8.338f, 18.7f)
                lineTo(6.363f, 18.7f)
                verticalLineToRelative(-1.38f)
                lineToRelative(-1.075f, 1.082f)
                lineToRelative(-1.076f, -1.082f)
                verticalLineToRelative(1.38f)
                lineTo(2.237f, 18.7f)
                verticalLineToRelative(-3.757f)
                close()
                moveTo(15.657f, 14.942f)
                horizontalLineToRelative(1.927f)
                lineToRelative(2.17f, 1.62f)
                verticalLineToRelative(-1.62f)
                horizontalLineToRelative(1.975f)
                lineTo(21.729f, 18.7f)
                horizontalLineToRelative(-1.942f)
                lineToRelative(-2.156f, -1.605f)
                lineTo(17.631f, 18.7f)
                horizontalLineToRelative(-1.975f)
                close()
            }
        }
        .build()
        return _man!!
    }

private var _man: ImageVector? = null
