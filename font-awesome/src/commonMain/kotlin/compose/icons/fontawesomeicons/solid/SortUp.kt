package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.SortUp: ImageVector
    get() {
        if (_sortUp != null) {
            return _sortUp!!
        }
        _sortUp = Builder(name = "SortUp", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(279.0f, 224.0f)
                horizontalLineTo(41.0f)
                curveToRelative(-21.4f, 0.0f, -32.1f, -25.9f, -17.0f, -41.0f)
                lineTo(143.0f, 64.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(119.0f, 119.0f)
                curveToRelative(15.2f, 15.1f, 4.5f, 41.0f, -16.9f, 41.0f)
                close()
            }
        }
        .build()
        return _sortUp!!
    }

private var _sortUp: ImageVector? = null
