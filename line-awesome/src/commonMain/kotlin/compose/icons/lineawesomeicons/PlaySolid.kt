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
                moveTo(9.0f, 5.156f)
                lineTo(9.0f, 26.844f)
                lineTo(10.531f, 25.844f)
                lineTo(25.844f, 16.0f)
                lineTo(10.531f, 6.156f)
                close()
                moveTo(11.0f, 8.813f)
                lineTo(22.156f, 16.0f)
                lineTo(11.0f, 23.188f)
                close()
            }
        }
        .build()
        return _playSolid!!
    }

private var _playSolid: ImageVector? = null
