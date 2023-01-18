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

public val BoldGroup.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) {
            return _figmaLogo!!
        }
        _figmaLogo = Builder(name = "FigmaLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(193.0f, 94.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -31.0f, -80.0f)
                lineTo(94.0f, 14.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 63.0f, 94.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 0.0f, 68.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 77.0f, 34.0f)
                lineTo(140.0f, 168.4f)
                arcToRelative(45.2f, 45.2f, 0.0f, false, false, 22.0f, 5.6f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 31.0f, -80.0f)
                close()
                moveTo(184.0f, 60.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, -22.0f, 22.0f)
                lineTo(140.0f, 82.0f)
                lineTo(140.0f, 38.0f)
                horizontalLineToRelative(22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 184.0f, 60.0f)
                close()
                moveTo(72.0f, 60.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 94.0f, 38.0f)
                horizontalLineToRelative(22.0f)
                lineTo(116.0f, 82.0f)
                lineTo(94.0f, 82.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 72.0f, 60.0f)
                close()
                moveTo(72.0f, 128.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, 22.0f, -22.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(44.0f)
                lineTo(94.0f, 150.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 72.0f, 128.0f)
                close()
                moveTo(116.0f, 196.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, -22.0f, -22.0f)
                horizontalLineToRelative(22.0f)
                close()
                moveTo(162.0f, 150.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 0.0f, -44.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 0.0f, 44.0f)
                close()
            }
        }
        .build()
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
