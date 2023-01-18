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

public val ThinGroup.Aperture: ImageVector
    get() {
        if (_aperture != null) {
            return _aperture!!
        }
        _aperture = Builder(name = "Aperture", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 128.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 57.3f, 57.3f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 128.0f, 228.0f)
                horizontalLineToRelative(0.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 228.0f, 128.0f)
                close()
                moveTo(209.1f, 171.6f)
                lineTo(148.1f, 160.4f)
                lineTo(210.4f, 87.0f)
                arcToRelative(92.5f, 92.5f, 0.0f, false, true, -1.3f, 84.6f)
                close()
                moveTo(106.9f, 152.9f)
                lineToRelative(-11.0f, -30.8f)
                lineTo(117.0f, 97.2f)
                lineToRelative(32.1f, 5.9f)
                lineToRelative(11.0f, 30.8f)
                lineTo(139.0f, 158.8f)
                close()
                moveTo(206.2f, 79.6f)
                lineTo(166.1f, 126.8f)
                lineTo(133.7f, 36.2f)
                arcToRelative(91.7f, 91.7f, 0.0f, false, true, 59.4f, 26.7f)
                arcTo(95.4f, 95.4f, 0.0f, false, true, 206.2f, 79.6f)
                close()
                moveTo(62.9f, 62.9f)
                arcToRelative(91.6f, 91.6f, 0.0f, false, true, 62.3f, -26.8f)
                lineTo(146.0f, 94.4f)
                lineTo(51.3f, 77.1f)
                arcTo(104.3f, 104.3f, 0.0f, false, true, 62.9f, 62.9f)
                close()
                moveTo(46.9f, 84.4f)
                lineTo(107.9f, 95.6f)
                lineTo(45.6f, 169.0f)
                arcToRelative(92.5f, 92.5f, 0.0f, false, true, 1.3f, -84.6f)
                close()
                moveTo(49.8f, 176.4f)
                lineTo(89.9f, 129.2f)
                lineTo(122.3f, 219.8f)
                arcToRelative(91.7f, 91.7f, 0.0f, false, true, -59.4f, -26.7f)
                arcTo(95.4f, 95.4f, 0.0f, false, true, 49.8f, 176.4f)
                close()
                moveTo(130.8f, 219.9f)
                lineTo(110.0f, 161.6f)
                lineToRelative(29.8f, 5.4f)
                horizontalLineToRelative(0.1f)
                lineToRelative(64.8f, 11.8f)
                arcToRelative(104.3f, 104.3f, 0.0f, false, true, -11.6f, 14.2f)
                arcTo(91.6f, 91.6f, 0.0f, false, true, 130.8f, 219.9f)
                close()
            }
        }
        .build()
        return _aperture!!
    }

private var _aperture: ImageVector? = null
