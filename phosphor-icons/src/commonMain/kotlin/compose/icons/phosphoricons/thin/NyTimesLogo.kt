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

public val ThinGroup.NyTimesLogo: ImageVector
    get() {
        if (_nyTimesLogo != null) {
            return _nyTimesLogo!!
        }
        _nyTimesLogo = Builder(name = "NyTimesLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.1f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 172.1f, 140.0f)
                close()
                moveTo(209.5f, 164.3f)
                arcTo(83.8f, 83.8f, 0.0f, false, true, 94.8f, 221.1f)
                lineToRelative(-0.8f, -0.3f)
                arcToRelative(84.2f, 84.2f, 0.0f, false, true, -49.2f, -65.7f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -0.1f, -0.6f)
                arcTo(74.1f, 74.1f, 0.0f, false, true, 44.0f, 144.0f)
                arcTo(83.3f, 83.3f, 0.0f, false, true, 60.2f, 94.5f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 70.1f, 32.0f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, 1.7f, 0.4f)
                lineTo(187.0f, 88.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -0.9f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, 64.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -1.8f, -0.4f)
                lineTo(127.2f, 68.0f)
                arcTo(76.2f, 76.2f, 0.0f, false, false, 52.0f, 144.0f)
                curveToRelative(0.0f, 1.3f, 0.0f, 2.6f, 0.1f, 3.9f)
                lineToRelative(74.0f, -39.4f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 4.0f, 0.1f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 132.0f, 112.0f)
                lineTo(132.0f, 219.9f)
                arcToRelative(75.8f, 75.8f, 0.0f, false, false, 69.8f, -57.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.7f, 1.9f)
                close()
                moveTo(65.8f, 87.6f)
                arcToRelative(83.7f, 83.7f, 0.0f, false, true, 47.5f, -26.3f)
                lineTo(69.2f, 40.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 46.1f, 64.0f)
                arcTo(23.8f, 23.8f, 0.0f, false, false, 65.8f, 87.6f)
                close()
                moveTo(124.0f, 118.7f)
                lineToRelative(-24.0f, 12.8f)
                verticalLineToRelative(83.1f)
                arcToRelative(74.2f, 74.2f, 0.0f, false, false, 24.0f, 5.3f)
                close()
                moveTo(92.0f, 210.9f)
                lineTo(92.0f, 135.7f)
                lineTo(53.0f, 156.5f)
                arcTo(76.4f, 76.4f, 0.0f, false, false, 92.0f, 210.9f)
                close()
            }
        }
        .build()
        return _nyTimesLogo!!
    }

private var _nyTimesLogo: ImageVector? = null
