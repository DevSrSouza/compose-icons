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

public val BoldGroup.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) {
            return _phosphorLogo!!
        }
        _phosphorLogo = Builder(name = "PhosphorLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 98.0f)
                arcToRelative(78.1f, 78.1f, 0.0f, false, false, -78.0f, -78.0f)
                lineTo(68.0f, 20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 56.0f, 32.0f)
                lineTo(56.0f, 164.0f)
                arcToRelative(78.1f, 78.1f, 0.0f, false, false, 78.0f, 78.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(146.0f, 175.9f)
                arcTo(78.1f, 78.1f, 0.0f, false, false, 220.0f, 98.0f)
                close()
                moveTo(80.0f, 82.8f)
                lineTo(114.6f, 152.0f)
                lineTo(80.0f, 152.0f)
                close()
                moveTo(122.0f, 113.2f)
                lineTo(87.4f, 44.0f)
                lineTo(122.0f, 44.0f)
                close()
                moveTo(81.4f, 176.0f)
                lineTo(122.0f, 176.0f)
                verticalLineToRelative(40.7f)
                arcTo(53.9f, 53.9f, 0.0f, false, true, 81.4f, 176.0f)
                close()
                moveTo(146.0f, 151.8f)
                lineTo(146.0f, 44.2f)
                arcToRelative(53.9f, 53.9f, 0.0f, false, true, 0.0f, 107.6f)
                close()
            }
        }
        .build()
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
