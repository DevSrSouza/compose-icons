package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ChartLine: ImageVector
    get() {
        if (_chartLine != null) {
            return _chartLine!!
        }
        _chartLine = Builder(name = "ChartLine", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 384.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(16.0f)
                curveTo(7.16f, 64.0f, 0.0f, 71.16f, 0.0f, 80.0f)
                verticalLineToRelative(336.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(464.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(464.0f, 96.0f)
                horizontalLineTo(345.94f)
                curveToRelative(-21.38f, 0.0f, -32.09f, 25.85f, -16.97f, 40.97f)
                lineToRelative(32.4f, 32.4f)
                lineTo(288.0f, 242.75f)
                lineToRelative(-73.37f, -73.37f)
                curveToRelative(-12.5f, -12.5f, -32.76f, -12.5f, -45.25f, 0.0f)
                lineToRelative(-68.69f, 68.69f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0.0f, 22.63f)
                lineToRelative(22.62f, 22.62f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0.0f)
                lineTo(192.0f, 237.25f)
                lineToRelative(73.37f, 73.37f)
                curveToRelative(12.5f, 12.5f, 32.76f, 12.5f, 45.25f, 0.0f)
                lineToRelative(96.0f, -96.0f)
                lineToRelative(32.4f, 32.4f)
                curveToRelative(15.12f, 15.12f, 40.97f, 4.41f, 40.97f, -16.97f)
                verticalLineTo(112.0f)
                curveToRelative(0.01f, -8.84f, -7.15f, -16.0f, -15.99f, -16.0f)
                close()
            }
        }
        .build()
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
