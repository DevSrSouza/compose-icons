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

public val BoldGroup.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) {
            return _tiktokLogo!!
        }
        _tiktokLogo = Builder(name = "TiktokLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 72.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -44.0f, -44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(128.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(116.0f, 156.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, true, 9.1f, -14.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.9f, -10.8f)
                lineTo(100.0f, 89.1f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -4.3f, -9.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.8f, -2.7f)
                arcTo(80.0f, 80.0f, 0.0f, true, false, 180.0f, 156.0f)
                lineTo(180.0f, 126.7f)
                arcToRelative(107.9f, 107.9f, 0.0f, false, false, 44.0f, 9.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 72.0f)
                close()
                moveTo(212.0f, 111.2f)
                arcToRelative(83.2f, 83.2f, 0.0f, false, true, -37.0f, -15.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -12.5f, -0.9f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 156.0f, 106.0f)
                verticalLineToRelative(50.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -80.0f, -50.6f)
                lineTo(76.0f, 124.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 64.0f, 32.0f)
                lineTo(140.0f, 40.0f)
                horizontalLineToRelative(17.1f)
                arcTo(67.9f, 67.9f, 0.0f, false, false, 212.0f, 94.9f)
                close()
            }
        }
        .build()
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
