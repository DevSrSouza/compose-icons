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

public val RemixIcons.PencilRuler2Fill: ImageVector
    get() {
        if (_pencilRuler2Fill != null) {
            return _pencilRuler2Fill!!
        }
        _pencilRuler2Fill = Builder(name = "PencilRuler2Fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.636f, 12.707f)
                lineToRelative(1.828f, 1.829f)
                lineTo(8.88f, 13.12f)
                lineTo(7.05f, 11.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.829f, 1.828f)
                lineToRelative(1.414f, -1.414f)
                lineTo(9.88f, 8.464f)
                lineToRelative(1.414f, -1.414f)
                lineTo(13.12f, 8.88f)
                lineToRelative(1.415f, -1.415f)
                lineToRelative(-1.829f, -1.828f)
                lineToRelative(2.829f, -2.828f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(4.242f, 4.242f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineTo(8.464f, 21.192f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineTo(2.808f, 16.95f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                lineToRelative(2.828f, -2.829f)
                close()
                moveTo(14.121f, 18.363f)
                lineToRelative(4.243f, -4.242f)
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
                lineTo(5.636f, 9.878f)
                close()
            }
        }
        .build()
        return _pencilRuler2Fill!!
    }

private var _pencilRuler2Fill: ImageVector? = null
