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

public val SolidGroup.FillDrip: ImageVector
    get() {
        if (_fillDrip != null) {
            return _fillDrip!!
        }
        _fillDrip = Builder(name = "FillDrip", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.4f, 9.4f)
                curveTo(53.9f, -3.1f, 74.1f, -3.1f, 86.6f, 9.4f)
                lineTo(168.0f, 90.7f)
                lineToRelative(53.1f, -53.1f)
                curveToRelative(28.1f, -28.1f, 73.7f, -28.1f, 101.8f, 0.0f)
                lineTo(474.3f, 189.1f)
                curveToRelative(28.1f, 28.1f, 28.1f, 73.7f, 0.0f, 101.8f)
                lineTo(283.9f, 481.4f)
                curveToRelative(-37.5f, 37.5f, -98.3f, 37.5f, -135.8f, 0.0f)
                lineTo(30.6f, 363.9f)
                curveToRelative(-37.5f, -37.5f, -37.5f, -98.3f, 0.0f, -135.8f)
                lineTo(122.7f, 136.0f)
                lineTo(41.4f, 54.6f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.3f)
                close()
                moveTo(217.4f, 230.7f)
                lineTo(168.0f, 181.3f)
                lineTo(75.9f, 273.4f)
                curveToRelative(-4.2f, 4.2f, -7.0f, 9.3f, -8.4f, 14.6f)
                lineTo(386.7f, 288.0f)
                lineToRelative(42.3f, -42.3f)
                curveToRelative(3.1f, -3.1f, 3.1f, -8.2f, 0.0f, -11.3f)
                lineTo(277.7f, 82.9f)
                curveToRelative(-3.1f, -3.1f, -8.2f, -3.1f, -11.3f, 0.0f)
                lineTo(213.3f, 136.0f)
                lineToRelative(49.4f, 49.4f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(-32.8f, 12.5f, -45.3f, 0.0f)
                close()
                moveTo(512.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                curveToRelative(0.0f, -25.2f, 32.6f, -79.6f, 51.2f, -108.7f)
                curveToRelative(6.0f, -9.4f, 19.5f, -9.4f, 25.5f, 0.0f)
                curveTo(543.4f, 368.4f, 576.0f, 422.8f, 576.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _fillDrip!!
    }

private var _fillDrip: ImageVector? = null
