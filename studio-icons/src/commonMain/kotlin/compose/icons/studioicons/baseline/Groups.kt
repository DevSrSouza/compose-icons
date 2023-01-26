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

public val BaselineGroup.Groups: ImageVector
    get() {
        if (_groups != null) {
            return _groups!!
        }
        _groups = Builder(name = "Groups", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.75f)
                curveToRelative(1.63f, 0.0f, 3.07f, 0.39f, 4.24f, 0.9f)
                curveToRelative(1.08f, 0.48f, 1.76f, 1.56f, 1.76f, 2.73f)
                lineTo(18.0f, 18.0f)
                horizontalLineTo(6.0f)
                lineToRelative(0.0f, -1.61f)
                curveToRelative(0.0f, -1.18f, 0.68f, -2.26f, 1.76f, -2.73f)
                curveTo(8.93f, 13.14f, 10.37f, 12.75f, 12.0f, 12.75f)
                close()
                moveTo(4.0f, 13.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                curveTo(2.0f, 12.1f, 2.9f, 13.0f, 4.0f, 13.0f)
                close()
                moveTo(5.13f, 14.1f)
                curveTo(4.76f, 14.04f, 4.39f, 14.0f, 4.0f, 14.0f)
                curveToRelative(-0.99f, 0.0f, -1.93f, 0.21f, -2.78f, 0.58f)
                curveTo(0.48f, 14.9f, 0.0f, 15.62f, 0.0f, 16.43f)
                verticalLineTo(18.0f)
                lineToRelative(4.5f, 0.0f)
                verticalLineToRelative(-1.61f)
                curveTo(4.5f, 15.56f, 4.73f, 14.78f, 5.13f, 14.1f)
                close()
                moveTo(20.0f, 13.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                curveTo(18.0f, 12.1f, 18.9f, 13.0f, 20.0f, 13.0f)
                close()
                moveTo(24.0f, 16.43f)
                curveToRelative(0.0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f)
                curveTo(21.93f, 14.21f, 20.99f, 14.0f, 20.0f, 14.0f)
                curveToRelative(-0.39f, 0.0f, -0.76f, 0.04f, -1.13f, 0.1f)
                curveToRelative(0.4f, 0.68f, 0.63f, 1.46f, 0.63f, 2.29f)
                verticalLineTo(18.0f)
                lineToRelative(4.5f, 0.0f)
                verticalLineTo(16.43f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f)
                curveTo(9.0f, 7.34f, 10.34f, 6.0f, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _groups!!
    }

private var _groups: ImageVector? = null
