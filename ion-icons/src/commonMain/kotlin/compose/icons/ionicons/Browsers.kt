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

public val IonIcons.Browsers: ImageVector
    get() {
        if (_browsers != null) {
            return _browsers!!
        }
        _browsers = Builder(name = "Browsers", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 48.0f)
                lineTo(96.0f, 48.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -64.0f, 64.0f)
                lineTo(32.0f, 400.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                lineTo(416.0f, 464.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(480.0f, 112.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 416.0f, 48.0f)
                close()
                moveTo(440.0f, 144.0f)
                lineTo(72.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(64.0f, 112.0f)
                arcTo(32.09f, 32.09f, 0.0f, false, true, 96.0f, 80.0f)
                lineTo(416.0f, 80.0f)
                arcToRelative(32.09f, 32.09f, 0.0f, false, true, 32.0f, 32.0f)
                verticalLineToRelative(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 440.0f, 144.0f)
                close()
            }
        }
        .build()
        return _browsers!!
    }

private var _browsers: ImageVector? = null
