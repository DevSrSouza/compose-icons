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

public val RoundGroup.NordicWalking: ImageVector
    get() {
        if (_nordicWalking != null) {
            return _nordicWalking!!
        }
        _nordicWalking = Builder(name = "NordicWalking", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.25f, 23.0f)
                curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(8.25f)
                curveTo(19.0f, 22.66f, 18.66f, 23.0f, 18.25f, 23.0f)
                close()
                moveTo(4.93f, 23.0f)
                curveToRelative(0.35f, 0.0f, 0.66f, -0.24f, 0.73f, -0.59f)
                lineTo(7.53f, 14.0f)
                horizontalLineTo(6.0f)
                lineToRelative(-1.8f, 8.09f)
                curveTo(4.1f, 22.56f, 4.45f, 23.0f, 4.93f, 23.0f)
                close()
                moveTo(13.5f, 5.5f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveTo(12.4f, 5.5f, 13.5f, 5.5f)
                close()
                moveTo(14.0f, 23.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-5.64f)
                curveToRelative(0.0f, -0.55f, -0.22f, -1.07f, -0.62f, -1.45f)
                lineTo(12.9f, 13.5f)
                lineToRelative(0.6f, -3.0f)
                curveToRelative(1.07f, 1.24f, 2.62f, 2.13f, 4.36f, 2.41f)
                curveToRelative(0.6f, 0.1f, 1.14f, -0.38f, 1.14f, -0.99f)
                curveToRelative(0.0f, -0.49f, -0.35f, -0.91f, -0.83f, -0.98f)
                curveToRelative(-1.53f, -0.24f, -2.79f, -1.14f, -3.47f, -2.33f)
                lineToRelative(-1.0f, -1.6f)
                curveToRelative(-0.56f, -0.89f, -1.68f, -1.25f, -2.66f, -0.84f)
                lineTo(7.22f, 7.78f)
                curveTo(6.48f, 8.1f, 6.0f, 8.82f, 6.0f, 9.62f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(9.6f)
                lineToRelative(1.8f, -0.7f)
                lineTo(7.25f, 21.76f)
                curveTo(7.12f, 22.4f, 7.61f, 23.0f, 8.27f, 23.0f)
                curveToRelative(0.49f, 0.0f, 0.91f, -0.34f, 1.02f, -0.81f)
                lineTo(10.9f, 15.0f)
                lineToRelative(2.1f, 2.0f)
                verticalLineToRelative(5.0f)
                curveTo(13.0f, 22.55f, 13.45f, 23.0f, 14.0f, 23.0f)
                close()
            }
        }
        .build()
        return _nordicWalking!!
    }

private var _nordicWalking: ImageVector? = null
