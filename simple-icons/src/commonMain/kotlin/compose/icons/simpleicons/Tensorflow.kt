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

public val SimpleIcons.Tensorflow: ImageVector
    get() {
        if (_tensorflow != null) {
            return _tensorflow!!
        }
        _tensorflow = Builder(name = "Tensorflow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.292f, 5.856f)
                lineTo(11.54f, 0.0f)
                verticalLineToRelative(24.0f)
                lineToRelative(-4.095f, -2.378f)
                lineTo(7.445f, 7.603f)
                lineToRelative(-6.168f, 3.564f)
                lineToRelative(0.015f, -5.31f)
                close()
                moveTo(22.722f, 11.167f)
                lineToRelative(-0.014f, -5.31f)
                lineTo(12.46f, 0.0f)
                verticalLineToRelative(24.0f)
                lineToRelative(4.095f, -2.378f)
                lineTo(16.555f, 14.87f)
                lineToRelative(3.092f, 1.788f)
                lineToRelative(-0.018f, -4.618f)
                lineToRelative(-3.074f, -1.756f)
                lineTo(16.555f, 7.603f)
                lineToRelative(6.168f, 3.564f)
                close()
            }
        }
        .build()
        return _tensorflow!!
    }

private var _tensorflow: ImageVector? = null
