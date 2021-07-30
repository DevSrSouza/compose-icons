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

public val BrandsGroup.CreativeCommons: ImageVector
    get() {
        if (_creativeCommons != null) {
            return _creativeCommons!!
        }
        _creativeCommons = Builder(name = "CreativeCommons", defaultWidth = 496.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.83f, 214.87f)
                lineToRelative(-33.22f, 17.28f)
                curveToRelative(-9.43f, -19.58f, -25.24f, -19.93f, -27.46f, -19.93f)
                curveToRelative(-22.13f, 0.0f, -33.22f, 14.61f, -33.22f, 43.84f)
                curveToRelative(0.0f, 23.57f, 9.21f, 43.84f, 33.22f, 43.84f)
                curveToRelative(14.47f, 0.0f, 24.65f, -7.09f, 30.57f, -21.26f)
                lineToRelative(30.55f, 15.5f)
                curveToRelative(-6.17f, 11.51f, -25.69f, 38.98f, -65.1f, 38.98f)
                curveToRelative(-22.6f, 0.0f, -73.96f, -10.32f, -73.96f, -77.05f)
                curveToRelative(0.0f, -58.69f, 43.0f, -77.06f, 72.63f, -77.06f)
                curveToRelative(30.72f, -0.01f, 52.7f, 11.95f, 65.99f, 35.86f)
                close()
                moveTo(388.88f, 214.87f)
                lineToRelative(-32.78f, 17.28f)
                curveToRelative(-9.5f, -19.77f, -25.72f, -19.93f, -27.9f, -19.93f)
                curveToRelative(-22.14f, 0.0f, -33.22f, 14.61f, -33.22f, 43.84f)
                curveToRelative(0.0f, 23.55f, 9.23f, 43.84f, 33.22f, 43.84f)
                curveToRelative(14.45f, 0.0f, 24.65f, -7.09f, 30.54f, -21.26f)
                lineToRelative(31.0f, 15.5f)
                curveToRelative(-2.1f, 3.75f, -21.39f, 38.98f, -65.09f, 38.98f)
                curveToRelative(-22.69f, 0.0f, -73.96f, -9.87f, -73.96f, -77.05f)
                curveToRelative(0.0f, -58.67f, 42.97f, -77.06f, 72.63f, -77.06f)
                curveToRelative(30.71f, -0.01f, 52.58f, 11.95f, 65.56f, 35.86f)
                close()
                moveTo(247.56f, 8.05f)
                curveTo(104.74f, 8.05f, 0.0f, 123.11f, 0.0f, 256.05f)
                curveToRelative(0.0f, 138.49f, 113.6f, 248.0f, 247.56f, 248.0f)
                curveToRelative(129.93f, 0.0f, 248.44f, -100.87f, 248.44f, -248.0f)
                curveToRelative(0.0f, -137.87f, -106.62f, -248.0f, -248.44f, -248.0f)
                close()
                moveTo(248.43f, 458.86f)
                curveToRelative(-112.54f, 0.0f, -203.7f, -93.04f, -203.7f, -202.81f)
                curveToRelative(0.0f, -105.42f, 85.43f, -203.27f, 203.72f, -203.27f)
                curveToRelative(112.53f, 0.0f, 202.82f, 89.46f, 202.82f, 203.26f)
                curveToRelative(-0.01f, 121.69f, -99.68f, 202.82f, -202.84f, 202.82f)
                close()
            }
        }
        .build()
        return _creativeCommons!!
    }

private var _creativeCommons: ImageVector? = null
