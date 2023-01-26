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

public val BaselineGroup.ChangeCircle: ImageVector
    get() {
        if (_changeCircle != null) {
            return _changeCircle!!
        }
        _changeCircle = Builder(name = "ChangeCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.06f, 19.0f)
                verticalLineToRelative(-2.01f)
                curveToRelative(-0.02f, 0.0f, -0.04f, 0.0f, -0.06f, 0.0f)
                curveToRelative(-1.28f, 0.0f, -2.56f, -0.49f, -3.54f, -1.46f)
                curveToRelative(-1.71f, -1.71f, -1.92f, -4.35f, -0.64f, -6.29f)
                lineToRelative(1.1f, 1.1f)
                curveToRelative(-0.71f, 1.33f, -0.53f, 3.01f, 0.59f, 4.13f)
                curveToRelative(0.7f, 0.7f, 1.62f, 1.03f, 2.54f, 1.01f)
                verticalLineToRelative(-2.14f)
                lineToRelative(2.83f, 2.83f)
                lineTo(12.06f, 19.0f)
                close()
                moveTo(16.17f, 14.76f)
                lineToRelative(-1.1f, -1.1f)
                curveToRelative(0.71f, -1.33f, 0.53f, -3.01f, -0.59f, -4.13f)
                curveTo(13.79f, 8.84f, 12.9f, 8.5f, 12.0f, 8.5f)
                curveToRelative(-0.02f, 0.0f, -0.04f, 0.0f, -0.06f, 0.0f)
                verticalLineToRelative(2.15f)
                lineTo(9.11f, 7.83f)
                lineTo(11.94f, 5.0f)
                verticalLineToRelative(2.02f)
                curveToRelative(1.3f, -0.02f, 2.61f, 0.45f, 3.6f, 1.45f)
                curveTo(17.24f, 10.17f, 17.45f, 12.82f, 16.17f, 14.76f)
                close()
            }
        }
        .build()
        return _changeCircle!!
    }

private var _changeCircle: ImageVector? = null
