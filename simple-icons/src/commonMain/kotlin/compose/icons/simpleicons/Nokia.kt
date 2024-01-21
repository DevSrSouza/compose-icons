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

public val SimpleIcons.Nokia: ImageVector
    get() {
        if (_nokia != null) {
            return _nokia!!
        }
        _nokia = Builder(name = "Nokia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.59f, 9.348f)
                verticalLineToRelative(5.304f)
                horizontalLineToRelative(0.796f)
                lineTo(17.386f, 9.348f)
                close()
                moveTo(8.093f, 9.258f)
                curveToRelative(-1.55f, 0.0f, -2.752f, 1.127f, -2.752f, 2.742f)
                curveToRelative(0.0f, 1.687f, 1.202f, 2.742f, 2.752f, 2.742f)
                curveToRelative(1.55f, 0.0f, 2.754f, -1.055f, 2.751f, -2.742f)
                arcToRelative(2.72f, 2.72f, 0.0f, false, false, -2.751f, -2.742f)
                close()
                moveTo(10.05f, 12.0f)
                curveToRelative(0.0f, 1.195f, -0.876f, 1.987f, -1.957f, 1.987f)
                curveToRelative(-1.082f, 0.0f, -1.958f, -0.792f, -1.958f, -1.987f)
                curveToRelative(0.0f, -1.174f, 0.876f, -1.987f, 1.958f, -1.987f)
                curveToRelative(1.08f, 0.0f, 1.957f, 0.813f, 1.957f, 1.987f)
                close()
                moveTo(0.0f, 9.176f)
                verticalLineToRelative(5.476f)
                horizontalLineToRelative(0.812f)
                verticalLineToRelative(-3.619f)
                lineToRelative(4.218f, 3.79f)
                verticalLineToRelative(-1.135f)
                close()
                moveTo(11.442f, 12.0f)
                lineToRelative(2.952f, 2.652f)
                horizontalLineToRelative(1.184f)
                lineTo(12.622f, 12.0f)
                lineToRelative(2.956f, -2.652f)
                horizontalLineToRelative(-1.184f)
                close()
                moveTo(24.0f, 14.652f)
                horizontalLineToRelative(-0.875f)
                lineToRelative(-0.64f, -1.175f)
                horizontalLineToRelative(-2.898f)
                lineToRelative(-0.64f, 1.175f)
                horizontalLineToRelative(-0.875f)
                lineToRelative(1.06f, -1.958f)
                horizontalLineToRelative(2.937f)
                lineToRelative(-1.465f, -2.72f)
                lineToRelative(0.432f, -0.798f)
                close()
            }
        }
        .build()
        return _nokia!!
    }

private var _nokia: ImageVector? = null
