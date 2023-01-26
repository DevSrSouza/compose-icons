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

public val TwotoneGroup.PhoneLocked: ImageVector
    get() {
        if (_phoneLocked != null) {
            return _phoneLocked!!
        }
        _phoneLocked = Builder(name = "PhoneLocked", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 17.83f)
                curveToRelative(1.29f, 0.54f, 2.63f, 0.89f, 4.0f, 1.07f)
                verticalLineToRelative(-2.23f)
                lineToRelative(-2.35f, -0.47f)
                lineTo(15.0f, 17.83f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.33f, 5.0f)
                horizontalLineTo(5.1f)
                curveToRelative(0.18f, 1.37f, 0.53f, 2.7f, 1.07f, 4.0f)
                lineTo(7.8f, 7.35f)
                lineTo(7.33f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2f, 14.87f)
                lineToRelative(-3.67f, -0.73f)
                curveToRelative(-0.5f, -0.1f, -0.83f, 0.2f, -0.9f, 0.27f)
                lineToRelative(-2.52f, 2.5f)
                curveToRelative(-2.5f, -1.43f, -4.57f, -3.5f, -6.0f, -6.0f)
                lineToRelative(2.5f, -2.52f)
                curveToRelative(0.23f, -0.24f, 0.33f, -0.57f, 0.27f, -0.9f)
                lineTo(9.13f, 3.8f)
                curveTo(9.04f, 3.34f, 8.63f, 3.0f, 8.15f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(3.44f, 3.0f, 2.97f, 3.47f, 3.0f, 4.03f)
                curveTo(3.17f, 6.92f, 4.05f, 9.63f, 5.43f, 12.0f)
                curveToRelative(1.58f, 2.73f, 3.85f, 4.99f, 6.57f, 6.57f)
                curveToRelative(2.37f, 1.37f, 5.08f, 2.26f, 7.97f, 2.43f)
                curveToRelative(0.55f, 0.03f, 1.03f, -0.43f, 1.03f, -1.0f)
                verticalLineToRelative(-4.15f)
                curveTo(21.0f, 15.37f, 20.66f, 14.96f, 20.2f, 14.87f)
                close()
                moveTo(5.1f, 5.0f)
                horizontalLineToRelative(2.23f)
                lineTo(7.8f, 7.35f)
                lineTo(6.17f, 9.0f)
                curveTo(5.63f, 7.7f, 5.27f, 6.37f, 5.1f, 5.0f)
                close()
                moveTo(19.0f, 18.9f)
                curveToRelative(-1.37f, -0.18f, -2.7f, -0.53f, -4.0f, -1.07f)
                lineToRelative(1.65f, -1.63f)
                lineTo(19.0f, 16.67f)
                verticalLineTo(18.9f)
                close()
            }
        }
        .build()
        return _phoneLocked!!
    }

private var _phoneLocked: ImageVector? = null
