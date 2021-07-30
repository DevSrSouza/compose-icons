package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Speakap: ImageVector
    get() {
        if (_speakap != null) {
            return _speakap!!
        }
        _speakap = Builder(name = "Speakap", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 391.78f)
                curveTo(-15.41f, 303.59f, -8.0f, 167.42f, 80.64f, 87.64f)
                reflectiveCurveToRelative(224.8f, -73.0f, 304.21f, 15.24f)
                reflectiveCurveToRelative(72.0f, 224.36f, -16.64f, 304.14f)
                curveToRelative(-18.74f, 16.87f, 64.0f, 43.09f, 42.0f, 52.26f)
                curveToRelative(-82.06f, 34.21f, -253.91f, 35.0f, -346.23f, -67.5f)
                close()
                moveTo(277.31f, 180.18f)
                lineToRelative(38.5f, -40.86f)
                curveToRelative(-9.61f, -8.89f, -32.0f, -26.83f, -76.17f, -27.6f)
                curveToRelative(-52.33f, -0.91f, -95.86f, 28.3f, -96.77f, 80.0f)
                curveToRelative(-0.2f, 11.33f, 0.29f, 36.72f, 29.42f, 54.83f)
                curveToRelative(34.46f, 21.42f, 86.52f, 21.51f, 86.0f, 52.26f)
                curveToRelative(-0.37f, 21.28f, -26.42f, 25.81f, -38.59f, 25.6f)
                curveToRelative(-3.0f, -0.05f, -30.23f, -0.46f, -47.61f, -24.62f)
                lineToRelative(-40.0f, 42.61f)
                curveToRelative(28.16f, 27.0f, 59.0f, 32.62f, 83.49f, 33.05f)
                curveToRelative(10.23f, 0.18f, 96.42f, 0.33f, 97.84f, -81.0f)
                curveToRelative(0.28f, -15.81f, -2.07f, -39.72f, -28.86f, -56.59f)
                curveToRelative(-34.36f, -21.64f, -85.0f, -19.45f, -84.43f, -49.75f)
                curveToRelative(0.41f, -23.25f, 31.0f, -25.37f, 37.53f, -25.26f)
                curveToRelative(0.43f, 0.0f, 26.62f, 0.26f, 39.62f, 17.37f)
                close()
            }
        }
        .build()
        return _speakap!!
    }

private var _speakap: ImageVector? = null
