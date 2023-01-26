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

public val TwotoneGroup.Stroller: ImageVector
    get() {
        if (_stroller != null) {
            return _stroller!!
        }
        _stroller = Builder(name = "Stroller", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 5.0f)
                curveToRelative(0.29f, 0.0f, 0.58f, 0.02f, 0.86f, 0.05f)
                lineTo(9.49f, 6.66f)
                lineToRelative(-1.4f, -1.4f)
                curveTo(8.71f, 5.09f, 9.35f, 5.0f, 10.0f, 5.0f)
                moveTo(15.0f, 8.66f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.6f)
                lineTo(15.0f, 8.66f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 5.0f)
                curveToRelative(0.29f, 0.0f, 0.58f, 0.02f, 0.86f, 0.05f)
                lineTo(9.49f, 6.66f)
                lineToRelative(-1.4f, -1.4f)
                curveTo(8.71f, 5.09f, 9.35f, 5.0f, 10.0f, 5.0f)
                moveTo(15.0f, 8.66f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.6f)
                lineTo(15.0f, 8.66f)
                moveTo(18.65f, 3.0f)
                curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f)
                lineToRelative(-8.8f, 10.32f)
                curveTo(6.12f, 16.0f, 6.58f, 17.0f, 7.43f, 17.0f)
                horizontalLineTo(15.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(6.27f)
                curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f)
                curveTo(19.42f, 5.0f, 20.0f, 5.66f, 20.0f, 6.48f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.48f)
                curveTo(22.0f, 4.56f, 20.52f, 3.0f, 18.65f, 3.0f)
                lineTo(18.65f, 3.0f)
                close()
                moveTo(10.0f, 3.0f)
                curveTo(8.03f, 3.0f, 6.21f, 3.64f, 4.72f, 4.72f)
                lineToRelative(4.89f, 4.89f)
                lineToRelative(4.7f, -5.51f)
                curveTo(13.03f, 3.4f, 11.56f, 3.0f, 10.0f, 3.0f)
                lineTo(10.0f, 3.0f)
                close()
                moveTo(16.0f, 18.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(17.1f, 18.0f, 16.0f, 18.0f)
                lineTo(16.0f, 18.0f)
                close()
                moveTo(6.0f, 18.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(7.1f, 18.0f, 6.0f, 18.0f)
                lineTo(6.0f, 18.0f)
                close()
            }
        }
        .build()
        return _stroller!!
    }

private var _stroller: ImageVector? = null
