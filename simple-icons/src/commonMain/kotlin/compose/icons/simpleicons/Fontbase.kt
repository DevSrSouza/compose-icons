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

public val SimpleIcons.Fontbase: ImageVector
    get() {
        if (_fontbase != null) {
            return _fontbase!!
        }
        _fontbase = Builder(name = "Fontbase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.079f, 13.996f)
                curveToRelative(-2.702f, -2.771f, -5.702f, -5.703f, -8.105f, -8.103f)
                curveToRelative(-1.62f, -1.621f, -4.284f, -1.621f, -5.943f, 0.0f)
                curveToRelative(-2.97f, 2.963f, -5.248f, 5.21f, -8.104f, 8.066f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, false, 0.0f, 4.437f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, false, 4.437f, 0.0f)
                lineToRelative(2.2f, -2.2f)
                lineToRelative(2.2f, 2.2f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, false, 4.438f, 0.0f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, false, 0.0f, -4.438f)
                lineToRelative(4.4f, 4.4f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, false, 4.438f, 0.0f)
                curveToRelative(1.274f, -1.16f, 1.274f, -3.165f, 0.039f, -4.362f)
                close()
            }
        }
        .build()
        return _fontbase!!
    }

private var _fontbase: ImageVector? = null
