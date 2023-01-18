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

public val BoldGroup.BagSimple: ImageVector
    get() {
        if (_bagSimple != null) {
            return _bagSimple!!
        }
        _bagSimple = Builder(name = "BagSimple", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 60.0f)
                lineTo(178.6f, 60.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 77.4f, 60.0f)
                lineTo(40.0f, 60.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 80.0f)
                lineTo(20.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 80.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 216.0f, 60.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 25.3f, 16.0f)
                lineTo(102.7f, 60.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(212.0f, 204.0f)
                lineTo(44.0f, 204.0f)
                lineTo(44.0f, 84.0f)
                lineTo(212.0f, 84.0f)
                close()
            }
        }
        .build()
        return _bagSimple!!
    }

private var _bagSimple: ImageVector? = null
