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

public val SolidGroup.FaceTired: ImageVector
    get() {
        if (_faceTired != null) {
            return _faceTired!!
        }
        _faceTired = Builder(name = "FaceTired", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(164.7f, 328.7f)
                curveToRelative(22.0f, -22.0f, 53.9f, -40.7f, 91.3f, -40.7f)
                reflectiveCurveToRelative(69.3f, 18.7f, 91.3f, 40.7f)
                curveToRelative(11.1f, 11.1f, 20.1f, 23.4f, 26.4f, 35.4f)
                curveToRelative(6.2f, 11.7f, 10.3f, 24.4f, 10.3f, 35.9f)
                curveToRelative(0.0f, 5.2f, -2.6f, 10.2f, -6.9f, 13.2f)
                reflectiveCurveToRelative(-9.8f, 3.7f, -14.7f, 1.8f)
                lineToRelative(-20.5f, -7.7f)
                curveToRelative(-26.9f, -10.1f, -55.5f, -15.3f, -84.3f, -15.3f)
                horizontalLineToRelative(-3.2f)
                curveToRelative(-28.8f, 0.0f, -57.3f, 5.2f, -84.3f, 15.3f)
                lineTo(149.6f, 415.0f)
                curveToRelative(-4.9f, 1.8f, -10.4f, 1.2f, -14.7f, -1.8f)
                reflectiveCurveToRelative(-6.9f, -7.9f, -6.9f, -13.2f)
                curveToRelative(0.0f, -11.6f, 4.2f, -24.2f, 10.3f, -35.9f)
                curveToRelative(6.3f, -12.0f, 15.3f, -24.3f, 26.4f, -35.4f)
                close()
                moveTo(133.5f, 146.7f)
                lineToRelative(89.9f, 47.9f)
                curveToRelative(10.7f, 5.7f, 10.7f, 21.1f, 0.0f, 26.8f)
                lineToRelative(-89.9f, 47.9f)
                curveToRelative(-7.9f, 4.2f, -17.5f, -1.5f, -17.5f, -10.5f)
                curveToRelative(0.0f, -2.8f, 1.0f, -5.5f, 2.8f, -7.6f)
                lineToRelative(36.0f, -43.2f)
                lineToRelative(-36.0f, -43.2f)
                curveToRelative(-1.8f, -2.1f, -2.8f, -4.8f, -2.8f, -7.6f)
                curveToRelative(0.0f, -9.0f, 9.6f, -14.7f, 17.5f, -10.5f)
                close()
                moveTo(396.0f, 157.1f)
                curveToRelative(0.0f, 2.8f, -1.0f, 5.5f, -2.8f, 7.6f)
                lineToRelative(-36.0f, 43.2f)
                lineToRelative(36.0f, 43.2f)
                curveToRelative(1.8f, 2.1f, 2.8f, 4.8f, 2.8f, 7.6f)
                curveToRelative(0.0f, 9.0f, -9.6f, 14.7f, -17.5f, 10.5f)
                lineToRelative(-89.9f, -47.9f)
                curveToRelative(-10.7f, -5.7f, -10.7f, -21.1f, 0.0f, -26.8f)
                lineToRelative(89.9f, -47.9f)
                curveToRelative(7.9f, -4.2f, 17.5f, 1.5f, 17.5f, 10.5f)
                close()
            }
        }
        .build()
        return _faceTired!!
    }

private var _faceTired: ImageVector? = null
