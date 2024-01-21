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

public val SolidGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.6f, 384.9f)
                lineTo(125.7f, 354.0f)
                curveToRelative(-8.5f, -8.5f, -11.5f, -20.8f, -7.7f, -32.2f)
                curveToRelative(3.0f, -8.9f, 7.0f, -20.5f, 11.8f, -33.8f)
                lineTo(24.0f, 288.0f)
                curveToRelative(-8.6f, 0.0f, -16.6f, -4.6f, -20.9f, -12.1f)
                reflectiveCurveToRelative(-4.2f, -16.7f, 0.2f, -24.1f)
                lineToRelative(52.5f, -88.5f)
                curveToRelative(13.0f, -21.9f, 36.5f, -35.3f, 61.9f, -35.3f)
                lineToRelative(82.3f, 0.0f)
                curveToRelative(2.4f, -4.0f, 4.8f, -7.7f, 7.2f, -11.3f)
                curveTo(289.1f, -4.1f, 411.1f, -8.1f, 483.9f, 5.3f)
                curveToRelative(11.6f, 2.1f, 20.6f, 11.2f, 22.8f, 22.8f)
                curveToRelative(13.4f, 72.9f, 9.3f, 194.8f, -111.4f, 276.7f)
                curveToRelative(-3.5f, 2.4f, -7.3f, 4.8f, -11.3f, 7.2f)
                verticalLineToRelative(82.3f)
                curveToRelative(0.0f, 25.4f, -13.4f, 49.0f, -35.3f, 61.9f)
                lineToRelative(-88.5f, 52.5f)
                curveToRelative(-7.4f, 4.4f, -16.6f, 4.5f, -24.1f, 0.2f)
                reflectiveCurveToRelative(-12.1f, -12.2f, -12.1f, -20.9f)
                verticalLineTo(380.8f)
                curveToRelative(-14.1f, 4.9f, -26.4f, 8.9f, -35.7f, 11.9f)
                curveToRelative(-11.2f, 3.6f, -23.4f, 0.5f, -31.8f, -7.8f)
                close()
                moveTo(384.0f, 168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 80.0f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
