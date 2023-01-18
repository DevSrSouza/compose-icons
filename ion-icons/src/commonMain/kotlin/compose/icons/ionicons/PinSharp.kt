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

public val IonIcons.PinSharp: ImageVector
    get() {
        if (_pinSharp != null) {
            return _pinSharp!!
        }
        _pinSharp = Builder(name = "PinSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(339.0f, 99.0f)
                arcToRelative(83.0f, 83.0f, 0.0f, true, false, -102.0f, 80.8f)
                lineTo(237.0f, 464.0f)
                lineToRelative(19.0f, 32.0f)
                lineToRelative(19.0f, -32.0f)
                lineTo(275.0f, 179.8f)
                arcTo(83.28f, 83.28f, 0.0f, false, false, 339.0f, 99.0f)
                close()
                moveTo(280.0f, 93.0f)
                arcToRelative(21.0f, 21.0f, 0.0f, true, true, 21.0f, -21.0f)
                arcTo(21.0f, 21.0f, 0.0f, false, true, 280.0f, 93.0f)
                close()
            }
        }
        .build()
        return _pinSharp!!
    }

private var _pinSharp: ImageVector? = null
