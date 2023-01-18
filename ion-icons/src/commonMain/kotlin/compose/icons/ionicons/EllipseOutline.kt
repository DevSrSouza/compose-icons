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

public val IonIcons.EllipseOutline: ImageVector
    get() {
        if (_ellipseOutline != null) {
            return _ellipseOutline!!
        }
        _ellipseOutline = Builder(name = "EllipseOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-192.0f, 0.0f)
                arcToRelative(192.0f, 192.0f, 0.0f, true, true, 384.0f, 0.0f)
                arcToRelative(192.0f, 192.0f, 0.0f, true, true, -384.0f, 0.0f)
            }
        }
        .build()
        return _ellipseOutline!!
    }

private var _ellipseOutline: ImageVector? = null
