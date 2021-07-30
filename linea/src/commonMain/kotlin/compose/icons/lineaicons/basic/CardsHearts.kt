package compose.icons.lineaicons.basic

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
import compose.icons.lineaicons.BasicGroup

public val BasicGroup.CardsHearts: ImageVector
    get() {
        if (_cardsHearts != null) {
            return _cardsHearts!!
        }
        _cardsHearts = Builder(name = "CardsHearts", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(44.0f, 59.0f)
                lineToRelative(-28.0f, -14.0f)
                lineToRelative(20.0f, -40.0f)
                lineToRelative(27.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(31.899f, 14.004f)
                lineToRelative(-3.899f, -8.004f)
                lineToRelative(-27.0f, 14.0f)
                lineToRelative(18.0f, 39.0f)
                lineToRelative(13.0f, -6.036f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(38.0f, 9.0f)
                lineTo(37.0f, 11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 23.0f)
                lineTo(6.0f, 21.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(43.0f, 53.0f)
                lineTo(42.0f, 55.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(33.0f, 25.0f)
                curveToRelative(-2.848f, 5.281f, 3.0f, 15.0f, 3.0f, 15.0f)
                reflectiveCurveToRelative(11.151f, 0.28f, 14.0f, -5.0f)
                curveToRelative(1.18f, -2.188f, 1.377f, -5.718f, -1.0f, -7.0f)
                curveToRelative(-2.188f, -1.18f, -5.82f, -1.188f, -7.0f, 1.0f)
                curveToRelative(1.18f, -2.188f, 0.188f, -4.82f, -2.0f, -6.0f)
                curveTo(37.624f, 21.718f, 34.181f, 22.813f, 33.0f, 25.0f)
                close()
            }
        }
        .build()
        return _cardsHearts!!
    }

private var _cardsHearts: ImageVector? = null
