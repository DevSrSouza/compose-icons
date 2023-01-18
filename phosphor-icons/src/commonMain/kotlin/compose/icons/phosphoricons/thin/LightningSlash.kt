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

public val ThinGroup.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) {
            return _lightningSlash!!
        }
        _lightningSlash = Builder(name = "LightningSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.0f, 5.4f)
                lineTo(86.8f, 88.6f)
                lineTo(45.1f, 133.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -1.0f, 3.7f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, 2.5f, 2.8f)
                lineToRelative(60.8f, 22.8f)
                lineTo(92.1f, 239.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.1f, 4.3f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, 4.7f, -0.8f)
                lineToRelative(64.8f, -69.4f)
                lineTo(205.0f, 218.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 5.7f, 0.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.3f, -5.7f)
                close()
                moveTo(102.7f, 227.0f)
                lineToRelative(13.2f, -66.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -2.5f, -4.6f)
                lineTo(55.0f, 134.3f)
                lineTo(92.2f, 94.5f)
                lineToRelative(66.1f, 72.8f)
                close()
                moveTo(111.4f, 68.1f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -0.2f, -5.7f)
                lineToRelative(45.9f, -49.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.8f, 3.6f)
                lineTo(148.6f, 93.4f)
                lineToRelative(60.8f, 22.8f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 2.5f, 2.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, 3.6f)
                lineToRelative(-22.3f, 23.9f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -2.9f, 1.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.9f, -6.7f)
                lineTo(201.0f, 121.6f)
                lineTo(142.6f, 99.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.5f, -4.5f)
                lineTo(153.3f, 29.0f)
                lineTo(117.0f, 67.9f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 111.4f, 68.1f)
                close()
            }
        }
        .build()
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
