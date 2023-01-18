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

public val LightGroup.Mouse: ImageVector
    get() {
        if (_mouse != null) {
            return _mouse!!
        }
        _mouse = Builder(name = "Mouse", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 26.0f)
                lineTo(108.0f, 26.0f)
                arcTo(62.1f, 62.1f, 0.0f, false, false, 46.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(62.1f, 62.1f, 0.0f, false, false, 62.0f, 62.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(62.1f, 62.1f, 0.0f, false, false, 62.0f, -62.0f)
                lineTo(210.0f, 88.0f)
                arcTo(62.1f, 62.1f, 0.0f, false, false, 148.0f, 26.0f)
                close()
                moveTo(198.0f, 88.0f)
                verticalLineToRelative(18.0f)
                lineTo(134.0f, 106.0f)
                lineTo(134.0f, 38.0f)
                horizontalLineToRelative(14.0f)
                arcTo(50.0f, 50.0f, 0.0f, false, true, 198.0f, 88.0f)
                close()
                moveTo(108.0f, 38.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(68.0f)
                lineTo(58.0f, 106.0f)
                lineTo(58.0f, 88.0f)
                arcTo(50.0f, 50.0f, 0.0f, false, true, 108.0f, 38.0f)
                close()
                moveTo(148.0f, 218.0f)
                lineTo(108.0f, 218.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, -50.0f, -50.0f)
                lineTo(58.0f, 118.0f)
                lineTo(198.0f, 118.0f)
                verticalLineToRelative(50.0f)
                arcTo(50.0f, 50.0f, 0.0f, false, true, 148.0f, 218.0f)
                close()
            }
        }
        .build()
        return _mouse!!
    }

private var _mouse: ImageVector? = null
