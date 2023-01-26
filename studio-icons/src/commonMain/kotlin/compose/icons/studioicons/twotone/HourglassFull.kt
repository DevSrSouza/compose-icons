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

public val TwotoneGroup.HourglassFull: ImageVector
    get() {
        if (_hourglassFull != null) {
            return _hourglassFull!!
        }
        _hourglassFull = Builder(name = "HourglassFull", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 7.5f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(4.0f, -4.0f)
                lineTo(16.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                close()
                moveTo(8.0f, 16.5f)
                lineTo(8.0f, 20.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.5f)
                lineToRelative(-4.0f, -4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(0.01f)
                lineTo(6.0f, 8.01f)
                lineTo(10.0f, 12.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(0.01f, 0.01f)
                lineTo(6.0f, 16.01f)
                lineTo(6.0f, 22.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-5.99f)
                horizontalLineToRelative(-0.01f)
                lineTo(18.0f, 16.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(4.0f, -3.99f)
                lineToRelative(-0.01f, -0.01f)
                lineTo(18.0f, 8.0f)
                lineTo(18.0f, 2.0f)
                close()
                moveTo(16.0f, 16.5f)
                lineTo(16.0f, 20.0f)
                lineTo(8.0f, 20.0f)
                verticalLineToRelative(-3.5f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(4.0f, 4.0f)
                close()
                moveTo(16.0f, 7.5f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(-4.0f, -4.0f)
                lineTo(8.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.5f)
                close()
            }
        }
        .build()
        return _hourglassFull!!
    }

private var _hourglassFull: ImageVector? = null
