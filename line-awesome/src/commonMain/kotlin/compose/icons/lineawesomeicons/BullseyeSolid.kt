package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.BullseyeSolid: ImageVector
    get() {
        if (_bullseyeSolid != null) {
            return _bullseyeSolid!!
        }
        _bullseyeSolid = Builder(name = "BullseyeSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.828f, 3.0f, 3.0f, 8.828f, 3.0f, 16.0f)
                curveTo(3.0f, 23.172f, 8.828f, 29.0f, 16.0f, 29.0f)
                curveTo(23.172f, 29.0f, 29.0f, 23.172f, 29.0f, 16.0f)
                curveTo(29.0f, 8.828f, 23.172f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(22.633f, 4.0f, 28.0f, 9.367f, 28.0f, 16.0f)
                curveTo(28.0f, 22.633f, 22.633f, 28.0f, 16.0f, 28.0f)
                curveTo(9.367f, 28.0f, 4.0f, 22.633f, 4.0f, 16.0f)
                curveTo(4.0f, 9.367f, 9.367f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(10.488f, 6.0f, 6.0f, 10.488f, 6.0f, 16.0f)
                curveTo(6.0f, 21.512f, 10.488f, 26.0f, 16.0f, 26.0f)
                curveTo(21.512f, 26.0f, 26.0f, 21.512f, 26.0f, 16.0f)
                curveTo(26.0f, 10.488f, 21.512f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(20.43f, 8.0f, 24.0f, 11.57f, 24.0f, 16.0f)
                curveTo(24.0f, 20.43f, 20.43f, 24.0f, 16.0f, 24.0f)
                curveTo(11.57f, 24.0f, 8.0f, 20.43f, 8.0f, 16.0f)
                curveTo(8.0f, 11.57f, 11.57f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(12.699f, 10.0f, 10.0f, 12.699f, 10.0f, 16.0f)
                curveTo(10.0f, 19.301f, 12.699f, 22.0f, 16.0f, 22.0f)
                curveTo(19.301f, 22.0f, 22.0f, 19.301f, 22.0f, 16.0f)
                curveTo(22.0f, 12.699f, 19.301f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(18.223f, 12.0f, 20.0f, 13.777f, 20.0f, 16.0f)
                curveTo(20.0f, 18.223f, 18.223f, 20.0f, 16.0f, 20.0f)
                curveTo(13.777f, 20.0f, 12.0f, 18.223f, 12.0f, 16.0f)
                curveTo(12.0f, 13.777f, 13.777f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(16.0f, 14.0f)
                curveTo(14.895f, 14.0f, 14.0f, 14.895f, 14.0f, 16.0f)
                curveTo(14.0f, 17.105f, 14.895f, 18.0f, 16.0f, 18.0f)
                curveTo(17.105f, 18.0f, 18.0f, 17.105f, 18.0f, 16.0f)
                curveTo(18.0f, 14.895f, 17.105f, 14.0f, 16.0f, 14.0f)
                close()
            }
        }
        .build()
        return _bullseyeSolid!!
    }

private var _bullseyeSolid: ImageVector? = null
