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

public val SolidGroup.Disease: ImageVector
    get() {
        if (_disease != null) {
            return _disease!!
        }
        _disease = Builder(name = "Disease", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.4f, 61.4f)
                lineTo(227.0f, 75.5f)
                curveToRelative(-21.3f, 32.0f, -59.4f, 48.5f, -97.3f, 42.1f)
                lineToRelative(-59.6f, -9.9f)
                curveTo(33.4f, 101.6f, 0.0f, 129.9f, 0.1f, 167.1f)
                curveToRelative(0.0f, 15.9f, 6.4f, 31.2f, 17.6f, 42.5f)
                lineToRelative(29.2f, 29.2f)
                curveToRelative(11.0f, 11.0f, 17.2f, 25.9f, 17.2f, 41.5f)
                curveToRelative(0.0f, 15.8f, -6.4f, 30.9f, -17.7f, 42.0f)
                lineTo(33.3f, 335.1f)
                curveTo(22.2f, 345.9f, 16.0f, 360.7f, 16.0f, 376.2f)
                curveToRelative(0.0f, 36.8f, 34.1f, 64.2f, 70.1f, 56.2f)
                lineToRelative(62.3f, -13.8f)
                curveToRelative(7.7f, -1.7f, 15.7f, -2.6f, 23.6f, -2.6f)
                horizontalLineToRelative(10.0f)
                curveToRelative(27.2f, 0.0f, 53.7f, 9.3f, 75.0f, 26.3f)
                lineTo(287.8f, 467.0f)
                curveToRelative(10.5f, 8.4f, 23.6f, 13.0f, 37.0f, 13.0f)
                curveToRelative(32.7f, 0.0f, 59.3f, -26.5f, 59.3f, -59.3f)
                lineToRelative(0.0f, -25.2f)
                curveToRelative(0.0f, -34.9f, 21.4f, -66.2f, 53.9f, -78.8f)
                lineToRelative(36.9f, -14.3f)
                curveToRelative(22.4f, -8.7f, 37.2f, -30.3f, 37.2f, -54.3f)
                curveToRelative(0.0f, -28.1f, -20.1f, -52.3f, -47.8f, -57.3f)
                lineToRelative(-28.0f, -5.1f)
                curveToRelative(-36.5f, -6.7f, -65.4f, -34.5f, -73.6f, -70.7f)
                lineToRelative(-7.1f, -31.5f)
                curveTo(348.9f, 53.4f, 322.1f, 32.0f, 291.3f, 32.0f)
                curveToRelative(-22.0f, 0.0f, -42.6f, 11.0f, -54.9f, 29.4f)
                close()
                moveTo(160.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(288.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -32.0f, 0.0f)
                close()
                moveTo(288.0f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _disease!!
    }

private var _disease: ImageVector? = null
