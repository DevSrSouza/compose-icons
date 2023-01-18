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

public val FillGroup.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.4f, 132.8f)
                arcToRelative(56.9f, 56.9f, 0.0f, false, false, -11.5f, -4.8f)
                arcToRelative(56.9f, 56.9f, 0.0f, false, false, 11.5f, -4.8f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -62.4f)
                arcToRelative(58.7f, 58.7f, 0.0f, false, false, -9.9f, 7.5f)
                arcTo(58.6f, 58.6f, 0.0f, false, false, 164.0f, 56.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -72.0f, 0.0f)
                arcToRelative(58.6f, 58.6f, 0.0f, false, false, 1.5f, 12.3f)
                arcToRelative(58.7f, 58.7f, 0.0f, false, false, -9.9f, -7.5f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 62.4f)
                arcTo(56.9f, 56.9f, 0.0f, false, false, 59.1f, 128.0f)
                arcToRelative(56.9f, 56.9f, 0.0f, false, false, -11.5f, 4.8f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 62.4f)
                arcToRelative(58.7f, 58.7f, 0.0f, false, false, 9.9f, -7.5f)
                arcTo(58.6f, 58.6f, 0.0f, false, false, 92.0f, 200.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 72.0f, 0.0f)
                arcToRelative(58.6f, 58.6f, 0.0f, false, false, -1.5f, -12.3f)
                arcToRelative(58.7f, 58.7f, 0.0f, false, false, 9.9f, 7.5f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -62.4f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 128.0f, 152.0f)
                close()
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null
