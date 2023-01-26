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

public val TwotoneGroup.SingleBed: ImageVector
    get() {
        if (_singleBed != null) {
            return _singleBed!!
        }
        _singleBed = Builder(name = "SingleBed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 5.0f, 6.0f, 5.9f, 6.0f, 7.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.33f)
                lineTo(6.0f, 19.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.67f, -2.0f)
                horizontalLineToRelative(8.67f)
                lineTo(17.0f, 19.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.67f, -2.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(-5.0f)
                curveTo(20.0f, 10.9f, 19.1f, 10.0f, 18.0f, 10.0f)
                close()
                moveTo(13.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(8.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(18.0f, 15.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _singleBed!!
    }

private var _singleBed: ImageVector? = null