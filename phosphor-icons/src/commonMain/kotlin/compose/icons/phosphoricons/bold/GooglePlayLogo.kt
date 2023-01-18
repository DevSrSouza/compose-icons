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

public val BoldGroup.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) {
            return _googlePlayLogo!!
        }
        _googlePlayLogo = Builder(name = "GooglePlayLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.7f, 110.7f)
                lineTo(57.9f, 14.7f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.1f, 0.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -9.9f, 17.2f)
                verticalLineTo(224.1f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 9.9f, 17.2f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 47.9f, 244.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 10.0f, -2.7f)
                lineToRelative(167.8f, -96.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 0.0f, -34.6f)
                close()
                moveTo(51.9f, 203.2f)
                verticalLineTo(52.8f)
                lineTo(127.1f, 128.0f)
                close()
                moveTo(144.1f, 145.0f)
                lineToRelative(12.3f, 12.3f)
                lineToRelative(-57.7f, 33.0f)
                close()
                moveTo(98.7f, 65.7f)
                lineToRelative(57.7f, 33.0f)
                lineTo(144.1f, 111.0f)
                close()
                moveTo(178.0f, 144.9f)
                lineTo(161.0f, 128.0f)
                lineToRelative(17.0f, -16.9f)
                lineTo(207.6f, 128.0f)
                close()
            }
        }
        .build()
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
