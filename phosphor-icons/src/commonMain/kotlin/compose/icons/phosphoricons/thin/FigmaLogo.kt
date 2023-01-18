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

public val ThinGroup.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) {
            return _figmaLogo!!
        }
        _figmaLogo = Builder(name = "FigmaLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.9f, 94.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 162.0f, 22.0f)
                lineTo(94.0f, 22.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 77.1f, 94.0f)
                arcToRelative(37.9f, 37.9f, 0.0f, false, false, 0.0f, 68.0f)
                arcTo(38.0f, 38.0f, 0.0f, true, false, 132.0f, 196.0f)
                lineTo(132.0f, 151.3f)
                arcTo(38.0f, 38.0f, 0.0f, true, false, 178.9f, 94.0f)
                close()
                moveTo(192.0f, 60.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -30.0f, 30.0f)
                lineTo(132.0f, 90.0f)
                lineTo(132.0f, 30.0f)
                horizontalLineToRelative(30.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 192.0f, 60.0f)
                close()
                moveTo(138.7f, 98.0f)
                arcToRelative(42.5f, 42.5f, 0.0f, false, false, -6.7f, 6.7f)
                lineTo(132.0f, 98.0f)
                close()
                moveTo(64.0f, 60.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 94.0f, 30.0f)
                horizontalLineToRelative(30.0f)
                lineTo(124.0f, 90.0f)
                lineTo(94.0f, 90.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 64.0f, 60.0f)
                close()
                moveTo(94.0f, 226.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 0.0f, -60.0f)
                horizontalLineToRelative(30.0f)
                verticalLineToRelative(30.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 94.0f, 226.0f)
                close()
                moveTo(124.0f, 158.0f)
                lineTo(94.0f, 158.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 0.0f, -60.0f)
                horizontalLineToRelative(30.0f)
                close()
                moveTo(162.0f, 158.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 0.0f, -60.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 0.0f, 60.0f)
                close()
            }
        }
        .build()
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
