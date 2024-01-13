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

public val SolidGroup.PersonHarassing: ImageVector
    get() {
        if (_personHarassing != null) {
            return _personHarassing!!
        }
        _personHarassing = Builder(name = "PersonHarassing", defaultWidth = 576.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
                moveTo(59.4f, 304.5f)
                lineTo(88.0f, 256.9f)
                lineTo(88.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(152.0f, 352.0f)
                horizontalLineToRelative(16.0f)
                lineTo(168.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(232.0f, 235.3f)
                lineToRelative(47.4f, 57.1f)
                curveToRelative(11.3f, 13.6f, 31.5f, 15.5f, 45.1f, 4.2f)
                reflectiveCurveToRelative(15.5f, -31.5f, 4.2f, -45.1f)
                lineToRelative(-73.7f, -88.9f)
                curveToRelative(-18.2f, -22.0f, -45.3f, -34.7f, -73.9f, -34.7f)
                lineTo(145.1f, 127.9f)
                curveToRelative(-33.7f, 0.0f, -64.9f, 17.7f, -82.3f, 46.6f)
                lineToRelative(-58.3f, 97.0f)
                curveToRelative(-9.1f, 15.1f, -4.2f, 34.8f, 10.9f, 43.9f)
                reflectiveCurveToRelative(34.8f, 4.2f, 43.9f, -10.9f)
                close()
                moveTo(480.0f, 240.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 96.0f, 0.0f)
                close()
                moveTo(464.0f, 344.0f)
                verticalLineToRelative(58.7f)
                lineToRelative(-41.4f, -41.4f)
                curveToRelative(-7.3f, -7.3f, -17.6f, -10.6f, -27.8f, -9.0f)
                reflectiveCurveToRelative(-18.9f, 8.1f, -23.5f, 17.3f)
                lineToRelative(-48.0f, 96.0f)
                curveToRelative(-7.9f, 15.8f, -1.5f, 35.0f, 14.3f, 42.9f)
                reflectiveCurveToRelative(35.0f, 1.5f, 42.9f, -14.3f)
                lineTo(408.8f, 438.0f)
                lineToRelative(54.7f, 54.7f)
                curveToRelative(12.4f, 12.4f, 29.1f, 19.3f, 46.6f, 19.3f)
                curveToRelative(36.4f, 0.0f, 65.9f, -29.5f, 65.9f, -65.9f)
                lineTo(576.0f, 344.0f)
                curveToRelative(0.0f, -30.9f, -25.1f, -56.0f, -56.0f, -56.0f)
                reflectiveCurveToRelative(-56.0f, 25.1f, -56.0f, 56.0f)
                close()
                moveTo(288.0f, 48.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(304.0f, 32.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                close()
                moveTo(287.2f, 97.7f)
                curveToRelative(-7.9f, -4.0f, -17.5f, -0.7f, -21.5f, 7.2f)
                reflectiveCurveToRelative(-0.7f, 17.5f, 7.2f, 21.5f)
                lineToRelative(48.0f, 24.0f)
                curveToRelative(7.9f, 4.0f, 17.5f, 0.7f, 21.5f, -7.2f)
                reflectiveCurveToRelative(0.7f, -17.5f, -7.2f, -21.5f)
                lineToRelative(-48.0f, -24.0f)
                close()
            }
        }
        .build()
        return _personHarassing!!
    }

private var _personHarassing: ImageVector? = null
