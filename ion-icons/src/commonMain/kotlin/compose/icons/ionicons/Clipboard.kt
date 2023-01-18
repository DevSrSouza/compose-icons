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

public val IonIcons.Clipboard: ImageVector
    get() {
        if (_clipboard != null) {
            return _clipboard!!
        }
        _clipboard = Builder(name = "Clipboard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 48.0f)
                lineTo(356.59f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.44f, -5.08f)
                arcTo(42.18f, 42.18f, 0.0f, false, false, 309.87f, 16.0f)
                lineTo(202.13f, 16.0f)
                arcToRelative(42.18f, 42.18f, 0.0f, false, false, -39.28f, 26.92f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 155.41f, 48.0f)
                lineTo(144.0f, 48.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -64.0f, 64.0f)
                lineTo(80.0f, 432.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                lineTo(368.0f, 496.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(432.0f, 112.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 368.0f, 48.0f)
                close()
                moveTo(319.87f, 112.0f)
                lineTo(192.13f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                lineTo(319.87f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
            }
        }
        .build()
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
