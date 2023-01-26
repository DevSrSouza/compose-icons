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

public val BaselineGroup.DonutLarge: ImageVector
    get() {
        if (_donutLarge != null) {
            return _donutLarge!!
        }
        _donutLarge = Builder(name = "DonutLarge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.08f)
                verticalLineTo(2.0f)
                curveTo(6.0f, 2.5f, 2.0f, 6.81f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.0f, 9.5f, 9.0f, 10.0f)
                verticalLineToRelative(-3.08f)
                curveToRelative(-3.0f, -0.48f, -6.0f, -3.4f, -6.0f, -6.92f)
                reflectiveCurveTo(8.0f, 5.56f, 11.0f, 5.08f)
                close()
                moveTo(18.97f, 11.0f)
                horizontalLineTo(22.0f)
                curveToRelative(-0.47f, -5.0f, -4.0f, -8.53f, -9.0f, -9.0f)
                verticalLineToRelative(3.08f)
                curveTo(16.0f, 5.51f, 18.54f, 8.0f, 18.97f, 11.0f)
                close()
                moveTo(13.0f, 18.92f)
                verticalLineTo(22.0f)
                curveToRelative(5.0f, -0.47f, 8.53f, -4.0f, 9.0f, -9.0f)
                horizontalLineToRelative(-3.03f)
                curveTo(18.54f, 16.0f, 16.0f, 18.49f, 13.0f, 18.92f)
                close()
            }
        }
        .build()
        return _donutLarge!!
    }

private var _donutLarge: ImageVector? = null
