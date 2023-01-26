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

public val SharpGroup.FlashOn: ImageVector
    get() {
        if (_flashOn != null) {
            return _flashOn!!
        }
        _flashOn = Builder(name = "FlashOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                lineToRelative(7.0f, -12.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(3.0f, -8.0f)
                close()
            }
        }
        .build()
        return _flashOn!!
    }

private var _flashOn: ImageVector? = null
