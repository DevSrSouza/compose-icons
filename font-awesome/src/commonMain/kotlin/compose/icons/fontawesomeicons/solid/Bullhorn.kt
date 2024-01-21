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

public val SolidGroup.Bullhorn: ImageVector
    get() {
        if (_bullhorn != null) {
            return _bullhorn!!
        }
        _bullhorn = Builder(name = "Bullhorn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 32.0f)
                curveToRelative(0.0f, -12.9f, -7.8f, -24.6f, -19.8f, -29.6f)
                reflectiveCurveToRelative(-25.7f, -2.2f, -34.9f, 6.9f)
                lineTo(381.7f, 53.0f)
                curveToRelative(-48.0f, 48.0f, -113.1f, 75.0f, -181.0f, 75.0f)
                lineTo(192.0f, 128.0f)
                lineTo(160.0f, 128.0f)
                lineTo(64.0f, 128.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(192.0f, 352.0f)
                lineToRelative(8.7f, 0.0f)
                curveToRelative(67.9f, 0.0f, 133.0f, 27.0f, 181.0f, 75.0f)
                lineToRelative(43.6f, 43.6f)
                curveToRelative(9.2f, 9.2f, 22.9f, 11.9f, 34.9f, 6.9f)
                reflectiveCurveToRelative(19.8f, -16.6f, 19.8f, -29.6f)
                lineTo(480.0f, 300.4f)
                curveToRelative(18.6f, -8.8f, 32.0f, -32.5f, 32.0f, -60.4f)
                reflectiveCurveToRelative(-13.4f, -51.6f, -32.0f, -60.4f)
                lineTo(480.0f, 32.0f)
                close()
                moveTo(416.0f, 108.7f)
                lineTo(416.0f, 240.0f)
                lineTo(416.0f, 371.3f)
                curveTo(357.2f, 317.8f, 280.5f, 288.0f, 200.7f, 288.0f)
                lineTo(192.0f, 288.0f)
                lineTo(192.0f, 192.0f)
                horizontalLineToRelative(8.7f)
                curveToRelative(79.8f, 0.0f, 156.5f, -29.8f, 215.3f, -83.3f)
                close()
            }
        }
        .build()
        return _bullhorn!!
    }

private var _bullhorn: ImageVector? = null
