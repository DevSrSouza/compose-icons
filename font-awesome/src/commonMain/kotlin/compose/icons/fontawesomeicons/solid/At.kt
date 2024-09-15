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
                curveTo(118.94f, 8.0f, 8.0f, 118.92f, 8.0f, 256.0f)
                curveToRelative(0.0f, 137.06f, 110.92f, 248.0f, 248.0f, 248.0f)
                curveToRelative(48.15f, 0.0f, 95.34f, -14.14f, 135.41f, -40.22f)
                curveToRelative(12.01f, -7.82f, 14.63f, -24.29f, 5.55f, -35.37f)
                lineToRelative(-10.18f, -12.43f)
                curveToRelative(-7.67f, -9.37f, -21.18f, -11.67f, -31.37f, -5.13f)
                curveTo(325.92f, 429.76f, 291.31f, 440.0f, 256.0f, 440.0f)
                curveToRelative(-101.46f, 0.0f, -184.0f, -82.54f, -184.0f, -184.0f)
                reflectiveCurveTo(154.54f, 72.0f, 256.0f, 72.0f)
                curveToRelative(100.14f, 0.0f, 184.0f, 57.62f, 184.0f, 160.0f)
                curveToRelative(0.0f, 38.79f, -21.09f, 79.74f, -58.17f, 83.69f)
                curveToRelative(-17.35f, -0.45f, -16.91f, -12.86f, -13.48f, -30.02f)
                lineToRelative(23.43f, -121.11f)
                curveTo(394.65f, 149.75f, 383.31f, 136.0f, 368.23f, 136.0f)
                horizontalLineToRelative(-44.98f)
                arcToRelative(13.52f, 13.52f, 0.0f, false, false, -13.43f, 11.99f)
                lineToRelative(-0.01f, 0.09f)
                curveToRelative(-14.7f, -17.9f, -40.45f, -21.77f, -59.97f, -21.77f)
                curveToRelative(-74.58f, 0.0f, -137.83f, 62.23f, -137.83f, 151.46f)
                curveToRelative(0.0f, 65.3f, 36.78f, 105.87f, 96.0f, 105.87f)
                curveToRelative(26.98f, 0.0f, 57.37f, -15.64f, 74.99f, -38.33f)
                curveToRelative(9.52f, 34.1f, 40.61f, 34.1f, 70.71f, 34.1f)
                curveTo(462.61f, 379.41f, 504.0f, 307.8f, 504.0f, 232.0f)
                curveTo(504.0f, 95.65f, 394.02f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(234.32f, 312.43f)
                curveToRelative(-22.25f, 0.0f, -36.07f, -15.62f, -36.07f, -40.77f)
                curveToRelative(0.0f, -44.99f, 30.78f, -72.73f, 58.63f, -72.73f)
                curveToRelative(22.29f, 0.0f, 35.6f, 15.24f, 35.6f, 40.77f)
                curveToRelative(0.0f, 45.06f, -33.88f, 72.73f, -58.16f, 72.73f)
                close()
            }
        }
        .build()
        return _at!!
    }

private var _at: ImageVector? = null
