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

public val IonIcons.EyeOffSharp: ImageVector
    get() {
        if (_eyeOffSharp != null) {
            return _eyeOffSharp!!
        }
        _eyeOffSharp = Builder(name = "EyeOffSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.998f, 86.004f)
                lineToRelative(21.998f, -21.998f)
                lineToRelative(362.003f, 362.003f)
                lineToRelative(-21.998f, 21.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(259.34f, 192.09f)
                lineToRelative(60.57f, 60.57f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 259.34f, 192.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.66f, 319.91f)
                lineToRelative(-60.57f, -60.57f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 252.66f, 319.91f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 352.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, -92.6f, -121.34f)
                lineTo(94.33f, 161.58f)
                curveTo(66.12f, 187.42f, 39.24f, 221.14f, 16.0f, 256.0f)
                curveToRelative(26.42f, 44.0f, 62.56f, 89.24f, 100.2f, 115.18f)
                curveTo(159.38f, 400.92f, 206.33f, 416.0f, 255.76f, 416.0f)
                arcTo(233.47f, 233.47f, 0.0f, false, false, 335.0f, 402.2f)
                lineToRelative(-53.61f, -53.6f)
                arcTo(95.84f, 95.84f, 0.0f, false, true, 256.0f, 352.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 160.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 92.6f, 121.34f)
                lineTo(419.26f, 352.0f)
                curveToRelative(29.15f, -26.25f, 56.07f, -61.56f, 76.74f, -96.0f)
                curveToRelative(-26.38f, -43.43f, -62.9f, -88.56f, -101.18f, -114.82f)
                curveTo(351.1f, 111.2f, 304.31f, 96.0f, 255.76f, 96.0f)
                arcToRelative(222.92f, 222.92f, 0.0f, false, false, -78.21f, 14.29f)
                lineToRelative(53.11f, 53.11f)
                arcTo(95.84f, 95.84f, 0.0f, false, true, 256.0f, 160.0f)
                close()
            }
        }
        .build()
        return _eyeOffSharp!!
    }

private var _eyeOffSharp: ImageVector? = null
