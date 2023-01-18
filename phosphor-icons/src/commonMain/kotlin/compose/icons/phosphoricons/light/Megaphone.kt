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

public val LightGroup.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 120.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -46.0f, -46.0f)
                lineTo(152.0f, 74.0f)
                curveToRelative(-0.5f, 0.0f, -52.8f, -0.5f, -103.0f, -42.5f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 42.2f)
                lineTo(26.0f, 197.8f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 8.1f, 12.7f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 5.9f, 1.3f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 9.0f, -3.3f)
                curveToRelative(40.1f, -33.6f, 81.8f, -40.6f, 97.0f, -42.1f)
                verticalLineToRelative(37.3f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 6.2f, 11.7f)
                lineToRelative(11.0f, 7.3f)
                arcTo(14.8f, 14.8f, 0.0f, false, false, 171.0f, 225.0f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, 5.0f, -0.9f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 8.6f, -9.7f)
                lineToRelative(12.1f, -48.6f)
                arcTo(46.1f, 46.1f, 0.0f, false, false, 238.0f, 120.0f)
                close()
                moveTo(41.3f, 199.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.2f, 0.2f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.1f, -1.8f)
                lineTo(38.0f, 42.2f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.1f, -1.8f)
                lineToRelative(0.9f, -0.2f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.3f, 0.5f)
                curveToRelative(43.9f, 36.8f, 88.8f, 43.7f, 104.7f, 45.0f)
                verticalLineToRelative(68.6f)
                curveTo(130.1f, 155.6f, 85.2f, 162.5f, 41.3f, 199.4f)
                close()
                moveTo(172.9f, 211.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.0f, 1.2f)
                lineToRelative(-11.0f, -7.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.9f, -1.7f)
                lineTo(158.0f, 166.0f)
                horizontalLineToRelative(26.3f)
                close()
                moveTo(192.0f, 154.0f)
                lineTo(158.0f, 154.0f)
                lineTo(158.0f, 86.0f)
                horizontalLineToRelative(34.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, 68.0f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
