package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) {
            return _lifebuoy!!
        }
        _lifebuoy = Builder(name = "Lifebuoy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.2f, 200.8f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 0.0f, -145.6f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -0.7f, -0.7f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -0.7f, -0.7f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, -145.6f, 0.0f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -0.7f, 0.7f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -0.7f, 0.7f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 0.0f, 145.6f)
                lineToRelative(0.7f, 0.7f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, 0.7f, 0.7f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 145.6f, 0.0f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, 0.7f, -0.7f)
                arcTo(2.3f, 2.3f, 0.0f, false, false, 202.2f, 200.8f)
                close()
                moveTo(195.6f, 184.3f)
                lineTo(167.1f, 155.8f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, false, 0.0f, -55.6f)
                lineToRelative(28.5f, -28.5f)
                arcToRelative(87.9f, 87.9f, 0.0f, false, true, 0.0f, 112.6f)
                close()
                moveTo(96.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 96.0f, 128.0f)
                close()
                moveTo(184.3f, 60.4f)
                lineTo(155.8f, 88.9f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, false, -55.6f, 0.0f)
                lineTo(71.7f, 60.4f)
                arcToRelative(87.9f, 87.9f, 0.0f, false, true, 112.6f, 0.0f)
                close()
                moveTo(60.4f, 71.7f)
                lineToRelative(28.5f, 28.5f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, false, 0.0f, 55.6f)
                lineTo(60.4f, 184.3f)
                arcToRelative(87.9f, 87.9f, 0.0f, false, true, 0.0f, -112.6f)
                close()
                moveTo(71.7f, 195.6f)
                lineToRelative(28.5f, -28.5f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, false, 55.6f, 0.0f)
                lineToRelative(28.5f, 28.5f)
                arcToRelative(87.9f, 87.9f, 0.0f, false, true, -112.6f, 0.0f)
                close()
            }
        }
        .build()
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
