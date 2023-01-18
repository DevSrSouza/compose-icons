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

public val ThinGroup.Percent: ImageVector
    get() {
        if (_percent != null) {
            return _percent!!
        }
        _percent = Builder(name = "Percent", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.8f, 58.8f)
                lineToRelative(-144.0f, 144.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineToRelative(144.0f, -144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.6f, 5.6f)
                close()
                moveTo(53.4f, 98.6f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, 0.0f, -45.2f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, 45.2f, 0.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 53.4f, 98.6f)
                close()
                moveTo(52.0f, 76.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 93.0f, 59.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, -34.0f, 0.0f)
                arcTo(24.2f, 24.2f, 0.0f, false, false, 52.0f, 76.0f)
                close()
                moveTo(212.0f, 180.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -54.6f, -22.6f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, 45.2f, 0.0f)
                arcTo(31.5f, 31.5f, 0.0f, false, true, 212.0f, 180.0f)
                close()
                moveTo(204.0f, 180.0f)
                arcToRelative(24.2f, 24.2f, 0.0f, false, false, -7.0f, -17.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, -34.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 41.0f, 17.0f)
                close()
            }
        }
        .build()
        return _percent!!
    }

private var _percent: ImageVector? = null
