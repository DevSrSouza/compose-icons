package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.CameraSwitchLine: ImageVector
    get() {
        if (_cameraSwitchLine != null) {
            return _cameraSwitchLine!!
        }
        _cameraSwitchLine = Builder(name = "CameraSwitchLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.828f, 5.0f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(4.0f, 7.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 7.0f)
                horizontalLineToRelative(-3.828f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(9.828f, 5.0f)
                close()
                moveTo(9.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(2.0f, -2.0f)
                close()
                moveTo(9.64f, 7.53f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 6.187f, 8.92f)
                lineTo(13.75f, 12.6f)
                horizontalLineToRelative(1.749f)
                lineToRelative(0.001f, -0.1f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -4.928f, -3.196f)
                lineTo(9.64f, 7.53f)
                close()
                moveTo(14.317f, 17.49f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -6.18f, -8.905f)
                lineTo(10.25f, 12.5f)
                lineTo(8.5f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.886f, 3.215f)
                lineToRelative(0.931f, 1.774f)
                close()
            }
        }
        .build()
        return _cameraSwitchLine!!
    }

private var _cameraSwitchLine: ImageVector? = null
