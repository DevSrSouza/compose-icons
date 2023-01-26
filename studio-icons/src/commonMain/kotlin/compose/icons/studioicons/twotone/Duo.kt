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

public val TwotoneGroup.Duo: ImageVector
    get() {
        if (_duo != null) {
            return _duo!!
        }
        _duo = Builder(name = "Duo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineToRelative(-8.0f)
                curveTo(6.38f, 2.0f, 2.0f, 6.66f, 2.0f, 12.28f)
                curveTo(2.0f, 17.5f, 6.49f, 22.0f, 11.72f, 22.0f)
                curveTo(17.39f, 22.0f, 22.0f, 17.62f, 22.0f, 12.0f)
                lineTo(22.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(17.0f, 15.0f)
                lineToRelative(-3.0f, -2.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 15.0f)
                lineTo(7.0f, 9.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(3.0f, -2.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _duo!!
    }

private var _duo: ImageVector? = null
