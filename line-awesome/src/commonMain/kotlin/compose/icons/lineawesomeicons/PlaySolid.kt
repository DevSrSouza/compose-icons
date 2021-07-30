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

public val LineAwesomeIcons.PlaySolid: ImageVector
    get() {
        if (_playSolid != null) {
            return _playSolid!!
        }
        _playSolid = Builder(name = "PlaySolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.1563f)
                lineTo(9.0f, 26.8438f)
                lineTo(10.5313f, 25.8438f)
                lineTo(25.8438f, 16.0f)
                lineTo(10.5313f, 6.1563f)
                close()
                moveTo(11.0f, 8.8125f)
                lineTo(22.1563f, 16.0f)
                lineTo(11.0f, 23.1875f)
                close()
            }
        }
        .build()
        return _playSolid!!
    }

private var _playSolid: ImageVector? = null
