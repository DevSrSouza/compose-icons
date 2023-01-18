package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.PlaystationFill: ImageVector
    get() {
        if (_playstationFill != null) {
            return _playstationFill!!
        }
        _playstationFill = Builder(name = "PlaystationFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.584f, 17.011f)
                curveToRelative(-0.43f, 0.543f, -1.482f, 0.93f, -1.482f, 0.93f)
                lineToRelative(-7.833f, 2.817f)
                lineTo(13.269f, 18.68f)
                lineToRelative(5.764f, -2.057f)
                curveToRelative(0.655f, -0.234f, 0.755f, -0.566f, 0.223f, -0.74f)
                curveToRelative(-0.53f, -0.175f, -1.491f, -0.125f, -2.146f, 0.111f)
                lineToRelative(-3.84f, 1.354f)
                verticalLineToRelative(-2.155f)
                lineToRelative(0.22f, -0.075f)
                reflectiveCurveToRelative(1.11f, -0.394f, 2.671f, -0.567f)
                curveToRelative(1.56f, -0.172f, 3.472f, 0.024f, 4.972f, 0.593f)
                curveToRelative(1.69f, 0.535f, 1.88f, 1.323f, 1.451f, 1.866f)
                close()
                moveTo(14.014f, 13.474f)
                lineTo(14.014f, 8.162f)
                curveToRelative(0.0f, -0.624f, -0.114f, -1.198f, -0.699f, -1.36f)
                curveToRelative(-0.447f, -0.144f, -0.725f, 0.272f, -0.725f, 0.895f)
                lineTo(12.59f, 21.0f)
                lineToRelative(-3.584f, -1.139f)
                lineTo(9.006f, 4.0f)
                curveToRelative(1.524f, 0.283f, 3.744f, 0.953f, 4.937f, 1.355f)
                curveToRelative(3.035f, 1.043f, 4.064f, 2.342f, 4.064f, 5.267f)
                curveToRelative(0.0f, 2.851f, -1.758f, 3.932f, -3.992f, 2.852f)
                close()
                moveTo(2.431f, 18.464f)
                curveToRelative(-1.735f, -0.49f, -2.024f, -1.51f, -1.233f, -2.097f)
                curveToRelative(0.731f, -0.542f, 1.974f, -0.95f, 1.974f, -0.95f)
                lineToRelative(5.138f, -1.83f)
                verticalLineToRelative(2.086f)
                lineToRelative(-3.697f, 1.325f)
                curveToRelative(-0.653f, 0.234f, -0.754f, 0.566f, -0.223f, 0.74f)
                curveToRelative(0.531f, 0.175f, 1.493f, 0.125f, 2.147f, -0.11f)
                lineToRelative(1.773f, -0.644f)
                verticalLineToRelative(1.865f)
                lineToRelative(-0.353f, 0.06f)
                curveToRelative(-1.774f, 0.29f, -3.664f, 0.169f, -5.526f, -0.445f)
                close()
            }
        }
        .build()
        return _playstationFill!!
    }

private var _playstationFill: ImageVector? = null
