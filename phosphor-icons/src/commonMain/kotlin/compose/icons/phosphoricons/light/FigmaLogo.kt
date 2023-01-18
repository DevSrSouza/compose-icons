package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) {
            return _figmaLogo!!
        }
        _figmaLogo = Builder(name = "FigmaLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.0f, 94.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -21.0f, -74.0f)
                lineTo(94.0f, 20.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 73.0f, 94.0f)
                arcToRelative(39.9f, 39.9f, 0.0f, false, false, 0.0f, 68.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 61.0f, 34.0f)
                lineTo(134.0f, 156.5f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 183.0f, 94.0f)
                close()
                moveTo(190.0f, 60.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, 28.0f)
                lineTo(134.0f, 88.0f)
                lineTo(134.0f, 32.0f)
                horizontalLineToRelative(28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 190.0f, 60.0f)
                close()
                moveTo(66.0f, 60.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 94.0f, 32.0f)
                horizontalLineToRelative(28.0f)
                lineTo(122.0f, 88.0f)
                lineTo(94.0f, 88.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 66.0f, 60.0f)
                close()
                moveTo(66.0f, 128.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, 28.0f, -28.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(56.0f)
                lineTo(94.0f, 156.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 66.0f, 128.0f)
                close()
                moveTo(94.0f, 224.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -56.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 94.0f, 224.0f)
                close()
                moveTo(162.0f, 156.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -56.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                close()
            }
        }
        .build()
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
