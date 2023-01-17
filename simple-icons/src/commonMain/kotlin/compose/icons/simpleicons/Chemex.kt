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

public val SimpleIcons.Chemex: ImageVector
    get() {
        if (_chemex != null) {
            return _chemex!!
        }
        _chemex = Builder(name = "Chemex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.665f, 0.124f)
                curveToRelative(-0.741f, 0.0f, -1.36f, 0.593f, -1.36f, 1.334f)
                curveToRelative(0.0f, 0.742f, 0.619f, 1.335f, 1.36f, 1.335f)
                arcTo(1.33f, 1.33f, 0.0f, false, false, 24.0f, 1.458f)
                arcTo(1.33f, 1.33f, 0.0f, false, false, 22.665f, 0.124f)
                close()
                moveTo(1.112f, 0.148f)
                reflectiveCurveToRelative(5.314f, 6.748f, 5.982f, 7.91f)
                curveToRelative(0.89f, 1.557f, 0.84f, 2.076f, -0.124f, 3.954f)
                curveTo(6.352f, 13.2f, 0.0f, 23.876f, 0.0f, 23.876f)
                horizontalLineToRelative(2.694f)
                reflectiveCurveTo(8.7f, 13.668f, 9.516f, 12.284f)
                curveToRelative(0.89f, -1.508f, 0.89f, -3.164f, 0.148f, -4.474f)
                curveTo(9.071f, 6.772f, 3.831f, 0.148f, 3.831f, 0.148f)
                close()
                moveTo(18.068f, 0.148f)
                reflectiveCurveToRelative(-5.24f, 6.624f, -5.833f, 7.662f)
                curveToRelative(-0.717f, 1.286f, -0.766f, 2.917f, 0.148f, 4.474f)
                curveToRelative(0.816f, 1.384f, 6.822f, 11.592f, 6.822f, 11.592f)
                horizontalLineToRelative(2.67f)
                curveToRelative(0.0f, -0.024f, -6.328f, -10.677f, -6.946f, -11.888f)
                curveToRelative(-0.964f, -1.854f, -1.013f, -2.373f, -0.123f, -3.93f)
                curveToRelative(0.667f, -1.162f, 5.98f, -7.91f, 5.98f, -7.91f)
                close()
                moveTo(22.665f, 0.371f)
                curveToRelative(0.593f, 0.0f, 1.088f, 0.494f, 1.088f, 1.087f)
                curveToRelative(0.0f, 0.594f, -0.495f, 1.088f, -1.088f, 1.088f)
                arcToRelative(1.097f, 1.097f, 0.0f, false, true, -1.087f, -1.088f)
                arcTo(1.08f, 1.08f, 0.0f, false, true, 22.665f, 0.371f)
                close()
                moveTo(22.072f, 0.667f)
                lineTo(22.072f, 2.15f)
                horizontalLineToRelative(0.272f)
                verticalLineToRelative(-0.519f)
                horizontalLineToRelative(0.37f)
                lineToRelative(0.273f, 0.52f)
                horizontalLineToRelative(0.321f)
                lineToRelative(-0.297f, -0.544f)
                arcToRelative(0.453f, 0.453f, 0.0f, false, false, 0.297f, -0.446f)
                curveToRelative(0.0f, -0.296f, -0.198f, -0.494f, -0.52f, -0.494f)
                close()
                moveTo(22.393f, 0.939f)
                horizontalLineToRelative(0.445f)
                curveToRelative(0.149f, 0.0f, 0.223f, 0.05f, 0.223f, 0.222f)
                curveToRelative(0.0f, 0.173f, -0.124f, 0.223f, -0.223f, 0.223f)
                horizontalLineToRelative(-0.445f)
                close()
            }
        }
        .build()
        return _chemex!!
    }

private var _chemex: ImageVector? = null
