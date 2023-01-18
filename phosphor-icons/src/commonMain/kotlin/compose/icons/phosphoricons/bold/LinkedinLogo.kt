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

public val BoldGroup.LinkedinLogo: ImageVector
    get() {
        if (_linkedinLogo != null) {
            return _linkedinLogo!!
        }
        _linkedinLogo = Builder(name = "LinkedinLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 120.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(72.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(124.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(136.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(192.0f, 148.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -58.6f, -35.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 112.0f, 120.0f)
                verticalLineToRelative(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 124.0f, 188.0f)
                close()
                moveTo(232.0f, 44.0f)
                lineTo(232.0f, 212.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(44.0f, 232.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(24.0f, 44.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 44.0f, 24.0f)
                lineTo(212.0f, 24.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 232.0f, 44.0f)
                close()
                moveTo(208.0f, 48.0f)
                lineTo(48.0f, 48.0f)
                lineTo(48.0f, 208.0f)
                lineTo(208.0f, 208.0f)
                close()
                moveTo(84.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, false, 68.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 84.0f, 96.0f)
                close()
            }
        }
        .build()
        return _linkedinLogo!!
    }

private var _linkedinLogo: ImageVector? = null
