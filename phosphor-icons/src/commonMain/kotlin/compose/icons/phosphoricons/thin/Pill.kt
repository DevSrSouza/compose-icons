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

public val ThinGroup.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.8f, 45.2f)
                arcToRelative(49.0f, 49.0f, 0.0f, false, false, -69.6f, 0.0f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(49.2f, 49.2f, 0.0f, true, false, 69.6f, 69.6f)
                lineToRelative(96.0f, -96.0f)
                arcTo(49.3f, 49.3f, 0.0f, false, false, 210.8f, 45.2f)
                close()
                moveTo(109.2f, 205.2f)
                arcToRelative(41.3f, 41.3f, 0.0f, false, true, -58.4f, -58.4f)
                lineTo(96.0f, 101.7f)
                lineTo(154.3f, 160.0f)
                close()
                moveTo(205.2f, 109.2f)
                lineTo(160.0f, 154.3f)
                lineTo(101.7f, 96.0f)
                lineToRelative(45.1f, -45.2f)
                arcToRelative(41.3f, 41.3f, 0.0f, false, true, 58.4f, 58.4f)
                close()
                moveTo(187.4f, 85.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -0.1f, 5.7f)
                lineToRelative(-24.5f, 23.5f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -2.7f, 1.2f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -2.9f, -1.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.1f, -5.6f)
                lineToRelative(24.4f, -23.6f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 187.4f, 85.7f)
                close()
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
