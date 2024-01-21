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

public val SimpleIcons.Kx: ImageVector
    get() {
        if (_kx != null) {
            return _kx!!
        }
        _kx = Builder(name = "Kx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.873f)
                horizontalLineToRelative(3.59f)
                verticalLineToRelative(12.254f)
                lineTo(0.0f, 18.127f)
                lineTo(0.0f, 5.873f)
                close()
                moveTo(11.746f, 5.873f)
                lineTo(7.65f, 12.0f)
                lineToRelative(4.097f, 6.127f)
                lineTo(7.65f, 18.127f)
                lineTo(3.59f, 12.0f)
                lineToRelative(4.06f, -6.127f)
                horizontalLineToRelative(4.097f)
                close()
                moveTo(24.0f, 5.873f)
                lineTo(19.903f, 12.0f)
                lineTo(24.0f, 18.127f)
                horizontalLineToRelative(-4.097f)
                lineToRelative(-2.03f, -3.045f)
                lineToRelative(-2.03f, 3.045f)
                horizontalLineToRelative(-4.097f)
                lineTo(15.843f, 12.0f)
                lineToRelative(-4.097f, -6.127f)
                horizontalLineToRelative(4.097f)
                lineToRelative(2.03f, 3.082f)
                lineToRelative(2.03f, -3.082f)
                lineTo(24.0f, 5.873f)
                close()
            }
        }
        .build()
        return _kx!!
    }

private var _kx: ImageVector? = null
