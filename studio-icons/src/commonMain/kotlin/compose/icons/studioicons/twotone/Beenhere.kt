package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Beenhere: ImageVector
    get() {
        if (_beenhere != null) {
            return _beenhere!!
        }
        _beenhere = Builder(name = "Beenhere", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                verticalLineToRelative(12.93f)
                lineToRelative(7.0f, 4.66f)
                lineToRelative(7.0f, -4.67f)
                lineTo(19.0f, 3.0f)
                close()
                moveTo(10.0f, 16.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.58f, 2.58f)
                lineToRelative(6.59f, -6.59f)
                lineTo(18.0f, 8.0f)
                lineToRelative(-8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 1.0f)
                lineTo(5.0f, 1.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                lineTo(3.0f, 15.93f)
                curveToRelative(0.0f, 0.69f, 0.35f, 1.3f, 0.88f, 1.66f)
                lineTo(12.0f, 23.0f)
                lineToRelative(8.11f, -5.41f)
                curveToRelative(0.53f, -0.36f, 0.88f, -0.97f, 0.88f, -1.66f)
                lineTo(21.0f, 3.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(12.0f, 20.6f)
                lineToRelative(-7.0f, -4.66f)
                lineTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(12.93f)
                lineToRelative(-7.0f, 4.67f)
                close()
                moveTo(9.99f, 13.18f)
                lineToRelative(-2.58f, -2.59f)
                lineTo(6.0f, 12.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(8.0f, -8.0f)
                lineToRelative(-1.42f, -1.42f)
                close()
            }
        }
        .build()
        return _beenhere!!
    }

private var _beenhere: ImageVector? = null
