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

public val BoldGroup.Graph: ImageVector
    get() {
        if (_graph != null) {
            return _graph!!
        }
        _graph = Builder(name = "Graph", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 152.0f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, -18.4f, 5.1f)
                lineToRelative(-19.8f, -16.6f)
                arcTo(36.9f, 36.9f, 0.0f, false, false, 164.0f, 128.0f)
                verticalLineToRelative(-1.1f)
                lineToRelative(8.7f, -3.4f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 164.0f, 100.0f)
                verticalLineToRelative(1.1f)
                lineToRelative(-8.7f, 3.4f)
                arcTo(36.2f, 36.2f, 0.0f, false, false, 128.0f, 92.0f)
                horizontalLineToRelative(-2.8f)
                lineToRelative(-4.5f, -10.0f)
                arcTo(35.5f, 35.5f, 0.0f, false, false, 132.0f, 56.0f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 96.0f, 92.0f)
                horizontalLineToRelative(2.8f)
                lineToRelative(4.5f, 10.0f)
                arcTo(35.5f, 35.5f, 0.0f, false, false, 92.0f, 128.0f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, false, 2.7f, 13.6f)
                lineTo(73.4f, 160.5f)
                arcTo(35.5f, 35.5f, 0.0f, false, false, 56.0f, 156.0f)
                arcToRelative(36.1f, 36.1f, 0.0f, true, false, 33.3f, 22.4f)
                lineToRelative(21.3f, -18.9f)
                arcTo(35.5f, 35.5f, 0.0f, false, false, 128.0f, 164.0f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, 18.4f, -5.1f)
                lineToRelative(19.8f, 16.6f)
                arcTo(36.9f, 36.9f, 0.0f, false, false, 164.0f, 188.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, -36.0f)
                close()
                moveTo(200.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 88.0f)
                close()
                moveTo(84.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 96.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 56.0f)
                close()
                moveTo(56.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 204.0f)
                close()
                moveTo(116.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 128.0f)
                close()
                moveTo(200.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 200.0f)
                close()
            }
        }
        .build()
        return _graph!!
    }

private var _graph: ImageVector? = null
