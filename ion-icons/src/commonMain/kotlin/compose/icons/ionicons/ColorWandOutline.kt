package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ColorWandOutline: ImageVector
    get() {
        if (_colorWandOutline != null) {
            return _colorWandOutline!!
        }
        _colorWandOutline = Builder(name = "ColorWandOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(178.287f, 178.29f)
                lineTo(178.287f, 178.29f)
                arcTo(31.52f, 31.515f, 45.004f, false, true, 222.86f, 178.293f)
                lineTo(445.711f, 401.145f)
                arcTo(31.52f, 31.515f, 45.004f, false, true, 445.715f, 445.717f)
                lineTo(445.715f, 445.717f)
                arcTo(31.52f, 31.515f, 45.004f, false, true, 401.143f, 445.714f)
                lineTo(178.291f, 222.862f)
                arcTo(31.52f, 31.515f, 45.004f, false, true, 178.287f, 178.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.38f, 178.38f)
                horizontalLineToRelative(0.0f)
                arcToRelative(31.64f, 31.64f, 0.0f, false, false, 0.0f, 44.75f)
                lineTo(223.25f, 268.0f)
                lineTo(268.0f, 223.25f)
                lineToRelative(-44.87f, -44.87f)
                arcTo(31.64f, 31.64f, 0.0f, false, false, 178.38f, 178.38f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 192.0f)
                lineTo(96.0f, 192.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(90.18f, 90.18f)
                lineTo(124.12f, 124.12f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 48.0f)
                lineTo(192.0f, 96.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(293.82f, 90.18f)
                lineTo(259.88f, 124.12f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(124.12f, 259.88f)
                lineTo(90.18f, 293.82f)
            }
        }
        .build()
        return _colorWandOutline!!
    }

private var _colorWandOutline: ImageVector? = null
