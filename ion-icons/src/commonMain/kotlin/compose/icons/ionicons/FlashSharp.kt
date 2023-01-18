package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.FlashSharp: ImageVector
    get() {
        if (_flashSharp != null) {
            return _flashSharp!!
        }
        _flashSharp = Builder(name = "FlashSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 208.0f)
                horizontalLineTo(288.0f)
                lineTo(320.0f, 16.0f)
                lineTo(80.0f, 304.0f)
                horizontalLineTo(224.0f)
                lineTo(192.0f, 496.0f)
                close()
            }
        }
        .build()
        return _flashSharp!!
    }

private var _flashSharp: ImageVector? = null
