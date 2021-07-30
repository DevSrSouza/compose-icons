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

public val SimpleIcons.Orcid: ImageVector
    get() {
        if (_orcid != null) {
            return _orcid!!
        }
        _orcid = Builder(name = "Orcid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.372f, 0.0f, 0.0f, 5.372f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.372f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.372f, 12.0f, -12.0f)
                reflectiveCurveTo(18.628f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(7.369f, 4.378f)
                curveToRelative(0.525f, 0.0f, 0.947f, 0.431f, 0.947f, 0.947f)
                reflectiveCurveToRelative(-0.422f, 0.947f, -0.947f, 0.947f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, true, -0.947f, -0.947f)
                curveToRelative(0.0f, -0.525f, 0.422f, -0.947f, 0.947f, -0.947f)
                close()
                moveTo(6.647f, 7.416f)
                horizontalLineToRelative(1.444f)
                verticalLineToRelative(10.041f)
                lineTo(6.647f, 17.457f)
                lineTo(6.647f, 7.416f)
                close()
                moveTo(10.209f, 7.416f)
                horizontalLineToRelative(3.9f)
                curveToRelative(3.712f, 0.0f, 5.344f, 2.653f, 5.344f, 5.025f)
                curveToRelative(0.0f, 2.578f, -2.016f, 5.025f, -5.325f, 5.025f)
                horizontalLineToRelative(-3.919f)
                lineTo(10.209f, 7.416f)
                close()
                moveTo(11.653f, 8.719f)
                verticalLineToRelative(7.444f)
                horizontalLineToRelative(2.297f)
                curveToRelative(3.272f, 0.0f, 4.022f, -2.484f, 4.022f, -3.722f)
                curveToRelative(0.0f, -2.016f, -1.284f, -3.722f, -4.097f, -3.722f)
                horizontalLineToRelative(-2.222f)
                close()
            }
        }
        .build()
        return _orcid!!
    }

private var _orcid: ImageVector? = null
