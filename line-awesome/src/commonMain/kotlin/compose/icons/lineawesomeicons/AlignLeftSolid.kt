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

public val LineAwesomeIcons.AlignLeftSolid: ImageVector
    get() {
        if (_alignLeftSolid != null) {
            return _alignLeftSolid!!
        }
        _alignLeftSolid = Builder(name = "AlignLeftSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                lineTo(3.0f, 9.0f)
                lineTo(29.0f, 9.0f)
                lineTo(29.0f, 7.0f)
                close()
                moveTo(3.0f, 11.0f)
                lineTo(3.0f, 13.0f)
                lineTo(21.0f, 13.0f)
                lineTo(21.0f, 11.0f)
                close()
                moveTo(3.0f, 15.0f)
                lineTo(3.0f, 17.0f)
                lineTo(29.0f, 17.0f)
                lineTo(29.0f, 15.0f)
                close()
                moveTo(3.0f, 19.0f)
                lineTo(3.0f, 21.0f)
                lineTo(21.0f, 21.0f)
                lineTo(21.0f, 19.0f)
                close()
                moveTo(3.0f, 23.0f)
                lineTo(3.0f, 25.0f)
                lineTo(29.0f, 25.0f)
                lineTo(29.0f, 23.0f)
                close()
            }
        }
        .build()
        return _alignLeftSolid!!
    }

private var _alignLeftSolid: ImageVector? = null
