package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.AlternateEmail: ImageVector
    get() {
        if (_alternateEmail != null) {
            return _alternateEmail!!
        }
        _alternateEmail = Builder(name = "AlternateEmail", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.72f, 2.03f)
                curveTo(6.63f, 1.6f, 1.6f, 6.63f, 2.03f, 12.72f)
                curveTo(2.39f, 18.01f, 7.01f, 22.0f, 12.31f, 22.0f)
                horizontalLineTo(16.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.67f)
                curveToRelative(-3.73f, 0.0f, -7.15f, -2.42f, -8.08f, -6.03f)
                curveToRelative(-1.49f, -5.8f, 3.91f, -11.21f, 9.71f, -9.71f)
                curveTo(17.58f, 5.18f, 20.0f, 8.6f, 20.0f, 12.33f)
                verticalLineToRelative(1.1f)
                curveToRelative(0.0f, 0.79f, -0.71f, 1.57f, -1.5f, 1.57f)
                reflectiveCurveToRelative(-1.5f, -0.78f, -1.5f, -1.57f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0.0f, -2.51f, -1.78f, -4.77f, -4.26f, -5.12f)
                curveToRelative(-3.4f, -0.49f, -6.27f, 2.45f, -5.66f, 5.87f)
                curveToRelative(0.34f, 1.91f, 1.83f, 3.49f, 3.72f, 3.94f)
                curveToRelative(1.84f, 0.43f, 3.59f, -0.16f, 4.74f, -1.33f)
                curveToRelative(0.89f, 1.22f, 2.67f, 1.86f, 4.3f, 1.21f)
                curveToRelative(1.34f, -0.53f, 2.16f, -1.9f, 2.16f, -3.34f)
                verticalLineToRelative(-1.09f)
                curveToRelative(0.0f, -5.31f, -3.99f, -9.93f, -9.28f, -10.29f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _alternateEmail!!
    }

private var _alternateEmail: ImageVector? = null
