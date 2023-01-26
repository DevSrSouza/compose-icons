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

public val SharpGroup.HourglassBottom: ImageVector
    get() {
        if (_hourglassBottom != null) {
            return _hourglassBottom!!
        }
        _hourglassBottom = Builder(name = "HourglassBottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 22.0f)
                lineToRelative(-0.01f, -6.0f)
                lineTo(14.0f, 12.0f)
                lineToRelative(3.99f, -4.01f)
                lineTo(18.0f, 2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-4.0f, 3.99f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(8.0f, 7.5f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.5f)
                lineToRelative(-4.0f, 4.0f)
                lineTo(8.0f, 7.5f)
                close()
            }
        }
        .build()
        return _hourglassBottom!!
    }

private var _hourglassBottom: ImageVector? = null
