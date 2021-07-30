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

public val SimpleIcons.Teratail: ImageVector
    get() {
        if (_teratail != null) {
            return _teratail!!
        }
        _teratail = Builder(name = "Teratail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.81f, 0.968f)
                horizontalLineToRelative(4.375f)
                lineTo(24.0f, 23.032f)
                horizontalLineToRelative(-5.107f)
                lineTo(12.121f, 6.605f)
                horizontalLineToRelative(-0.198f)
                lineTo(5.148f, 23.03f)
                horizontalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _teratail!!
    }

private var _teratail: ImageVector? = null
