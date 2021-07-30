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

public val SimpleIcons.Cmake: ImageVector
    get() {
        if (_cmake != null) {
            return _cmake!!
        }
        _cmake = Builder(name = "Cmake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.769f, 0.066f)
                lineTo(0.067f, 23.206f)
                lineToRelative(12.76f, -10.843f)
                close()
                moveTo(23.207f, 23.934f)
                lineTo(7.471f, 17.587f)
                lineTo(0.0f, 23.934f)
                close()
                moveTo(24.0f, 23.736f)
                lineTo(12.298f, 0.463f)
                lineToRelative(1.719f, 19.24f)
                close()
                moveTo(12.893f, 12.959f)
                lineToRelative(-5.025f, 4.298f)
                lineToRelative(5.62f, 2.248f)
                close()
            }
        }
        .build()
        return _cmake!!
    }

private var _cmake: ImageVector? = null
