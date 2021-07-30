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

public val LineAwesomeIcons.DiceSixSolid: ImageVector
    get() {
        if (_diceSixSolid != null) {
            return _diceSixSolid!!
        }
        _diceSixSolid = Builder(name = "DiceSixSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(11.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 8.0f)
                close()
                moveTo(21.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 8.0f)
                close()
                moveTo(11.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 14.0f)
                close()
                moveTo(21.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 14.0f)
                close()
                moveTo(11.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 24.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 20.0f)
                close()
                moveTo(21.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 24.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 20.0f)
                close()
            }
        }
        .build()
        return _diceSixSolid!!
    }

private var _diceSixSolid: ImageVector? = null
