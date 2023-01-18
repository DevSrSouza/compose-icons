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

public val IonIcons.PizzaOutline: ImageVector
    get() {
        if (_pizzaOutline != null) {
            return _pizzaOutline!!
        }
        _pizzaOutline = Builder(name = "PizzaOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(404.76f, 123.08f)
                curveTo(358.37f, 104.18f, 309.69f, 96.0f, 256.0f, 96.0f)
                reflectiveCurveTo(149.9f, 105.0f, 107.1f, 122.68f)
                curveToRelative(-8.08f, 3.3f, -15.26f, 9.0f, -10.07f, 19.5f)
                curveTo(101.24f, 150.71f, 203.0f, 375.0f, 241.66f, 455.0f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, 28.72f, 0.0f)
                lineTo(414.43f, 142.78f)
                curveTo(417.62f, 135.88f, 415.33f, 127.38f, 404.76f, 123.08f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(436.38f, 82.68f)
                curveTo(384.31f, 62.08f, 320.17f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveTo(128.65f, 60.78f, 75.48f, 82.08f)
                curveTo(70.79f, 84.0f, 62.0f, 88.43f, 64.41f, 95.88f)
                lineTo(74.09f, 120.0f)
                curveToRelative(4.0f, 8.2f, 8.67f, 8.2f, 15.06f, 8.2f)
                curveToRelative(1.79f, 0.0f, 4.29f, -1.0f, 7.28f, -2.18f)
                arcTo(442.46f, 442.46f, 0.0f, false, true, 256.0f, 96.0f)
                curveToRelative(56.76f, 0.0f, 114.91f, 12.0f, 159.6f, 30.0f)
                curveToRelative(3.59f, 1.4f, 5.59f, 2.18f, 7.28f, 2.18f)
                curveToRelative(6.58f, 0.0f, 10.38f, 2.19f, 15.0f, -8.1f)
                lineTo(447.65f, 96.0f)
                curveTo(449.66f, 90.0f, 442.66f, 85.18f, 436.38f, 82.68f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 192.0f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 208.0f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 320.0f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
        }
        .build()
        return _pizzaOutline!!
    }

private var _pizzaOutline: ImageVector? = null
