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

public val SharpGroup.MobileOff: ImageVector
    get() {
        if (_mobileOff != null) {
            return _mobileOff!!
        }
        _mobileOff = Builder(name = "MobileOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 5.0f)
                verticalLineToRelative(8.61f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(0.61f)
                lineTo(8.39f, 5.0f)
                close()
                moveTo(2.9f, 2.35f)
                lineTo(1.49f, 3.76f)
                lineTo(5.0f, 7.27f)
                verticalLineTo(23.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.73f)
                lineToRelative(1.7f, 1.7f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.9f, 2.35f)
                close()
                moveTo(7.0f, 19.0f)
                verticalLineTo(9.27f)
                lineTo(16.73f, 19.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _mobileOff!!
    }

private var _mobileOff: ImageVector? = null
