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

public val RoundGroup.MicNone: ImageVector
    get() {
        if (_micNone != null) {
            return _micNone!!
        }
        _micNone = Builder(name = "MicNone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                lineTo(15.0f, 5.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveTo(9.0f, 3.34f, 9.0f, 5.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(11.0f, 5.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(11.0f, 5.0f)
                close()
                moveTo(17.91f, 11.0f)
                curveToRelative(-0.49f, 0.0f, -0.9f, 0.36f, -0.98f, 0.85f)
                curveTo(16.52f, 14.2f, 14.47f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveToRelative(-4.52f, -1.8f, -4.93f, -4.15f)
                curveToRelative(-0.08f, -0.49f, -0.49f, -0.85f, -0.98f, -0.85f)
                curveToRelative(-0.61f, 0.0f, -1.09f, 0.54f, -1.0f, 1.14f)
                curveToRelative(0.49f, 3.0f, 2.89f, 5.35f, 5.91f, 5.78f)
                lineTo(11.0f, 20.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.08f)
                curveToRelative(3.02f, -0.43f, 5.42f, -2.78f, 5.91f, -5.78f)
                curveToRelative(0.1f, -0.6f, -0.39f, -1.14f, -1.0f, -1.14f)
                close()
            }
        }
        .build()
        return _micNone!!
    }

private var _micNone: ImageVector? = null
