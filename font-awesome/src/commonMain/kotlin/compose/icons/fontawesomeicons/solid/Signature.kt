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

public val SolidGroup.Signature: ImageVector
    get() {
        if (_signature != null) {
            return _signature!!
        }
        _signature = Builder(name = "Signature", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 128.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(7.8f)
                curveToRelative(0.0f, 27.7f, -2.4f, 55.3f, -7.1f, 82.5f)
                lineToRelative(-84.4f, 25.3f)
                curveToRelative(-40.6f, 12.2f, -68.4f, 49.6f, -68.4f, 92.0f)
                verticalLineToRelative(71.9f)
                curveToRelative(0.0f, 40.0f, 32.5f, 72.5f, 72.5f, 72.5f)
                curveToRelative(26.0f, 0.0f, 50.0f, -13.9f, 62.9f, -36.5f)
                lineToRelative(13.9f, -24.3f)
                curveToRelative(26.8f, -47.0f, 46.5f, -97.7f, 58.4f, -150.5f)
                lineToRelative(94.4f, -28.3f)
                lineToRelative(-12.5f, 37.5f)
                curveToRelative(-3.3f, 9.8f, -1.6f, 20.5f, 4.4f, 28.8f)
                reflectiveCurveToRelative(15.7f, 13.3f, 26.0f, 13.3f)
                lineTo(544.0f, 320.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(460.4f, 256.0f)
                lineToRelative(18.0f, -53.9f)
                curveToRelative(3.8f, -11.3f, 0.9f, -23.8f, -7.4f, -32.4f)
                reflectiveCurveToRelative(-20.7f, -11.8f, -32.2f, -8.4f)
                lineTo(316.4f, 198.1f)
                curveToRelative(2.4f, -20.7f, 3.6f, -41.4f, 3.6f, -62.3f)
                lineTo(320.0f, 128.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 43.0f, -96.0f, 96.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(192.0f, 128.0f)
                close()
                moveTo(182.8f, 305.0f)
                lineToRelative(49.0f, -14.7f)
                curveToRelative(-10.4f, 33.8f, -24.5f, 66.4f, -42.1f, 97.2f)
                lineToRelative(-13.9f, 24.3f)
                curveToRelative(-1.5f, 2.6f, -4.3f, 4.3f, -7.4f, 4.3f)
                curveToRelative(-4.7f, 0.0f, -8.5f, -3.8f, -8.5f, -8.5f)
                lineTo(159.9f, 335.6f)
                curveToRelative(0.0f, -14.1f, 9.3f, -26.6f, 22.8f, -30.7f)
                close()
                moveTo(24.0f, 368.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineTo(64.3f, 416.0f)
                curveToRelative(-0.2f, -2.8f, -0.3f, -5.6f, -0.3f, -8.5f)
                lineTo(64.0f, 368.0f)
                lineTo(24.0f, 368.0f)
                close()
                moveTo(616.0f, 416.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(305.9f, 368.0f)
                curveToRelative(-6.7f, 16.3f, -14.2f, 32.3f, -22.3f, 48.0f)
                lineTo(616.0f, 416.0f)
                close()
            }
        }
        .build()
        return _signature!!
    }

private var _signature: ImageVector? = null
