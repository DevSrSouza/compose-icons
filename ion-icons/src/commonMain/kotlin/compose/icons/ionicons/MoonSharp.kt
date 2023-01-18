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

public val IonIcons.MoonSharp: ImageVector
    get() {
        if (_moonSharp != null) {
            return _moonSharp!!
        }
        _moonSharp = Builder(name = "MoonSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.62f, 126.77f)
                curveToRelative(0.0f, -33.0f, 4.85f, -66.35f, 17.23f, -94.77f)
                curveTo(87.54f, 67.83f, 32.0f, 151.89f, 32.0f, 247.38f)
                curveTo(32.0f, 375.85f, 136.15f, 480.0f, 264.62f, 480.0f)
                curveToRelative(95.49f, 0.0f, 179.55f, -55.54f, 215.38f, -137.85f)
                curveToRelative(-28.42f, 12.38f, -61.8f, 17.23f, -94.77f, 17.23f)
                curveTo(256.76f, 359.38f, 152.62f, 255.24f, 152.62f, 126.77f)
                close()
            }
        }
        .build()
        return _moonSharp!!
    }

private var _moonSharp: ImageVector? = null
