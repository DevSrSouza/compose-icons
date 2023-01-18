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

public val ThinGroup.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) {
            return _appleLogo!!
        }
        _appleLogo = Builder(name = "AppleLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.4f, 31.1f)
                arcTo(36.2f, 36.2f, 0.0f, false, true, 168.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -26.1f, 17.9f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -3.8f, 2.6f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.4f, -0.3f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 134.4f, 31.1f)
                close()
                moveTo(222.2f, 164.4f)
                curveTo(208.8f, 197.2f, 184.9f, 220.0f, 164.0f, 220.0f)
                lineTo(92.0f, 220.0f)
                curveToRelative(-30.0f, 0.0f, -68.0f, -49.0f, -68.0f, -104.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 128.0f, 66.0f)
                arcToRelative(64.1f, 64.1f, 0.0f, false, true, 90.3f, 10.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.8f, 3.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -1.9f, 2.7f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 3.1f, 77.0f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 222.2f, 164.4f)
                close()
                moveTo(213.4f, 164.7f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -4.2f, -86.6f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -78.5f, -3.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.4f, 0.1f)
                arcTo(55.9f, 55.9f, 0.0f, false, false, 32.0f, 116.0f)
                curveToRelative(0.0f, 23.2f, 7.6f, 47.7f, 20.8f, 67.3f)
                curveTo(64.8f, 201.0f, 79.8f, 212.0f, 92.0f, 212.0f)
                horizontalLineToRelative(72.0f)
                curveTo(180.8f, 212.0f, 201.2f, 192.3f, 213.4f, 164.7f)
                close()
            }
        }
        .build()
        return _appleLogo!!
    }

private var _appleLogo: ImageVector? = null
