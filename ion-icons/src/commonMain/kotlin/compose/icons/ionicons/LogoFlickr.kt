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

public val IonIcons.LogoFlickr: ImageVector
    get() {
        if (_logoFlickr != null) {
            return _logoFlickr!!
        }
        _logoFlickr = Builder(name = "LogoFlickr", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                horizontalLineToRelative(0.0f)
                curveTo(132.8f, 32.0f, 32.0f, 132.8f, 32.0f, 256.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 123.2f, 100.8f, 224.0f, 224.0f, 224.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(123.2f, 0.0f, 224.0f, -100.8f, 224.0f, -224.0f)
                horizontalLineToRelative(0.0f)
                curveTo(480.0f, 132.8f, 379.2f, 32.0f, 256.0f, 32.0f)
                close()
                moveTo(173.84f, 312.0f)
                arcTo(56.0f, 56.0f, 0.0f, true, true, 228.0f, 257.84f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 173.84f, 312.0f)
                close()
                moveTo(341.84f, 312.0f)
                arcTo(56.0f, 56.0f, 0.0f, true, true, 396.0f, 257.84f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 341.84f, 312.0f)
                close()
            }
        }
        .build()
        return _logoFlickr!!
    }

private var _logoFlickr: ImageVector? = null
