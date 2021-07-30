package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.MapMarkedSolid: ImageVector
    get() {
        if (_mapMarkedSolid != null) {
            return _mapMarkedSolid!!
        }
        _mapMarkedSolid = Builder(name = "MapMarkedSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                curveTo(18.699f, 3.0f, 16.0f, 5.699f, 16.0f, 9.0f)
                curveTo(16.0f, 9.992f, 16.383f, 11.004f, 16.875f, 12.125f)
                curveTo(17.367f, 13.246f, 17.988f, 14.4342f, 18.625f, 15.5313f)
                curveTo(19.898f, 17.7262f, 21.1875f, 19.5625f, 21.1875f, 19.5625f)
                lineTo(22.0f, 20.75f)
                lineTo(22.8125f, 19.5625f)
                curveTo(22.8125f, 19.5625f, 24.101f, 17.7262f, 25.375f, 15.5313f)
                curveTo(26.012f, 14.4333f, 26.633f, 13.246f, 27.125f, 12.125f)
                curveTo(27.617f, 11.004f, 28.0f, 9.992f, 28.0f, 9.0f)
                curveTo(28.0f, 5.699f, 25.301f, 3.0f, 22.0f, 3.0f)
                close()
                moveTo(11.9688f, 4.9375f)
                lineTo(4.0f, 8.3438f)
                lineTo(4.0f, 27.5313f)
                lineTo(12.0313f, 24.0625f)
                lineTo(20.0313f, 27.0625f)
                lineTo(28.0f, 23.6563f)
                lineTo(28.0f, 14.9375f)
                curveTo(27.363f, 16.1605f, 26.656f, 17.332f, 26.0f, 18.375f)
                lineTo(26.0f, 22.3438f)
                lineTo(21.0f, 24.4688f)
                lineTo(21.0f, 22.8438f)
                lineTo(19.5313f, 20.7188f)
                curveTo(19.3752f, 20.4918f, 19.191f, 20.2225f, 19.0f, 19.9375f)
                lineTo(19.0f, 24.5625f)
                lineTo(13.0f, 22.3125f)
                lineTo(13.0f, 7.4375f)
                lineTo(14.0938f, 7.8438f)
                curveTo(14.1917f, 7.1677f, 14.367f, 6.5163f, 14.625f, 5.9063f)
                lineTo(11.9688f, 4.9375f)
                close()
                moveTo(22.0f, 5.0f)
                curveTo(24.219f, 5.0f, 26.0f, 6.781f, 26.0f, 9.0f)
                curveTo(26.0f, 9.387f, 25.7585f, 10.3005f, 25.3125f, 11.3125f)
                curveTo(24.8675f, 12.3245f, 24.238f, 13.4722f, 23.625f, 14.5313f)
                curveTo(22.809f, 15.9373f, 22.457f, 16.439f, 22.0f, 17.127f)
                curveTo(21.543f, 16.439f, 21.191f, 15.9373f, 20.375f, 14.5313f)
                curveTo(19.762f, 13.4722f, 19.1335f, 12.3245f, 18.6875f, 11.3125f)
                curveTo(18.2425f, 10.3005f, 18.0f, 9.387f, 18.0f, 9.0f)
                curveTo(18.0f, 6.781f, 19.781f, 5.0f, 22.0f, 5.0f)
                close()
                moveTo(11.0f, 7.5f)
                lineTo(11.0f, 22.3438f)
                lineTo(6.0f, 24.4688f)
                lineTo(6.0f, 9.6563f)
                lineTo(11.0f, 7.5f)
                close()
            }
        }
        .build()
        return _mapMarkedSolid!!
    }

private var _mapMarkedSolid: ImageVector? = null
