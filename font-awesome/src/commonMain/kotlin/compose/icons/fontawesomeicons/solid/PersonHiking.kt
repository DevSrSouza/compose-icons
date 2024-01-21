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

public val SolidGroup.PersonHiking: ImageVector
    get() {
        if (_personHiking != null) {
            return _personHiking!!
        }
        _personHiking = Builder(name = "PersonHiking", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(243.3f, 230.7f)
                lineTo(224.2f, 307.0f)
                lineToRelative(49.7f, 49.7f)
                curveToRelative(9.0f, 9.0f, 14.1f, 21.2f, 14.1f, 33.9f)
                lineTo(288.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(224.0f, 397.3f)
                lineToRelative(-73.9f, -73.9f)
                curveToRelative(-15.8f, -15.8f, -22.2f, -38.6f, -16.9f, -60.3f)
                lineToRelative(20.4f, -84.0f)
                curveToRelative(8.3f, -34.1f, 42.7f, -54.9f, 76.7f, -46.4f)
                curveToRelative(19.0f, 4.8f, 35.6f, 16.4f, 46.4f, 32.7f)
                lineTo(305.1f, 208.0f)
                lineTo(336.0f, 208.0f)
                lineTo(336.0f, 184.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineToRelative(55.8f)
                curveToRelative(0.0f, 0.1f, 0.0f, 0.2f, 0.0f, 0.2f)
                reflectiveCurveToRelative(0.0f, 0.2f, 0.0f, 0.2f)
                lineTo(384.0f, 488.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(336.0f, 272.0f)
                lineTo(296.6f, 272.0f)
                curveToRelative(-16.0f, 0.0f, -31.0f, -8.0f, -39.9f, -21.4f)
                lineToRelative(-13.3f, -20.0f)
                close()
                moveTo(81.1f, 471.9f)
                lineTo(117.3f, 334.0f)
                curveToRelative(3.0f, 4.2f, 6.4f, 8.2f, 10.1f, 11.9f)
                lineToRelative(41.9f, 41.9f)
                lineTo(142.9f, 488.1f)
                curveToRelative(-4.5f, 17.1f, -22.0f, 27.3f, -39.1f, 22.8f)
                reflectiveCurveToRelative(-27.3f, -22.0f, -22.8f, -39.1f)
                close()
                moveTo(136.6f, 125.9f)
                lineTo(101.4f, 266.5f)
                curveToRelative(-3.0f, 12.1f, -14.9f, 19.9f, -27.2f, 17.9f)
                lineToRelative(-47.9f, -8.0f)
                curveToRelative(-14.0f, -2.3f, -22.9f, -16.3f, -19.2f, -30.0f)
                lineTo(31.9f, 155.0f)
                curveToRelative(9.5f, -34.8f, 41.1f, -59.0f, 77.2f, -59.0f)
                horizontalLineToRelative(4.2f)
                curveToRelative(15.6f, 0.0f, 27.1f, 14.7f, 23.3f, 29.8f)
                close()
            }
        }
        .build()
        return _personHiking!!
    }

private var _personHiking: ImageVector? = null
