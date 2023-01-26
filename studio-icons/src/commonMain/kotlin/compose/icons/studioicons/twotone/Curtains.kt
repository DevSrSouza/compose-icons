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

public val TwotoneGroup.Curtains: ImageVector
    get() {
        if (_curtains != null) {
            return _curtains!!
        }
        _curtains = Builder(name = "Curtains", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 13.14f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(3.94f)
                curveTo(9.64f, 16.07f, 8.05f, 13.73f, 6.0f, 13.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.94f, 5.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(5.86f)
                curveTo(8.05f, 10.27f, 9.64f, 7.93f, 9.94f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.06f, 19.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(-5.86f)
                curveTo(15.95f, 13.73f, 14.36f, 16.07f, 14.06f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 10.86f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-3.94f)
                curveTo(14.36f, 7.93f, 15.95f, 10.27f, 18.0f, 10.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(6.0f, 5.0f)
                horizontalLineToRelative(3.94f)
                curveTo(9.64f, 7.93f, 8.05f, 10.27f, 6.0f, 10.86f)
                verticalLineTo(5.0f)
                close()
                moveTo(6.0f, 19.0f)
                verticalLineToRelative(-5.86f)
                curveToRelative(2.05f, 0.58f, 3.64f, 2.93f, 3.94f, 5.86f)
                horizontalLineTo(6.0f)
                close()
                moveTo(11.95f, 19.0f)
                curveToRelative(-0.26f, -3.06f, -1.72f, -5.65f, -3.76f, -7.0f)
                curveToRelative(2.04f, -1.35f, 3.5f, -3.94f, 3.76f, -7.0f)
                horizontalLineToRelative(0.09f)
                curveToRelative(0.26f, 3.06f, 1.72f, 5.65f, 3.76f, 7.0f)
                curveToRelative(-2.04f, 1.35f, -3.5f, 3.94f, -3.76f, 7.0f)
                horizontalLineTo(11.95f)
                close()
                moveTo(18.0f, 19.0f)
                horizontalLineToRelative(-3.94f)
                curveToRelative(0.3f, -2.93f, 1.89f, -5.27f, 3.94f, -5.86f)
                verticalLineTo(19.0f)
                close()
                moveTo(18.0f, 10.86f)
                curveToRelative(-2.05f, -0.58f, -3.64f, -2.93f, -3.94f, -5.86f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.86f)
                close()
            }
        }
        .build()
        return _curtains!!
    }

private var _curtains: ImageVector? = null
