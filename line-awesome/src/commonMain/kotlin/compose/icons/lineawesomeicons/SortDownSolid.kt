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
                moveTo(3.594f, 12.0f)
                lineTo(5.281f, 13.719f)
                lineTo(15.281f, 23.719f)
                lineTo(16.0f, 24.406f)
                lineTo(16.719f, 23.719f)
                lineTo(26.719f, 13.719f)
                lineTo(28.406f, 12.0f)
                close()
                moveTo(8.438f, 14.0f)
                lineTo(23.563f, 14.0f)
                lineTo(16.0f, 21.563f)
                close()
            }
        }
        .build()
        return _sortDownSolid!!
    }

private var _sortDownSolid: ImageVector? = null
