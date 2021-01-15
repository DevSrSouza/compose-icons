package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Transferwise: ImageVector
    get() {
        if (_transferwise != null) {
            return _transferwise!!
        }
        _transferwise = Builder(name = "Transferwise", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.871f, 24.0f)
                horizontalLineToRelative(3.11f)
                lineTo(23.127f, 0.0f)
                horizontalLineTo(3.694f)
                lineToRelative(3.748f, 6.291f)
                lineToRelative(-6.571f, 6.283f)
                horizontalLineToRelative(11.361f)
                lineToRelative(1.068f, -2.517f)
                horizontalLineTo(7.03f)
                lineToRelative(3.792f, -3.783f)
                lineTo(8.61f, 2.516f)
                horizontalLineToRelative(10.337f)
                close()
            }
        }
        .build()
        return _transferwise!!
    }

private var _transferwise: ImageVector? = null
