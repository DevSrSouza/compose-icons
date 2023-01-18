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

public val ThinGroup.WindowsLogo: ImageVector
    get() {
        if (_windowsLogo != null) {
            return _windowsLogo!!
        }
        _windowsLogo = Builder(name = "WindowsLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 140.0f)
                lineTo(136.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(57.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.3f, 3.9f)
                lineToRelative(80.0f, 14.5f)
                horizontalLineToRelative(0.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.6f, -0.9f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 220.0f, 216.0f)
                lineTo(220.0f, 144.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 140.0f)
                close()
                moveTo(212.0f, 211.2f)
                lineTo(140.0f, 198.1f)
                lineTo(140.0f, 148.0f)
                horizontalLineToRelative(72.0f)
                close()
                moveTo(104.0f, 140.0f)
                lineTo(40.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.3f, 3.9f)
                lineToRelative(64.0f, 11.7f)
                horizontalLineToRelative(0.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.6f, -0.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 1.4f, -3.1f)
                lineTo(108.0f, 144.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 140.0f)
                close()
                moveTo(100.0f, 190.8f)
                lineTo(44.0f, 180.7f)
                lineTo(44.0f, 148.0f)
                horizontalLineToRelative(56.0f)
                close()
                moveTo(218.6f, 36.9f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -3.3f, -0.8f)
                lineToRelative(-80.0f, 14.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.3f, 3.9f)
                lineTo(132.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(220.0f, 40.0f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 218.6f, 36.9f)
                close()
                moveTo(212.0f, 108.0f)
                lineTo(140.0f, 108.0f)
                lineTo(140.0f, 57.9f)
                lineToRelative(72.0f, -13.1f)
                close()
                moveTo(103.3f, 56.4f)
                lineToRelative(-64.0f, 11.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 36.0f, 72.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(108.0f, 60.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -1.4f, -3.1f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 103.3f, 56.4f)
                close()
                moveTo(100.0f, 108.0f)
                lineTo(44.0f, 108.0f)
                lineTo(44.0f, 75.3f)
                lineToRelative(56.0f, -10.1f)
                close()
            }
        }
        .build()
        return _windowsLogo!!
    }

private var _windowsLogo: ImageVector? = null
