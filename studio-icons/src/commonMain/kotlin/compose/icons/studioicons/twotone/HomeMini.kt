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

public val TwotoneGroup.HomeMini: ImageVector
    get() {
        if (_homeMini != null) {
            return _homeMini!!
        }
        _homeMini = Builder(name = "HomeMini", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveToRelative(-7.91f, 0.0f, -8.0f, 4.8f, -8.0f, 5.0f)
                horizontalLineToRelative(16.0f)
                curveTo(19.99f, 11.51f, 19.64f, 7.0f, 12.0f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.14f, 17.0f)
                horizontalLineToRelative(5.72f)
                curveToRelative(2.1f, 0.0f, 3.92f, -1.24f, 4.71f, -3.0f)
                horizontalLineTo(4.42f)
                curveTo(5.22f, 15.76f, 7.04f, 17.0f, 9.14f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(4.19f, 5.0f, 2.0f, 9.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 3.86f, 3.13f, 7.0f, 6.99f, 7.0f)
                horizontalLineToRelative(6.02f)
                curveToRelative(2.69f, 0.0f, 6.99f, -2.08f, 6.99f, -7.0f)
                curveTo(22.0f, 12.0f, 22.0f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(14.86f, 17.0f)
                horizontalLineTo(9.14f)
                curveToRelative(-2.1f, 0.0f, -3.92f, -1.24f, -4.71f, -3.0f)
                horizontalLineToRelative(15.15f)
                curveTo(18.78f, 15.76f, 16.96f, 17.0f, 14.86f, 17.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -0.2f, 0.09f, -5.0f, 8.0f, -5.0f)
                curveToRelative(7.64f, 0.0f, 7.99f, 4.51f, 8.0f, 5.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _homeMini!!
    }

private var _homeMini: ImageVector? = null
