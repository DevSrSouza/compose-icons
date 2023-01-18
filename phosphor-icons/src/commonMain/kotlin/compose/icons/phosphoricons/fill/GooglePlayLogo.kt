package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) {
            return _googlePlayLogo!!
        }
        _googlePlayLogo = Builder(name = "GooglePlayLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.7f, 114.2f)
                lineTo(55.9f, 18.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.1f, 0.1f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, -7.9f, 13.7f)
                lineTo(31.9f, 224.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 15.9f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 8.0f, -2.1f)
                lineToRelative(167.8f, -96.1f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, 0.0f, -27.6f)
                close()
                moveTo(144.1f, 139.3f)
                lineTo(162.9f, 158.2f)
                lineTo(74.7f, 208.6f)
                close()
                moveTo(74.7f, 47.3f)
                lineTo(162.9f, 97.8f)
                lineTo(144.1f, 116.7f)
                close()
                moveTo(177.3f, 149.9f)
                lineTo(155.4f, 128.0f)
                lineToRelative(21.9f, -21.9f)
                lineTo(215.6f, 128.0f)
                close()
            }
        }
        .build()
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
