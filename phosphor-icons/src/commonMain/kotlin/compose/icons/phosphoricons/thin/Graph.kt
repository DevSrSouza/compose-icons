package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Graph: ImageVector
    get() {
        if (_graph != null) {
            return _graph!!
        }
        _graph = Builder(name = "Graph", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 156.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -19.4f, 7.8f)
                lineToRelative(-28.3f, -22.0f)
                arcTo(26.9f, 26.9f, 0.0f, false, false, 156.0f, 128.0f)
                arcToRelative(27.3f, 27.3f, 0.0f, false, false, -0.5f, -5.0f)
                lineToRelative(19.5f, -6.4f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -3.0f, -12.6f)
                arcToRelative(27.3f, 27.3f, 0.0f, false, false, 0.5f, 5.0f)
                lineTo(153.0f, 115.4f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 128.0f, 100.0f)
                arcToRelative(27.4f, 27.4f, 0.0f, false, false, -7.6f, 1.1f)
                lineToRelative(-9.5f, -21.4f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 96.0f, 84.0f)
                arcToRelative(27.4f, 27.4f, 0.0f, false, false, 7.6f, -1.1f)
                lineToRelative(9.5f, 21.4f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -8.5f, 39.1f)
                lineTo(74.0f, 170.6f)
                arcTo(27.6f, 27.6f, 0.0f, false, false, 56.0f, 164.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 23.4f, 12.6f)
                lineTo(110.0f, 149.4f)
                arcToRelative(27.6f, 27.6f, 0.0f, false, false, 18.0f, 6.6f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 19.4f, -7.8f)
                lineToRelative(28.3f, 22.0f)
                arcTo(26.9f, 26.9f, 0.0f, false, false, 172.0f, 184.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, -28.0f)
                close()
                moveTo(200.0f, 84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 200.0f, 84.0f)
                close()
                moveTo(76.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 96.0f, 76.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 76.0f, 56.0f)
                close()
                moveTo(56.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 56.0f, 212.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 128.0f, 148.0f)
                close()
                moveTo(200.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 200.0f, 204.0f)
                close()
            }
        }
        .build()
        return _graph!!
    }

private var _graph: ImageVector? = null
