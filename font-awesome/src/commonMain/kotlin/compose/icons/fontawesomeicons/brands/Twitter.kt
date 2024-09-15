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

public val BrandsGroup.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(459.37f, 151.72f)
                curveToRelative(0.32f, 4.55f, 0.32f, 9.1f, 0.32f, 13.65f)
                curveToRelative(0.0f, 138.72f, -105.58f, 298.56f, -298.56f, 298.56f)
                curveToRelative(-59.45f, 0.0f, -114.68f, -17.22f, -161.14f, -47.11f)
                curveToRelative(8.45f, 0.97f, 16.57f, 1.3f, 25.34f, 1.3f)
                curveToRelative(49.06f, 0.0f, 94.21f, -16.57f, 130.27f, -44.83f)
                curveToRelative(-46.13f, -0.98f, -84.79f, -31.19f, -98.11f, -72.77f)
                curveToRelative(6.5f, 0.97f, 12.99f, 1.62f, 19.82f, 1.62f)
                curveToRelative(9.42f, 0.0f, 18.84f, -1.3f, 27.61f, -3.57f)
                curveToRelative(-48.08f, -9.75f, -84.14f, -51.98f, -84.14f, -102.99f)
                verticalLineToRelative(-1.3f)
                curveToRelative(13.97f, 7.8f, 30.21f, 12.67f, 47.43f, 13.32f)
                curveToRelative(-28.26f, -18.84f, -46.78f, -51.01f, -46.78f, -87.39f)
                curveToRelative(0.0f, -19.49f, 5.2f, -37.36f, 14.29f, -52.95f)
                curveToRelative(51.65f, 63.67f, 129.3f, 105.26f, 216.37f, 109.81f)
                curveToRelative(-1.62f, -7.8f, -2.6f, -15.92f, -2.6f, -24.04f)
                curveToRelative(0.0f, -57.83f, 46.78f, -104.93f, 104.93f, -104.93f)
                curveToRelative(30.21f, 0.0f, 57.5f, 12.67f, 76.67f, 33.14f)
                curveToRelative(23.72f, -4.55f, 46.46f, -13.32f, 66.6f, -25.34f)
                curveToRelative(-7.8f, 24.37f, -24.37f, 44.83f, -46.13f, 57.83f)
                curveToRelative(21.12f, -2.27f, 41.58f, -8.12f, 60.43f, -16.24f)
                curveToRelative(-14.29f, 20.79f, -32.16f, 39.31f, -52.63f, 54.25f)
                close()
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
