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

public val LineAwesomeIcons.SortSolid: ImageVector
    get() {
        if (_sortSolid != null) {
            return _sortSolid!!
        }
        _sortSolid = Builder(name = "SortSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.5938f)
                lineTo(15.2813f, 4.2813f)
                lineTo(7.2813f, 12.2813f)
                lineTo(5.5938f, 14.0f)
                lineTo(26.4063f, 14.0f)
                lineTo(24.7188f, 12.2813f)
                lineTo(16.7188f, 4.2813f)
                close()
                moveTo(16.0f, 6.4375f)
                lineTo(21.5625f, 12.0f)
                lineTo(10.4375f, 12.0f)
                close()
                moveTo(5.5938f, 18.0f)
                lineTo(7.2813f, 19.7188f)
                lineTo(15.2813f, 27.7188f)
                lineTo(16.0f, 28.4063f)
                lineTo(16.7188f, 27.7188f)
                lineTo(24.7188f, 19.7188f)
                lineTo(26.4063f, 18.0f)
                close()
                moveTo(10.4375f, 20.0f)
                lineTo(21.5625f, 20.0f)
                lineTo(16.0f, 25.5625f)
                close()
            }
        }
        .build()
        return _sortSolid!!
    }

private var _sortSolid: ImageVector? = null
