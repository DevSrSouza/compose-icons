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

public val IonIcons.Terminal: ImageVector
    get() {
        if (_terminal != null) {
            return _terminal!!
        }
        _terminal = Builder(name = "Terminal", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 32.0f)
                lineTo(80.0f, 32.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 16.0f, 96.0f)
                lineTo(16.0f, 416.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, 64.0f)
                lineTo(432.0f, 480.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(496.0f, 96.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 432.0f, 32.0f)
                close()
                moveTo(96.0f, 256.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -10.0f, -28.49f)
                lineTo(150.39f, 176.0f)
                lineTo(86.0f, 124.49f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 20.0f, -25.0f)
                lineToRelative(80.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 25.0f)
                lineToRelative(-80.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 96.0f, 256.0f)
                close()
                moveTo(256.0f, 256.0f)
                lineTo(192.0f, 256.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
            }
        }
        .build()
        return _terminal!!
    }

private var _terminal: ImageVector? = null
