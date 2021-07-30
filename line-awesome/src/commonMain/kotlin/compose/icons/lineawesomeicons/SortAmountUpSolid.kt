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

public val LineAwesomeIcons.SortAmountUpSolid: ImageVector
    get() {
        if (_sortAmountUpSolid != null) {
            return _sortAmountUpSolid!!
        }
        _sortAmountUpSolid = Builder(name = "SortAmountUpSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                lineTo(4.0f, 7.0f)
                lineTo(16.0f, 7.0f)
                lineTo(16.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                close()
                moveTo(22.0f, 5.5f)
                lineTo(21.2793f, 6.1895f)
                lineTo(17.0f, 10.5f)
                lineTo(18.4102f, 11.9102f)
                lineTo(21.0f, 9.3105f)
                lineTo(21.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                lineTo(23.0f, 9.3105f)
                lineTo(25.5898f, 11.9102f)
                lineTo(27.0f, 10.5f)
                lineTo(22.7207f, 6.1895f)
                lineTo(22.0f, 5.5f)
                close()
                moveTo(4.0f, 9.0f)
                lineTo(4.0f, 11.0f)
                lineTo(14.0f, 11.0f)
                lineTo(14.0f, 9.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(4.0f, 13.0f)
                lineTo(4.0f, 15.0f)
                lineTo(12.0f, 15.0f)
                lineTo(12.0f, 13.0f)
                lineTo(4.0f, 13.0f)
                close()
                moveTo(4.0f, 17.0f)
                lineTo(4.0f, 19.0f)
                lineTo(10.0f, 19.0f)
                lineTo(10.0f, 17.0f)
                lineTo(4.0f, 17.0f)
                close()
                moveTo(4.0f, 21.0f)
                lineTo(4.0f, 23.0f)
                lineTo(8.0f, 23.0f)
                lineTo(8.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                close()
                moveTo(4.0f, 25.0f)
                lineTo(4.0f, 27.0f)
                lineTo(6.0f, 27.0f)
                lineTo(6.0f, 25.0f)
                lineTo(4.0f, 25.0f)
                close()
            }
        }
        .build()
        return _sortAmountUpSolid!!
    }

private var _sortAmountUpSolid: ImageVector? = null
