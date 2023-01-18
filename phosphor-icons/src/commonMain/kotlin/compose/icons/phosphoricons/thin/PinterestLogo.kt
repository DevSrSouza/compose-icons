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

public val ThinGroup.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) {
            return _pinterestLogo!!
        }
        _pinterestLogo = Builder(name = "PinterestLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 112.0f)
                curveToRelative(0.0f, 21.5f, -7.5f, 41.2f, -21.1f, 55.3f)
                reflectiveCurveTo(161.2f, 188.0f, 144.0f, 188.0f)
                curveToRelative(-21.4f, 0.0f, -33.5f, -8.8f, -39.8f, -15.6f)
                lineTo(91.9f, 224.9f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 88.0f, 228.0f)
                horizontalLineToRelative(-0.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, -4.8f)
                lineToRelative(32.0f, -136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.8f, 1.8f)
                lineToRelative(-17.3f, 73.5f)
                curveToRelative(2.4f, 4.0f, 12.3f, 17.6f, 37.4f, 17.6f)
                curveToRelative(29.5f, 0.0f, 60.0f, -25.4f, 60.0f, -68.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -152.0f, 0.0f)
                arcToRelative(74.8f, 74.8f, 0.0f, false, false, 12.9f, 42.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.7f, 4.5f)
                arcTo(84.0f, 84.0f, 0.0f, true, true, 212.0f, 112.0f)
                close()
            }
        }
        .build()
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
