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

public val BrandsGroup.Edge: ImageVector
    get() {
        if (_edge != null) {
            return _edge!!
        }
        _edge = Builder(name = "Edge", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(481.92f, 134.48f)
                curveTo(440.87f, 54.18f, 352.26f, 8.0f, 255.91f, 8.0f)
                curveTo(137.05f, 8.0f, 37.51f, 91.68f, 13.47f, 203.66f)
                curveToRelative(26.0f, -46.49f, 86.22f, -79.14f, 149.46f, -79.14f)
                curveToRelative(79.27f, 0.0f, 121.09f, 48.93f, 122.25f, 50.18f)
                curveToRelative(22.0f, 23.8f, 33.0f, 50.39f, 33.0f, 83.1f)
                curveToRelative(0.0f, 10.4f, -5.31f, 25.82f, -15.11f, 38.57f)
                curveToRelative(-1.57f, 2.0f, -6.39f, 4.84f, -6.39f, 11.0f)
                curveToRelative(0.0f, 5.06f, 3.29f, 9.92f, 9.14f, 14.0f)
                curveToRelative(27.86f, 19.37f, 80.37f, 16.81f, 80.51f, 16.81f)
                arcTo(115.39f, 115.39f, 0.0f, false, false, 444.94f, 322.0f)
                arcToRelative(118.92f, 118.92f, 0.0f, false, false, 58.95f, -102.44f)
                curveTo(504.39f, 176.13f, 488.39f, 147.26f, 481.92f, 134.48f)
                close()
                moveTo(212.77f, 475.67f)
                arcToRelative(154.88f, 154.88f, 0.0f, false, true, -46.64f, -45.0f)
                curveToRelative(-32.94f, -47.42f, -34.24f, -95.6f, -20.1f, -136.0f)
                arcTo(155.5f, 155.5f, 0.0f, false, true, 203.0f, 215.75f)
                curveToRelative(59.0f, -45.2f, 94.84f, -5.65f, 99.06f, -1.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -4.89f, -10.14f)
                curveToRelative(-9.24f, -15.93f, -24.0f, -36.41f, -56.56f, -53.51f)
                curveToRelative(-33.72f, -17.69f, -70.59f, -18.59f, -77.64f, -18.59f)
                curveToRelative(-38.71f, 0.0f, -77.9f, 13.0f, -107.53f, 35.69f)
                curveTo(35.68f, 183.3f, 12.77f, 208.72f, 8.6f, 243.0f)
                curveToRelative(-1.08f, 12.31f, -2.75f, 62.8f, 23.0f, 118.27f)
                arcToRelative(248.0f, 248.0f, 0.0f, false, false, 248.3f, 141.61f)
                curveTo(241.78f, 496.26f, 214.05f, 476.24f, 212.77f, 475.67f)
                close()
                moveTo(463.49f, 377.34f)
                arcToRelative(7.76f, 7.76f, 0.0f, false, false, -7.92f, -0.23f)
                arcToRelative(181.66f, 181.66f, 0.0f, false, true, -20.41f, 9.12f)
                arcToRelative(197.54f, 197.54f, 0.0f, false, true, -69.55f, 12.52f)
                curveToRelative(-91.67f, 0.0f, -171.52f, -63.06f, -171.52f, -144.0f)
                arcTo(61.12f, 61.12f, 0.0f, false, true, 200.61f, 228.0f)
                arcTo(168.72f, 168.72f, 0.0f, false, false, 161.85f, 278.0f)
                curveToRelative(-14.92f, 29.37f, -33.0f, 88.13f, 13.33f, 151.66f)
                curveToRelative(6.51f, 8.91f, 23.0f, 30.0f, 56.0f, 47.67f)
                curveToRelative(23.57f, 12.65f, 49.0f, 19.61f, 71.7f, 19.61f)
                curveToRelative(35.14f, 0.0f, 115.43f, -33.44f, 163.0f, -108.87f)
                arcTo(7.75f, 7.75f, 0.0f, false, false, 463.49f, 377.34f)
                close()
            }
        }
        .build()
        return _edge!!
    }

private var _edge: ImageVector? = null
