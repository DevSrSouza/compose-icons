package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.SortAscending: ImageVector
    get() {
        if (_sortAscending != null) {
            return _sortAscending!!
        }
        _sortAscending = Builder(name = "SortAscending", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.5f, 176.5f)
                lineToRelative(-40.0f, 40.0f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.8f, 0.7f)
                lineToRelative(-0.4f, 0.3f)
                lineToRelative(-0.5f, 0.4f)
                lineToRelative(-0.6f, 0.3f)
                lineToRelative(-0.4f, 0.3f)
                lineToRelative(-0.6f, 0.2f)
                lineToRelative(-0.5f, 0.3f)
                lineToRelative(-0.5f, 0.2f)
                lineToRelative(-0.6f, 0.2f)
                horizontalLineToRelative(-0.6f)
                lineToRelative(-0.6f, 0.2f)
                horizontalLineToRelative(-4.6f)
                lineToRelative(-0.6f, -0.2f)
                horizontalLineToRelative(-0.6f)
                lineToRelative(-0.6f, -0.2f)
                lineToRelative(-0.5f, -0.2f)
                lineToRelative(-0.5f, -0.3f)
                lineToRelative(-0.6f, -0.2f)
                lineToRelative(-0.4f, -0.3f)
                lineToRelative(-0.6f, -0.3f)
                lineToRelative(-0.5f, -0.4f)
                lineToRelative(-0.4f, -0.3f)
                lineToRelative(-0.8f, -0.8f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-40.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(172.0f, 179.0f)
                lineTo(172.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(67.0f)
                lineToRelative(19.5f, -19.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
                moveTo(120.0f, 116.0f)
                lineTo(48.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(48.0f, 76.0f)
                lineTo(184.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(48.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(104.0f, 180.0f)
                lineTo(48.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _sortAscending!!
    }

private var _sortAscending: ImageVector? = null
