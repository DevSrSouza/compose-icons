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

public val LightGroup.Graph: ImageVector
    get() {
        if (_graph != null) {
            return _graph!!
        }
        _graph = Builder(name = "Graph", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 154.0f)
                arcToRelative(29.8f, 29.8f, 0.0f, false, false, -19.5f, 7.2f)
                lineToRelative(-25.6f, -19.9f)
                arcTo(29.6f, 29.6f, 0.0f, false, false, 158.0f, 128.0f)
                curveToRelative(0.0f, -1.2f, -0.1f, -2.4f, -0.2f, -3.6f)
                lineTo(174.0f, 119.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -4.0f, -15.0f)
                curveToRelative(0.0f, 1.2f, 0.1f, 2.4f, 0.2f, 3.6f)
                lineTo(154.0f, 113.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -26.0f, -15.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -6.5f, 0.7f)
                lineToRelative(-8.1f, -18.3f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 96.0f, 86.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 6.5f, -0.7f)
                lineToRelative(8.1f, 18.3f)
                arcTo(29.9f, 29.9f, 0.0f, false, false, 98.0f, 128.0f)
                arcToRelative(29.3f, 29.3f, 0.0f, false, false, 4.1f, 15.0f)
                lineTo(74.0f, 168.0f)
                arcToRelative(29.7f, 29.7f, 0.0f, false, false, -18.0f, -6.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 30.0f, 30.0f)
                arcToRelative(29.3f, 29.3f, 0.0f, false, false, -4.1f, -15.0f)
                lineTo(110.0f, 152.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 37.5f, -1.2f)
                lineToRelative(25.6f, 19.9f)
                arcTo(29.6f, 29.6f, 0.0f, false, false, 170.0f, 184.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 30.0f, -30.0f)
                close()
                moveTo(200.0f, 86.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 200.0f, 86.0f)
                close()
                moveTo(78.0f, 56.0f)
                arcTo(18.0f, 18.0f, 0.0f, true, true, 96.0f, 74.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 78.0f, 56.0f)
                close()
                moveTo(56.0f, 210.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 56.0f, 210.0f)
                close()
                moveTo(128.0f, 146.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 128.0f, 146.0f)
                close()
                moveTo(200.0f, 202.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 200.0f, 202.0f)
                close()
            }
        }
        .build()
        return _graph!!
    }

private var _graph: ImageVector? = null
