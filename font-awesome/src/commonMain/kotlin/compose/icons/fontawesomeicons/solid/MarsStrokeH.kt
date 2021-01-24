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

public val SolidGroup.MarsStrokeH: ImageVector
    get() {
        if (_marsStrokeH != null) {
            return _marsStrokeH!!
        }
        _marsStrokeH = Builder(name = "MarsStrokeH", defaultWidth = 480.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 480.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(476.2f, 247.5f)
                lineToRelative(-55.9f, -55.9f)
                curveToRelative(-7.6f, -7.6f, -20.5f, -2.2f, -20.5f, 8.5f)
                lineTo(399.8f, 224.0f)
                lineTo(376.0f, 224.0f)
                verticalLineToRelative(-20.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-40.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, 5.4f, -12.0f, 12.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-27.6f)
                curveToRelative(-5.8f, -25.6f, -18.7f, -49.9f, -38.6f, -69.8f)
                curveTo(189.6f, 98.0f, 98.4f, 98.0f, 42.2f, 154.2f)
                curveToRelative(-56.2f, 56.2f, -56.2f, 147.4f, 0.0f, 203.6f)
                curveToRelative(56.2f, 56.2f, 147.4f, 56.2f, 203.6f, 0.0f)
                curveToRelative(19.9f, -19.9f, 32.8f, -44.2f, 38.6f, -69.8f)
                lineTo(312.0f, 288.0f)
                verticalLineToRelative(20.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-20.0f)
                horizontalLineToRelative(23.9f)
                verticalLineToRelative(23.9f)
                curveToRelative(0.0f, 10.7f, 12.9f, 16.0f, 20.5f, 8.5f)
                lineToRelative(55.9f, -55.9f)
                curveToRelative(4.6f, -4.7f, 4.6f, -12.3f, -0.1f, -17.0f)
                close()
                moveTo(200.6f, 312.6f)
                curveToRelative(-31.2f, 31.2f, -81.9f, 31.2f, -113.1f, 0.0f)
                curveToRelative(-31.2f, -31.2f, -31.2f, -81.9f, 0.0f, -113.1f)
                curveToRelative(31.2f, -31.2f, 81.9f, -31.2f, 113.1f, 0.0f)
                curveToRelative(31.2f, 31.1f, 31.2f, 81.9f, 0.0f, 113.1f)
                close()
            }
        }
        .build()
        return _marsStrokeH!!
    }

private var _marsStrokeH: ImageVector? = null
