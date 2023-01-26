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

public val TwotoneGroup.Villa: ImageVector
    get() {
        if (_villa != null) {
            return _villa!!
        }
        _villa = Builder(name = "Villa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 9.37f)
                lineToRelative(9.0f, -3.46f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.37f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(3.0f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-9.0f)
                curveTo(21.0f, 10.9f, 20.1f, 10.0f, 19.0f, 10.0f)
                close()
                moveTo(5.0f, 9.37f)
                lineToRelative(9.0f, -3.46f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.37f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _villa!!
    }

private var _villa: ImageVector? = null
