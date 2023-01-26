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

public val TwotoneGroup.SafetyDivider: ImageVector
    get() {
        if (_safetyDivider != null) {
            return _safetyDivider!!
        }
        _safetyDivider = Builder(name = "SafetyDivider", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(5.0f, 12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                curveTo(3.0f, 11.1f, 3.9f, 12.0f, 5.0f, 12.0f)
                close()
                moveTo(7.78f, 13.58f)
                curveTo(6.93f, 13.21f, 5.99f, 13.0f, 5.0f, 13.0f)
                reflectiveCurveToRelative(-1.93f, 0.21f, -2.78f, 0.58f)
                curveTo(1.48f, 13.9f, 1.0f, 14.62f, 1.0f, 15.43f)
                lineTo(1.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(0.0f, -0.57f)
                curveTo(9.0f, 14.62f, 8.52f, 13.9f, 7.78f, 13.58f)
                close()
                moveTo(19.0f, 12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                curveTo(17.0f, 11.1f, 17.9f, 12.0f, 19.0f, 12.0f)
                close()
                moveTo(21.78f, 13.58f)
                curveTo(20.93f, 13.21f, 19.99f, 13.0f, 19.0f, 13.0f)
                reflectiveCurveToRelative(-1.93f, 0.21f, -2.78f, 0.58f)
                curveTo(15.48f, 13.9f, 15.0f, 14.62f, 15.0f, 15.43f)
                lineTo(15.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(0.0f, -0.57f)
                curveTo(23.0f, 14.62f, 22.52f, 13.9f, 21.78f, 13.58f)
                close()
            }
        }
        .build()
        return _safetyDivider!!
    }

private var _safetyDivider: ImageVector? = null
