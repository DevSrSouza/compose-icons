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

public val LightGroup.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) {
            return _appleLogo!!
        }
        _appleLogo = Builder(name = "AppleLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.5f, 30.4f)
                arcTo(38.3f, 38.3f, 0.0f, false, true, 168.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                arcToRelative(26.2f, 26.2f, 0.0f, false, false, -24.3f, 16.7f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -5.6f, 3.8f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, true, -2.1f, -0.4f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 132.5f, 30.4f)
                close()
                moveTo(224.1f, 165.2f)
                curveTo(210.4f, 198.6f, 185.7f, 222.0f, 164.0f, 222.0f)
                lineTo(92.0f, 222.0f)
                curveToRelative(-15.7f, 0.0f, -33.5f, -12.4f, -47.5f, -33.1f)
                reflectiveCurveTo(22.0f, 141.1f, 22.0f, 116.0f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 128.0f, 63.5f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, true, 91.9f, 11.7f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, 1.2f, 4.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -2.8f, 4.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 2.9f, 73.5f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 224.1f, 165.2f)
                close()
                moveTo(210.9f, 165.5f)
                arcToRelative(54.1f, 54.1f, 0.0f, false, true, -4.7f, -87.7f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, -74.1f, -2.1f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -8.1f, 0.1f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 34.0f, 116.0f)
                curveToRelative(0.0f, 22.8f, 7.5f, 46.9f, 20.5f, 66.1f)
                curveTo(66.1f, 199.3f, 80.5f, 210.0f, 92.0f, 210.0f)
                horizontalLineToRelative(72.0f)
                curveTo(179.4f, 210.0f, 199.0f, 191.2f, 210.9f, 165.5f)
                close()
            }
        }
        .build()
        return _appleLogo!!
    }

private var _appleLogo: ImageVector? = null
