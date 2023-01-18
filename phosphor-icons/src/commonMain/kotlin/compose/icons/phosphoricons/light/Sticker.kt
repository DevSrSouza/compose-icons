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

public val LightGroup.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.9f, 136.9f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 0.1f, -0.9f)
                lineTo(222.0f, 88.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, -54.0f, -54.0f)
                lineTo(88.0f, 34.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 34.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 54.0f, 54.0f)
                horizontalLineToRelative(49.0f)
                lineToRelative(0.9f, -0.2f)
                horizontalLineToRelative(0.0f)
                curveToRelative(25.8f, -8.6f, 75.2f, -58.0f, 83.8f, -83.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, 0.2f, -0.9f)
                close()
                moveTo(46.0f, 168.0f)
                lineTo(46.0f, 88.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 88.0f, 46.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, 42.0f)
                verticalLineToRelative(42.0f)
                lineTo(184.0f, 130.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, -54.0f, 54.0f)
                verticalLineToRelative(26.0f)
                lineTo(88.0f, 210.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 46.0f, 168.0f)
                close()
                moveTo(142.0f, 206.7f)
                lineTo(142.0f, 184.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, -42.0f)
                horizontalLineToRelative(22.7f)
                curveTo(194.8f, 163.1f, 163.1f, 194.8f, 142.0f, 206.7f)
                close()
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
