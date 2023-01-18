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

public val RemixIcons.DeleteBack2Line: ImageVector
    get() {
        if (_deleteBack2Line != null) {
            return _deleteBack2Line!!
        }
        _deleteBack2Line = Builder(name = "DeleteBack2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.535f, 3.0f)
                lineTo(21.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(6.535f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.832f, -0.445f)
                lineToRelative(-5.333f, -8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.11f)
                lineToRelative(5.333f, -8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.535f, 3.0f)
                close()
                moveTo(7.07f, 5.0f)
                lineToRelative(-4.666f, 7.0f)
                lineToRelative(4.666f, 7.0f)
                lineTo(20.0f, 19.0f)
                lineTo(20.0f, 5.0f)
                lineTo(7.07f, 5.0f)
                close()
                moveTo(13.0f, 10.586f)
                lineToRelative(2.828f, -2.829f)
                lineToRelative(1.415f, 1.415f)
                lineTo(14.414f, 12.0f)
                lineToRelative(2.829f, 2.828f)
                lineToRelative(-1.415f, 1.415f)
                lineTo(13.0f, 13.414f)
                lineToRelative(-2.828f, 2.829f)
                lineToRelative(-1.415f, -1.415f)
                lineTo(11.586f, 12.0f)
                lineTo(8.757f, 9.172f)
                lineToRelative(1.415f, -1.415f)
                lineTo(13.0f, 10.586f)
                close()
            }
        }
        .build()
        return _deleteBack2Line!!
    }

private var _deleteBack2Line: ImageVector? = null
