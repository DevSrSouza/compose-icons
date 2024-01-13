package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Gem: ImageVector
    get() {
        if (_gem != null) {
            return _gem!!
        }
        _gem = Builder(name = "Gem", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.5f, 72.0f)
                lineTo(256.0f, 165.0f)
                lineToRelative(87.5f, -93.0f)
                horizontalLineToRelative(-175.0f)
                close()
                moveTo(383.9f, 99.1f)
                lineTo(311.5f, 176.0f)
                horizontalLineToRelative(129.0f)
                lineTo(383.9f, 99.1f)
                close()
                moveTo(433.9f, 224.0f)
                lineTo(256.0f, 224.0f)
                lineTo(78.1f, 224.0f)
                lineTo(256.0f, 420.3f)
                lineTo(433.9f, 224.0f)
                close()
                moveTo(71.5f, 176.0f)
                horizontalLineToRelative(129.0f)
                lineTo(128.1f, 99.1f)
                lineTo(71.5f, 176.0f)
                close()
                moveTo(505.8f, 216.1f)
                lineToRelative(-232.0f, 256.0f)
                curveToRelative(-4.5f, 5.0f, -11.0f, 7.9f, -17.8f, 7.9f)
                reflectiveCurveToRelative(-13.2f, -2.9f, -17.8f, -7.9f)
                lineToRelative(-232.0f, -256.0f)
                curveToRelative(-7.7f, -8.5f, -8.3f, -21.2f, -1.5f, -30.4f)
                lineToRelative(112.0f, -152.0f)
                curveToRelative(4.5f, -6.1f, 11.7f, -9.8f, 19.3f, -9.8f)
                lineTo(376.0f, 23.9f)
                curveToRelative(7.6f, 0.0f, 14.8f, 3.6f, 19.3f, 9.8f)
                lineToRelative(112.0f, 152.0f)
                curveToRelative(6.8f, 9.2f, 6.1f, 21.9f, -1.5f, 30.4f)
                close()
            }
        }
        .build()
        return _gem!!
    }

private var _gem: ImageVector? = null
