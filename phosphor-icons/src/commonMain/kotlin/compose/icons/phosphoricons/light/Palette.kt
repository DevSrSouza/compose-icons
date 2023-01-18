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

public val LightGroup.Palette: ImageVector
    get() {
        if (_palette != null) {
            return _palette!!
        }
        _palette = Builder(name = "Palette", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.4f, 55.3f)
                arcTo(101.5f, 101.5f, 0.0f, false, false, 128.0f, 26.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 94.0f, 224.2f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 40.0f, -28.3f)
                lineTo(134.0f, 192.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, 18.0f, -18.0f)
                horizontalLineToRelative(46.2f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 29.3f, -23.3f)
                arcToRelative(103.4f, 103.4f, 0.0f, false, false, 2.5f, -23.6f)
                arcTo(101.3f, 101.3f, 0.0f, false, false, 199.4f, 55.3f)
                close()
                moveTo(215.8f, 148.0f)
                arcToRelative(17.9f, 17.9f, 0.0f, false, true, -17.6f, 14.0f)
                lineTo(152.0f, 162.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, false, -30.0f, 30.0f)
                verticalLineToRelative(3.9f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -24.0f, 17.0f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 64.1f, 64.7f)
                arcToRelative(88.8f, 88.8f, 0.0f, false, true, 63.0f, -26.7f)
                horizontalLineToRelative(0.9f)
                arcToRelative(90.3f, 90.3f, 0.0f, false, true, 90.0f, 89.2f)
                arcTo(90.8f, 90.8f, 0.0f, false, true, 215.8f, 148.0f)
                close()
                moveTo(138.0f, 76.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 76.0f)
                close()
                moveTo(91.6f, 107.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 74.3f, 97.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 17.3f, 10.0f)
                close()
                moveTo(91.6f, 149.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 78.0f, 145.3f)
                arcTo(10.1f, 10.1f, 0.0f, false, true, 91.6f, 149.0f)
                close()
                moveTo(181.7f, 97.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 168.0f, 93.3f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 181.7f, 97.0f)
                close()
            }
        }
        .build()
        return _palette!!
    }

private var _palette: ImageVector? = null
