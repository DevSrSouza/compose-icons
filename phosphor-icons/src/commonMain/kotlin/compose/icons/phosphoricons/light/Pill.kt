package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.2f, 43.8f)
                arcToRelative(50.9f, 50.9f, 0.0f, false, false, -72.4f, 0.0f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(51.2f, 51.2f, 0.0f, false, false, 0.0f, 72.4f)
                arcToRelative(50.9f, 50.9f, 0.0f, false, false, 72.4f, 0.0f)
                lineToRelative(96.0f, -96.0f)
                arcTo(51.2f, 51.2f, 0.0f, false, false, 212.2f, 43.8f)
                close()
                moveTo(107.8f, 203.8f)
                arcToRelative(39.3f, 39.3f, 0.0f, false, true, -55.6f, -55.6f)
                lineTo(96.0f, 104.5f)
                lineTo(151.5f, 160.0f)
                close()
                moveTo(203.8f, 107.8f)
                lineTo(160.0f, 151.5f)
                lineTo(104.5f, 96.0f)
                lineToRelative(43.7f, -43.8f)
                arcToRelative(39.3f, 39.3f, 0.0f, false, true, 55.6f, 55.6f)
                close()
                moveTo(188.8f, 84.3f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -0.1f, 8.5f)
                lineToRelative(-24.5f, 23.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -4.1f, 1.7f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, -4.3f, -1.9f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 0.1f, -8.4f)
                lineToRelative(24.4f, -23.6f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 188.8f, 84.3f)
                close()
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
