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

public val ThinGroup.GitlabLogo: ImageVector
    get() {
        if (_gitlabLogo != null) {
            return _gitlabLogo!!
        }
        _gitlabLogo = Builder(name = "GitlabLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.4f, 153.5f)
                lineTo(207.1f, 51.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -7.4f, -5.9f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -7.8f, 5.2f)
                lineTo(170.2f, 108.0f)
                lineTo(85.8f, 108.0f)
                lineTo(64.1f, 50.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.2f, 0.7f)
                lineTo(21.6f, 153.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 4.7f, 13.0f)
                lineToRelative(94.9f, 65.6f)
                arcToRelative(10.9f, 10.9f, 0.0f, false, false, 5.4f, 2.1f)
                horizontalLineToRelative(2.8f)
                arcToRelative(10.9f, 10.9f, 0.0f, false, false, 5.4f, -2.1f)
                lineToRelative(94.9f, -65.6f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 234.4f, 153.5f)
                close()
                moveTo(199.4f, 53.1f)
                lineTo(214.0f, 108.0f)
                lineTo(178.8f, 108.0f)
                close()
                moveTo(128.0f, 220.6f)
                lineTo(88.8f, 116.0f)
                horizontalLineToRelative(78.4f)
                close()
                moveTo(56.6f, 53.1f)
                lineTo(77.2f, 108.0f)
                lineTo(42.0f, 108.0f)
                close()
                moveTo(29.3f, 155.6f)
                lineTo(39.9f, 116.0f)
                lineTo(80.2f, 116.0f)
                lineToRelative(39.6f, 105.4f)
                lineTo(30.9f, 159.9f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 29.3f, 155.6f)
                close()
                moveTo(225.1f, 159.9f)
                lineTo(136.2f, 221.4f)
                lineTo(175.8f, 116.0f)
                horizontalLineToRelative(40.3f)
                lineToRelative(10.6f, 39.6f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 225.1f, 159.9f)
                close()
            }
        }
        .build()
        return _gitlabLogo!!
    }

private var _gitlabLogo: ImageVector? = null
