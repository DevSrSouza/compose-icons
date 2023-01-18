package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) {
            return _pinterestLogo!!
        }
        _pinterestLogo = Builder(name = "PinterestLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 112.0f)
                curveToRelative(0.0f, 22.6f, -7.9f, 43.2f, -22.2f, 58.1f)
                reflectiveCurveTo(162.2f, 192.0f, 144.0f, 192.0f)
                reflectiveCurveToRelative(-29.8f, -5.9f, -37.4f, -12.0f)
                lineTo(95.8f, 225.8f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 88.0f, 232.0f)
                lineToRelative(-1.8f, -0.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.0f, -9.6f)
                lineToRelative(32.0f, -136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.6f, 3.6f)
                lineToRelative(-16.9f, 71.8f)
                curveTo(114.0f, 166.0f, 123.3f, 176.0f, 144.0f, 176.0f)
                curveToRelative(27.5f, 0.0f, 56.0f, -23.9f, 56.0f, -64.0f)
                arcTo(72.0f, 72.0f, 0.0f, true, false, 68.2f, 152.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 66.0f, 163.2f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 54.9f, 161.0f)
                arcTo(88.0f, 88.0f, 0.0f, true, true, 216.0f, 112.0f)
                close()
            }
        }
        .build()
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
