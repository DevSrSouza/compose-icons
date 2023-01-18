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

public val RemixIcons.PushpinFill: ImageVector
    get() {
        if (_pushpinFill != null) {
            return _pushpinFill!!
        }
        _pushpinFill = Builder(name = "PushpinFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.314f, 10.172f)
                lineToRelative(-1.415f, 1.414f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-4.242f, 4.242f)
                lineToRelative(-0.707f, 3.536f)
                lineToRelative(-1.415f, 1.414f)
                lineToRelative(-4.242f, -4.243f)
                lineToRelative(-4.95f, 4.95f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(4.95f, -4.95f)
                lineToRelative(-4.243f, -4.242f)
                lineToRelative(1.414f, -1.415f)
                lineTo(8.88f, 8.05f)
                lineToRelative(4.242f, -4.242f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(1.414f, -1.415f)
                close()
            }
        }
        .build()
        return _pushpinFill!!
    }

private var _pushpinFill: ImageVector? = null
