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

public val ThinGroup.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 128.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -88.8f, 36.8f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.1f, -0.1f, -0.2f)
                lineTo(95.0f, 96.8f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 0.0f, 62.4f)
                lineToRelative(8.6f, -9.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.0f, 5.3f)
                lineToRelative(-8.7f, 9.8f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.1f, -0.1f, 0.2f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 0.0f, -73.6f)
                curveToRelative(0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.2f)
                lineTo(161.0f, 159.2f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 0.0f, -62.4f)
                lineToRelative(-8.6f, 9.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.0f, -5.3f)
                lineToRelative(8.7f, -9.8f)
                curveToRelative(0.0f, -0.1f, 0.1f, -0.1f, 0.1f, -0.2f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 244.0f, 128.0f)
                close()
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
