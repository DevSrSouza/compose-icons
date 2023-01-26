package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Update: ImageVector
    get() {
        if (_update != null) {
            return _update!!
        }
        _update = Builder(name = "Update", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.12f)
                horizontalLineToRelative(-6.78f)
                lineToRelative(2.74f, -2.82f)
                curveToRelative(-2.73f, -2.7f, -7.15f, -2.8f, -9.88f, -0.1f)
                curveToRelative(-2.73f, 2.71f, -2.73f, 7.08f, 0.0f, 9.79f)
                reflectiveCurveToRelative(7.15f, 2.71f, 9.88f, 0.0f)
                curveTo(18.32f, 15.65f, 19.0f, 14.08f, 19.0f, 12.1f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.98f, -0.88f, 4.55f, -2.64f, 6.29f)
                curveToRelative(-3.51f, 3.48f, -9.21f, 3.48f, -12.72f, 0.0f)
                curveToRelative(-3.5f, -3.47f, -3.53f, -9.11f, -0.02f, -12.58f)
                reflectiveCurveToRelative(9.14f, -3.47f, 12.65f, 0.0f)
                lineTo(21.0f, 3.0f)
                verticalLineTo(10.12f)
                close()
                moveTo(12.5f, 8.0f)
                verticalLineToRelative(4.25f)
                lineToRelative(3.5f, 2.08f)
                lineToRelative(-0.72f, 1.21f)
                lineTo(11.0f, 13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.5f)
                close()
            }
        }
        .build()
        return _update!!
    }

private var _update: ImageVector? = null
