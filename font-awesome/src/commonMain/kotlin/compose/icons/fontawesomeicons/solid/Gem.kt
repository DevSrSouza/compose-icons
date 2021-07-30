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

public val SolidGroup.Gem: ImageVector
    get() {
        if (_gem != null) {
            return _gem!!
        }
        _gem = Builder(name = "Gem", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(485.5f, 0.0f)
                lineTo(576.0f, 160.0f)
                lineTo(474.9f, 160.0f)
                lineTo(405.7f, 0.0f)
                horizontalLineToRelative(79.8f)
                close()
                moveTo(357.5f, 0.0f)
                lineToRelative(69.2f, 160.0f)
                lineTo(149.3f, 160.0f)
                lineTo(218.5f, 0.0f)
                horizontalLineToRelative(139.0f)
                close()
                moveTo(90.5f, 0.0f)
                horizontalLineToRelative(79.8f)
                lineToRelative(-69.2f, 160.0f)
                lineTo(0.0f, 160.0f)
                lineTo(90.5f, 0.0f)
                close()
                moveTo(0.0f, 192.0f)
                horizontalLineToRelative(100.7f)
                lineToRelative(123.0f, 251.7f)
                curveToRelative(1.5f, 3.1f, -2.7f, 5.9f, -5.0f, 3.3f)
                lineTo(0.0f, 192.0f)
                close()
                moveTo(148.2f, 192.0f)
                horizontalLineToRelative(279.6f)
                lineToRelative(-137.0f, 318.2f)
                curveToRelative(-1.0f, 2.4f, -4.5f, 2.4f, -5.5f, 0.0f)
                lineTo(148.2f, 192.0f)
                close()
                moveTo(352.3f, 443.7f)
                lineToRelative(123.0f, -251.7f)
                lineTo(576.0f, 192.0f)
                lineTo(357.3f, 446.9f)
                curveToRelative(-2.3f, 2.7f, -6.5f, -0.1f, -5.0f, -3.2f)
                close()
            }
        }
        .build()
        return _gem!!
    }

private var _gem: ImageVector? = null
