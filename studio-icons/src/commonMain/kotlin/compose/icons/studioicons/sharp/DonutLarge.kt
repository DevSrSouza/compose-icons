package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.DonutLarge: ImageVector
    get() {
        if (_donutLarge != null) {
            return _donutLarge!!
        }
        _donutLarge = Builder(name = "DonutLarge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.08f)
                curveToRelative(3.06f, 0.44f, 5.48f, 2.86f, 5.92f, 5.92f)
                horizontalLineToRelative(3.03f)
                curveToRelative(-0.47f, -4.72f, -4.23f, -8.48f, -8.95f, -8.95f)
                verticalLineToRelative(3.03f)
                close()
                moveTo(18.92f, 13.0f)
                curveToRelative(-0.44f, 3.06f, -2.86f, 5.48f, -5.92f, 5.92f)
                verticalLineToRelative(3.03f)
                curveToRelative(4.72f, -0.47f, 8.48f, -4.23f, 8.95f, -8.95f)
                horizontalLineToRelative(-3.03f)
                close()
                moveTo(11.0f, 18.92f)
                curveToRelative(-3.39f, -0.49f, -6.0f, -3.4f, -6.0f, -6.92f)
                reflectiveCurveToRelative(2.61f, -6.43f, 6.0f, -6.92f)
                verticalLineTo(2.05f)
                curveToRelative(-5.05f, 0.5f, -9.0f, 4.76f, -9.0f, 9.95f)
                curveToRelative(0.0f, 5.19f, 3.95f, 9.45f, 9.0f, 9.95f)
                verticalLineToRelative(-3.03f)
                close()
            }
        }
        .build()
        return _donutLarge!!
    }

private var _donutLarge: ImageVector? = null
