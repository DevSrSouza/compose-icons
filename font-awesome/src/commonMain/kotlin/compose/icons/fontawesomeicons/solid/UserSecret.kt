package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.UserSecret: ImageVector
    get() {
        if (_userSecret != null) {
            return _userSecret!!
        }
        _userSecret = Builder(name = "UserSecret", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(383.9f, 308.3f)
                lineToRelative(23.9f, -62.6f)
                curveToRelative(4.0f, -10.5f, -3.7f, -21.7f, -15.0f, -21.7f)
                horizontalLineToRelative(-58.5f)
                curveToRelative(11.0f, -18.9f, 17.8f, -40.6f, 17.8f, -64.0f)
                verticalLineToRelative(-0.3f)
                curveToRelative(39.2f, -7.8f, 64.0f, -19.1f, 64.0f, -31.7f)
                curveToRelative(0.0f, -13.3f, -27.3f, -25.1f, -70.1f, -33.0f)
                curveToRelative(-9.2f, -32.8f, -27.0f, -65.8f, -40.6f, -82.8f)
                curveToRelative(-9.5f, -11.9f, -25.9f, -15.6f, -39.5f, -8.8f)
                lineToRelative(-27.6f, 13.8f)
                curveToRelative(-9.0f, 4.5f, -19.6f, 4.5f, -28.6f, 0.0f)
                lineTo(182.1f, 3.4f)
                curveToRelative(-13.6f, -6.8f, -30.0f, -3.1f, -39.5f, 8.8f)
                curveToRelative(-13.5f, 17.0f, -31.4f, 50.0f, -40.6f, 82.8f)
                curveToRelative(-42.7f, 7.9f, -70.0f, 19.7f, -70.0f, 33.0f)
                curveToRelative(0.0f, 12.6f, 24.8f, 23.9f, 64.0f, 31.7f)
                verticalLineToRelative(0.3f)
                curveToRelative(0.0f, 23.4f, 6.8f, 45.1f, 17.8f, 64.0f)
                lineTo(56.3f, 224.0f)
                curveToRelative(-11.5f, 0.0f, -19.2f, 11.7f, -14.7f, 22.3f)
                lineToRelative(25.8f, 60.2f)
                curveTo(27.3f, 329.8f, 0.0f, 372.7f, 0.0f, 422.4f)
                verticalLineToRelative(44.8f)
                curveTo(0.0f, 491.9f, 20.1f, 512.0f, 44.8f, 512.0f)
                horizontalLineToRelative(358.4f)
                curveToRelative(24.7f, 0.0f, 44.8f, -20.1f, 44.8f, -44.8f)
                verticalLineToRelative(-44.8f)
                curveToRelative(0.0f, -48.4f, -25.8f, -90.4f, -64.1f, -114.1f)
                close()
                moveTo(176.0f, 480.0f)
                lineToRelative(-41.6f, -192.0f)
                lineToRelative(49.6f, 32.0f)
                lineToRelative(24.0f, 40.0f)
                lineToRelative(-32.0f, 120.0f)
                close()
                moveTo(272.0f, 480.0f)
                lineToRelative(-32.0f, -120.0f)
                lineToRelative(24.0f, -40.0f)
                lineToRelative(49.6f, -32.0f)
                lineTo(272.0f, 480.0f)
                close()
                moveTo(313.7f, 181.5f)
                curveToRelative(-3.9f, 11.9f, -7.0f, 24.6f, -16.5f, 33.4f)
                curveToRelative(-10.1f, 9.3f, -48.0f, 22.4f, -64.0f, -25.0f)
                curveToRelative(-2.8f, -8.4f, -15.4f, -8.4f, -18.3f, 0.0f)
                curveToRelative(-17.0f, 50.2f, -56.0f, 32.4f, -64.0f, 25.0f)
                curveToRelative(-9.5f, -8.8f, -12.7f, -21.5f, -16.5f, -33.4f)
                curveToRelative(-0.8f, -2.5f, -6.3f, -5.7f, -6.3f, -5.8f)
                verticalLineToRelative(-10.8f)
                curveToRelative(28.3f, 3.6f, 61.0f, 5.8f, 96.0f, 5.8f)
                reflectiveCurveToRelative(67.7f, -2.1f, 96.0f, -5.8f)
                verticalLineToRelative(10.8f)
                curveToRelative(-0.1f, 0.1f, -5.6f, 3.2f, -6.4f, 5.8f)
                close()
            }
        }
        .build()
        return _userSecret!!
    }

private var _userSecret: ImageVector? = null
