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

public val LightGroup.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) {
            return _pinterestLogo!!
        }
        _pinterestLogo = Builder(name = "PinterestLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 112.0f)
                curveToRelative(0.0f, 22.0f, -7.7f, 42.2f, -21.7f, 56.7f)
                reflectiveCurveTo(161.7f, 190.0f, 144.0f, 190.0f)
                curveToRelative(-19.4f, 0.0f, -31.5f, -7.1f, -38.6f, -13.6f)
                lineToRelative(-11.6f, 49.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 88.0f, 230.0f)
                lineToRelative(-1.4f, -0.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.4f, -7.2f)
                lineToRelative(32.0f, -136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.6f, 2.8f)
                lineTo(108.7f, 162.0f)
                curveToRelative(2.9f, 4.4f, 12.5f, 16.0f, 35.3f, 16.0f)
                curveToRelative(28.5f, 0.0f, 58.0f, -24.7f, 58.0f, -66.0f)
                arcTo(74.0f, 74.0f, 0.0f, true, false, 66.5f, 153.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -1.6f, 8.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.3f, -1.6f)
                arcTo(85.0f, 85.0f, 0.0f, false, true, 42.0f, 112.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, true, 172.0f, 0.0f)
                close()
            }
        }
        .build()
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
