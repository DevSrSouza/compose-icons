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

public val SolidGroup.PersonWalkingWithCane: ImageVector
    get() {
        if (_personWalkingWithCane != null) {
            return _personWalkingWithCane!!
        }
        _personWalkingWithCane = Builder(name = "PersonWalkingWithCane", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
                moveTo(167.6f, 128.0f)
                curveToRelative(-36.4f, 0.0f, -69.6f, 20.5f, -85.9f, 53.1f)
                lineTo(35.4f, 273.7f)
                curveToRelative(-7.9f, 15.8f, -1.5f, 35.0f, 14.3f, 42.9f)
                reflectiveCurveToRelative(35.0f, 1.5f, 42.9f, -14.3f)
                lineTo(128.0f, 231.6f)
                verticalLineToRelative(43.2f)
                curveToRelative(0.0f, 17.0f, 6.7f, 33.3f, 18.7f, 45.3f)
                lineTo(224.0f, 397.3f)
                lineTo(224.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(288.0f, 390.6f)
                curveToRelative(0.0f, -12.7f, -5.1f, -24.9f, -14.1f, -33.9f)
                lineTo(224.0f, 306.7f)
                lineTo(224.0f, 213.3f)
                lineToRelative(70.4f, 93.9f)
                curveToRelative(10.6f, 14.1f, 30.7f, 17.0f, 44.8f, 6.4f)
                reflectiveCurveToRelative(17.0f, -30.7f, 6.4f, -44.8f)
                lineTo(268.8f, 166.4f)
                curveTo(250.7f, 142.2f, 222.2f, 128.0f, 192.0f, 128.0f)
                lineTo(167.6f, 128.0f)
                close()
                moveTo(128.3f, 346.8f)
                lineTo(97.0f, 472.2f)
                curveToRelative(-4.3f, 17.1f, 6.1f, 34.5f, 23.3f, 38.8f)
                reflectiveCurveToRelative(34.5f, -6.1f, 38.8f, -23.3f)
                lineToRelative(22.0f, -88.2f)
                lineToRelative(-52.8f, -52.8f)
                close()
                moveTo(450.8f, 505.1f)
                curveToRelative(5.0f, 7.3f, 15.0f, 9.1f, 22.3f, 4.0f)
                reflectiveCurveToRelative(9.1f, -15.0f, 4.0f, -22.3f)
                lineTo(358.9f, 316.1f)
                curveToRelative(-2.8f, 3.8f, -6.1f, 7.3f, -10.1f, 10.3f)
                curveToRelative(-5.0f, 3.8f, -10.5f, 6.4f, -16.2f, 7.9f)
                lineTo(450.8f, 505.1f)
                close()
            }
        }
        .build()
        return _personWalkingWithCane!!
    }

private var _personWalkingWithCane: ImageVector? = null
