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

public val RemixIcons.Coupon4Line: ImageVector
    get() {
        if (_coupon4Line != null) {
            return _coupon4Line!!
        }
        _coupon4Line = Builder(name = "Coupon4Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                close()
                moveTo(8.535f, 19.0f)
                arcTo(3.998f, 3.998f, 0.0f, false, true, 12.0f, 17.0f)
                curveToRelative(1.48f, 0.0f, 2.773f, 0.804f, 3.465f, 2.0f)
                lineTo(20.0f, 19.0f)
                lineTo(20.0f, 5.0f)
                horizontalLineToRelative(-4.535f)
                arcTo(3.998f, 3.998f, 0.0f, false, true, 12.0f, 7.0f)
                arcToRelative(3.998f, 3.998f, 0.0f, false, true, -3.465f, -2.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(4.535f)
                close()
                moveTo(6.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                lineTo(6.0f, 16.0f)
                lineTo(6.0f, 8.0f)
                close()
                moveTo(16.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 8.0f)
                close()
            }
        }
        .build()
        return _coupon4Line!!
    }

private var _coupon4Line: ImageVector? = null
