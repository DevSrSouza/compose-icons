package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Square as StrokeCapSquare
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.MagnetSharp: ImageVector
    get() {
        if (_magnetSharp != null) {
            return _magnetSharp!!
        }
        _magnetSharp = Builder(name = "MagnetSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(191.98f, 463.58f)
                lineTo(191.98f, 415.58f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(90.16f, 421.4f)
                lineTo(124.1f, 387.46f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(47.98f, 319.58f)
                lineTo(95.98f, 319.58f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(422.2f, 89.82f)
                arcToRelative(144.0f, 144.0f, 0.0f, false, false, -203.71f, -0.07f)
                lineToRelative(-67.88f, 67.88f)
                lineToRelative(67.88f, 67.89f)
                lineToRelative(67.88f, -67.89f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 68.46f, 0.59f)
                curveToRelative(18.3f, 18.92f, 17.48f, 49.24f, -1.14f, 67.86f)
                lineTo(286.37f, 293.4f)
                lineToRelative(67.88f, 67.88f)
                lineToRelative(66.91f, -66.91f)
                curveTo(477.53f, 238.0f, 478.53f, 146.22f, 422.2f, 89.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(82.718f, 225.517f)
                lineToRelative(45.255f, -45.255f)
                lineToRelative(67.882f, 67.882f)
                lineToRelative(-45.255f, 45.255f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.489f, 361.27f)
                lineToRelative(45.255f, -45.255f)
                lineToRelative(67.882f, 67.882f)
                lineToRelative(-45.255f, 45.255f)
                close()
            }
        }
        .build()
        return _magnetSharp!!
    }

private var _magnetSharp: ImageVector? = null
