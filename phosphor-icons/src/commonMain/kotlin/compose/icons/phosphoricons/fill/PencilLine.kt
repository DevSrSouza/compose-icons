package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.PencilLine: ImageVector
    get() {
        if (_pencilLine != null) {
            return _pencilLine!!
        }
        _pencilLine = Builder(name = "PencilLine", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 76.7f)
                lineTo(179.3f, 32.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -22.6f, 0.0f)
                lineTo(36.7f, 152.0f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, -3.6f, 5.5f)
                lineToRelative(-0.2f, 0.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -0.9f, 5.3f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(115.3f, 208.0f)
                lineTo(224.0f, 99.3f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 224.0f, 76.7f)
                close()
                moveTo(144.0f, 67.3f)
                lineTo(160.7f, 84.0f)
                lineTo(68.0f, 176.7f)
                lineTo(51.3f, 160.0f)
                close()
                moveTo(48.0f, 208.0f)
                lineTo(48.0f, 179.3f)
                lineTo(76.7f, 208.0f)
                close()
                moveTo(96.0f, 204.7f)
                lineTo(79.3f, 188.0f)
                lineTo(172.0f, 95.3f)
                lineTo(188.7f, 112.0f)
                close()
            }
        }
        .build()
        return _pencilLine!!
    }

private var _pencilLine: ImageVector? = null
