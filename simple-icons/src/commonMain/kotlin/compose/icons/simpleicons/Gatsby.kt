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

public val SimpleIcons.Gatsby: ImageVector
    get() {
        if (_gatsby != null) {
            return _gatsby!!
        }
        _gatsby = Builder(name = "Gatsby", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.4f, 0.0f, 0.0f, 5.4f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.4f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.4f, 12.0f, -12.0f)
                reflectiveCurveTo(18.6f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 2.571f)
                curveToRelative(3.171f, 0.0f, 5.915f, 1.543f, 7.629f, 3.858f)
                lineToRelative(-1.286f, 1.115f)
                curveTo(16.886f, 5.572f, 14.571f, 4.286f, 12.0f, 4.286f)
                curveToRelative(-3.343f, 0.0f, -6.171f, 2.143f, -7.286f, 5.143f)
                lineToRelative(9.857f, 9.857f)
                curveToRelative(2.486f, -0.857f, 4.373f, -3.0f, 4.973f, -5.572f)
                horizontalLineToRelative(-4.115f)
                lineTo(15.429f, 12.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 4.457f, -3.172f, 8.228f, -7.372f, 9.17f)
                lineTo(2.83f, 9.944f)
                curveTo(3.772f, 5.743f, 7.543f, 2.57f, 12.0f, 2.57f)
                close()
                moveTo(2.571f, 12.171f)
                lineToRelative(9.344f, 9.258f)
                curveToRelative(-2.4f, -0.086f, -4.801f, -0.943f, -6.601f, -2.743f)
                curveToRelative(-1.8f, -1.8f, -2.743f, -4.201f, -2.743f, -6.515f)
                close()
            }
        }
        .build()
        return _gatsby!!
    }

private var _gatsby: ImageVector? = null
