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

public val SimpleIcons.Litiengine: ImageVector
    get() {
        if (_litiengine != null) {
            return _litiengine!!
        }
        _litiengine = Builder(name = "Litiengine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 12.018f)
                lineToRelative(2.09f, 2.088f)
                lineTo(11.987f, 24.0f)
                lineToRelative(2.146f, -2.146f)
                lineToRelative(-9.897f, -9.893f)
                lineToRelative(6.586f, -6.582f)
                lineToRelative(-2.09f, -2.089f)
                close()
                moveTo(13.211f, 18.642f)
                lineTo(15.291f, 20.72f)
                lineTo(20.716f, 15.298f)
                lineTo(18.636f, 13.22f)
                close()
                moveTo(9.85f, 2.151f)
                lineToRelative(6.606f, 6.602f)
                lineTo(9.9f, 15.306f)
                lineToRelative(2.134f, 2.133f)
                lineToRelative(6.555f, -6.553f)
                lineToRelative(3.258f, 3.257f)
                lineTo(24.0f, 11.993f)
                lineTo(12.0f, 0.0f)
                close()
                moveTo(6.574f, 12.004f)
                lineTo(8.609f, 14.038f)
                lineTo(14.062f, 8.588f)
                lineTo(12.027f, 6.553f)
                close()
            }
        }
        .build()
        return _litiengine!!
    }

private var _litiengine: ImageVector? = null
