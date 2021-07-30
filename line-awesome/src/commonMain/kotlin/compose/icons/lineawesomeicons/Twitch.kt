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

public val LineAwesomeIcons.Twitch: ImageVector
    get() {
        if (_twitch != null) {
            return _twitch!!
        }
        _twitch = Builder(name = "Twitch", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 5.0f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 25.0f)
                lineTo(10.5f, 25.0f)
                lineTo(10.5f, 28.0f)
                lineTo(13.5f, 28.0f)
                lineTo(16.5f, 25.0f)
                lineTo(21.0f, 25.0f)
                lineTo(27.0f, 19.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(9.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 18.0f)
                lineTo(22.0f, 21.0f)
                lineTo(16.0f, 21.0f)
                lineTo(13.0f, 24.0f)
                lineTo(13.0f, 21.0f)
                lineTo(9.0f, 21.0f)
                close()
                moveTo(14.0f, 11.0f)
                lineTo(14.0f, 17.0f)
                lineTo(16.0f, 17.0f)
                lineTo(16.0f, 11.0f)
                close()
                moveTo(19.0f, 11.0f)
                lineTo(19.0f, 17.0f)
                lineTo(21.0f, 17.0f)
                lineTo(21.0f, 11.0f)
                close()
            }
        }
        .build()
        return _twitch!!
    }

private var _twitch: ImageVector? = null
