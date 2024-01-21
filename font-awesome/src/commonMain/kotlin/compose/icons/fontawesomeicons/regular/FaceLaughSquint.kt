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

public val RegularGroup.FaceLaughSquint: ImageVector
    get() {
        if (_faceLaughSquint != null) {
            return _faceLaughSquint!!
        }
        _faceLaughSquint = Builder(name = "FaceLaughSquint", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
                moveTo(133.5f, 130.6f)
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
                moveTo(396.0f, 141.1f)
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
        return _faceLaughSquint!!
    }

private var _faceLaughSquint: ImageVector? = null
