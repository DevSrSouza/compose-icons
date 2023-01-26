package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.ChangeCircle: ImageVector
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
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f)
                reflectiveCurveTo(16.41f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(16.17f, 14.76f)
                lineToRelative(-1.1f, -1.1f)
                curveToRelative(0.71f, -1.33f, 0.53f, -3.01f, -0.59f, -4.13f)
                curveTo(13.79f, 8.84f, 12.9f, 8.5f, 12.0f, 8.5f)
                curveToRelative(-0.03f, 0.0f, -0.06f, 0.01f, -0.09f, 0.01f)
                lineTo(13.0f, 9.6f)
                lineToRelative(-1.06f, 1.06f)
                lineTo(9.11f, 7.83f)
                lineTo(11.94f, 5.0f)
                lineTo(13.0f, 6.06f)
                lineToRelative(-0.96f, 0.96f)
                curveToRelative(1.27f, 0.01f, 2.53f, 0.48f, 3.5f, 1.44f)
                curveTo(17.24f, 10.17f, 17.45f, 12.82f, 16.17f, 14.76f)
                close()
                moveTo(14.89f, 16.17f)
                lineTo(12.06f, 19.0f)
                lineTo(11.0f, 17.94f)
                lineToRelative(0.95f, -0.95f)
                curveToRelative(-1.26f, -0.01f, -2.52f, -0.5f, -3.48f, -1.46f)
                curveToRelative(-1.71f, -1.71f, -1.92f, -4.35f, -0.64f, -6.29f)
                lineToRelative(1.1f, 1.1f)
                curveToRelative(-0.71f, 1.33f, -0.53f, 3.01f, 0.59f, 4.13f)
                curveToRelative(0.7f, 0.7f, 1.63f, 1.04f, 2.56f, 1.01f)
                lineTo(11.0f, 14.4f)
                lineToRelative(1.06f, -1.06f)
                lineTo(14.89f, 16.17f)
                close()
            }
        }
        .build()
        return _changeCircle!!
    }

private var _changeCircle: ImageVector? = null
