package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ShieldHalf: ImageVector
    get() {
        if (_shieldHalf != null) {
            return _shieldHalf!!
        }
        _shieldHalf = Builder(name = "ShieldHalf", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.9f, 112.37f)
                curveTo(138.32f, 96.33f, 175.29f, 84.45f, 256.0f, 48.0f)
                curveToRelative(80.71f, 36.45f, 117.68f, 48.33f, 207.1f, 64.37f)
                curveTo(479.3f, 369.13f, 271.42f, 457.79f, 256.0f, 464.0f)
                curveTo(240.58f, 457.79f, 32.7f, 369.13f, 48.9f, 112.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveToRelative(80.71f, 36.45f, 117.68f, 48.33f, 207.1f, 64.37f)
                curveTo(479.3f, 369.13f, 271.42f, 457.79f, 256.0f, 464.0f)
                close()
            }
        }
        .build()
        return _shieldHalf!!
    }

private var _shieldHalf: ImageVector? = null
