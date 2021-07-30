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

public val RegularGroup.WindowClose: ImageVector
    get() {
        if (_windowClose != null) {
            return _windowClose!!
        }
        _windowClose = Builder(name = "WindowClose", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(512.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(464.0f, 426.0f)
                curveToRelative(0.0f, 3.3f, -2.7f, 6.0f, -6.0f, 6.0f)
                lineTo(54.0f, 432.0f)
                curveToRelative(-3.3f, 0.0f, -6.0f, -2.7f, -6.0f, -6.0f)
                lineTo(48.0f, 86.0f)
                curveToRelative(0.0f, -3.3f, 2.7f, -6.0f, 6.0f, -6.0f)
                horizontalLineToRelative(404.0f)
                curveToRelative(3.3f, 0.0f, 6.0f, 2.7f, 6.0f, 6.0f)
                verticalLineToRelative(340.0f)
                close()
                moveTo(356.5f, 194.6f)
                lineTo(295.1f, 256.0f)
                lineToRelative(61.4f, 61.4f)
                curveToRelative(4.6f, 4.6f, 4.6f, 12.1f, 0.0f, 16.8f)
                lineToRelative(-22.3f, 22.3f)
                curveToRelative(-4.6f, 4.6f, -12.1f, 4.6f, -16.8f, 0.0f)
                lineTo(256.0f, 295.1f)
                lineToRelative(-61.4f, 61.4f)
                curveToRelative(-4.6f, 4.6f, -12.1f, 4.6f, -16.8f, 0.0f)
                lineToRelative(-22.3f, -22.3f)
                curveToRelative(-4.6f, -4.6f, -4.6f, -12.1f, 0.0f, -16.8f)
                lineToRelative(61.4f, -61.4f)
                lineToRelative(-61.4f, -61.4f)
                curveToRelative(-4.6f, -4.6f, -4.6f, -12.1f, 0.0f, -16.8f)
                lineToRelative(22.3f, -22.3f)
                curveToRelative(4.6f, -4.6f, 12.1f, -4.6f, 16.8f, 0.0f)
                lineToRelative(61.4f, 61.4f)
                lineToRelative(61.4f, -61.4f)
                curveToRelative(4.6f, -4.6f, 12.1f, -4.6f, 16.8f, 0.0f)
                lineToRelative(22.3f, 22.3f)
                curveToRelative(4.7f, 4.6f, 4.7f, 12.1f, 0.0f, 16.8f)
                close()
            }
        }
        .build()
        return _windowClose!!
    }

private var _windowClose: ImageVector? = null
