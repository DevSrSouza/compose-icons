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

public val LightGroup.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) {
            return _googlePlayLogo!!
        }
        _googlePlayLogo = Builder(name = "GooglePlayLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.7f, 115.9f)
                lineTo(54.9f, 19.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.1f, 0.0f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, -6.9f, 12.0f)
                lineTo(33.9f, 224.1f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 6.9f, 12.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.1f, 1.9f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 7.0f, -1.9f)
                lineToRelative(167.8f, -96.0f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 0.0f, -24.2f)
                close()
                moveTo(45.9f, 217.7f)
                lineTo(45.9f, 38.3f)
                lineTo(135.6f, 128.0f)
                close()
                moveTo(144.1f, 136.5f)
                lineTo(166.2f, 158.6f)
                lineTo(62.7f, 217.8f)
                close()
                moveTo(62.7f, 38.2f)
                lineTo(166.2f, 97.4f)
                lineToRelative(-22.1f, 22.1f)
                close()
                moveTo(216.9f, 129.6f)
                horizontalLineToRelative(-0.1f)
                lineTo(177.0f, 152.4f)
                lineTo(152.6f, 128.0f)
                lineTo(177.0f, 103.6f)
                lineToRelative(39.8f, 22.8f)
                horizontalLineToRelative(0.1f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 0.0f, 3.2f)
                close()
            }
        }
        .build()
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
