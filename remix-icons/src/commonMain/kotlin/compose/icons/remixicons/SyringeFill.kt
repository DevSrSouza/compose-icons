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

public val RemixIcons.SyringeFill: ImageVector
    get() {
        if (_syringeFill != null) {
            return _syringeFill!!
        }
        _syringeFill = Builder(name = "SyringeFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(9.657f, 14.342f)
                lineToRelative(-2.829f, -2.828f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.829f, 2.828f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(12.485f, 11.514f)
                lineTo(9.657f, 8.686f)
                lineToRelative(-1.414f, 1.415f)
                lineToRelative(2.828f, 2.828f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _syringeFill!!
    }

private var _syringeFill: ImageVector? = null
