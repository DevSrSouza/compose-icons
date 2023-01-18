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

public val RemixIcons.ScissorsLine: ImageVector
    get() {
        if (_scissorsLine != null) {
            return _scissorsLine!!
        }
        _scissorsLine = Builder(name = "ScissorsLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.446f, 8.032f)
                lineTo(12.0f, 10.586f)
                lineToRelative(6.728f, -6.728f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.828f, 0.0f)
                lineToRelative(-12.11f, 12.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -1.414f, -1.414f)
                lineTo(10.586f, 12.0f)
                lineTo(8.032f, 9.446f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 1.414f, -1.414f)
                close()
                moveTo(14.826f, 13.412f)
                lineToRelative(6.73f, 6.73f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.828f, 0.0f)
                lineToRelative(-5.317f, -5.316f)
                lineToRelative(1.415f, -1.415f)
                close()
                moveTo(7.414f, 16.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -2.828f, 2.828f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.828f, -2.828f)
                close()
                moveTo(7.414f, 7.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -2.828f, -2.828f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.828f, 2.828f)
                close()
            }
        }
        .build()
        return _scissorsLine!!
    }

private var _scissorsLine: ImageVector? = null
