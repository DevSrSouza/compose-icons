package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Patreon: ImageVector
    get() {
        if (_patreon != null) {
            return _patreon!!
        }
        _patreon = Builder(name = "Patreon", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                lineTo(4.0f, 28.0f)
                lineTo(11.0f, 28.0f)
                lineTo(11.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                close()
                moveTo(21.5f, 4.0f)
                curveTo(16.813f, 4.0f, 13.0f, 7.813f, 13.0f, 12.5f)
                curveTo(13.0f, 17.187f, 16.813f, 21.0f, 21.5f, 21.0f)
                curveTo(26.187f, 21.0f, 30.0f, 17.187f, 30.0f, 12.5f)
                curveTo(30.0f, 7.813f, 26.187f, 4.0f, 21.5f, 4.0f)
                close()
                moveTo(6.0f, 6.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(21.5f, 6.0f)
                curveTo(25.084f, 6.0f, 28.0f, 8.916f, 28.0f, 12.5f)
                curveTo(28.0f, 16.084f, 25.084f, 19.0f, 21.5f, 19.0f)
                curveTo(17.916f, 19.0f, 15.0f, 16.084f, 15.0f, 12.5f)
                curveTo(15.0f, 8.916f, 17.916f, 6.0f, 21.5f, 6.0f)
                close()
            }
        }
        .build()
        return _patreon!!
    }

private var _patreon: ImageVector? = null
