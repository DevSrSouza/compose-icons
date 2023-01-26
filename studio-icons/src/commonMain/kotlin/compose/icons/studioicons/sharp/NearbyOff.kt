package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.NearbyOff: ImageVector
    get() {
        if (_nearbyOff != null) {
            return _nearbyOff!!
        }
        _nearbyOff = Builder(name = "NearbyOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.82f, 12.01f)
                lineTo(18.83f, 16.0f)
                lineToRelative(-1.81f, -1.81f)
                lineTo(19.2f, 12.0f)
                lineTo(12.0f, 4.8f)
                lineTo(9.81f, 6.99f)
                lineTo(8.0f, 5.17f)
                lineToRelative(3.99f, -3.99f)
                lineTo(22.82f, 12.01f)
                close()
                moveTo(21.19f, 21.19f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(16.0f, 18.83f)
                lineToRelative(-3.99f, 3.99f)
                lineTo(1.18f, 11.99f)
                lineTo(5.17f, 8.0f)
                lineTo(1.39f, 4.22f)
                lineTo(2.8f, 2.81f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(14.19f, 17.02f)
                lineToRelative(-1.39f, -1.39f)
                lineToRelative(-0.8f, 0.8f)
                lineTo(7.58f, 12.0f)
                lineToRelative(0.8f, -0.8f)
                lineToRelative(-1.4f, -1.39f)
                lineTo(4.8f, 12.0f)
                lineToRelative(7.2f, 7.2f)
                lineTo(14.19f, 17.02f)
                close()
                moveTo(16.42f, 12.0f)
                lineTo(12.0f, 7.58f)
                lineToRelative(-0.8f, 0.8f)
                lineToRelative(4.42f, 4.42f)
                lineTo(16.42f, 12.0f)
                close()
            }
        }
        .build()
        return _nearbyOff!!
    }

private var _nearbyOff: ImageVector? = null
