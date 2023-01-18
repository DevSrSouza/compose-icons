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

public val IonIcons.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = Builder(name = "Pin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 96.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -96.0f, 78.39f)
                lineTo(240.0f, 457.56f)
                arcToRelative(32.09f, 32.09f, 0.0f, false, false, 2.49f, 12.38f)
                lineToRelative(10.07f, 24.0f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, false, 6.88f, 0.0f)
                lineToRelative(10.07f, -24.0f)
                arcTo(32.09f, 32.09f, 0.0f, false, false, 272.0f, 457.56f)
                lineTo(272.0f, 174.39f)
                arcTo(80.13f, 80.13f, 0.0f, false, false, 336.0f, 96.0f)
                close()
                moveTo(280.0f, 96.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 280.0f, 96.0f)
                close()
            }
        }
        .build()
        return _pin!!
    }

private var _pin: ImageVector? = null
