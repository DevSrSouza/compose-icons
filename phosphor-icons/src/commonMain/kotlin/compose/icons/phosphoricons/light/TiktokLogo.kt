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

public val LightGroup.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) {
            return _tiktokLogo!!
        }
        _tiktokLogo = Builder(name = "TiktokLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 78.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, -50.0f, -50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(128.0f, 22.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(122.0f, 156.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, -31.4f, -19.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.4f, -5.4f)
                lineTo(94.0f, 89.1f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -7.1f, -6.0f)
                arcTo(74.0f, 74.0f, 0.0f, true, false, 174.0f, 156.0f)
                lineTo(174.0f, 116.9f)
                arcTo(101.1f, 101.1f, 0.0f, false, false, 224.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(230.0f, 84.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 78.0f)
                close()
                moveTo(218.0f, 117.8f)
                arcToRelative(89.0f, 89.0f, 0.0f, false, true, -46.5f, -16.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.2f, -0.5f)
                arcTo(6.2f, 6.2f, 0.0f, false, false, 162.0f, 106.0f)
                verticalLineToRelative(50.0f)
                arcTo(62.0f, 62.0f, 0.0f, true, true, 82.0f, 96.6f)
                verticalLineToRelative(30.6f)
                arcTo(34.0f, 34.0f, 0.0f, true, false, 134.0f, 156.0f)
                lineTo(134.0f, 34.0f)
                horizontalLineToRelative(28.3f)
                arcTo(62.0f, 62.0f, 0.0f, false, false, 218.0f, 89.7f)
                close()
            }
        }
        .build()
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
