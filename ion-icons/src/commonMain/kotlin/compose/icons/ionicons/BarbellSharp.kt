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

public val IonIcons.BarbellSharp: ImageVector
    get() {
        if (_barbellSharp != null) {
            return _barbellSharp!!
        }
        _barbellSharp = Builder(name = "BarbellSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 176.0f)
                lineToRelative(-58.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-76.0f, 0.0f)
                lineToRelative(0.0f, 122.0f)
                lineToRelative(-212.0f, 0.0f)
                lineToRelative(0.0f, -122.0f)
                lineToRelative(-76.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-58.0f, 0.0f)
                lineToRelative(0.0f, 160.0f)
                lineToRelative(58.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(76.0f, 0.0f)
                lineToRelative(0.0f, -122.0f)
                lineToRelative(212.0f, 0.0f)
                lineToRelative(0.0f, 122.0f)
                lineToRelative(76.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(58.0f, 0.0f)
                lineToRelative(0.0f, -160.0f)
                close()
            }
        }
        .build()
        return _barbellSharp!!
    }

private var _barbellSharp: ImageVector? = null
