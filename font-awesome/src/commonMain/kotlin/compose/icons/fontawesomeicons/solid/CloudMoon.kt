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

public val SolidGroup.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) {
            return _cloudMoon!!
        }
        _cloudMoon = Builder(name = "CloudMoon", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(342.8f, 352.7f)
                curveToRelative(5.7f, -9.6f, 9.2f, -20.7f, 9.2f, -32.7f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                curveToRelative(-17.2f, 0.0f, -32.8f, 6.9f, -44.3f, 17.9f)
                curveToRelative(-16.3f, -29.6f, -47.5f, -49.9f, -83.7f, -49.9f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                curveToRelative(0.0f, 2.0f, 0.5f, 3.8f, 0.6f, 5.7f)
                curveTo(27.1f, 338.8f, 0.0f, 374.1f, 0.0f, 416.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                horizontalLineToRelative(240.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, -35.8f, 80.0f, -80.0f)
                curveToRelative(0.0f, -41.9f, -32.3f, -75.8f, -73.2f, -79.3f)
                close()
                moveTo(565.3f, 298.4f)
                curveToRelative(-93.1f, 17.7f, -178.5f, -53.7f, -178.5f, -147.7f)
                curveToRelative(0.0f, -54.2f, 29.0f, -104.0f, 76.1f, -130.8f)
                curveToRelative(7.3f, -4.1f, 5.4f, -15.1f, -2.8f, -16.7f)
                curveTo(448.4f, 1.1f, 436.7f, 0.0f, 425.0f, 0.0f)
                curveTo(319.1f, 0.0f, 233.1f, 85.9f, 233.1f, 192.0f)
                curveToRelative(0.0f, 8.5f, 0.7f, 16.8f, 1.8f, 25.0f)
                curveToRelative(5.9f, 4.3f, 11.6f, 8.9f, 16.7f, 14.2f)
                curveToRelative(11.4f, -4.7f, 23.7f, -7.2f, 36.4f, -7.2f)
                curveToRelative(52.9f, 0.0f, 96.0f, 43.1f, 96.0f, 96.0f)
                curveToRelative(0.0f, 3.6f, -0.2f, 7.2f, -0.6f, 10.7f)
                curveToRelative(23.6f, 10.8f, 42.4f, 29.5f, 53.5f, 52.6f)
                curveToRelative(54.4f, -3.4f, 103.7f, -29.3f, 137.1f, -70.4f)
                curveToRelative(5.3f, -6.5f, -0.5f, -16.1f, -8.7f, -14.5f)
                close()
            }
        }
        .build()
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
