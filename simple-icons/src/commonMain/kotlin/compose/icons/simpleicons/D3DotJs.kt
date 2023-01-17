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

public val SimpleIcons.D3dotjs: ImageVector
    get() {
        if (_d3dotjs != null) {
            return _d3dotjs!!
        }
        _d3dotjs = Builder(name = "D3dotjs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.312f, 12.0f)
                curveTo(13.312f, 5.718f, 8.22f, 0.625f, 1.937f, 0.625f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.938f)
                curveToRelative(3.521f, 0.0f, 6.375f, 2.854f, 6.375f, 6.375f)
                reflectiveCurveToRelative(-2.854f, 6.375f, -6.375f, 6.375f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.938f)
                curveToRelative(6.281f, 0.0f, 11.374f, -5.093f, 11.374f, -11.375f)
                close()
                moveTo(24.0f, 7.563f)
                curveTo(24.0f, 3.731f, 20.893f, 0.625f, 17.062f, 0.625f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(13.4154f, 13.4154f, 0.0f, false, true, 4.686f, 5.0f)
                horizontalLineToRelative(3.314f)
                curveToRelative(1.069f, 0.0f, 1.938f, 0.868f, 1.938f, 1.938f)
                curveToRelative(0.0f, 1.07f, -0.869f, 1.938f, -1.938f, 1.938f)
                horizontalLineToRelative(-1.938f)
                curveToRelative(0.313f, 1.652f, 0.313f, 3.348f, 0.0f, 5.0f)
                horizontalLineToRelative(1.938f)
                curveToRelative(1.068f, 0.0f, 1.938f, 0.867f, 1.938f, 1.938f)
                reflectiveCurveToRelative(-0.869f, 1.938f, -1.938f, 1.938f)
                horizontalLineToRelative(-3.314f)
                arcToRelative(13.4154f, 13.4154f, 0.0f, false, true, -4.686f, 5.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.621f, 0.0f, 3.191f, -0.568f, 4.438f, -1.605f)
                curveToRelative(2.943f, -2.45f, 3.346f, -6.824f, 0.895f, -9.77f)
                arcTo(6.9459f, 6.9459f, 0.0f, false, false, 24.0f, 7.563f)
                close()
            }
        }
        .build()
        return _d3dotjs!!
    }

private var _d3dotjs: ImageVector? = null
