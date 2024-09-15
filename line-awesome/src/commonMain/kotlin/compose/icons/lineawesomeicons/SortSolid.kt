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
                moveTo(16.0f, 3.594f)
                lineTo(15.281f, 4.281f)
                lineTo(7.281f, 12.281f)
                lineTo(5.594f, 14.0f)
                lineTo(26.406f, 14.0f)
                lineTo(24.719f, 12.281f)
                lineTo(16.719f, 4.281f)
                close()
                moveTo(16.0f, 6.438f)
                lineTo(21.563f, 12.0f)
                lineTo(10.438f, 12.0f)
                close()
                moveTo(5.594f, 18.0f)
                lineTo(7.281f, 19.719f)
                lineTo(15.281f, 27.719f)
                lineTo(16.0f, 28.406f)
                lineTo(16.719f, 27.719f)
                lineTo(24.719f, 19.719f)
                lineTo(26.406f, 18.0f)
                close()
                moveTo(10.438f, 20.0f)
                lineTo(21.563f, 20.0f)
                lineTo(16.0f, 25.563f)
                close()
            }
        }
        .build()
        return _sortSolid!!
    }

private var _sortSolid: ImageVector? = null
