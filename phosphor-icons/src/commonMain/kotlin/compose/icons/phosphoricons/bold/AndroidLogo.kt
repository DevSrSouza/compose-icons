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

public val BoldGroup.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) {
            return _androidLogo!!
        }
        _androidLogo = Builder(name = "AndroidLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 156.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 180.0f, 156.0f)
                close()
                moveTo(92.0f, 140.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 92.0f, 140.0f)
                close()
                moveTo(244.0f, 168.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(32.0f, 212.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(12.0f, 169.1f)
                arcTo(117.4f, 117.4f, 0.0f, false, true, 45.7f, 86.7f)
                lineTo(23.5f, 64.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(64.3f, 71.3f)
                arcTo(114.7f, 114.7f, 0.0f, false, true, 127.6f, 52.0f)
                horizontalLineToRelative(0.4f)
                arcToRelative(115.5f, 115.5f, 0.0f, false, true, 63.9f, 19.1f)
                lineToRelative(23.6f, -23.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineToRelative(-22.0f, 22.0f)
                arcTo(115.0f, 115.0f, 0.0f, false, true, 244.0f, 168.0f)
                close()
                moveTo(220.0f, 168.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, -92.3f, -92.0f)
                curveTo(77.1f, 76.2f, 36.0f, 118.0f, 36.0f, 169.1f)
                lineTo(36.0f, 188.0f)
                lineTo(220.0f, 188.0f)
                close()
            }
        }
        .build()
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
