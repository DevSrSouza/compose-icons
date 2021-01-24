package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.WindowClose: ImageVector
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
                moveTo(380.4f, 322.5f)
                curveToRelative(4.8f, 4.8f, 4.8f, 12.6f, 0.0f, 17.4f)
                lineToRelative(-40.5f, 40.5f)
                curveToRelative(-4.8f, 4.8f, -12.6f, 4.8f, -17.4f, 0.0f)
                lineTo(256.0f, 313.3f)
                lineToRelative(-66.5f, 67.1f)
                curveToRelative(-4.8f, 4.8f, -12.6f, 4.8f, -17.4f, 0.0f)
                lineToRelative(-40.5f, -40.5f)
                curveToRelative(-4.8f, -4.8f, -4.8f, -12.6f, 0.0f, -17.4f)
                lineToRelative(67.1f, -66.5f)
                lineToRelative(-67.1f, -66.5f)
                curveToRelative(-4.8f, -4.8f, -4.8f, -12.6f, 0.0f, -17.4f)
                lineToRelative(40.5f, -40.5f)
                curveToRelative(4.8f, -4.8f, 12.6f, -4.8f, 17.4f, 0.0f)
                lineToRelative(66.5f, 67.1f)
                lineToRelative(66.5f, -67.1f)
                curveToRelative(4.8f, -4.8f, 12.6f, -4.8f, 17.4f, 0.0f)
                lineToRelative(40.5f, 40.5f)
                curveToRelative(4.8f, 4.8f, 4.8f, 12.6f, 0.0f, 17.4f)
                lineTo(313.3f, 256.0f)
                lineToRelative(67.1f, 66.5f)
                close()
            }
        }
        .build()
        return _windowClose!!
    }

private var _windowClose: ImageVector? = null
