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

public val IonIcons.Close: ImageVector
    get() {
        if (_close != null) {
            return _close!!
        }
        _close = Builder(name = "Close", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(289.94f, 256.0f)
                lineToRelative(95.0f, -95.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 351.0f, 127.0f)
                lineToRelative(-95.0f, 95.0f)
                lineToRelative(-95.0f, -95.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 127.0f, 161.0f)
                lineToRelative(95.0f, 95.0f)
                lineToRelative(-95.0f, 95.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 161.0f, 385.0f)
                lineToRelative(95.0f, -95.0f)
                lineToRelative(95.0f, 95.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 385.0f, 351.0f)
                close()
            }
        }
        .build()
        return _close!!
    }

private var _close: ImageVector? = null
