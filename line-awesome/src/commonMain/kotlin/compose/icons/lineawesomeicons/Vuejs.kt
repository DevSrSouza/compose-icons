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

public val LineAwesomeIcons.Vuejs: ImageVector
    get() {
        if (_vuejs != null) {
            return _vuejs!!
        }
        _vuejs = Builder(name = "Vuejs", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                lineTo(16.0f, 28.0f)
                lineTo(29.0f, 6.0f)
                lineTo(19.0f, 6.0f)
                lineTo(16.0f, 11.3008f)
                lineTo(13.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                close()
                moveTo(6.5f, 8.0f)
                lineTo(10.2715f, 8.0f)
                lineTo(16.0f, 18.0f)
                lineTo(21.7285f, 8.0f)
                lineTo(25.5f, 8.0f)
                lineTo(16.0f, 24.0996f)
                lineTo(6.5f, 8.0f)
                close()
            }
        }
        .build()
        return _vuejs!!
    }

private var _vuejs: ImageVector? = null
