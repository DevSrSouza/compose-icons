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
                moveTo(224.0f, 16.0f)
                curveToRelative(-6.7f, 0.0f, -10.8f, -2.8f, -15.5f, -6.1f)
                curveTo(201.9f, 5.4f, 194.0f, 0.0f, 176.0f, 0.0f)
                curveToRelative(-30.5f, 0.0f, -52.0f, 43.7f, -66.0f, 89.4f)
                curveTo(62.7f, 98.1f, 32.0f, 112.2f, 32.0f, 128.0f)
                curveToRelative(0.0f, 14.3f, 25.0f, 27.1f, 64.6f, 35.9f)
                curveToRelative(-0.4f, 4.0f, -0.6f, 8.0f, -0.6f, 12.1f)
                curveToRelative(0.0f, 17.0f, 3.3f, 33.2f, 9.3f, 48.0f)
                lineTo(45.4f, 224.0f)
                curveTo(38.0f, 224.0f, 32.0f, 230.0f, 32.0f, 237.4f)
                curveToRelative(0.0f, 1.7f, 0.3f, 3.4f, 1.0f, 5.0f)
                lineToRelative(38.8f, 96.9f)
                curveTo(28.2f, 371.8f, 0.0f, 423.8f, 0.0f, 482.3f)
                curveTo(0.0f, 498.7f, 13.3f, 512.0f, 29.7f, 512.0f)
                lineTo(418.3f, 512.0f)
                curveToRelative(16.4f, 0.0f, 29.7f, -13.3f, 29.7f, -29.7f)
                curveToRelative(0.0f, -58.5f, -28.2f, -110.4f, -71.7f, -143.0f)
                lineTo(415.0f, 242.4f)
                curveToRelative(0.6f, -1.6f, 1.0f, -3.3f, 1.0f, -5.0f)
                curveToRelative(0.0f, -7.4f, -6.0f, -13.4f, -13.4f, -13.4f)
                lineTo(342.7f, 224.0f)
                curveToRelative(6.0f, -14.8f, 9.3f, -31.0f, 9.3f, -48.0f)
                curveToRelative(0.0f, -4.1f, -0.2f, -8.1f, -0.6f, -12.1f)
                curveTo(391.0f, 155.1f, 416.0f, 142.3f, 416.0f, 128.0f)
                curveToRelative(0.0f, -15.8f, -30.7f, -29.9f, -78.0f, -38.6f)
                curveTo(324.0f, 43.7f, 302.5f, 0.0f, 272.0f, 0.0f)
                curveToRelative(-18.0f, 0.0f, -25.9f, 5.4f, -32.5f, 9.9f)
                curveToRelative(-4.8f, 3.3f, -8.8f, 6.1f, -15.5f, 6.1f)
                close()
                moveTo(280.0f, 224.0f)
                lineTo(267.6f, 224.0f)
                curveToRelative(-16.5f, 0.0f, -31.1f, -10.6f, -36.3f, -26.2f)
                curveToRelative(-2.3f, -7.0f, -12.2f, -7.0f, -14.5f, 0.0f)
                curveToRelative(-5.2f, 15.6f, -19.9f, 26.2f, -36.3f, 26.2f)
                lineTo(168.0f, 224.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, -17.9f, -40.0f, -40.0f)
                lineTo(128.0f, 169.6f)
                curveToRelative(28.2f, 4.1f, 61.0f, 6.4f, 96.0f, 6.4f)
                reflectiveCurveToRelative(67.8f, -2.3f, 96.0f, -6.4f)
                lineTo(320.0f, 184.0f)
                curveToRelative(0.0f, 22.1f, -17.9f, 40.0f, -40.0f, 40.0f)
                close()
                moveTo(192.0f, 320.0f)
                lineToRelative(16.0f, 32.0f)
                lineTo(176.0f, 480.0f)
                lineTo(128.0f, 288.0f)
                lineToRelative(64.0f, 32.0f)
                close()
                moveTo(320.0f, 288.0f)
                lineTo(272.0f, 480.0f)
                lineTo(240.0f, 352.0f)
                lineToRelative(16.0f, -32.0f)
                lineToRelative(64.0f, -32.0f)
                close()
            }
        }
        .build()
        return _userSecret!!
    }

private var _userSecret: ImageVector? = null
