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

public val RemixIcons.Settings6Fill: ImageVector
    get() {
        if (_settings6Fill != null) {
            return _settings6Fill!!
        }
        _settings6Fill = Builder(name = "Settings6Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 2.474f)
                lineTo(23.0f, 12.0f)
                lineToRelative(-5.5f, 9.526f)
                horizontalLineToRelative(-11.0f)
                lineTo(1.0f, 12.0f)
                lineToRelative(5.5f, -9.526f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(8.634f, 8.17f)
                lineToRelative(5.0f, 8.66f)
                lineToRelative(1.732f, -1.0f)
                lineToRelative(-5.0f, -8.66f)
                lineToRelative(-1.732f, 1.0f)
                close()
            }
        }
        .build()
        return _settings6Fill!!
    }

private var _settings6Fill: ImageVector? = null
