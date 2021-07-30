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

public val SolidGroup.ChartBar: ImageVector
    get() {
        if (_chartBar != null) {
            return _chartBar!!
        }
        _chartBar = Builder(name = "ChartBar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(332.8f, 320.0f)
                horizontalLineToRelative(38.4f)
                curveToRelative(6.4f, 0.0f, 12.8f, -6.4f, 12.8f, -12.8f)
                lineTo(384.0f, 172.8f)
                curveToRelative(0.0f, -6.4f, -6.4f, -12.8f, -12.8f, -12.8f)
                horizontalLineToRelative(-38.4f)
                curveToRelative(-6.4f, 0.0f, -12.8f, 6.4f, -12.8f, 12.8f)
                verticalLineToRelative(134.4f)
                curveToRelative(0.0f, 6.4f, 6.4f, 12.8f, 12.8f, 12.8f)
                close()
                moveTo(428.8f, 320.0f)
                horizontalLineToRelative(38.4f)
                curveToRelative(6.4f, 0.0f, 12.8f, -6.4f, 12.8f, -12.8f)
                lineTo(480.0f, 76.8f)
                curveToRelative(0.0f, -6.4f, -6.4f, -12.8f, -12.8f, -12.8f)
                horizontalLineToRelative(-38.4f)
                curveToRelative(-6.4f, 0.0f, -12.8f, 6.4f, -12.8f, 12.8f)
                verticalLineToRelative(230.4f)
                curveToRelative(0.0f, 6.4f, 6.4f, 12.8f, 12.8f, 12.8f)
                close()
                moveTo(140.8f, 320.0f)
                horizontalLineToRelative(38.4f)
                curveToRelative(6.4f, 0.0f, 12.8f, -6.4f, 12.8f, -12.8f)
                verticalLineToRelative(-70.4f)
                curveToRelative(0.0f, -6.4f, -6.4f, -12.8f, -12.8f, -12.8f)
                horizontalLineToRelative(-38.4f)
                curveToRelative(-6.4f, 0.0f, -12.8f, 6.4f, -12.8f, 12.8f)
                verticalLineToRelative(70.4f)
                curveToRelative(0.0f, 6.4f, 6.4f, 12.8f, 12.8f, 12.8f)
                close()
                moveTo(236.8f, 320.0f)
                horizontalLineToRelative(38.4f)
                curveToRelative(6.4f, 0.0f, 12.8f, -6.4f, 12.8f, -12.8f)
                lineTo(288.0f, 108.8f)
                curveToRelative(0.0f, -6.4f, -6.4f, -12.8f, -12.8f, -12.8f)
                horizontalLineToRelative(-38.4f)
                curveToRelative(-6.4f, 0.0f, -12.8f, 6.4f, -12.8f, 12.8f)
                verticalLineToRelative(198.4f)
                curveToRelative(0.0f, 6.4f, 6.4f, 12.8f, 12.8f, 12.8f)
                close()
                moveTo(496.0f, 384.0f)
                lineTo(64.0f, 384.0f)
                lineTo(64.0f, 80.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                lineTo(16.0f, 64.0f)
                curveTo(7.16f, 64.0f, 0.0f, 71.16f, 0.0f, 80.0f)
                verticalLineToRelative(336.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(464.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
