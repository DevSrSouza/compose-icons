package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ShieldOutline: ImageVector
    get() {
        if (_shieldOutline != null) {
            return _shieldOutline!!
        }
        _shieldOutline = Builder(name = "ShieldOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(463.1f, 112.37f)
                curveTo(373.68f, 96.33f, 336.71f, 84.45f, 256.0f, 48.0f)
                curveTo(175.29f, 84.45f, 138.32f, 96.33f, 48.9f, 112.37f)
                curveTo(32.7f, 369.13f, 240.58f, 457.79f, 256.0f, 464.0f)
                curveTo(271.42f, 457.79f, 479.3f, 369.13f, 463.1f, 112.37f)
                close()
            }
        }
        .build()
        return _shieldOutline!!
    }

private var _shieldOutline: ImageVector? = null
