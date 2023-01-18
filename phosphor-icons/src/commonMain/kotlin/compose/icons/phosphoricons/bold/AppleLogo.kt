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

public val BoldGroup.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) {
            return _appleLogo!!
        }
        _appleLogo = Builder(name = "AppleLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.8f, 152.2f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -2.4f, -63.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.2f, -17.7f)
                arcTo(71.6f, 71.6f, 0.0f, false, false, 168.0f, 44.0f)
                arcToRelative(72.6f, 72.6f, 0.0f, false, false, -40.0f, 12.1f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 16.0f, 116.0f)
                curveToRelative(0.0f, 26.3f, 8.6f, 54.1f, 23.6f, 76.2f)
                reflectiveCurveTo(74.0f, 228.0f, 92.0f, 228.0f)
                horizontalLineToRelative(72.0f)
                curveToRelative(12.6f, 0.0f, 25.7f, -6.4f, 38.1f, -18.4f)
                reflectiveCurveToRelative(20.8f, -25.8f, 27.5f, -42.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 223.8f, 152.2f)
                close()
                moveTo(164.0f, 204.0f)
                horizontalLineTo(92.0f)
                curveToRelative(-19.6f, 0.0f, -52.0f, -41.1f, -52.0f, -88.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 80.0f, -35.8f)
                lineToRelative(0.2f, 0.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 16.0f, -0.3f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, true, 61.0f, -2.2f)
                arcToRelative(60.2f, 60.2f, 0.0f, false, false, 6.0f, 89.6f)
                curveTo(191.5f, 190.5f, 174.8f, 204.0f, 164.0f, 204.0f)
                close()
                moveTo(134.4f, 15.6f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 168.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -15.3f, 7.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -9.2f, 4.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -9.1f, -19.8f)
                close()
            }
        }
        .build()
        return _appleLogo!!
    }

private var _appleLogo: ImageVector? = null
