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

public val TwotoneGroup.Gif: ImageVector
    get() {
        if (_gif != null) {
            return _gif!!
        }
        _gif = Builder(name = "Gif", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.87f, strokeAlpha
                    = 0.87f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5f, 9.0f)
                lineTo(13.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(11.5f, 9.0f)
                close()
                moveTo(9.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                curveToRelative(-0.6f, 0.0f, -1.0f, 0.5f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.5f, 0.4f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.6f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                lineTo(8.5f, 12.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                lineTo(10.0f, 10.5f)
                lineTo(10.0f, 10.0f)
                curveToRelative(0.0f, -0.5f, -0.4f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(19.0f, 10.5f)
                lineTo(19.0f, 9.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(6.0f)
                lineTo(16.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _gif!!
    }

private var _gif: ImageVector? = null