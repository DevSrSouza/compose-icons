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

public val SimpleIcons.Okta: ImageVector
    get() {
        if (_okta != null) {
            return _okta!!
        }
        _okta = Builder(name = "Okta", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.389f, 0.0f, 0.0f, 5.35f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.35f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.35f, 12.0f, -12.0f)
                reflectiveCurveTo(18.611f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-3.325f, 0.0f, -6.0f, -2.675f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.675f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.675f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.675f, 6.0f, -6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _okta!!
    }

private var _okta: ImageVector? = null
