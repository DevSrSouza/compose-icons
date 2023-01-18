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

public val ThinGroup.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) {
            return _tiktokLogo!!
        }
        _tiktokLogo = Builder(name = "TiktokLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 80.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -52.0f, -52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(128.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(124.0f, 156.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -34.3f, -21.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.3f, -3.6f)
                lineTo(92.0f, 89.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.7f, -4.0f)
                arcTo(72.0f, 72.0f, 0.0f, true, false, 172.0f, 156.0f)
                lineTo(172.0f, 113.4f)
                arcTo(98.9f, 98.9f, 0.0f, false, false, 224.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(228.0f, 84.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 80.0f)
                close()
                moveTo(220.0f, 119.9f)
                arcToRelative(90.3f, 90.3f, 0.0f, false, true, -49.7f, -17.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.1f, -0.3f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 164.0f, 106.0f)
                verticalLineToRelative(50.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, true, 84.0f, 94.0f)
                verticalLineToRelative(34.3f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 132.0f, 156.0f)
                lineTo(132.0f, 32.0f)
                horizontalLineToRelative(32.1f)
                arcTo(60.2f, 60.2f, 0.0f, false, false, 220.0f, 87.9f)
                close()
            }
        }
        .build()
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
