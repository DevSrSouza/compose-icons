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

public val LightGroup.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.9f, 130.6f)
                lineTo(158.2f, 92.3f)
                lineTo(158.2f, 48.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -60.0f, 0.0f)
                lineTo(98.2f, 92.3f)
                lineTo(21.3f, 130.6f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 18.0f, 136.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 2.2f, 4.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, 1.3f)
                lineTo(98.0f, 159.3f)
                verticalLineToRelative(22.2f)
                lineTo(83.8f, 195.8f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 82.0f, 200.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 2.6f, 5.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 5.6f, 0.6f)
                lineTo(128.0f, 222.5f)
                lineToRelative(37.8f, 15.1f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, 2.2f, 0.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 3.4f, -1.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 2.6f, -5.0f)
                lineTo(174.0f, 200.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -1.7f, -4.2f)
                lineToRelative(-14.1f, -14.3f)
                lineTo(158.2f, 159.3f)
                lineTo(231.0f, 173.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, -1.3f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 2.2f, -4.6f)
                lineTo(238.2f, 136.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 234.9f, 130.6f)
                close()
                moveTo(226.2f, 160.7f)
                lineTo(153.4f, 146.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, 1.3f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -2.2f, 4.6f)
                verticalLineToRelative(32.0f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, 1.8f, 4.2f)
                lineToRelative(14.0f, 14.3f)
                verticalLineToRelative(20.6f)
                lineToRelative(-31.8f, -12.7f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, -4.4f, 0.0f)
                lineTo(94.0f, 223.1f)
                lineTo(94.0f, 202.5f)
                lineToRelative(14.2f, -14.3f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 110.0f, 184.0f)
                lineTo(110.0f, 152.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -2.2f, -4.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, -1.3f)
                lineTo(30.0f, 160.7f)
                verticalLineToRelative(-21.0f)
                lineToRelative(76.7f, -38.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 110.0f, 96.0f)
                lineTo(110.0f, 48.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f)
                lineTo(146.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.3f, 5.4f)
                lineToRelative(76.7f, 38.3f)
                close()
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
