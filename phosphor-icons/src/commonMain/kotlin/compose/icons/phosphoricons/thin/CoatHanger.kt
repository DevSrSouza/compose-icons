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

public val ThinGroup.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) {
            return _coatHanger!!
        }
        _coatHanger = Builder(name = "CoatHanger", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.2f, 174.4f)
                lineTo(134.7f, 96.0f)
                lineToRelative(27.7f, -20.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 164.0f, 72.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -72.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 55.9f, -1.9f)
                lineTo(125.7f, 92.7f)
                lineToRelative(-0.2f, 0.2f)
                lineTo(16.8f, 174.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.2f, 13.4f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 24.0f, 196.0f)
                lineTo(232.0f, 196.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 11.4f, -8.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 239.2f, 174.4f)
                close()
                moveTo(235.8f, 185.3f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 232.0f, 188.0f)
                lineTo(24.0f, 188.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.8f, -2.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.4f, -4.5f)
                lineTo(128.0f, 101.0f)
                lineToRelative(106.4f, 79.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 235.8f, 185.3f)
                close()
            }
        }
        .build()
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
