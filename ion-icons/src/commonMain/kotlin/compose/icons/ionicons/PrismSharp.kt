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

public val IonIcons.PrismSharp: ImageVector
    get() {
        if (_prismSharp != null) {
            return _prismSharp!!
        }
        _prismSharp = Builder(name = "PrismSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 16.0f)
                lineTo(16.0f, 352.0f)
                lineTo(256.0f, 496.0f)
                lineTo(496.0f, 352.0f)
                close()
                moveTo(236.0f, 112.82f)
                lineTo(236.0f, 437.35f)
                lineTo(73.73f, 340.0f)
                close()
            }
        }
        .build()
        return _prismSharp!!
    }

private var _prismSharp: ImageVector? = null
