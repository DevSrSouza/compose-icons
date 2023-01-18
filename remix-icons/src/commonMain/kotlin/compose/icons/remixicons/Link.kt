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

public val RemixIcons.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.364f, 15.536f)
                lineTo(16.95f, 14.12f)
                lineToRelative(1.414f, -1.414f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -7.071f, -7.071f)
                lineTo(9.879f, 7.05f)
                lineTo(8.464f, 5.636f)
                lineTo(9.88f, 4.222f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 9.9f, 9.9f)
                lineToRelative(-1.415f, 1.414f)
                close()
                moveTo(15.536f, 18.364f)
                lineToRelative(-1.415f, 1.414f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -9.9f, -9.9f)
                lineToRelative(1.415f, -1.414f)
                lineTo(7.05f, 9.88f)
                lineToRelative(-1.414f, 1.414f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 7.071f, 7.071f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.415f, 1.414f)
                close()
                moveTo(14.828f, 7.757f)
                lineToRelative(1.415f, 1.415f)
                lineToRelative(-7.071f, 7.07f)
                lineToRelative(-1.415f, -1.414f)
                lineToRelative(7.071f, -7.07f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
