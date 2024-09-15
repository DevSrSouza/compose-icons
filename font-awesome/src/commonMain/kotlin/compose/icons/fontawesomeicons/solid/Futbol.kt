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

public val SolidGroup.Futbol: ImageVector
    get() {
        if (_futbol != null) {
            return _futbol!!
        }
        _futbol = Builder(name = "Futbol", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 256.0f)
                curveToRelative(0.0f, 136.97f, -111.03f, 248.0f, -248.0f, 248.0f)
                reflectiveCurveTo(8.0f, 392.97f, 8.0f, 256.0f)
                reflectiveCurveTo(119.03f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.03f, 248.0f, 248.0f)
                close()
                moveTo(456.0f, 256.0f)
                lineToRelative(-0.0f, -0.28f)
                lineToRelative(-26.06f, 22.74f)
                lineToRelative(-62.68f, -58.5f)
                lineToRelative(16.45f, -84.36f)
                lineToRelative(34.3f, 3.07f)
                curveToRelative(-24.89f, -34.22f, -60.0f, -60.09f, -100.71f, -73.14f)
                lineToRelative(13.65f, 31.94f)
                lineTo(256.0f, 139.0f)
                lineToRelative(-74.95f, -41.53f)
                lineToRelative(13.65f, -31.94f)
                curveToRelative(-40.63f, 13.03f, -75.78f, 38.87f, -100.71f, 73.14f)
                lineToRelative(34.56f, -3.07f)
                lineToRelative(16.19f, 84.36f)
                lineToRelative(-62.68f, 58.5f)
                lineToRelative(-26.06f, -22.74f)
                lineToRelative(-0.0f, 0.28f)
                curveToRelative(0.0f, 43.01f, 13.5f, 83.95f, 38.47f, 117.99f)
                lineToRelative(7.7f, -33.9f)
                lineToRelative(85.14f, 10.45f)
                lineToRelative(36.3f, 77.83f)
                lineToRelative(-29.9f, 17.79f)
                curveToRelative(40.2f, 13.12f, 84.29f, 13.15f, 124.57f, 0.0f)
                lineToRelative(-29.9f, -17.79f)
                lineToRelative(36.3f, -77.83f)
                lineToRelative(85.14f, -10.45f)
                lineToRelative(7.7f, 33.9f)
                curveTo(442.5f, 339.95f, 456.0f, 299.02f, 456.0f, 256.0f)
                close()
                moveTo(207.9f, 325.57f)
                lineToRelative(-29.89f, -91.31f)
                lineTo(256.0f, 177.73f)
                lineToRelative(78.0f, 56.53f)
                lineToRelative(-29.62f, 91.31f)
                horizontalLineToRelative(-96.48f)
                close()
            }
        }
        .build()
        return _futbol!!
    }

private var _futbol: ImageVector? = null
