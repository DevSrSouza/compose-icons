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

public val IonIcons.FlashOffSharp: ImageVector
    get() {
        if (_flashOffSharp != null) {
            return _flashOffSharp!!
        }
        _flashOffSharp = Builder(name = "FlashOffSharp", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(80.0f, 304.0f)
                lineToRelative(144.0f, 0.0f)
                lineToRelative(-32.0f, 192.0f)
                lineToRelative(108.18f, -129.82f)
                lineToRelative(-148.36f, -148.36f)
                lineToRelative(-71.82f, 86.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 208.0f)
                lineToRelative(-144.0f, 0.0f)
                lineToRelative(32.0f, -192.0f)
                lineToRelative(-108.18f, 129.82f)
                lineToRelative(148.36f, 148.36f)
                lineToRelative(71.82f, -86.18f)
                close()
            }
        }
        .build()
        return _flashOffSharp!!
    }

private var _flashOffSharp: ImageVector? = null
