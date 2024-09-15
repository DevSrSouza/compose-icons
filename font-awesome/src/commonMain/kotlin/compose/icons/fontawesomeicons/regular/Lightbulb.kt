package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 352.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 352.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 80.0f)
                curveToRelative(-52.94f, 0.0f, -96.0f, 43.06f, -96.0f, 96.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.16f, 16.0f, -16.0f)
                curveToRelative(0.0f, -35.3f, 28.72f, -64.0f, 64.0f, -64.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.16f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(96.06f, 459.17f)
                curveToRelative(0.0f, 3.15f, 0.93f, 6.22f, 2.68f, 8.84f)
                lineToRelative(24.51f, 36.84f)
                curveToRelative(2.97f, 4.46f, 7.97f, 7.14f, 13.32f, 7.14f)
                horizontalLineToRelative(78.85f)
                curveToRelative(5.36f, 0.0f, 10.36f, -2.68f, 13.32f, -7.14f)
                lineToRelative(24.51f, -36.84f)
                curveToRelative(1.74f, -2.62f, 2.67f, -5.7f, 2.68f, -8.84f)
                lineToRelative(0.05f, -43.18f)
                horizontalLineTo(96.02f)
                lineToRelative(0.04f, 43.18f)
                close()
                moveTo(176.0f, 0.0f)
                curveTo(73.72f, 0.0f, 0.0f, 82.97f, 0.0f, 176.0f)
                curveToRelative(0.0f, 44.37f, 16.45f, 84.85f, 43.56f, 115.78f)
                curveToRelative(16.64f, 18.99f, 42.74f, 58.8f, 52.42f, 92.16f)
                verticalLineToRelative(0.06f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(-0.12f)
                curveToRelative(-0.01f, -4.77f, -0.72f, -9.51f, -2.15f, -14.07f)
                curveToRelative(-5.59f, -17.81f, -22.82f, -64.77f, -62.17f, -109.67f)
                curveToRelative(-20.54f, -23.43f, -31.52f, -53.15f, -31.61f, -84.14f)
                curveToRelative(-0.2f, -73.64f, 59.67f, -128.0f, 127.95f, -128.0f)
                curveToRelative(70.58f, 0.0f, 128.0f, 57.42f, 128.0f, 128.0f)
                curveToRelative(0.0f, 30.97f, -11.24f, 60.85f, -31.65f, 84.14f)
                curveToRelative(-39.11f, 44.61f, -56.42f, 91.47f, -62.1f, 109.46f)
                arcToRelative(47.51f, 47.51f, 0.0f, false, false, -2.22f, 14.3f)
                verticalLineToRelative(0.1f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(-0.05f)
                curveToRelative(9.68f, -33.37f, 35.78f, -73.18f, 52.42f, -92.16f)
                curveTo(335.55f, 260.85f, 352.0f, 220.37f, 352.0f, 176.0f)
                curveTo(352.0f, 78.8f, 273.2f, 0.0f, 176.0f, 0.0f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
