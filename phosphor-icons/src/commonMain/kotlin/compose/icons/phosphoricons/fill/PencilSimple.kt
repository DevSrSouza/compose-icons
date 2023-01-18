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

public val FillGroup.PencilSimple: ImageVector
    get() {
        if (_pencilSimple != null) {
            return _pencilSimple!!
        }
        _pencilSimple = Builder(name = "PencilSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 76.7f)
                lineTo(179.7f, 32.3f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, false, -11.3f, -5.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 156.7f, 32.0f)
                lineTo(130.3f, 58.3f)
                horizontalLineToRelative(0.0f)
                lineTo(36.7f, 152.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 32.0f, 163.3f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(92.7f, 224.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 11.3f, -4.7f)
                lineToRelative(120.0f, -120.0f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 224.0f, 76.7f)
                close()
                moveTo(192.0f, 108.7f)
                lineTo(147.3f, 64.0f)
                lineTo(168.0f, 43.3f)
                lineTo(212.7f, 88.0f)
                close()
            }
        }
        .build()
        return _pencilSimple!!
    }

private var _pencilSimple: ImageVector? = null
