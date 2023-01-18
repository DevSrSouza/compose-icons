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

public val BoldGroup.Airplay: ImageVector
    get() {
        if (_airplay != null) {
            return _airplay!!
        }
        _airplay = Builder(name = "Airplay", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(137.1f, 152.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -18.2f, 0.0f)
                lineToRelative(-48.0f, 56.0f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 69.1f, 221.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 80.0f, 228.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.9f, -7.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -1.8f, -12.8f)
                close()
                moveTo(106.1f, 204.0f)
                lineTo(128.0f, 178.4f)
                lineTo(149.9f, 204.0f)
                close()
                moveTo(236.0f, 64.0f)
                lineTo(236.0f, 176.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(212.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(48.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(44.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(20.0f, 64.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 48.0f, 36.0f)
                lineTo(208.0f, 36.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 236.0f, 64.0f)
                close()
            }
        }
        .build()
        return _airplay!!
    }

private var _airplay: ImageVector? = null
