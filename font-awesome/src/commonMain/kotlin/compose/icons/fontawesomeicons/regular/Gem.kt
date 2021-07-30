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
        _gem = Builder(name = "Gem", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 0.0f)
                lineTo(112.0f, 0.0f)
                curveToRelative(-4.0f, 0.0f, -7.8f, 2.0f, -10.0f, 5.4f)
                lineTo(2.0f, 152.6f)
                curveToRelative(-2.9f, 4.4f, -2.6f, 10.2f, 0.7f, 14.2f)
                lineToRelative(276.0f, 340.8f)
                curveToRelative(4.8f, 5.9f, 13.8f, 5.9f, 18.6f, 0.0f)
                lineToRelative(276.0f, -340.8f)
                curveToRelative(3.3f, -4.1f, 3.6f, -9.8f, 0.7f, -14.2f)
                lineTo(474.1f, 5.4f)
                curveTo(471.8f, 2.0f, 468.1f, 0.0f, 464.0f, 0.0f)
                close()
                moveTo(444.7f, 48.0f)
                lineToRelative(63.3f, 96.0f)
                horizontalLineToRelative(-68.4f)
                lineToRelative(-51.7f, -96.0f)
                horizontalLineToRelative(56.8f)
                close()
                moveTo(242.6f, 48.0f)
                horizontalLineToRelative(90.7f)
                lineToRelative(51.7f, 96.0f)
                lineTo(191.0f, 144.0f)
                lineToRelative(51.6f, -96.0f)
                close()
                moveTo(131.3f, 48.0f)
                horizontalLineToRelative(56.8f)
                lineToRelative(-51.7f, 96.0f)
                lineTo(68.0f, 144.0f)
                lineToRelative(63.3f, -96.0f)
                close()
                moveTo(88.3f, 192.0f)
                horizontalLineToRelative(51.4f)
                lineTo(208.0f, 352.0f)
                lineTo(88.3f, 192.0f)
                close()
                moveTo(191.2f, 192.0f)
                horizontalLineToRelative(193.6f)
                lineTo(288.0f, 435.3f)
                lineTo(191.2f, 192.0f)
                close()
                moveTo(368.0f, 352.0f)
                lineToRelative(68.2f, -160.0f)
                horizontalLineToRelative(51.4f)
                lineTo(368.0f, 352.0f)
                close()
            }
        }
        .build()
        return _gem!!
    }

private var _gem: ImageVector? = null
