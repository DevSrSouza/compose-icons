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

public val SolidGroup.PersonWalking: ImageVector
    get() {
        if (_personWalking != null) {
            return _personWalking!!
        }
        _personWalking = Builder(name = "PersonWalking", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(126.5f, 199.3f)
                curveToRelative(-1.0f, 0.4f, -1.9f, 0.8f, -2.9f, 1.2f)
                lineToRelative(-8.0f, 3.5f)
                curveToRelative(-16.4f, 7.3f, -29.0f, 21.2f, -34.7f, 38.2f)
                lineToRelative(-2.6f, 7.8f)
                curveToRelative(-5.6f, 16.8f, -23.7f, 25.8f, -40.5f, 20.2f)
                reflectiveCurveToRelative(-25.8f, -23.7f, -20.2f, -40.5f)
                lineToRelative(2.6f, -7.8f)
                curveToRelative(11.4f, -34.1f, 36.6f, -61.9f, 69.4f, -76.5f)
                lineToRelative(8.0f, -3.5f)
                curveToRelative(20.8f, -9.2f, 43.3f, -14.0f, 66.1f, -14.0f)
                curveToRelative(44.6f, 0.0f, 84.8f, 26.8f, 101.9f, 67.9f)
                lineTo(281.0f, 232.7f)
                lineToRelative(21.4f, 10.7f)
                curveToRelative(15.8f, 7.9f, 22.2f, 27.1f, 14.3f, 42.9f)
                reflectiveCurveToRelative(-27.1f, 22.2f, -42.9f, 14.3f)
                lineTo(247.0f, 287.3f)
                curveToRelative(-10.3f, -5.2f, -18.4f, -13.8f, -22.8f, -24.5f)
                lineToRelative(-9.6f, -23.0f)
                lineToRelative(-19.3f, 65.5f)
                lineToRelative(49.5f, 54.0f)
                curveToRelative(5.4f, 5.9f, 9.2f, 13.0f, 11.2f, 20.8f)
                lineToRelative(23.0f, 92.1f)
                curveToRelative(4.3f, 17.1f, -6.1f, 34.5f, -23.3f, 38.8f)
                reflectiveCurveToRelative(-34.5f, -6.1f, -38.8f, -23.3f)
                lineToRelative(-22.0f, -88.1f)
                lineToRelative(-70.7f, -77.1f)
                curveToRelative(-14.8f, -16.1f, -20.3f, -38.6f, -14.7f, -59.7f)
                lineToRelative(16.9f, -63.5f)
                close()
                moveTo(68.7f, 398.0f)
                lineToRelative(25.0f, -62.4f)
                curveToRelative(2.1f, 3.0f, 4.5f, 5.8f, 7.0f, 8.6f)
                lineToRelative(40.7f, 44.4f)
                lineToRelative(-14.5f, 36.2f)
                curveToRelative(-2.4f, 6.0f, -6.0f, 11.5f, -10.6f, 16.1f)
                lineTo(54.6f, 502.6f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, -32.8f, 0.0f, -45.3f)
                lineTo(68.7f, 398.0f)
                close()
            }
        }
        .build()
        return _personWalking!!
    }

private var _personWalking: ImageVector? = null
