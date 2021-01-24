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

public val SolidGroup.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(622.34f, 153.2f)
                lineTo(343.4f, 67.5f)
                curveToRelative(-15.2f, -4.67f, -31.6f, -4.67f, -46.79f, 0.0f)
                lineTo(17.66f, 153.2f)
                curveToRelative(-23.54f, 7.23f, -23.54f, 38.36f, 0.0f, 45.59f)
                lineToRelative(48.63f, 14.94f)
                curveToRelative(-10.67f, 13.19f, -17.23f, 29.28f, -17.88f, 46.9f)
                curveTo(38.78f, 266.15f, 32.0f, 276.11f, 32.0f, 288.0f)
                curveToRelative(0.0f, 10.78f, 5.68f, 19.85f, 13.86f, 25.65f)
                lineTo(20.33f, 428.53f)
                curveTo(18.11f, 438.52f, 25.71f, 448.0f, 35.94f, 448.0f)
                horizontalLineToRelative(56.11f)
                curveToRelative(10.24f, 0.0f, 17.84f, -9.48f, 15.62f, -19.47f)
                lineTo(82.14f, 313.65f)
                curveTo(90.32f, 307.85f, 96.0f, 298.78f, 96.0f, 288.0f)
                curveToRelative(0.0f, -11.57f, -6.47f, -21.25f, -15.66f, -26.87f)
                curveToRelative(0.76f, -15.02f, 8.44f, -28.3f, 20.69f, -36.72f)
                lineTo(296.6f, 284.5f)
                curveToRelative(9.06f, 2.78f, 26.44f, 6.25f, 46.79f, 0.0f)
                lineToRelative(278.95f, -85.7f)
                curveToRelative(23.55f, -7.24f, 23.55f, -38.36f, 0.0f, -45.6f)
                close()
                moveTo(352.79f, 315.09f)
                curveToRelative(-28.53f, 8.76f, -52.84f, 3.92f, -65.59f, 0.0f)
                lineToRelative(-145.02f, -44.55f)
                lineTo(128.0f, 384.0f)
                curveToRelative(0.0f, 35.35f, 85.96f, 64.0f, 192.0f, 64.0f)
                reflectiveCurveToRelative(192.0f, -28.65f, 192.0f, -64.0f)
                lineToRelative(-14.18f, -113.47f)
                lineToRelative(-145.03f, 44.56f)
                close()
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
