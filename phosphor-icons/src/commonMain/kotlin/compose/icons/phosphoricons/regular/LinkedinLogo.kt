package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.LinkedinLogo: ImageVector
    get() {
        if (_linkedinLogo != null) {
            return _linkedinLogo!!
        }
        _linkedinLogo = Builder(name = "LinkedinLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 88.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 80.0f)
                close()
                moveTo(228.0f, 44.0f)
                lineTo(228.0f, 212.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(44.0f, 228.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(28.0f, 44.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 44.0f, 28.0f)
                lineTo(212.0f, 28.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 228.0f, 44.0f)
                close()
                moveTo(212.0f, 212.0f)
                lineTo(212.0f, 44.0f)
                lineTo(44.0f, 44.0f)
                lineTo(44.0f, 212.0f)
                close()
                moveTo(88.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(96.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 104.0f)
                close()
                moveTo(148.0f, 104.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -20.2f, 6.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 112.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(128.0f, 140.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(184.0f, 140.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 148.0f, 104.0f)
                close()
            }
        }
        .build()
        return _linkedinLogo!!
    }

private var _linkedinLogo: ImageVector? = null
