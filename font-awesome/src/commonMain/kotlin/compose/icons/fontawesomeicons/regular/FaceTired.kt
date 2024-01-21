package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.FaceTired: ImageVector
    get() {
        if (_faceTired != null) {
            return _faceTired!!
        }
        _faceTired = Builder(name = "FaceTired", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                arcTo(208.0f, 208.0f, 0.0f, true, false, 48.0f, 256.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, 416.0f, 0.0f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, true, 0.0f, 256.0f)
                close()
                moveTo(176.5f, 320.3f)
                curveTo(196.1f, 302.1f, 223.8f, 288.0f, 256.0f, 288.0f)
                reflectiveCurveToRelative(59.9f, 14.1f, 79.5f, 32.3f)
                curveTo(354.5f, 338.1f, 368.0f, 362.0f, 368.0f, 384.0f)
                curveToRelative(0.0f, 5.4f, -2.7f, 10.4f, -7.2f, 13.4f)
                reflectiveCurveToRelative(-10.2f, 3.4f, -15.2f, 1.3f)
                lineToRelative(-17.2f, -7.5f)
                curveToRelative(-22.8f, -10.0f, -47.5f, -15.1f, -72.4f, -15.1f)
                reflectiveCurveToRelative(-49.6f, 5.2f, -72.4f, 15.1f)
                lineToRelative(-17.2f, 7.5f)
                curveToRelative(-4.9f, 2.2f, -10.7f, 1.7f, -15.2f, -1.3f)
                reflectiveCurveToRelative(-7.2f, -8.0f, -7.2f, -13.4f)
                curveToRelative(0.0f, -22.0f, 13.5f, -45.9f, 32.5f, -63.7f)
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
