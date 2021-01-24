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

public val SolidGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 352.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 352.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.06f, 454.35f)
                curveToRelative(0.01f, 6.29f, 1.87f, 12.45f, 5.36f, 17.69f)
                lineToRelative(17.09f, 25.69f)
                arcToRelative(31.99f, 31.99f, 0.0f, false, false, 26.64f, 14.28f)
                horizontalLineToRelative(61.71f)
                arcToRelative(31.99f, 31.99f, 0.0f, false, false, 26.64f, -14.28f)
                lineToRelative(17.09f, -25.69f)
                arcToRelative(31.989f, 31.989f, 0.0f, false, false, 5.36f, -17.69f)
                lineToRelative(0.04f, -38.35f)
                lineTo(96.01f, 416.0f)
                lineToRelative(0.05f, 38.35f)
                close()
                moveTo(0.0f, 176.0f)
                curveToRelative(0.0f, 44.37f, 16.45f, 84.85f, 43.56f, 115.78f)
                curveToRelative(16.52f, 18.85f, 42.36f, 58.23f, 52.21f, 91.45f)
                curveToRelative(0.04f, 0.26f, 0.07f, 0.52f, 0.11f, 0.78f)
                horizontalLineToRelative(160.24f)
                curveToRelative(0.04f, -0.26f, 0.07f, -0.51f, 0.11f, -0.78f)
                curveToRelative(9.85f, -33.22f, 35.69f, -72.6f, 52.21f, -91.45f)
                curveTo(335.55f, 260.85f, 352.0f, 220.37f, 352.0f, 176.0f)
                curveTo(352.0f, 78.61f, 272.91f, -0.3f, 175.45f, 0.0f)
                curveTo(73.44f, 0.31f, 0.0f, 82.97f, 0.0f, 176.0f)
                close()
                moveTo(176.0f, 96.0f)
                curveToRelative(-44.11f, 0.0f, -80.0f, 35.89f, -80.0f, 80.0f)
                curveToRelative(0.0f, 8.84f, -7.16f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.16f, -16.0f, -16.0f)
                curveToRelative(0.0f, -61.76f, 50.24f, -112.0f, 112.0f, -112.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, 7.16f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.16f, 16.0f, -16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
