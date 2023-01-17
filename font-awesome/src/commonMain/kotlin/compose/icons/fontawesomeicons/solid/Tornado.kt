package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Tornado: ImageVector
    get() {
        if (_tornado != null) {
            return _tornado!!
        }
        _tornado = Builder(name = "Tornado", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                lineTo(0.0f, 45.6f)
                curveTo(0.0f, 62.7f, 1.7f, 79.6f, 5.0f, 96.0f)
                lineTo(357.8f, 96.0f)
                curveToRelative(3.2f, -6.9f, 7.5f, -13.3f, 13.0f, -18.8f)
                lineToRelative(38.6f, -38.6f)
                curveToRelative(4.2f, -4.2f, 6.6f, -10.0f, 6.6f, -16.0f)
                curveTo(416.0f, 10.1f, 405.9f, 0.0f, 393.4f, 0.0f)
                lineTo(32.0f, 0.0f)
                curveTo(14.3f, 0.0f, 0.0f, 14.3f, 0.0f, 32.0f)
                close()
                moveTo(352.2f, 128.0f)
                lineTo(13.6f, 128.0f)
                curveToRelative(12.2f, 35.9f, 32.3f, 68.7f, 58.8f, 96.0f)
                lineTo(412.0f, 224.0f)
                lineToRelative(-47.2f, -62.9f)
                curveToRelative(-7.3f, -9.7f, -11.6f, -21.2f, -12.6f, -33.1f)
                close()
                moveTo(126.2f, 266.2f)
                lineToRelative(116.4f, 68.5f)
                curveToRelative(8.2f, 4.8f, 15.8f, 10.7f, 22.5f, 17.3f)
                lineTo(445.0f, 352.0f)
                curveToRelative(2.0f, -9.8f, 3.0f, -19.9f, 3.0f, -30.1f)
                curveToRelative(0.0f, -23.0f, -5.3f, -45.5f, -15.3f, -65.9f)
                lineTo(110.2f, 256.0f)
                curveToRelative(5.2f, 3.6f, 10.5f, 7.0f, 16.0f, 10.2f)
                close()
                moveTo(288.0f, 384.0f)
                curveToRelative(10.3f, 21.4f, 13.8f, 45.5f, 9.9f, 69.0f)
                lineToRelative(-5.9f, 35.7f)
                curveToRelative(-2.0f, 12.2f, 7.4f, 23.4f, 19.8f, 23.4f)
                curveToRelative(5.3f, 0.0f, 10.4f, -2.1f, 14.2f, -5.9f)
                lineToRelative(78.2f, -78.2f)
                curveToRelative(12.8f, -12.8f, 23.1f, -27.7f, 30.4f, -43.9f)
                lineTo(288.0f, 384.1f)
                close()
            }
        }
        .build()
        return _tornado!!
    }

private var _tornado: ImageVector? = null
