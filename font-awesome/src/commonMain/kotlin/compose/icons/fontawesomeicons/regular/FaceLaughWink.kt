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

public val RegularGroup.FaceLaughWink: ImageVector
    get() {
        if (_faceLaughWink != null) {
            return _faceLaughWink!!
        }
        _faceLaughWink = Builder(name = "FaceLaughWink", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
                moveTo(130.7f, 313.9f)
                curveToRelative(-4.2f, -13.6f, 7.1f, -25.9f, 21.3f, -25.9f)
                lineTo(364.5f, 288.0f)
                curveToRelative(14.2f, 0.0f, 25.5f, 12.4f, 21.3f, 25.9f)
                curveTo(369.0f, 368.4f, 318.2f, 408.0f, 258.2f, 408.0f)
                reflectiveCurveToRelative(-110.8f, -39.6f, -127.5f, -94.1f)
                close()
                moveTo(144.4f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(310.2f, 213.7f)
                curveToRelative(-7.6f, 8.1f, -20.2f, 8.5f, -28.3f, 0.9f)
                reflectiveCurveToRelative(-8.5f, -20.2f, -0.9f, -28.3f)
                curveToRelative(14.5f, -15.5f, 35.2f, -22.3f, 54.6f, -22.3f)
                reflectiveCurveToRelative(40.1f, 6.8f, 54.6f, 22.3f)
                curveToRelative(7.6f, 8.1f, 7.1f, 20.7f, -0.9f, 28.3f)
                reflectiveCurveToRelative(-20.7f, 7.1f, -28.3f, -0.9f)
                curveToRelative(-5.5f, -5.8f, -14.8f, -9.7f, -25.4f, -9.7f)
                reflectiveCurveToRelative(-19.9f, 3.8f, -25.4f, 9.7f)
                close()
            }
        }
        .build()
        return _faceLaughWink!!
    }

private var _faceLaughWink: ImageVector? = null
