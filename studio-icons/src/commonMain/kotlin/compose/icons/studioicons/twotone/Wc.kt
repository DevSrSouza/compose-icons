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

public val TwotoneGroup.Wc: ImageVector
    get() {
        if (_wc != null) {
            return _wc!!
        }
        _wc = Builder(name = "Wc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 22.0f)
                verticalLineToRelative(-7.5f)
                lineTo(4.0f, 14.5f)
                lineTo(4.0f, 9.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(5.5f)
                lineTo(9.5f, 14.5f)
                lineTo(9.5f, 22.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(18.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-2.54f, -7.63f)
                curveTo(18.18f, 7.55f, 17.42f, 7.0f, 16.56f, 7.0f)
                horizontalLineToRelative(-0.12f)
                curveToRelative(-0.86f, 0.0f, -1.63f, 0.55f, -1.9f, 1.37f)
                lineTo(12.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(7.5f, 6.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.89f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(16.5f, 6.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.89f, 2.0f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _wc!!
    }

private var _wc: ImageVector? = null
