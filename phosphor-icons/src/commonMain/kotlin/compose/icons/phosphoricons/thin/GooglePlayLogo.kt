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

public val ThinGroup.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) {
            return _googlePlayLogo!!
        }
        _googlePlayLogo = Builder(name = "GooglePlayLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.8f, 117.7f)
                lineTo(53.9f, 21.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -12.1f, 0.0f)
                arcToRelative(18.4f, 18.4f, 0.0f, false, false, -2.2f, 1.7f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, -3.6f, 8.5f)
                lineTo(35.9f, 224.1f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, 3.6f, 8.5f)
                horizontalLineToRelative(0.1f)
                arcToRelative(18.4f, 18.4f, 0.0f, false, false, 2.2f, 1.7f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 6.1f, 1.6f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 6.0f, -1.6f)
                lineToRelative(167.8f, -96.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 6.2f, -10.4f)
                arcTo(11.6f, 11.6f, 0.0f, false, false, 221.8f, 117.7f)
                close()
                moveTo(169.5f, 97.0f)
                lineToRelative(-25.4f, 25.3f)
                lineTo(50.7f, 29.0f)
                close()
                moveTo(43.9f, 222.5f)
                lineTo(43.9f, 33.5f)
                lineTo(138.4f, 128.0f)
                close()
                moveTo(50.7f, 227.0f)
                lineTo(144.1f, 133.7f)
                lineTo(169.5f, 159.0f)
                close()
                moveTo(217.8f, 131.4f)
                lineTo(176.7f, 154.9f)
                lineTo(149.7f, 128.0f)
                lineTo(176.7f, 101.1f)
                lineTo(217.9f, 124.7f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, 2.0f, 3.3f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 217.8f, 131.4f)
                close()
            }
        }
        .build()
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
