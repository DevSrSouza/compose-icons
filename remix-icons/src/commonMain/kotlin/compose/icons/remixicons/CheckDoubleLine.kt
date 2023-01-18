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

public val RemixIcons.CheckDoubleLine: ImageVector
    get() {
        if (_checkDoubleLine != null) {
            return _checkDoubleLine!!
        }
        _checkDoubleLine = Builder(name = "CheckDoubleLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.602f, 13.76f)
                lineToRelative(1.412f, 1.412f)
                lineToRelative(8.466f, -8.466f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-9.88f, 9.88f)
                lineToRelative(-6.364f, -6.364f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.125f, 2.125f)
                lineToRelative(1.413f, 1.412f)
                close()
                moveTo(11.604f, 10.932f)
                lineToRelative(4.952f, -4.953f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-4.952f, 4.953f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(8.777f, 16.587f)
                lineTo(7.364f, 18.0f)
                lineTo(1.0f, 11.636f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.413f, 1.413f)
                lineToRelative(-0.001f, 0.001f)
                lineToRelative(4.951f, 4.951f)
                close()
            }
        }
        .build()
        return _checkDoubleLine!!
    }

private var _checkDoubleLine: ImageVector? = null
