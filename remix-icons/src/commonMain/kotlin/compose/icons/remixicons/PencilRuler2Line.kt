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

public val RemixIcons.PencilRuler2Line: ImageVector
    get() {
        if (_pencilRuler2Line != null) {
            return _pencilRuler2Line!!
        }
        _pencilRuler2Line = Builder(name = "PencilRuler2Line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.05f, 14.121f)
                lineTo(4.93f, 16.243f)
                lineToRelative(2.828f, 2.828f)
                lineTo(19.071f, 7.757f)
                lineTo(16.243f, 4.93f)
                lineTo(14.12f, 7.05f)
                lineToRelative(1.415f, 1.414f)
                lineTo(14.12f, 9.88f)
                lineToRelative(-1.414f, -1.415f)
                lineToRelative(-1.414f, 1.415f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.415f, 1.414f)
                lineToRelative(1.415f, 1.414f)
                lineToRelative(-1.415f, 1.415f)
                lineTo(7.05f, 14.12f)
                close()
                moveTo(16.95f, 2.808f)
                lineToRelative(4.242f, 4.242f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineTo(8.464f, 21.192f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineTo(2.808f, 16.95f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                lineTo(15.536f, 2.808f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                close()
                moveTo(14.12f, 18.363f)
                lineToRelative(1.415f, -1.414f)
                lineToRelative(2.242f, 2.243f)
                horizontalLineToRelative(1.414f)
                verticalLineToRelative(-1.414f)
                lineToRelative(-2.242f, -2.243f)
                lineToRelative(1.414f, -1.414f)
                lineTo(21.0f, 16.757f)
                lineTo(21.0f, 21.0f)
                horizontalLineToRelative(-4.242f)
                lineToRelative(-2.637f, -2.637f)
                close()
                moveTo(5.636f, 9.878f)
                lineTo(2.807f, 7.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.415f)
                lineToRelative(2.829f, -2.828f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineTo(9.88f, 5.635f)
                lineTo(8.464f, 7.05f)
                lineTo(6.343f, 4.928f)
                lineTo(4.929f, 6.343f)
                lineToRelative(2.121f, 2.12f)
                lineToRelative(-1.414f, 1.415f)
                close()
            }
        }
        .build()
        return _pencilRuler2Line!!
    }

private var _pencilRuler2Line: ImageVector? = null
