package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.TrafficLightFill: ImageVector
    get() {
        if (_trafficLightFill != null) {
            return _trafficLightFill!!
        }
        _trafficLightFill = Builder(name = "TrafficLightFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 4.0f)
                lineTo(7.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.5f, -2.5f, 3.5f, -3.0f, 3.5f)
                lineTo(17.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.5f, -2.5f, 3.5f, -3.0f, 3.5f)
                lineTo(17.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.5f, -2.5f, 3.5f, -3.0f, 3.5f)
                lineTo(17.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(8.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(-0.5f, 0.0f, -3.0f, -1.0f, -3.0f, -3.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(-0.5f, 0.0f, -3.0f, -1.0f, -3.0f, -3.5f)
                horizontalLineToRelative(3.0f)
                lineTo(7.0f, 7.5f)
                curveToRelative(-0.5f, 0.0f, -3.0f, -1.0f, -3.0f, -3.5f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _trafficLightFill!!
    }

private var _trafficLightFill: ImageVector? = null
