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

public val FillGroup.ArrowLineUpLeft: ImageVector
    get() {
        if (_arrowLineUpLeft != null) {
            return _arrowLineUpLeft!!
        }
        _arrowLineUpLeft = Builder(name = "ArrowLineUpLeft", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 156.0f)
                lineTo(56.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(164.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.4f, 4.9f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -1.7f, 8.8f)
                lineTo(125.3f, 106.0f)
                lineToRelative(56.4f, 56.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineTo(114.0f, 117.3f)
                lineTo(69.7f, 161.7f)
                arcTo(8.3f, 8.3f, 0.0f, false, true, 64.0f, 164.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -3.1f, -0.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 156.0f)
                close()
                moveTo(216.0f, 208.0f)
                lineTo(40.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(216.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _arrowLineUpLeft!!
    }

private var _arrowLineUpLeft: ImageVector? = null
