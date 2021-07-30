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

public val SimpleIcons.Mega: ImageVector
    get() {
        if (_mega != null) {
            return _mega!!
        }
        _mega = Builder(name = "Mega", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(18.23f, 16.244f)
                arcToRelative(0.371f, 0.371f, 0.0f, false, true, -0.373f, 0.372f)
                lineTo(16.29f, 16.616f)
                arcToRelative(0.371f, 0.371f, 0.0f, false, true, -0.372f, -0.372f)
                verticalLineToRelative(-4.828f)
                curveToRelative(0.0f, -0.04f, -0.046f, -0.06f, -0.08f, -0.033f)
                lineToRelative(-3.32f, 3.32f)
                arcToRelative(0.742f, 0.742f, 0.0f, false, true, -1.043f, 0.0f)
                lineToRelative(-3.32f, -3.32f)
                curveToRelative(-0.027f, -0.027f, -0.08f, -0.007f, -0.08f, 0.033f)
                verticalLineToRelative(4.828f)
                arcToRelative(0.371f, 0.371f, 0.0f, false, true, -0.372f, 0.372f)
                lineTo(6.136f, 16.616f)
                arcToRelative(0.371f, 0.371f, 0.0f, false, true, -0.372f, -0.372f)
                lineTo(5.764f, 7.757f)
                curveToRelative(0.0f, -0.206f, 0.166f, -0.372f, 0.372f, -0.372f)
                horizontalLineToRelative(1.076f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.525f, 0.22f)
                lineToRelative(4.13f, 4.13f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, false, 0.26f, 0.0f)
                lineToRelative(4.13f, -4.13f)
                curveToRelative(0.14f, -0.14f, 0.325f, -0.22f, 0.525f, -0.22f)
                horizontalLineToRelative(1.075f)
                curveToRelative(0.206f, 0.0f, 0.372f, 0.166f, 0.372f, 0.372f)
                close()
            }
        }
        .build()
        return _mega!!
    }

private var _mega: ImageVector? = null
