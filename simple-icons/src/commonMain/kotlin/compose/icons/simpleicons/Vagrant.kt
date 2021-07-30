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

public val SimpleIcons.Vagrant: ImageVector
    get() {
        if (_vagrant != null) {
            return _vagrant!!
        }
        _vagrant = Builder(name = "Vagrant", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.556f, 0.0f)
                lineTo(0.392f, 1.846f)
                verticalLineTo(4.11f)
                lineToRelative(7.124f, 17.3f)
                lineTo(11.998f, 24.0f)
                lineToRelative(4.523f, -2.611f)
                lineToRelative(7.083f, -17.345f)
                verticalLineTo(1.848f)
                lineToRelative(0.004f, -0.002f)
                lineTo(20.44f, 0.0f)
                lineToRelative(-5.274f, 3.087f)
                verticalLineToRelative(2.111f)
                lineToRelative(-3.168f, 7.384f)
                lineToRelative(-3.164f, -7.384f)
                verticalLineTo(3.109f)
                lineToRelative(-0.017f, -0.008f)
                lineToRelative(0.017f, -0.01f)
                close()
            }
        }
        .build()
        return _vagrant!!
    }

private var _vagrant: ImageVector? = null
