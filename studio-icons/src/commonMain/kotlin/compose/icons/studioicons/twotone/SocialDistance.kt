package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.SocialDistance: ImageVector
    get() {
        if (_socialDistance != null) {
            return _socialDistance!!
        }
        _socialDistance = Builder(name = "SocialDistance", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(4.0f, 6.1f, 4.0f, 5.0f)
                close()
                moveTo(8.78f, 8.58f)
                curveTo(7.93f, 8.21f, 6.99f, 8.0f, 6.0f, 8.0f)
                reflectiveCurveTo(4.07f, 8.21f, 3.22f, 8.58f)
                curveTo(2.48f, 8.9f, 2.0f, 9.62f, 2.0f, 10.43f)
                lineTo(2.0f, 11.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(0.0f, -0.57f)
                curveTo(10.0f, 9.62f, 9.52f, 8.9f, 8.78f, 8.58f)
                close()
                moveTo(18.0f, 7.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                curveTo(16.0f, 6.1f, 16.9f, 7.0f, 18.0f, 7.0f)
                close()
                moveTo(20.78f, 8.58f)
                curveTo(19.93f, 8.21f, 18.99f, 8.0f, 18.0f, 8.0f)
                curveToRelative(-0.99f, 0.0f, -1.93f, 0.21f, -2.78f, 0.58f)
                curveTo(14.48f, 8.9f, 14.0f, 9.62f, 14.0f, 10.43f)
                lineTo(14.0f, 11.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(0.0f, -0.57f)
                curveTo(22.0f, 9.62f, 21.52f, 8.9f, 20.78f, 8.58f)
                close()
                moveTo(22.0f, 17.0f)
                lineToRelative(-4.0f, -4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(4.0f, 4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(3.0f)
                lineTo(22.0f, 17.0f)
                close()
            }
        }
        .build()
        return _socialDistance!!
    }

private var _socialDistance: ImageVector? = null
