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

public val LineAwesomeIcons.Elementor: ImageVector
    get() {
        if (_elementor != null) {
            return _elementor!!
        }
        _elementor = Builder(name = "Elementor", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(11.0f, 11.0f)
                lineTo(11.0f, 21.0f)
                lineTo(13.0f, 21.0f)
                lineTo(13.0f, 11.0f)
                lineTo(11.0f, 11.0f)
                close()
                moveTo(15.0f, 11.0f)
                lineTo(15.0f, 13.0f)
                lineTo(21.0f, 13.0f)
                lineTo(21.0f, 11.0f)
                lineTo(15.0f, 11.0f)
                close()
                moveTo(15.0f, 15.0f)
                lineTo(15.0f, 17.0f)
                lineTo(21.0f, 17.0f)
                lineTo(21.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                close()
                moveTo(15.0f, 19.0f)
                lineTo(15.0f, 21.0f)
                lineTo(21.0f, 21.0f)
                lineTo(21.0f, 19.0f)
                lineTo(15.0f, 19.0f)
                close()
            }
        }
        .build()
        return _elementor!!
    }

private var _elementor: ImageVector? = null
