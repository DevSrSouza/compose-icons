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

public val ThinGroup.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) {
            return _lifebuoy!!
        }
        _lifebuoy = Builder(name = "Lifebuoy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.0f, 198.3f)
                arcToRelative(99.7f, 99.7f, 0.0f, false, false, 0.0f, -140.6f)
                lineToRelative(-0.3f, -0.4f)
                lineToRelative(-0.4f, -0.3f)
                arcTo(99.7f, 99.7f, 0.0f, false, false, 57.7f, 57.0f)
                lineToRelative(-0.4f, 0.3f)
                lineToRelative(-0.3f, 0.4f)
                arcToRelative(99.7f, 99.7f, 0.0f, false, false, 0.0f, 140.6f)
                lineToRelative(0.3f, 0.4f)
                lineToRelative(0.4f, 0.3f)
                arcToRelative(99.7f, 99.7f, 0.0f, false, false, 140.6f, 0.0f)
                lineToRelative(0.4f, -0.3f)
                close()
                moveTo(195.8f, 190.1f)
                lineTo(161.8f, 156.1f)
                arcToRelative(43.8f, 43.8f, 0.0f, false, false, 0.0f, -56.2f)
                lineToRelative(34.0f, -34.0f)
                arcToRelative(91.8f, 91.8f, 0.0f, false, true, 0.0f, 124.2f)
                close()
                moveTo(92.0f, 128.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 128.0f)
                close()
                moveTo(190.1f, 60.2f)
                lineTo(156.1f, 94.2f)
                arcToRelative(43.8f, 43.8f, 0.0f, false, false, -56.2f, 0.0f)
                lineToRelative(-34.0f, -34.0f)
                arcToRelative(91.8f, 91.8f, 0.0f, false, true, 124.2f, 0.0f)
                close()
                moveTo(60.2f, 65.9f)
                lineToRelative(34.0f, 34.0f)
                arcToRelative(43.8f, 43.8f, 0.0f, false, false, 0.0f, 56.2f)
                lineToRelative(-34.0f, 34.0f)
                arcToRelative(91.8f, 91.8f, 0.0f, false, true, 0.0f, -124.2f)
                close()
                moveTo(65.9f, 195.8f)
                lineTo(99.9f, 161.8f)
                arcToRelative(43.8f, 43.8f, 0.0f, false, false, 56.2f, 0.0f)
                lineToRelative(34.0f, 34.0f)
                arcToRelative(91.8f, 91.8f, 0.0f, false, true, -124.2f, 0.0f)
                close()
            }
        }
        .build()
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
