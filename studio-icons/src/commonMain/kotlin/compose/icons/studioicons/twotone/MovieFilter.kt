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

public val TwotoneGroup.MovieFilter: ImageVector
    get() {
        if (_movieFilter != null) {
            return _movieFilter!!
        }
        _movieFilter = Builder(name = "MovieFilter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.63f, 11.37f)
                lineTo(18.0f, 12.0f)
                lineToRelative(-1.37f, 0.63f)
                lineTo(16.0f, 14.0f)
                lineToRelative(-0.63f, -1.37f)
                lineTo(14.0f, 12.0f)
                lineToRelative(1.37f, -0.63f)
                lineTo(16.0f, 10.0f)
                lineTo(5.77f, 10.0f)
                lineTo(4.01f, 6.47f)
                lineTo(4.01f, 18.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-8.0f)
                lineTo(16.0f, 10.0f)
                lineToRelative(0.63f, 1.37f)
                close()
                moveTo(10.94f, 14.94f)
                lineTo(10.0f, 17.0f)
                lineToRelative(-0.94f, -2.06f)
                lineTo(7.0f, 14.0f)
                lineToRelative(2.06f, -0.94f)
                lineTo(10.0f, 11.0f)
                lineToRelative(0.94f, 2.06f)
                lineTo(13.0f, 14.0f)
                lineToRelative(-2.06f, 0.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 11.0f)
                lineToRelative(-0.94f, 2.06f)
                lineTo(7.0f, 14.0f)
                lineToRelative(2.06f, 0.94f)
                lineTo(10.0f, 17.0f)
                lineToRelative(0.94f, -2.06f)
                lineTo(13.0f, 14.0f)
                lineToRelative(-2.06f, -0.94f)
                close()
                moveTo(18.01f, 4.0f)
                lineToRelative(2.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-2.0f, -4.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(2.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-2.0f, -4.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(2.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-2.0f, -4.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                lineToRelative(-0.01f, 12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f)
                lineTo(22.0f, 4.0f)
                horizontalLineToRelative(-3.99f)
                close()
                moveTo(20.01f, 18.0f)
                horizontalLineToRelative(-16.0f)
                lineTo(4.01f, 6.47f)
                lineTo(5.77f, 10.0f)
                lineTo(16.0f, 10.0f)
                lineToRelative(-0.63f, 1.37f)
                lineTo(14.0f, 12.0f)
                lineToRelative(1.37f, 0.63f)
                lineTo(16.0f, 14.0f)
                lineToRelative(0.63f, -1.37f)
                lineTo(18.0f, 12.0f)
                lineToRelative(-1.37f, -0.63f)
                lineTo(16.0f, 10.0f)
                horizontalLineToRelative(4.01f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _movieFilter!!
    }

private var _movieFilter: ImageVector? = null
