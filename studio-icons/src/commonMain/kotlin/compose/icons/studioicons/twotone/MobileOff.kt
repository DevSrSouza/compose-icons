package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.MobileOff: ImageVector
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
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-0.71f, 0.0f, -1.33f, 0.37f, -1.68f, 0.93f)
                lineTo(8.39f, 5.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(1.49f, 3.76f)
                lineTo(5.0f, 7.27f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.02f, 0.0f, 1.85f, -0.77f, 1.98f, -1.75f)
                lineToRelative(1.72f, 1.72f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.9f, 2.35f)
                lineTo(1.49f, 3.76f)
                close()
                moveTo(7.0f, 9.27f)
                lineTo(16.73f, 19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.27f)
                close()
            }
        }
        .build()
        return _mobileOff!!
    }

private var _mobileOff: ImageVector? = null
