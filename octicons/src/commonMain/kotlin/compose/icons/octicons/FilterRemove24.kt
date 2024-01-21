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

public val Octicons.FilterRemove24: ImageVector
    get() {
        if (_filterRemove24 != null) {
            return _filterRemove24!!
        }
        _filterRemove24 = Builder(name = "FilterRemove24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.587f, 9.273f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.061f, -1.061f)
                lineToRelative(-1.591f, -1.591f)
                lineToRelative(1.591f, -1.591f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -1.061f, -1.06f)
                lineToRelative(-1.591f, 1.591f)
                lineToRelative(-1.591f, -1.591f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.591f, 1.591f)
                lineToRelative(-1.591f, 1.591f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.061f)
                lineToRelative(1.591f, -1.591f)
                lineToRelative(1.591f, 1.591f)
                close()
                moveTo(1.75f, 6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(14.5f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(1.75f, 6.0f)
                close()
                moveTo(5.0f, 11.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(5.75f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(9.0f, 16.688f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        .build()
        return _filterRemove24!!
    }

private var _filterRemove24: ImageVector? = null
