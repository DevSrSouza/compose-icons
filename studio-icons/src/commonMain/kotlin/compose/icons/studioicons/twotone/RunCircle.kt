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

public val TwotoneGroup.RunCircle: ImageVector
    get() {
        if (_runCircle != null) {
            return _runCircle!!
        }
        _runCircle = Builder(name = "RunCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f)
                reflectiveCurveTo(16.42f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(13.5f, 6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                curveTo(12.5f, 6.45f, 12.95f, 6.0f, 13.5f, 6.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveToRelative(-0.7f, 0.0f, -2.01f, -0.54f, -2.91f, -1.76f)
                lineToRelative(-0.41f, 2.35f)
                lineTo(14.0f, 14.03f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.58f)
                lineToRelative(-1.11f, -1.21f)
                lineToRelative(-0.52f, 2.64f)
                lineTo(7.6f, 15.08f)
                lineToRelative(0.2f, -0.98f)
                lineToRelative(2.78f, 0.57f)
                lineToRelative(0.96f, -4.89f)
                lineTo(10.0f, 10.35f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.65f)
                lineToRelative(3.28f, -1.21f)
                curveToRelative(0.49f, -0.18f, 1.03f, 0.06f, 1.26f, 0.53f)
                curveTo(14.37f, 10.67f, 15.59f, 11.0f, 16.0f, 11.0f)
                verticalLineTo(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f)
                reflectiveCurveTo(16.42f, 20.0f, 12.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.54f, 8.97f)
                curveToRelative(-0.23f, -0.47f, -0.76f, -0.71f, -1.26f, -0.53f)
                lineTo(9.0f, 9.65f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.65f)
                lineToRelative(1.54f, -0.57f)
                lineToRelative(-0.96f, 4.89f)
                lineTo(7.8f, 14.1f)
                lineToRelative(-0.2f, 0.98f)
                lineToRelative(3.76f, 0.77f)
                lineToRelative(0.52f, -2.64f)
                lineTo(13.0f, 14.42f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.97f)
                lineToRelative(-1.32f, -1.44f)
                lineToRelative(0.41f, -2.35f)
                curveTo(13.99f, 11.46f, 15.3f, 12.0f, 16.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                curveTo(15.59f, 11.0f, 14.37f, 10.67f, 13.54f, 8.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 7.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
        }
        .build()
        return _runCircle!!
    }

private var _runCircle: ImageVector? = null
