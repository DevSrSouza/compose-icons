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

public val LineAwesomeIcons.SolarPanelSolid: ImageVector
    get() {
        if (_solarPanelSolid != null) {
            return _solarPanelSolid!!
        }
        _solarPanelSolid = Builder(name = "SolarPanelSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                lineTo(15.0f, 6.594f)
                lineTo(13.188f, 4.813f)
                lineTo(11.813f, 6.188f)
                lineTo(13.594f, 8.0f)
                lineTo(11.0f, 8.0f)
                lineTo(11.0f, 10.0f)
                lineTo(13.594f, 10.0f)
                lineTo(11.813f, 11.813f)
                lineTo(13.188f, 13.188f)
                lineTo(15.0f, 11.406f)
                lineTo(15.0f, 14.0f)
                lineTo(17.0f, 14.0f)
                lineTo(17.0f, 11.406f)
                lineTo(18.813f, 13.188f)
                lineTo(20.188f, 11.813f)
                lineTo(18.406f, 10.0f)
                lineTo(21.0f, 10.0f)
                lineTo(21.0f, 8.0f)
                lineTo(18.406f, 8.0f)
                lineTo(20.188f, 6.188f)
                lineTo(18.813f, 4.813f)
                lineTo(17.0f, 6.594f)
                lineTo(17.0f, 4.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(17.102f, 7.0f, 18.0f, 7.898f, 18.0f, 9.0f)
                curveTo(18.0f, 10.102f, 17.102f, 11.0f, 16.0f, 11.0f)
                curveTo(14.898f, 11.0f, 14.0f, 10.102f, 14.0f, 9.0f)
                curveTo(14.0f, 7.898f, 14.898f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(6.219f, 16.0f)
                lineTo(4.0f, 24.875f)
                lineTo(4.0f, 28.0f)
                lineTo(28.0f, 28.0f)
                lineTo(28.0f, 24.875f)
                lineTo(25.781f, 16.0f)
                close()
                moveTo(7.781f, 18.0f)
                lineTo(24.219f, 18.0f)
                lineTo(26.0f, 25.125f)
                lineTo(26.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                lineTo(6.0f, 25.125f)
                close()
                moveTo(9.0f, 19.0f)
                lineTo(8.594f, 20.813f)
                lineTo(10.688f, 20.813f)
                lineTo(11.0f, 19.0f)
                close()
                moveTo(13.0f, 19.0f)
                lineTo(12.813f, 20.813f)
                lineTo(14.906f, 20.813f)
                lineTo(15.0f, 19.0f)
                close()
                moveTo(17.0f, 19.0f)
                lineTo(17.094f, 20.813f)
                lineTo(19.188f, 20.813f)
                lineTo(19.0f, 19.0f)
                close()
                moveTo(21.0f, 19.0f)
                lineTo(21.313f, 20.813f)
                lineTo(23.406f, 20.813f)
                lineTo(23.0f, 19.0f)
                close()
                moveTo(8.188f, 22.813f)
                lineTo(7.813f, 25.0f)
                lineTo(10.094f, 25.0f)
                lineTo(10.406f, 22.813f)
                close()
                moveTo(12.688f, 22.813f)
                lineTo(12.5f, 25.0f)
                lineTo(14.813f, 25.0f)
                lineTo(14.906f, 22.813f)
                close()
                moveTo(17.094f, 22.813f)
                lineTo(17.188f, 25.0f)
                lineTo(19.5f, 25.0f)
                lineTo(19.313f, 22.813f)
                close()
                moveTo(21.594f, 22.813f)
                lineTo(21.906f, 25.0f)
                lineTo(24.188f, 25.0f)
                lineTo(23.813f, 22.813f)
                close()
            }
        }
        .build()
        return _solarPanelSolid!!
    }

private var _solarPanelSolid: ImageVector? = null
