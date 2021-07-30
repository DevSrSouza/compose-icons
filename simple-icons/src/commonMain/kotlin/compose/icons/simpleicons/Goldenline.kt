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

public val SimpleIcons.Goldenline: ImageVector
    get() {
        if (_goldenline != null) {
            return _goldenline!!
        }
        _goldenline = Builder(name = "Goldenline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.997f, 24.0f)
                arcToRelative(11.995f, 11.995f, 0.0f, false, false, 11.949f, -13.04f)
                horizontalLineToRelative(-6.781f)
                verticalLineToRelative(2.943f)
                horizontalLineToRelative(1.226f)
                arcToRelative(6.667f, 6.667f, 0.0f, true, true, -0.114f, -4.156f)
                horizontalLineToRelative(5.509f)
                arcTo(11.995f, 11.995f, 0.0f, true, false, 12.0f, 23.991f)
                close()
            }
        }
        .build()
        return _goldenline!!
    }

private var _goldenline: ImageVector? = null
