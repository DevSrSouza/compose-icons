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

public val SimpleIcons.Hyper: ImageVector
    get() {
        if (_hyper != null) {
            return _hyper!!
        }
        _hyper = Builder(name = "Hyper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.565f, 17.91f)
                lineTo(24.0f, 17.91f)
                verticalLineToRelative(1.964f)
                lineTo(13.565f, 19.874f)
                close()
                moveTo(10.364f, 12.82f)
                lineToRelative(-9.187f, 8.003f)
                lineToRelative(2.86f, -7.004f)
                lineTo(0.0f, 11.179f)
                lineToRelative(9.187f, -8.002f)
                lineToRelative(-3.11f, 7.451f)
                close()
            }
        }
        .build()
        return _hyper!!
    }

private var _hyper: ImageVector? = null
