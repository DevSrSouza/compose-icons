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

public val LineAwesomeIcons.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                lineTo(7.0f, 28.0f)
                lineTo(8.5938f, 26.8125f)
                lineTo(16.0f, 21.25f)
                lineTo(23.4063f, 26.8125f)
                lineTo(25.0f, 28.0f)
                lineTo(25.0f, 5.0f)
                close()
                moveTo(9.0f, 7.0f)
                lineTo(23.0f, 7.0f)
                lineTo(23.0f, 24.0f)
                lineTo(16.5938f, 19.1875f)
                lineTo(16.0f, 18.75f)
                lineTo(15.4063f, 19.1875f)
                lineTo(9.0f, 24.0f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
