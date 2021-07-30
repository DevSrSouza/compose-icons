package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Iconify: ImageVector
    get() {
        if (_iconify != null) {
            return _iconify!!
        }
        _iconify = Builder(name = "Iconify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.5f)
                curveToRelative(3.75f, 0.0f, 7.159f, -3.379f, 6.768f, -4.125f)
                curveToRelative(-0.393f, -0.75f, -2.268f, 1.875f, -6.768f, 1.875f)
                reflectiveCurveToRelative(-6.0f, -2.625f, -6.375f, -1.875f)
                reflectiveCurveTo(8.25f, 19.5f, 12.0f, 19.5f)
                close()
                moveTo(16.125f, 7.5f)
                curveToRelative(0.623f, 0.0f, 1.125f, 0.502f, 1.125f, 1.125f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.623f, -0.502f, 1.125f, -1.125f, 1.125f)
                arcTo(1.123f, 1.123f, 0.0f, false, true, 15.0f, 10.125f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.623f, 0.502f, -1.125f, 1.125f, -1.125f)
                close()
                moveTo(7.875f, 7.5f)
                curveTo(8.498f, 7.5f, 9.0f, 8.002f, 9.0f, 8.625f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.623f, -0.502f, 1.125f, -1.125f, 1.125f)
                arcToRelative(1.123f, 1.123f, 0.0f, false, true, -1.125f, -1.125f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.623f, 0.502f, -1.125f, 1.125f, -1.125f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.381f, 0.0f, 0.0f, 5.381f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.381f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.381f, 12.0f, -12.0f)
                reflectiveCurveTo(18.619f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 1.5f)
                curveToRelative(5.808f, 0.0f, 10.5f, 4.692f, 10.5f, 10.5f)
                reflectiveCurveTo(17.808f, 22.5f, 12.0f, 22.5f)
                reflectiveCurveTo(1.5f, 17.808f, 1.5f, 12.0f)
                reflectiveCurveTo(6.192f, 1.5f, 12.0f, 1.5f)
                close()
            }
        }
        .build()
        return _iconify!!
    }

private var _iconify: ImageVector? = null
