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

public val RegularGroup.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(440.0f, 6.5f)
                lineTo(24.0f, 246.4f)
                curveToRelative(-34.4f, 19.9f, -31.1f, 70.8f, 5.7f, 85.9f)
                lineTo(144.0f, 379.6f)
                lineTo(144.0f, 464.0f)
                curveToRelative(0.0f, 46.4f, 59.2f, 65.5f, 86.6f, 28.6f)
                lineToRelative(43.8f, -59.1f)
                lineToRelative(111.9f, 46.2f)
                curveToRelative(5.9f, 2.4f, 12.1f, 3.6f, 18.3f, 3.6f)
                curveToRelative(8.2f, 0.0f, 16.3f, -2.1f, 23.6f, -6.2f)
                curveToRelative(12.8f, -7.2f, 21.6f, -20.0f, 23.9f, -34.5f)
                lineToRelative(59.4f, -387.2f)
                curveToRelative(6.1f, -40.1f, -36.9f, -68.8f, -71.5f, -48.9f)
                close()
                moveTo(192.0f, 464.0f)
                verticalLineToRelative(-64.6f)
                lineToRelative(36.6f, 15.1f)
                lineTo(192.0f, 464.0f)
                close()
                moveTo(404.6f, 435.3f)
                lineToRelative(-153.8f, -63.5f)
                lineTo(391.0f, 169.5f)
                curveToRelative(10.7f, -15.5f, -9.5f, -33.5f, -23.7f, -21.2f)
                lineTo(155.8f, 332.6f)
                lineTo(48.0f, 288.0f)
                lineTo(464.0f, 48.0f)
                lineToRelative(-59.4f, 387.3f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
