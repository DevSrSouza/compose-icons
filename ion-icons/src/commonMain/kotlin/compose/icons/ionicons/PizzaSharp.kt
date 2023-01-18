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

public val IonIcons.PizzaSharp: ImageVector
    get() {
        if (_pizzaSharp != null) {
            return _pizzaSharp!!
        }
        _pizzaSharp = Builder(name = "PizzaSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(442.3f, 67.82f)
                horizontalLineToRelative(0.0f)
                curveTo(383.92f, 44.72f, 317.78f, 32.0f, 256.0f, 32.0f)
                curveToRelative(-63.57f, 0.0f, -129.8f, 12.51f, -186.56f, 35.25f)
                curveTo(49.18f, 75.48f, 42.0f, 80.0f, 42.0f, 80.0f)
                lineToRelative(22.0f, 44.0f)
                lineToRelative(37.53f, -16.14f)
                curveTo(147.58f, 89.53f, 199.19f, 80.0f, 256.51f, 80.0f)
                curveTo(314.0f, 80.0f, 364.6f, 89.23f, 411.26f, 108.25f)
                horizontalLineToRelative(0.0f)
                lineTo(448.0f, 124.0f)
                lineToRelative(22.0f, -44.0f)
                reflectiveCurveTo(463.0f, 76.0f, 442.3f, 67.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(409.66f, 140.85f)
                curveTo(364.15f, 122.52f, 308.16f, 112.0f, 256.0f, 112.0f)
                arcTo(425.0f, 425.0f, 0.0f, false, false, 102.3f, 140.9f)
                curveToRelative(-0.25f, 0.1f, -9.24f, 4.23f, -19.0f, 8.71f)
                curveToRelative(7.46f, 16.22f, 18.0f, 39.16f, 22.2f, 48.33f)
                lineTo(256.0f, 480.0f)
                lineTo(429.74f, 149.16f)
                lineToRelative(-19.92f, -8.24f)
                close()
                moveTo(224.41f, 194.07f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -34.0f, -34.0f)
                arcTo(32.12f, 32.12f, 0.0f, false, true, 224.41f, 194.07f)
                close()
                moveTo(288.41f, 322.07f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -34.0f, -34.0f)
                arcTo(32.12f, 32.12f, 0.0f, false, true, 288.41f, 322.07f)
                close()
                moveTo(352.41f, 210.07f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -34.0f, -34.0f)
                arcTo(32.12f, 32.12f, 0.0f, false, true, 352.41f, 210.07f)
                close()
            }
        }
        .build()
        return _pizzaSharp!!
    }

private var _pizzaSharp: ImageVector? = null
