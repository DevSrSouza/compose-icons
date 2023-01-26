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

public val TwotoneGroup.AddReaction: ImageVector
    get() {
        if (_addReaction != null) {
            return _addReaction!!
        }
        _addReaction = Builder(name = "AddReaction", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.41f, 9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(5.08f)
                curveTo(14.82f, 4.4f, 13.46f, 4.0f, 12.0f, 4.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f)
                curveTo(20.0f, 10.94f, 19.79f, 9.93f, 19.41f, 9.0f)
                close()
                moveTo(15.5f, 8.0f)
                curveTo(16.33f, 8.0f, 17.0f, 8.67f, 17.0f, 9.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveTo(14.0f, 10.33f, 14.0f, 9.5f)
                curveTo(14.0f, 8.67f, 14.67f, 8.0f, 15.5f, 8.0f)
                close()
                moveTo(8.5f, 8.0f)
                curveTo(9.33f, 8.0f, 10.0f, 8.67f, 10.0f, 9.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveTo(7.0f, 10.33f, 7.0f, 9.5f)
                curveTo(7.0f, 8.67f, 7.67f, 8.0f, 8.5f, 8.0f)
                close()
                moveTo(12.0f, 17.5f)
                curveToRelative(-2.33f, 0.0f, -4.31f, -1.46f, -5.11f, -3.5f)
                horizontalLineToRelative(10.22f)
                curveTo(16.31f, 16.04f, 14.33f, 17.5f, 12.0f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 9.5f)
                curveTo(7.0f, 8.67f, 7.67f, 8.0f, 8.5f, 8.0f)
                reflectiveCurveTo(10.0f, 8.67f, 10.0f, 9.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveTo(7.0f, 10.33f, 7.0f, 9.5f)
                close()
                moveTo(12.0f, 17.5f)
                curveToRelative(2.33f, 0.0f, 4.31f, -1.46f, 5.11f, -3.5f)
                horizontalLineTo(6.89f)
                curveTo(7.69f, 16.04f, 9.67f, 17.5f, 12.0f, 17.5f)
                close()
                moveTo(15.5f, 11.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveTo(17.0f, 8.67f, 16.33f, 8.0f, 15.5f, 8.0f)
                reflectiveCurveTo(14.0f, 8.67f, 14.0f, 9.5f)
                curveTo(14.0f, 10.33f, 14.67f, 11.0f, 15.5f, 11.0f)
                close()
                moveTo(22.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(1.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.58f, -8.0f, -8.0f)
                curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f)
                curveToRelative(1.46f, 0.0f, 2.82f, 0.4f, 4.0f, 1.08f)
                verticalLineTo(2.84f)
                curveTo(14.77f, 2.3f, 13.42f, 2.0f, 11.99f, 2.0f)
                curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveToRelative(0.0f, -1.05f, -0.17f, -2.05f, -0.47f, -3.0f)
                horizontalLineToRelative(-2.13f)
                curveTo(19.78f, 9.93f, 20.0f, 10.94f, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _addReaction!!
    }

private var _addReaction: ImageVector? = null
