package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.CustomerService2Fill: ImageVector
    get() {
        if (_customerService2Fill != null) {
            return _customerService2Fill!!
        }
        _customerService2Fill = Builder(name = "CustomerService2Fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-1.062f)
                arcTo(8.001f, 8.001f, 0.0f, false, true, 12.0f, 23.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineTo(9.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 6.0f, 9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(1.062f)
                arcToRelative(8.001f, 8.001f, 0.0f, false, true, 15.876f, 0.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(7.76f, 15.785f)
                lineToRelative(1.06f, -1.696f)
                arcTo(5.972f, 5.972f, 0.0f, false, false, 12.0f, 15.0f)
                arcToRelative(5.972f, 5.972f, 0.0f, false, false, 3.18f, -0.911f)
                lineToRelative(1.06f, 1.696f)
                arcTo(7.963f, 7.963f, 0.0f, false, true, 12.0f, 17.0f)
                arcToRelative(7.963f, 7.963f, 0.0f, false, true, -4.24f, -1.215f)
                close()
            }
        }
        .build()
        return _customerService2Fill!!
    }

private var _customerService2Fill: ImageVector? = null
