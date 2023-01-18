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

public val LightGroup.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(name = "Balloon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 18.0f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, false, -86.0f, 86.0f)
                curveToRelative(0.0f, 23.0f, 9.2f, 48.5f, 24.7f, 68.3f)
                curveToRelative(12.2f, 15.5f, 26.8f, 26.1f, 42.4f, 30.8f)
                lineTo(98.4f, 229.8f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 0.6f, 5.6f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 5.0f, 2.6f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 5.0f, -2.6f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 0.6f, -5.6f)
                lineToRelative(-10.7f, -26.7f)
                curveToRelative(15.6f, -4.7f, 30.2f, -15.3f, 42.4f, -30.8f)
                curveTo(204.8f, 152.5f, 214.0f, 127.0f, 214.0f, 104.0f)
                arcTo(86.1f, 86.1f, 0.0f, false, false, 128.0f, 18.0f)
                close()
                moveTo(143.1f, 226.0f)
                lineTo(112.9f, 226.0f)
                lineToRelative(8.1f, -20.4f)
                arcToRelative(61.4f, 61.4f, 0.0f, false, false, 14.0f, 0.0f)
                close()
                moveTo(128.0f, 194.0f)
                curveToRelative(-33.5f, 0.0f, -74.0f, -40.1f, -74.0f, -90.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, true, 148.0f, 0.0f)
                curveTo(202.0f, 153.9f, 161.5f, 194.0f, 128.0f, 194.0f)
                close()
                moveTo(176.3f, 101.9f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -5.9f, -5.0f)
                arcTo(41.8f, 41.8f, 0.0f, false, false, 135.0f, 62.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.0f, -11.9f)
                arcTo(54.0f, 54.0f, 0.0f, false, true, 181.3f, 95.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 176.3f, 101.9f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
