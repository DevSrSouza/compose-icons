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

public val BrandsGroup.Yelp: ImageVector
    get() {
        if (_yelp != null) {
            return _yelp!!
        }
        _yelp = Builder(name = "Yelp", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.9f, 240.32f)
                lineToRelative(99.62f, 48.61f)
                curveToRelative(19.2f, 9.4f, 16.2f, 37.51f, -4.5f, 42.71f)
                lineTo(30.5f, 358.45f)
                arcToRelative(22.79f, 22.79f, 0.0f, false, true, -28.21f, -19.6f)
                arcToRelative(197.16f, 197.16f, 0.0f, false, true, 9.0f, -85.32f)
                arcToRelative(22.8f, 22.8f, 0.0f, false, true, 31.61f, -13.21f)
                close()
                moveTo(86.9f, 479.57f)
                arcToRelative(199.45f, 199.45f, 0.0f, false, false, 79.42f, 32.11f)
                arcTo(22.78f, 22.78f, 0.0f, false, false, 192.94f, 490.0f)
                lineToRelative(3.9f, -110.82f)
                curveToRelative(0.7f, -21.3f, -25.5f, -31.91f, -39.81f, -16.1f)
                lineToRelative(-74.21f, 82.4f)
                arcToRelative(22.82f, 22.82f, 0.0f, false, false, 4.09f, 34.09f)
                close()
                moveTo(232.24f, 369.65f)
                lineToRelative(58.81f, 94.0f)
                arcToRelative(22.93f, 22.93f, 0.0f, false, false, 34.0f, 5.5f)
                arcToRelative(198.36f, 198.36f, 0.0f, false, false, 52.71f, -67.61f)
                arcTo(23.0f, 23.0f, 0.0f, false, false, 364.17f, 370.0f)
                lineToRelative(-105.42f, -34.26f)
                curveToRelative(-20.31f, -6.5f, -37.81f, 15.8f, -26.51f, 33.91f)
                close()
                moveTo(380.57f, 237.42f)
                arcToRelative(197.44f, 197.44f, 0.0f, false, false, -50.41f, -69.31f)
                arcToRelative(22.85f, 22.85f, 0.0f, false, false, -34.0f, 4.4f)
                lineToRelative(-62.0f, 91.92f)
                curveToRelative(-11.9f, 17.7f, 4.7f, 40.61f, 25.2f, 34.71f)
                lineTo(366.0f, 268.63f)
                arcToRelative(23.0f, 23.0f, 0.0f, false, false, 14.61f, -31.21f)
                close()
                moveTo(62.11f, 30.18f)
                arcToRelative(22.86f, 22.86f, 0.0f, false, false, -9.9f, 32.0f)
                lineToRelative(104.12f, 180.44f)
                curveToRelative(11.7f, 20.2f, 42.61f, 11.9f, 42.61f, -11.4f)
                lineTo(198.94f, 22.88f)
                arcToRelative(22.67f, 22.67f, 0.0f, false, false, -24.5f, -22.8f)
                arcToRelative(320.37f, 320.37f, 0.0f, false, false, -112.33f, 30.1f)
                close()
            }
        }
        .build()
        return _yelp!!
    }

private var _yelp: ImageVector? = null
