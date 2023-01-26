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

public val RoundGroup.MicExternalOn: ImageVector
    get() {
        if (_micExternalOn != null) {
            return _micExternalOn!!
        }
        _micExternalOn = Builder(name = "MicExternalOn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.22f, 7.0f)
                horizontalLineTo(4.78f)
                curveTo(4.3f, 6.47f, 4.0f, 5.77f, 4.0f, 5.0f)
                curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                curveTo(10.0f, 5.77f, 9.7f, 6.47f, 9.22f, 7.0f)
                close()
                moveTo(16.24f, 2.01f)
                curveTo(18.32f, 2.13f, 20.0f, 4.08f, 20.0f, 6.16f)
                lineTo(20.0f, 21.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineToRelative(0.0f, -14.91f)
                curveToRelative(0.0f, -0.96f, -0.64f, -1.86f, -1.58f, -2.05f)
                curveTo(15.14f, 3.78f, 14.0f, 4.76f, 14.0f, 6.0f)
                lineToRelative(0.0f, 11.84f)
                curveToRelative(0.0f, 2.08f, -1.68f, 4.03f, -3.76f, 4.15f)
                curveTo(7.92f, 22.13f, 6.0f, 20.29f, 6.0f, 18.0f)
                horizontalLineTo(5.45f)
                curveToRelative(-0.26f, 0.0f, -0.47f, -0.19f, -0.5f, -0.45f)
                lineTo(4.11f, 9.1f)
                curveTo(4.05f, 8.51f, 4.51f, 8.0f, 5.1f, 8.0f)
                horizontalLineTo(8.9f)
                curveToRelative(0.59f, 0.0f, 1.05f, 0.51f, 1.0f, 1.1f)
                lineToRelative(-0.85f, 8.45f)
                curveTo(9.02f, 17.81f, 8.8f, 18.0f, 8.55f, 18.0f)
                horizontalLineTo(8.0f)
                curveToRelative(0.0f, 1.24f, 1.14f, 2.22f, 2.42f, 1.96f)
                curveToRelative(0.94f, -0.19f, 1.58f, -1.09f, 1.58f, -2.05f)
                lineTo(12.0f, 6.0f)
                curveTo(12.0f, 3.71f, 13.92f, 1.87f, 16.24f, 2.01f)
                close()
            }
        }
        .build()
        return _micExternalOn!!
    }

private var _micExternalOn: ImageVector? = null
