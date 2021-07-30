package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Saopaulometro: ImageVector
    get() {
        if (_saopaulometro != null) {
            return _saopaulometro!!
        }
        _saopaulometro = Builder(name = "Saopaulometro", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.366f, 6.543f)
                lineToRelative(5.092f, 5.456f)
                lineToRelative(-5.092f, 5.456f)
                lineTo(13.366f, 6.543f)
                close()
                moveTo(24.0f, 0.0f)
                verticalLineToRelative(24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(18.458f, 11.999f)
                lineToRelative(1.747f, -1.872f)
                lineTo(11.976f, 1.9f)
                lineToRelative(-8.227f, 8.228f)
                lineToRelative(1.747f, 1.871f)
                lineToRelative(-1.747f, 1.871f)
                lineToRelative(8.227f, 8.229f)
                lineToRelative(8.228f, -8.229f)
                lineToRelative(-1.746f, -1.871f)
                close()
                moveTo(10.588f, 17.454f)
                lineTo(10.588f, 6.543f)
                lineToRelative(-5.092f, 5.456f)
                lineToRelative(5.092f, 5.455f)
                close()
            }
        }
        .build()
        return _saopaulometro!!
    }

private var _saopaulometro: ImageVector? = null
