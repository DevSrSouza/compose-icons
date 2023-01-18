package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.SortAscending: ImageVector
    get() {
        if (_sortAscending != null) {
            return _sortAscending!!
        }
        _sortAscending = Builder(name = "SortAscending", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.2f, 172.3f)
                lineToRelative(-40.0f, 39.9f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, -0.9f, 0.8f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-1.0f, 0.5f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-1.0f, 0.3f)
                horizontalLineToRelative(-2.4f)
                lineToRelative(-1.0f, -0.3f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-1.0f, -0.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, -0.9f, -0.8f)
                lineToRelative(-40.0f, -40.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                lineTo(178.0f, 193.5f)
                lineTo(178.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(81.5f)
                lineToRelative(29.8f, -29.7f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 8.4f, 0.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 228.2f, 172.3f)
                close()
                moveTo(120.0f, 122.0f)
                lineTo(48.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(48.0f, 70.0f)
                lineTo(184.0f, 70.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(48.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(104.0f, 186.0f)
                lineTo(48.0f, 186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _sortAscending!!
    }

private var _sortAscending: ImageVector? = null
