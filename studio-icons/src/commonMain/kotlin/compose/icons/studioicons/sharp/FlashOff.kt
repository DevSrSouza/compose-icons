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

public val SharpGroup.FlashOff: ImageVector
    get() {
        if (_flashOff != null) {
            return _flashOff!!
        }
        _flashOff = Builder(name = "FlashOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                horizontalLineToRelative(-3.61f)
                lineToRelative(2.28f, 2.28f)
                close()
                moveTo(17.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                verticalLineToRelative(1.61f)
                lineToRelative(6.13f, 6.13f)
                close()
                moveTo(3.41f, 2.86f)
                lineTo(2.0f, 4.27f)
                lineToRelative(5.0f, 5.0f)
                lineTo(7.0f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                lineToRelative(3.58f, -6.15f)
                lineTo(17.73f, 20.0f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }
        .build()
        return _flashOff!!
    }

private var _flashOff: ImageVector? = null
