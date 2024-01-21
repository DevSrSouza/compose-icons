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

public val SimpleIcons.Packer: ImageVector
    get() {
        if (_packer != null) {
            return _packer!!
        }
        _packer = Builder(name = "Packer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.844f, 0.0f)
                verticalLineToRelative(3.38f)
                lineToRelative(5.75f, 3.32f)
                verticalLineToRelative(10.148f)
                lineToRelative(2.705f, 1.552f)
                curveToRelative(1.676f, 0.967f, 3.045f, 0.388f, 3.045f, -1.285f)
                verticalLineTo(9.668f)
                curveToRelative(-0.014f, -1.687f, -1.382f, -3.832f, -3.059f, -4.799f)
                lineTo(7.844f, 0.0f)
                close()
                moveTo(4.656f, 2.932f)
                verticalLineToRelative(16.574f)
                lineTo(12.436f, 24.0f)
                verticalLineTo(7.426f)
                lineToRelative(-7.78f, -4.494f)
                close()
            }
        }
        .build()
        return _packer!!
    }

private var _packer: ImageVector? = null
