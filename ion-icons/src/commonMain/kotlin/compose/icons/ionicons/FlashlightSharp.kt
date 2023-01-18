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

public val IonIcons.FlashlightSharp: ImageVector
    get() {
        if (_flashlightSharp != null) {
            return _flashlightSharp!!
        }
        _flashlightSharp = Builder(name = "FlashlightSharp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(330.0f, 16.0f)
                lineToRelative(-42.68f, 42.7f)
                lineToRelative(165.98f, 165.98f)
                lineToRelative(42.7f, -42.68f)
                lineToRelative(-166.0f, -166.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(429.21f, 243.85f)
                lineTo(268.0f, 82.59f)
                lineTo(249.65f, 168.0f)
                lineTo(16.0f, 402.0f)
                lineToRelative(94.0f, 94.0f)
                lineTo(344.23f, 262.2f)
                close()
                moveTo(240.21f, 299.92f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -25.25f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 240.19f, 299.92f)
                close()
            }
        }
        .build()
        return _flashlightSharp!!
    }

private var _flashlightSharp: ImageVector? = null
