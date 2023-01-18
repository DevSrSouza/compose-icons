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

public val LightGroup.GitlabLogo: ImageVector
    get() {
        if (_gitlabLogo != null) {
            return _gitlabLogo!!
        }
        _gitlabLogo = Builder(name = "GitlabLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.3f, 153.0f)
                lineTo(209.0f, 50.5f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -19.0f, -0.9f)
                lineTo(168.8f, 106.0f)
                horizontalLineTo(87.2f)
                lineTo(66.0f, 49.6f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -19.0f, 0.9f)
                lineTo(19.7f, 153.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 5.5f, 15.1f)
                lineTo(120.0f, 233.8f)
                arcToRelative(13.4f, 13.4f, 0.0f, false, false, 6.3f, 2.3f)
                horizontalLineToRelative(3.4f)
                arcToRelative(13.4f, 13.4f, 0.0f, false, false, 6.3f, -2.3f)
                lineToRelative(94.8f, -65.7f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 236.3f, 153.0f)
                close()
                moveTo(199.0f, 59.7f)
                lineTo(211.4f, 106.0f)
                horizontalLineTo(181.7f)
                close()
                moveTo(164.3f, 118.0f)
                lineTo(128.0f, 214.9f)
                lineTo(91.7f, 118.0f)
                close()
                moveTo(57.0f, 59.7f)
                lineTo(74.3f, 106.0f)
                horizontalLineTo(44.6f)
                close()
                moveTo(31.2f, 156.1f)
                lineTo(41.4f, 118.0f)
                horizontalLineTo(78.8f)
                lineToRelative(36.8f, 98.2f)
                lineTo(32.0f, 158.3f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 31.2f, 156.1f)
                close()
                moveTo(224.0f, 158.3f)
                lineToRelative(-83.6f, 57.9f)
                lineTo(177.2f, 118.0f)
                horizontalLineToRelative(37.4f)
                lineToRelative(10.2f, 38.1f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 224.0f, 158.3f)
                close()
            }
        }
        .build()
        return _gitlabLogo!!
    }

private var _gitlabLogo: ImageVector? = null
