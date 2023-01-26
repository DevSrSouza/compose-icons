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

public val SharpGroup.PhonelinkOff: ImageVector
    get() {
        if (_phonelinkOff != null) {
            return _phonelinkOff!!
        }
        _phonelinkOff = Builder(name = "PhonelinkOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.56f, 4.0f)
                lineToRelative(-2.5f, -2.49f)
                lineTo(4.56f, 4.0f)
                close()
                moveTo(24.0f, 8.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(4.61f)
                lineToRelative(2.0f, 2.0f)
                lineTo(18.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.61f)
                lineToRelative(3.0f, 3.0f)
                lineTo(24.0f, 20.0f)
                close()
                moveTo(22.0f, 6.0f)
                lineTo(22.0f, 4.0f)
                lineTo(7.39f, 4.0f)
                lineToRelative(2.0f, 2.0f)
                close()
                moveTo(2.06f, 1.51f)
                lineTo(0.65f, 2.92f)
                lineTo(2.0f, 4.27f)
                lineTo(2.0f, 17.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(17.73f)
                lineToRelative(2.35f, 2.35f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.06f, 1.51f)
                close()
                moveTo(4.0f, 17.0f)
                lineTo(4.0f, 6.27f)
                lineTo(14.73f, 17.0f)
                lineTo(4.0f, 17.0f)
                close()
            }
        }
        .build()
        return _phonelinkOff!!
    }

private var _phonelinkOff: ImageVector? = null
