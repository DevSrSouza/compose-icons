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

public val IonIcons.PaperPlaneSharp: ImageVector
    get() {
        if (_paperPlaneSharp != null) {
            return _paperPlaneSharp!!
        }
        _paperPlaneSharp = Builder(name = "PaperPlaneSharp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 16.0f)
                lineToRelative(-480.12f, 192.0f)
                lineToRelative(179.12f, 81.0f)
                lineToRelative(253.0f, -225.0f)
                lineToRelative(-225.0f, 253.0f)
                lineToRelative(81.0f, 179.0f)
                lineToRelative(192.0f, -480.0f)
                close()
            }
        }
        .build()
        return _paperPlaneSharp!!
    }

private var _paperPlaneSharp: ImageVector? = null
