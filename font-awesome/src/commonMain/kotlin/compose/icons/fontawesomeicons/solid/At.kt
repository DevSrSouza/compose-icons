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

public val SolidGroup.At: ImageVector
    get() {
        if (_at != null) {
            return _at!!
        }
        _at = Builder(name = "At", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(118.941f, 8.0f, 8.0f, 118.919f, 8.0f, 256.0f)
                curveToRelative(0.0f, 137.059f, 110.919f, 248.0f, 248.0f, 248.0f)
                curveToRelative(48.154f, 0.0f, 95.342f, -14.14f, 135.408f, -40.223f)
                curveToRelative(12.005f, -7.815f, 14.625f, -24.288f, 5.552f, -35.372f)
                lineToRelative(-10.177f, -12.433f)
                curveToRelative(-7.671f, -9.371f, -21.179f, -11.667f, -31.373f, -5.129f)
                curveTo(325.92f, 429.757f, 291.314f, 440.0f, 256.0f, 440.0f)
                curveToRelative(-101.458f, 0.0f, -184.0f, -82.542f, -184.0f, -184.0f)
                reflectiveCurveTo(154.542f, 72.0f, 256.0f, 72.0f)
                curveToRelative(100.139f, 0.0f, 184.0f, 57.619f, 184.0f, 160.0f)
                curveToRelative(0.0f, 38.786f, -21.093f, 79.742f, -58.17f, 83.693f)
                curveToRelative(-17.349f, -0.454f, -16.91f, -12.857f, -13.476f, -30.024f)
                lineToRelative(23.433f, -121.11f)
                curveTo(394.653f, 149.75f, 383.308f, 136.0f, 368.225f, 136.0f)
                horizontalLineToRelative(-44.981f)
                arcToRelative(13.518f, 13.518f, 0.0f, false, false, -13.432f, 11.993f)
                lineToRelative(-0.01f, 0.092f)
                curveToRelative(-14.697f, -17.901f, -40.448f, -21.775f, -59.971f, -21.775f)
                curveToRelative(-74.58f, 0.0f, -137.831f, 62.234f, -137.831f, 151.46f)
                curveToRelative(0.0f, 65.303f, 36.785f, 105.87f, 96.0f, 105.87f)
                curveToRelative(26.984f, 0.0f, 57.369f, -15.637f, 74.991f, -38.333f)
                curveToRelative(9.522f, 34.104f, 40.613f, 34.103f, 70.71f, 34.103f)
                curveTo(462.609f, 379.41f, 504.0f, 307.798f, 504.0f, 232.0f)
                curveTo(504.0f, 95.653f, 394.023f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(234.32f, 312.43f)
                curveToRelative(-22.249f, 0.0f, -36.07f, -15.623f, -36.07f, -40.771f)
                curveToRelative(0.0f, -44.993f, 30.779f, -72.729f, 58.63f, -72.729f)
                curveToRelative(22.292f, 0.0f, 35.601f, 15.241f, 35.601f, 40.77f)
                curveToRelative(0.0f, 45.061f, -33.875f, 72.73f, -58.161f, 72.73f)
                close()
            }
        }
        .build()
        return _at!!
    }

private var _at: ImageVector? = null
