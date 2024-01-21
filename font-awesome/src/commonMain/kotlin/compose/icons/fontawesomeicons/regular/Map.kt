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

public val RegularGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(565.6f, 36.2f)
                curveTo(572.1f, 40.7f, 576.0f, 48.1f, 576.0f, 56.0f)
                lineTo(576.0f, 392.0f)
                curveToRelative(0.0f, 10.0f, -6.2f, 18.9f, -15.5f, 22.4f)
                lineToRelative(-168.0f, 64.0f)
                curveToRelative(-5.2f, 2.0f, -10.9f, 2.1f, -16.1f, 0.3f)
                lineTo(192.5f, 417.5f)
                lineToRelative(-160.0f, 61.0f)
                curveToRelative(-7.4f, 2.8f, -15.7f, 1.8f, -22.2f, -2.7f)
                reflectiveCurveTo(0.0f, 463.9f, 0.0f, 456.0f)
                lineTo(0.0f, 120.0f)
                curveToRelative(0.0f, -10.0f, 6.1f, -18.9f, 15.5f, -22.4f)
                lineToRelative(168.0f, -64.0f)
                curveToRelative(5.2f, -2.0f, 10.9f, -2.1f, 16.1f, -0.3f)
                lineTo(383.5f, 94.5f)
                lineToRelative(160.0f, -61.0f)
                curveToRelative(7.4f, -2.8f, 15.7f, -1.8f, 22.2f, 2.7f)
                close()
                moveTo(48.0f, 136.5f)
                lineTo(48.0f, 421.2f)
                lineToRelative(120.0f, -45.7f)
                lineTo(168.0f, 90.8f)
                lineTo(48.0f, 136.5f)
                close()
                moveTo(360.0f, 422.7f)
                lineTo(360.0f, 137.3f)
                lineToRelative(-144.0f, -48.0f)
                lineTo(216.0f, 374.7f)
                lineToRelative(144.0f, 48.0f)
                close()
                moveTo(408.0f, 421.2f)
                lineToRelative(120.0f, -45.7f)
                lineTo(528.0f, 90.8f)
                lineTo(408.0f, 136.5f)
                lineTo(408.0f, 421.2f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
