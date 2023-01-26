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

public val TwotoneGroup.EggAlt: ImageVector
    get() {
        if (_eggAlt != null) {
            return _eggAlt!!
        }
        _eggAlt = Builder(name = "EggAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.59f, 10.42f)
                curveToRelative(-0.69f, -0.68f, -1.21f, -1.51f, -1.76f, -2.39f)
                curveTo(14.48f, 5.86f, 13.31f, 4.0f, 9.97f, 4.0f)
                curveTo(8.35f, 4.0f, 7.01f, 4.52f, 5.99f, 5.55f)
                curveTo(4.68f, 6.88f, 3.97f, 8.99f, 4.0f, 11.5f)
                curveTo(4.05f, 16.01f, 8.33f, 17.0f, 9.97f, 17.0f)
                curveToRelative(1.69f, 0.0f, 2.68f, 1.05f, 3.34f, 1.74f)
                curveTo(14.03f, 19.5f, 14.5f, 20.0f, 15.99f, 20.0f)
                curveToRelative(1.89f, 0.0f, 4.01f, -2.13f, 4.01f, -4.98f)
                curveTo(20.0f, 12.82f, 19.49f, 12.31f, 17.59f, 10.42f)
                close()
                moveTo(12.0f, 15.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveTo(13.93f, 15.5f, 12.0f, 15.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                curveTo(17.0f, 7.0f, 15.99f, 2.0f, 9.97f, 2.0f)
                curveTo(4.95f, 2.0f, 1.94f, 6.0f, 2.0f, 11.52f)
                curveTo(2.06f, 17.04f, 6.96f, 19.0f, 9.97f, 19.0f)
                curveToRelative(2.01f, 0.0f, 2.01f, 3.0f, 6.02f, 3.0f)
                curveTo(19.0f, 22.0f, 22.0f, 19.0f, 22.0f, 15.02f)
                curveTo(22.0f, 12.0f, 21.01f, 11.0f, 19.0f, 9.0f)
                close()
                moveTo(15.99f, 20.0f)
                curveToRelative(-1.49f, 0.0f, -1.96f, -0.5f, -2.68f, -1.26f)
                curveTo(12.66f, 18.05f, 11.66f, 17.0f, 9.97f, 17.0f)
                curveTo(8.33f, 17.0f, 4.05f, 16.01f, 4.0f, 11.5f)
                curveTo(3.97f, 8.99f, 4.68f, 6.88f, 5.99f, 5.55f)
                curveTo(7.01f, 4.52f, 8.35f, 4.0f, 9.97f, 4.0f)
                curveToRelative(3.34f, 0.0f, 4.51f, 1.86f, 5.86f, 4.02f)
                curveToRelative(0.55f, 0.88f, 1.07f, 1.71f, 1.76f, 2.39f)
                curveToRelative(1.9f, 1.89f, 2.41f, 2.4f, 2.41f, 4.61f)
                curveTo(20.0f, 17.87f, 17.88f, 20.0f, 15.99f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-3.5f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
            }
        }
        .build()
        return _eggAlt!!
    }

private var _eggAlt: ImageVector? = null
