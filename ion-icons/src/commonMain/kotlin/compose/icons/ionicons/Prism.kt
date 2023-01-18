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

public val IonIcons.Prism: ImageVector
    get() {
        if (_prism != null) {
            return _prism!!
        }
        _prism = Builder(name = "Prism", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(487.83f, 319.44f)
                lineTo(295.63f, 36.88f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -79.26f, 0.0f)
                lineTo(24.17f, 319.44f)
                arcTo(47.1f, 47.1f, 0.0f, false, false, 41.1f, 387.57f)
                lineTo(233.3f, 490.32f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 45.4f, 0.0f)
                lineTo(470.9f, 387.57f)
                arcToRelative(47.1f, 47.1f, 0.0f, false, false, 16.93f, -68.13f)
                close()
                moveTo(56.57f, 360.44f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, true, -8.0f, -10.38f)
                arcToRelative(16.8f, 16.8f, 0.0f, false, true, 2.37f, -13.62f)
                lineTo(232.66f, 69.26f)
                curveToRelative(2.18f, -3.21f, 7.34f, -1.72f, 7.34f, 2.13f)
                verticalLineToRelative(374.0f)
                curveToRelative(0.0f, 5.9f, -6.54f, 9.63f, -11.87f, 6.78f)
                close()
            }
        }
        .build()
        return _prism!!
    }

private var _prism: ImageVector? = null
