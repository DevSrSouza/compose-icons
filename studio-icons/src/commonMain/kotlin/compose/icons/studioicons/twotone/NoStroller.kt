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

public val TwotoneGroup.NoStroller: ImageVector
    get() {
        if (_noStroller != null) {
            return _noStroller!!
        }
        _noStroller = Builder(name = "NoStroller", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.1f, 5.27f)
                curveTo(8.71f, 5.1f, 9.35f, 5.0f, 10.0f, 5.0f)
                curveToRelative(0.29f, 0.0f, 0.58f, 0.02f, 0.86f, 0.05f)
                lineTo(9.49f, 6.67f)
                lineTo(8.1f, 5.27f)
                close()
                moveTo(15.0f, 12.17f)
                verticalLineTo(8.66f)
                lineToRelative(-1.61f, 1.89f)
                lineTo(15.0f, 12.17f)
                close()
                moveTo(12.17f, 15.0f)
                lineToRelative(-1.39f, -1.39f)
                lineTo(9.6f, 15.0f)
                horizontalLineTo(12.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 20.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveTo(8.0f, 18.9f, 8.0f, 20.0f)
                close()
                moveTo(15.0f, 8.66f)
                verticalLineToRelative(3.51f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(-7.9f)
                curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f)
                curveTo(19.42f, 5.0f, 20.0f, 5.66f, 20.0f, 6.48f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.48f)
                curveTo(22.0f, 4.56f, 20.52f, 3.0f, 18.65f, 3.0f)
                curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f)
                lineToRelative(-3.5f, 4.11f)
                lineToRelative(1.42f, 1.42f)
                lineTo(15.0f, 8.66f)
                close()
                moveTo(19.78f, 22.61f)
                lineToRelative(-1.91f, -1.91f)
                curveTo(17.58f, 21.46f, 16.86f, 22.0f, 16.0f, 22.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.86f, 0.54f, -1.58f, 1.3f, -1.87f)
                lineTo(14.17f, 17.0f)
                horizontalLineTo(7.43f)
                curveToRelative(-0.85f, 0.0f, -1.31f, -1.0f, -0.76f, -1.65f)
                lineToRelative(2.69f, -3.16f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(7.86f, 7.86f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(9.11f, 9.11f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(12.17f, 15.0f)
                lineToRelative(-1.39f, -1.39f)
                lineTo(9.6f, 15.0f)
                horizontalLineTo(12.17f)
                close()
                moveTo(10.0f, 5.0f)
                curveToRelative(0.29f, 0.0f, 0.58f, 0.02f, 0.86f, 0.05f)
                lineTo(9.49f, 6.67f)
                lineToRelative(1.42f, 1.42f)
                lineTo(14.3f, 4.1f)
                curveTo(13.03f, 3.4f, 11.56f, 3.0f, 10.0f, 3.0f)
                curveTo(8.77f, 3.0f, 7.6f, 3.25f, 6.53f, 3.7f)
                lineTo(8.1f, 5.27f)
                curveTo(8.71f, 5.1f, 9.35f, 5.0f, 10.0f, 5.0f)
                close()
            }
        }
        .build()
        return _noStroller!!
    }

private var _noStroller: ImageVector? = null
