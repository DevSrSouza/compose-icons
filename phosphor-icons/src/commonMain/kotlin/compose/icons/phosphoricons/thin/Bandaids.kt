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

public val ThinGroup.Bandaids: ImageVector
    get() {
        if (_bandaids != null) {
            return _bandaids!!
        }
        _bandaids = Builder(name = "Bandaids", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.9f, 128.0f)
                lineToRelative(30.6f, -30.5f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, -51.0f, -51.0f)
                lineTo(128.0f, 77.1f)
                lineTo(97.5f, 46.5f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, -51.0f, 51.0f)
                lineTo(77.1f, 128.0f)
                lineTo(46.5f, 158.5f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, 51.0f, 51.0f)
                lineTo(128.0f, 178.9f)
                lineToRelative(30.5f, 30.6f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, 51.0f, -51.0f)
                close()
                moveTo(164.2f, 52.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 39.6f, 39.6f)
                lineToRelative(-30.5f, 30.5f)
                lineTo(133.7f, 82.7f)
                close()
                moveTo(167.6f, 128.0f)
                lineTo(128.0f, 167.6f)
                lineTo(88.4f, 128.0f)
                lineTo(128.0f, 88.4f)
                close()
                moveTo(52.2f, 91.8f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 91.8f, 52.2f)
                lineToRelative(30.5f, 30.5f)
                lineTo(82.7f, 122.3f)
                close()
                moveTo(91.8f, 203.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -39.6f, -39.6f)
                lineToRelative(30.5f, -30.5f)
                lineToRelative(39.6f, 39.6f)
                close()
                moveTo(203.8f, 203.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -39.6f, 0.0f)
                lineToRelative(-30.5f, -30.5f)
                lineToRelative(39.6f, -39.6f)
                lineToRelative(30.5f, 30.5f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 39.6f)
                close()
                moveTo(120.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 128.0f)
                close()
            }
        }
        .build()
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
