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

public val RegularGroup.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) {
            return _figmaLogo!!
        }
        _figmaLogo = Builder(name = "FigmaLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.6f, 94.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 162.0f, 18.0f)
                lineTo(94.0f, 18.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 69.4f, 94.0f)
                arcToRelative(41.9f, 41.9f, 0.0f, false, false, 0.0f, 68.0f)
                arcTo(42.0f, 42.0f, 0.0f, true, false, 136.0f, 196.0f)
                lineTo(136.0f, 160.9f)
                arcTo(42.0f, 42.0f, 0.0f, true, false, 186.6f, 94.0f)
                close()
                moveTo(188.0f, 60.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, -26.0f, 26.0f)
                lineTo(136.0f, 86.0f)
                lineTo(136.0f, 34.0f)
                horizontalLineToRelative(26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 188.0f, 60.0f)
                close()
                moveTo(68.0f, 60.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 94.0f, 34.0f)
                horizontalLineToRelative(26.0f)
                lineTo(120.0f, 86.0f)
                lineTo(94.0f, 86.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 68.0f, 60.0f)
                close()
                moveTo(68.0f, 128.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, 26.0f, -26.0f)
                horizontalLineToRelative(26.0f)
                verticalLineToRelative(52.0f)
                lineTo(94.0f, 154.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 68.0f, 128.0f)
                close()
                moveTo(94.0f, 222.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, -52.0f)
                horizontalLineToRelative(26.0f)
                verticalLineToRelative(26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 94.0f, 222.0f)
                close()
                moveTo(162.0f, 154.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, -52.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, 52.0f)
                close()
            }
        }
        .build()
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
