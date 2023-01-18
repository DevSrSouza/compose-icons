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

public val RemixIcons.DiscordLine: ImageVector
    get() {
        if (_discordLine != null) {
            return _discordLine!!
        }
        _discordLine = Builder(name = "DiscordLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.914f, 14.58f)
                arcToRelative(8.998f, 8.998f, 0.0f, false, true, -0.484f, 0.104f)
                arcToRelative(7.06f, 7.06f, 0.0f, false, true, -2.664f, -0.01f)
                curveToRelative(-0.154f, -0.03f, -0.372f, -0.083f, -0.653f, -0.158f)
                lineToRelative(-0.921f, 1.197f)
                curveToRelative(-2.273f, -0.073f, -3.137f, -1.596f, -3.137f, -1.596f)
                curveToRelative(0.0f, -3.381f, 1.481f, -6.122f, 1.481f, -6.122f)
                curveToRelative(1.481f, -1.133f, 2.89f, -1.102f, 2.89f, -1.102f)
                lineToRelative(0.403f, 0.525f)
                arcToRelative(1.12f, 1.12f, 0.0f, false, true, 0.112f, -0.01f)
                arcToRelative(8.527f, 8.527f, 0.0f, false, true, 2.314f, 0.01f)
                lineToRelative(0.442f, -0.525f)
                reflectiveCurveToRelative(1.41f, -0.031f, 2.89f, 1.103f)
                curveToRelative(0.0f, 0.0f, 1.482f, 2.74f, 1.482f, 6.121f)
                curveToRelative(0.0f, 0.0f, -0.875f, 1.522f, -3.148f, 1.596f)
                lineToRelative(-1.007f, -1.134f)
                close()
                moveTo(10.076f, 11.0f)
                curveTo(9.475f, 11.0f, 9.0f, 11.45f, 9.0f, 12.0f)
                reflectiveCurveToRelative(0.485f, 1.0f, 1.076f, 1.0f)
                curveToRelative(0.6f, 0.0f, 1.075f, -0.45f, 1.075f, -1.0f)
                curveToRelative(0.01f, -0.55f, -0.474f, -1.0f, -1.075f, -1.0f)
                close()
                moveTo(13.924f, 11.0f)
                curveToRelative(-0.6f, 0.0f, -1.075f, 0.45f, -1.075f, 1.0f)
                reflectiveCurveToRelative(0.485f, 1.0f, 1.075f, 1.0f)
                curveToRelative(0.601f, 0.0f, 1.076f, -0.45f, 1.076f, -1.0f)
                reflectiveCurveToRelative(-0.475f, -1.0f, -1.076f, -1.0f)
                close()
                moveTo(21.0f, 23.0f)
                lineToRelative(-4.99f, -5.0f)
                lineTo(19.0f, 18.0f)
                lineTo(19.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(11.003f)
                lineToRelative(0.57f, 2.0f)
                lineTo(5.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(19.0f)
                close()
            }
        }
        .build()
        return _discordLine!!
    }

private var _discordLine: ImageVector? = null
