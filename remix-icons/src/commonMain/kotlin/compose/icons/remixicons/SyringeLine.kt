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

public val RemixIcons.SyringeLine: ImageVector
    get() {
        if (_syringeLine != null) {
            return _syringeLine!!
        }
        _syringeLine = Builder(name = "SyringeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.678f, 7.98f)
                lineToRelative(-1.415f, 1.413f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.122f, 2.12f)
                lineToRelative(3.535f, 3.536f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(11.071f, 20.0f)
                lineTo(5.414f, 20.0f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(4.0f, 18.586f)
                verticalLineToRelative(-5.657f)
                lineToRelative(6.364f, -6.364f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.536f, 3.535f)
                lineToRelative(2.12f, -2.121f)
                lineToRelative(-2.12f, -2.121f)
                lineToRelative(1.414f, -1.415f)
                lineToRelative(5.657f, 5.657f)
                close()
                moveTo(16.021f, 12.222f)
                lineToRelative(-4.243f, -4.243f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.121f, 2.122f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.12f, 2.121f)
                lineToRelative(-1.413f, 1.414f)
                lineToRelative(-2.122f, -2.121f)
                lineToRelative(-0.121f, 0.121f)
                lineTo(6.0f, 18.0f)
                horizontalLineToRelative(4.243f)
                lineToRelative(5.778f, -5.778f)
                close()
            }
        }
        .build()
        return _syringeLine!!
    }

private var _syringeLine: ImageVector? = null
