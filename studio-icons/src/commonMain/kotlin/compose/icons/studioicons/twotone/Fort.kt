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

public val TwotoneGroup.Fort: ImageVector
    get() {
        if (_fort != null) {
            return _fort!!
        }
        _fort = Builder(name = "Fort", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 8.17f)
                lineTo(20.17f, 7.0f)
                horizontalLineToRelative(-4.34f)
                lineTo(17.0f, 8.17f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.17f)
                lineTo(8.17f, 7.0f)
                horizontalLineTo(3.83f)
                lineTo(5.0f, 8.17f)
                verticalLineToRelative(7.66f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.17f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(8.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 7.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                lineToRelative(2.0f, -2.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(9.0f)
                lineTo(23.0f, 7.0f)
                close()
                moveTo(21.0f, 19.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-1.17f)
                lineToRelative(2.0f, -2.0f)
                verticalLineTo(8.17f)
                lineTo(3.83f, 7.0f)
                horizontalLineToRelative(4.34f)
                lineTo(7.0f, 8.17f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(8.17f)
                lineTo(15.83f, 7.0f)
                horizontalLineToRelative(4.34f)
                lineTo(19.0f, 8.17f)
                verticalLineToRelative(7.66f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _fort!!
    }

private var _fort: ImageVector? = null
