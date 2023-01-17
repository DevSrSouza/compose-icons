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

public val SolidGroup.Toolbox: ImageVector
    get() {
        if (_toolbox != null) {
            return _toolbox!!
        }
        _toolbox = Builder(name = "Toolbox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 88.0f)
                verticalLineToRelative(40.0f)
                lineTo(336.0f, 128.0f)
                lineTo(336.0f, 88.0f)
                curveToRelative(0.0f, -4.4f, -3.6f, -8.0f, -8.0f, -8.0f)
                lineTo(184.0f, 80.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                close()
                moveTo(128.0f, 128.0f)
                lineTo(128.0f, 88.0f)
                curveToRelative(0.0f, -30.9f, 25.1f, -56.0f, 56.0f, -56.0f)
                lineTo(328.0f, 32.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, 25.1f, 56.0f, 56.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(28.1f)
                curveToRelative(12.7f, 0.0f, 24.9f, 5.1f, 33.9f, 14.1f)
                lineToRelative(51.9f, 51.9f)
                curveToRelative(9.0f, 9.0f, 14.1f, 21.2f, 14.1f, 33.9f)
                lineTo(512.0f, 304.0f)
                lineTo(384.0f, 304.0f)
                lineTo(384.0f, 288.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(16.0f)
                lineTo(192.0f, 304.0f)
                lineTo(192.0f, 288.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(16.0f)
                lineTo(0.0f, 304.0f)
                lineTo(0.0f, 227.9f)
                curveToRelative(0.0f, -12.7f, 5.1f, -24.9f, 14.1f, -33.9f)
                lineToRelative(51.9f, -51.9f)
                curveToRelative(9.0f, -9.0f, 21.2f, -14.1f, 33.9f, -14.1f)
                lineTo(128.0f, 128.0f)
                close()
                moveTo(0.0f, 416.0f)
                lineTo(0.0f, 336.0f)
                lineTo(128.0f, 336.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(192.0f, 336.0f)
                lineTo(320.0f, 336.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(384.0f, 336.0f)
                lineTo(512.0f, 336.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
