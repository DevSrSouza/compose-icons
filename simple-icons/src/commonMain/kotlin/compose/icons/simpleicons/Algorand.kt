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

public val SimpleIcons.Algorand: ImageVector
    get() {
        if (_algorand != null) {
            return _algorand!!
        }
        _algorand = Builder(name = "Algorand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.874f, 0.0f)
                horizontalLineToRelative(3.673f)
                lineToRelative(1.61f, 5.963f)
                horizontalLineToRelative(3.789f)
                lineToRelative(-2.588f, 4.5f)
                lineToRelative(3.624f, 13.533f)
                horizontalLineToRelative(-3.757f)
                lineToRelative(-2.44f, -9.077f)
                lineToRelative(-5.247f, 9.079f)
                horizontalLineTo(8.345f)
                lineToRelative(8.107f, -14.051f)
                lineToRelative(-1.304f, -4.878f)
                lineTo(4.215f, 24.0f)
                horizontalLineTo(0.018f)
                close()
            }
        }
        .build()
        return _algorand!!
    }

private var _algorand: ImageVector? = null
