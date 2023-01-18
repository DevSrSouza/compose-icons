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

public val ThinGroup.Spade: ImageVector
    get() {
        if (_spade != null) {
            return _spade!!
        }
        _spade = Builder(name = "Spade", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 236.0f)
                lineTo(96.0f, 236.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -3.2f, -1.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -0.6f, -3.6f)
                lineToRelative(13.7f, -41.1f)
                arcTo(55.2f, 55.2f, 0.0f, false, true, 80.0f, 196.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -56.0f, -56.0f)
                curveTo(24.0f, 86.4f, 121.7f, 23.3f, 125.8f, 20.6f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 4.4f, 0.0f)
                curveTo(134.3f, 23.3f, 232.0f, 86.4f, 232.0f, 140.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -56.0f, 56.0f)
                arcToRelative(55.2f, 55.2f, 0.0f, false, true, -25.9f, -6.4f)
                lineToRelative(13.7f, 41.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -0.6f, 3.6f)
                arcTo(3.7f, 3.7f, 0.0f, false, true, 160.0f, 236.0f)
                close()
                moveTo(101.5f, 228.0f)
                horizontalLineToRelative(53.0f)
                lineToRelative(-15.7f, -46.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.6f, -4.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 4.8f, 0.2f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 224.0f, 140.0f)
                curveToRelative(0.0f, -45.1f, -81.6f, -101.6f, -96.0f, -111.2f)
                curveTo(113.6f, 38.4f, 32.0f, 94.9f, 32.0f, 140.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 78.8f, 36.8f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 4.8f, -0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.6f, 4.5f)
                close()
            }
        }
        .build()
        return _spade!!
    }

private var _spade: ImageVector? = null
