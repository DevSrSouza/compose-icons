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

public val LineAwesomeIcons.SortAmountDownSolid: ImageVector
    get() {
        if (_sortAmountDownSolid != null) {
            return _sortAmountDownSolid!!
        }
        _sortAmountDownSolid = Builder(name = "SortAmountDownSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                lineTo(4.0f, 7.0f)
                lineTo(16.0f, 7.0f)
                lineTo(16.0f, 5.0f)
                close()
                moveTo(21.0f, 5.0f)
                lineTo(21.0f, 23.688f)
                lineTo(18.406f, 21.094f)
                lineTo(17.0f, 22.5f)
                lineTo(21.281f, 26.813f)
                lineTo(22.0f, 27.5f)
                lineTo(22.719f, 26.813f)
                lineTo(27.0f, 22.5f)
                lineTo(25.594f, 21.094f)
                lineTo(23.0f, 23.688f)
                lineTo(23.0f, 5.0f)
                close()
                moveTo(4.0f, 9.0f)
                lineTo(4.0f, 11.0f)
                lineTo(14.0f, 11.0f)
                lineTo(14.0f, 9.0f)
                close()
                moveTo(4.0f, 13.0f)
                lineTo(4.0f, 15.0f)
                lineTo(12.0f, 15.0f)
                lineTo(12.0f, 13.0f)
                close()
                moveTo(4.0f, 17.0f)
                lineTo(4.0f, 19.0f)
                lineTo(10.0f, 19.0f)
                lineTo(10.0f, 17.0f)
                close()
                moveTo(4.0f, 21.0f)
                lineTo(4.0f, 23.0f)
                lineTo(8.0f, 23.0f)
                lineTo(8.0f, 21.0f)
                close()
                moveTo(4.0f, 25.0f)
                lineTo(4.0f, 27.0f)
                lineTo(6.0f, 27.0f)
                lineTo(6.0f, 25.0f)
                close()
            }
        }
        .build()
        return _sortAmountDownSolid!!
    }

private var _sortAmountDownSolid: ImageVector? = null
