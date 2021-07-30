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

public val LineAwesomeIcons.SortDownSolid: ImageVector
    get() {
        if (_sortDownSolid != null) {
            return _sortDownSolid!!
        }
        _sortDownSolid = Builder(name = "SortDownSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5938f, 12.0f)
                lineTo(5.2813f, 13.7188f)
                lineTo(15.2813f, 23.7188f)
                lineTo(16.0f, 24.4063f)
                lineTo(16.7188f, 23.7188f)
                lineTo(26.7188f, 13.7188f)
                lineTo(28.4063f, 12.0f)
                close()
                moveTo(8.4375f, 14.0f)
                lineTo(23.5625f, 14.0f)
                lineTo(16.0f, 21.5625f)
                close()
            }
        }
        .build()
        return _sortDownSolid!!
    }

private var _sortDownSolid: ImageVector? = null
