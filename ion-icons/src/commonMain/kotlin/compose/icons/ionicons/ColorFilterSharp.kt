package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ColorFilterSharp: ImageVector
    get() {
        if (_colorFilterSharp != null) {
            return _colorFilterSharp!!
        }
        _colorFilterSharp = Builder(name = "ColorFilterSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 185.0f)
                arcToRelative(167.85f, 167.85f, 0.0f, false, true, 134.9f, -18.28f)
                curveTo(382.36f, 99.83f, 325.12f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveTo(129.64f, 99.83f, 121.1f, 166.67f)
                arcTo(167.85f, 167.85f, 0.0f, false, true, 256.0f, 185.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 331.73f)
                arcToRelative(167.51f, 167.51f, 0.0f, false, true, -52.37f, 118.08f)
                arcTo(135.0f, 135.0f, 0.0f, false, false, 344.0f, 464.0f)
                curveToRelative(75.0f, 0.0f, 136.0f, -61.0f, 136.0f, -136.0f)
                arcToRelative(136.0f, 136.0f, 0.0f, false, false, -59.06f, -112.08f)
                arcTo(168.53f, 168.53f, 0.0f, false, true, 336.0f, 331.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(283.58f, 206.19f)
                arcToRelative(167.87f, 167.87f, 0.0f, false, true, 49.36f, 89.89f)
                arcTo(136.14f, 136.14f, 0.0f, false, false, 391.0f, 200.38f)
                arcToRelative(135.87f, 135.87f, 0.0f, false, false, -107.43f, 5.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.05f, 331.73f)
                arcToRelative(168.53f, 168.53f, 0.0f, false, true, -85.0f, -115.81f)
                arcTo(136.0f, 136.0f, 0.0f, false, false, 32.0f, 328.0f)
                curveToRelative(0.0f, 75.0f, 61.0f, 136.0f, 136.0f, 136.0f)
                arcToRelative(135.0f, 135.0f, 0.0f, false, false, 60.42f, -14.19f)
                arcTo(167.51f, 167.51f, 0.0f, false, true, 176.05f, 331.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(179.06f, 296.08f)
                arcToRelative(167.87f, 167.87f, 0.0f, false, true, 49.36f, -89.89f)
                arcTo(135.87f, 135.87f, 0.0f, false, false, 121.0f, 200.38f)
                arcTo(136.14f, 136.14f, 0.0f, false, false, 179.06f, 296.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(302.9f, 345.33f)
                arcToRelative(168.22f, 168.22f, 0.0f, false, true, -93.8f, 0.0f)
                arcTo(135.9f, 135.9f, 0.0f, false, false, 256.0f, 431.6f)
                arcTo(135.9f, 135.9f, 0.0f, false, false, 302.9f, 345.33f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.0f, 311.62f)
                arcToRelative(136.0f, 136.0f, 0.0f, false, false, 94.0f, 0.0f)
                arcToRelative(135.93f, 135.93f, 0.0f, false, false, -47.0f, -87.22f)
                arcTo(135.93f, 135.93f, 0.0f, false, false, 209.0f, 311.62f)
                close()
            }
        }
        .build()
        return _colorFilterSharp!!
    }

private var _colorFilterSharp: ImageVector? = null
