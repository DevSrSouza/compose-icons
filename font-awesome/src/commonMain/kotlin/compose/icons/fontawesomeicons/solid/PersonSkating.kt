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

public val SolidGroup.PersonSkating: ImageVector
    get() {
        if (_personSkating != null) {
            return _personSkating!!
        }
        _personSkating = Builder(name = "PersonSkating", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(128.0f, 128.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(319.4f, 96.0f)
                curveToRelative(43.6f, 0.0f, 64.6f, 53.4f, 32.8f, 83.1f)
                lineToRelative(-74.4f, 69.4f)
                lineToRelative(60.2f, 60.2f)
                curveToRelative(9.0f, 9.0f, 14.1f, 21.2f, 14.1f, 33.9f)
                lineTo(352.1f, 416.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(288.1f, 349.3f)
                lineToRelative(-77.9f, -77.8f)
                curveToRelative(-26.6f, -26.6f, -24.6f, -70.3f, 4.3f, -94.4f)
                lineToRelative(20.4f, -17.0f)
                lineTo(160.0f, 160.1f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(81.4f, 353.4f)
                lineToRelative(86.9f, -86.9f)
                curveToRelative(4.6f, 10.0f, 11.0f, 19.3f, 19.3f, 27.5f)
                lineToRelative(21.8f, 21.8f)
                lineToRelative(-82.7f, 82.7f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, -32.8f, 0.0f, -45.3f)
                close()
                moveTo(403.9f, 448.5f)
                curveToRelative(8.6f, 2.1f, 13.8f, 10.8f, 11.6f, 19.4f)
                lineToRelative(-0.4f, 1.7f)
                curveToRelative(-6.2f, 24.9f, -28.6f, 42.4f, -54.3f, 42.4f)
                lineTo(272.0f, 512.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(88.8f)
                curveToRelative(11.0f, 0.0f, 20.6f, -7.5f, 23.3f, -18.2f)
                lineToRelative(0.4f, -1.7f)
                curveToRelative(2.1f, -8.6f, 10.8f, -13.8f, 19.4f, -11.6f)
                close()
                moveTo(135.2f, 478.3f)
                lineToRelative(-6.2f, 3.1f)
                curveToRelative(-21.6f, 10.8f, -47.6f, 6.6f, -64.6f, -10.5f)
                lineTo(4.7f, 411.3f)
                curveToRelative(-6.2f, -6.2f, -6.2f, -16.4f, 0.0f, -22.6f)
                reflectiveCurveToRelative(16.4f, -6.2f, 22.6f, 0.0f)
                lineToRelative(59.6f, 59.6f)
                curveToRelative(7.3f, 7.3f, 18.5f, 9.1f, 27.7f, 4.5f)
                lineToRelative(6.2f, -3.1f)
                curveToRelative(7.9f, -4.0f, 17.5f, -0.7f, 21.5f, 7.2f)
                reflectiveCurveToRelative(0.7f, 17.5f, -7.2f, 21.5f)
                close()
            }
        }
        .build()
        return _personSkating!!
    }

private var _personSkating: ImageVector? = null
