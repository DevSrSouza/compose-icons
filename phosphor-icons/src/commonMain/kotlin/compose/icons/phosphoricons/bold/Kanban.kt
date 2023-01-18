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

public val BoldGroup.Kanban: ImageVector
    get() {
        if (_kanban != null) {
            return _kanban!!
        }
        _kanban = Builder(name = "Kanban", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(88.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(108.0f, 164.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(204.0f, 108.0f)
                lineTo(172.0f, 108.0f)
                lineTo(172.0f, 68.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(84.0f, 68.0f)
                verticalLineToRelative(40.0f)
                lineTo(52.0f, 108.0f)
                lineTo(52.0f, 68.0f)
                close()
                moveTo(84.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 132.0f)
                lineTo(84.0f, 132.0f)
                close()
                moveTo(108.0f, 140.0f)
                lineTo(108.0f, 68.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(72.0f)
                close()
                moveTo(172.0f, 172.0f)
                lineTo(172.0f, 132.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(40.0f)
                close()
            }
        }
        .build()
        return _kanban!!
    }

private var _kanban: ImageVector? = null
