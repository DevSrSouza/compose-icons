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

public val IonIcons.IceCreamSharp: ImageVector
    get() {
        if (_iceCreamSharp != null) {
            return _iceCreamSharp!!
        }
        _iceCreamSharp = Builder(name = "IceCreamSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(359.72f, 112.37f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, -207.44f, 0.0f)
                arcTo(80.12f, 80.12f, 0.0f, false, false, 80.0f, 192.0f)
                curveToRelative(0.0f, 39.36f, 26.37f, 71.23f, 62.38f, 78.46f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.62f, 2.0f)
                verticalLineToRelative(38.83f)
                curveToRelative(0.0f, 21.84f, 17.2f, 40.22f, 39.0f, 40.74f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 41.0f, -40.0f)
                verticalLineTo(264.19f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.72f, -1.86f)
                arcTo(83.47f, 83.47f, 0.0f, false, false, 256.0f, 268.0f)
                arcToRelative(63.18f, 63.18f, 0.0f, false, false, 42.24f, -16.59f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.74f, 0.0f)
                arcTo(74.63f, 74.63f, 0.0f, false, false, 352.0f, 272.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 7.72f, -159.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 300.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, -58.21f, 70.64f)
                lineTo(256.0f, 496.0f)
                lineToRelative(92.06f, -192.08f)
                arcToRelative(105.29f, 105.29f, 0.0f, false, true, -49.18f, -14.36f)
                arcTo(93.75f, 93.75f, 0.0f, false, true, 256.0f, 300.0f)
                close()
            }
        }
        .build()
        return _iceCreamSharp!!
    }

private var _iceCreamSharp: ImageVector? = null
