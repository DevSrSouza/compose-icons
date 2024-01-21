package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.SortAsc16: ImageVector
    get() {
        if (_sortAsc16 != null) {
            return _sortAsc16!!
        }
        _sortAsc16 = Builder(name = "SortAsc16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.927f, 2.573f)
                lineToRelative(3.0f, 3.0f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 15.75f, 6.0f)
                lineTo(13.5f, 6.0f)
                verticalLineToRelative(6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(12.0f, 6.0f)
                lineTo(9.75f, 6.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.177f, -0.427f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.354f, 0.0f)
                close()
                moveTo(0.0f, 12.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(0.75f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(0.0f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(0.75f, 9.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 0.0f, 8.25f)
                close()
                moveTo(0.0f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(0.75f, 5.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 0.0f, 4.25f)
                close()
            }
        }
        .build()
        return _sortAsc16!!
    }

private var _sortAsc16: ImageVector? = null
