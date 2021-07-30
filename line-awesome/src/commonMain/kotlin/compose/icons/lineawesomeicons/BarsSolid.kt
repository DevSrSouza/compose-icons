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

public val LineAwesomeIcons.BarsSolid: ImageVector
    get() {
        if (_barsSolid != null) {
            return _barsSolid!!
        }
        _barsSolid = Builder(name = "BarsSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 7.0f)
                lineTo(4.0f, 9.0f)
                lineTo(28.0f, 9.0f)
                lineTo(28.0f, 7.0f)
                close()
                moveTo(4.0f, 15.0f)
                lineTo(4.0f, 17.0f)
                lineTo(28.0f, 17.0f)
                lineTo(28.0f, 15.0f)
                close()
                moveTo(4.0f, 23.0f)
                lineTo(4.0f, 25.0f)
                lineTo(28.0f, 25.0f)
                lineTo(28.0f, 23.0f)
                close()
            }
        }
        .build()
        return _barsSolid!!
    }

private var _barsSolid: ImageVector? = null
