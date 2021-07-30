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

public val RegularGroup.ChartBar: ImageVector
    get() {
        if (_chartBar != null) {
            return _chartBar!!
        }
        _chartBar = Builder(name = "ChartBar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(396.8f, 352.0f)
                horizontalLineToRelative(22.4f)
                curveToRelative(6.4f, 0.0f, 12.8f, -6.4f, 12.8f, -12.8f)
                lineTo(432.0f, 108.8f)
                curveToRelative(0.0f, -6.4f, -6.4f, -12.8f, -12.8f, -12.8f)
                horizontalLineToRelative(-22.4f)
                curveToRelative(-6.4f, 0.0f, -12.8f, 6.4f, -12.8f, 12.8f)
                verticalLineToRelative(230.4f)
                curveToRelative(0.0f, 6.4f, 6.4f, 12.8f, 12.8f, 12.8f)
                close()
                moveTo(204.8f, 352.0f)
                horizontalLineToRelative(22.4f)
                curveToRelative(6.4f, 0.0f, 12.8f, -6.4f, 12.8f, -12.8f)
                lineTo(240.0f, 140.8f)
                curveToRelative(0.0f, -6.4f, -6.4f, -12.8f, -12.8f, -12.8f)
                horizontalLineToRelative(-22.4f)
                curveToRelative(-6.4f, 0.0f, -12.8f, 6.4f, -12.8f, 12.8f)
                verticalLineToRelative(198.4f)
                curveToRelative(0.0f, 6.4f, 6.4f, 12.8f, 12.8f, 12.8f)
                close()
                moveTo(300.8f, 352.0f)
                horizontalLineToRelative(22.4f)
                curveToRelative(6.4f, 0.0f, 12.8f, -6.4f, 12.8f, -12.8f)
                lineTo(336.0f, 204.8f)
                curveToRelative(0.0f, -6.4f, -6.4f, -12.8f, -12.8f, -12.8f)
                horizontalLineToRelative(-22.4f)
                curveToRelative(-6.4f, 0.0f, -12.8f, 6.4f, -12.8f, 12.8f)
                verticalLineToRelative(134.4f)
                curveToRelative(0.0f, 6.4f, 6.4f, 12.8f, 12.8f, 12.8f)
                close()
                moveTo(496.0f, 400.0f)
                lineTo(48.0f, 400.0f)
                lineTo(48.0f, 80.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                lineTo(16.0f, 64.0f)
                curveTo(7.16f, 64.0f, 0.0f, 71.16f, 0.0f, 80.0f)
                verticalLineToRelative(336.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(464.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(108.8f, 352.0f)
                horizontalLineToRelative(22.4f)
                curveToRelative(6.4f, 0.0f, 12.8f, -6.4f, 12.8f, -12.8f)
                verticalLineToRelative(-70.4f)
                curveToRelative(0.0f, -6.4f, -6.4f, -12.8f, -12.8f, -12.8f)
                horizontalLineToRelative(-22.4f)
                curveToRelative(-6.4f, 0.0f, -12.8f, 6.4f, -12.8f, 12.8f)
                verticalLineToRelative(70.4f)
                curveToRelative(0.0f, 6.4f, 6.4f, 12.8f, 12.8f, 12.8f)
                close()
            }
        }
        .build()
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
