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

public val RemixIcons.LinksLine: ImageVector
    get() {
        if (_linksLine != null) {
            return _linksLine!!
        }
        _linksLine = Builder(name = "LinksLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.06f, 8.11f)
                lineToRelative(1.415f, 1.415f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, 9.9f)
                lineToRelative(-0.354f, 0.353f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -9.9f, -9.9f)
                lineToRelative(1.415f, 1.415f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 7.071f, 7.071f)
                lineToRelative(0.354f, -0.354f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, -7.07f)
                lineToRelative(-1.415f, -1.415f)
                lineToRelative(1.415f, -1.414f)
                close()
                moveTo(19.778f, 14.121f)
                lineToRelative(-1.414f, -1.414f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -7.071f, -7.071f)
                lineToRelative(-0.354f, 0.354f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, 7.07f)
                lineToRelative(1.415f, 1.415f)
                lineToRelative(-1.415f, 1.414f)
                lineToRelative(-1.414f, -1.414f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, -9.9f)
                lineToRelative(0.354f, -0.353f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 9.9f, 9.9f)
                close()
            }
        }
        .build()
        return _linksLine!!
    }

private var _linksLine: ImageVector? = null
