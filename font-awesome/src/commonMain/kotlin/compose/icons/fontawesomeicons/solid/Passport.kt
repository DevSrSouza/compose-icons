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

public val SolidGroup.Passport: ImageVector
    get() {
        if (_passport != null) {
            return _passport!!
        }
        _passport = Builder(name = "Passport", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 28.7f, 28.7f, 0.0f, 64.0f, 0.0f)
                lineTo(384.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineTo(448.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 64.0f)
                close()
                moveTo(183.0f, 278.8f)
                curveToRelative(-27.9f, -13.2f, -48.4f, -39.4f, -53.7f, -70.8f)
                horizontalLineToRelative(39.1f)
                curveToRelative(1.6f, 30.4f, 7.7f, 53.8f, 14.6f, 70.8f)
                close()
                moveTo(224.3f, 288.0f)
                lineToRelative(-0.3f, 0.0f)
                lineToRelative(-0.3f, 0.0f)
                curveToRelative(-2.4f, -3.5f, -5.7f, -8.9f, -9.1f, -16.5f)
                curveToRelative(-6.0f, -13.6f, -12.4f, -34.3f, -14.2f, -63.5f)
                horizontalLineToRelative(47.1f)
                curveToRelative(-1.8f, 29.2f, -8.1f, 49.9f, -14.2f, 63.5f)
                curveToRelative(-3.4f, 7.6f, -6.7f, 13.0f, -9.1f, 16.5f)
                close()
                moveTo(265.0f, 278.8f)
                curveToRelative(6.8f, -17.1f, 12.9f, -40.4f, 14.6f, -70.8f)
                horizontalLineToRelative(39.1f)
                curveToRelative(-5.3f, 31.4f, -25.8f, 57.6f, -53.7f, 70.8f)
                close()
                moveTo(279.6f, 176.0f)
                curveToRelative(-1.6f, -30.4f, -7.7f, -53.8f, -14.6f, -70.8f)
                curveToRelative(27.9f, 13.2f, 48.4f, 39.4f, 53.7f, 70.8f)
                lineTo(279.6f, 176.0f)
                close()
                moveTo(223.7f, 96.0f)
                lineToRelative(0.3f, 0.0f)
                lineToRelative(0.3f, 0.0f)
                curveToRelative(2.4f, 3.5f, 5.7f, 8.9f, 9.1f, 16.5f)
                curveToRelative(6.0f, 13.6f, 12.4f, 34.3f, 14.2f, 63.5f)
                lineTo(200.5f, 176.0f)
                curveToRelative(1.8f, -29.2f, 8.1f, -49.9f, 14.2f, -63.5f)
                curveToRelative(3.4f, -7.6f, 6.7f, -13.0f, 9.1f, -16.5f)
                close()
                moveTo(183.0f, 105.2f)
                curveToRelative(-6.8f, 17.1f, -12.9f, 40.4f, -14.6f, 70.8f)
                lineTo(129.3f, 176.0f)
                curveToRelative(5.3f, -31.4f, 25.8f, -57.6f, 53.7f, -70.8f)
                close()
                moveTo(352.0f, 192.0f)
                arcTo(128.0f, 128.0f, 0.0f, true, false, 96.0f, 192.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 256.0f, 0.0f)
                close()
                moveTo(112.0f, 384.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                lineTo(336.0f, 416.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(112.0f, 384.0f)
                close()
            }
        }
        .build()
        return _passport!!
    }

private var _passport: ImageVector? = null
