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

public val LineAwesomeIcons.RadiationAltSolid: ImageVector
    get() {
        if (_radiationAltSolid != null) {
            return _radiationAltSolid!!
        }
        _radiationAltSolid = Builder(name = "RadiationAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.086f, 5.0f, 27.0f, 9.914f, 27.0f, 16.0f)
                curveTo(27.0f, 22.086f, 22.086f, 27.0f, 16.0f, 27.0f)
                curveTo(9.914f, 27.0f, 5.0f, 22.086f, 5.0f, 16.0f)
                curveTo(5.0f, 9.914f, 9.914f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.5f, 8.188f)
                curveTo(8.801f, 9.789f, 7.0f, 12.699f, 7.0f, 16.0f)
                lineTo(13.5f, 16.0f)
                curveTo(13.5f, 15.102f, 14.012f, 14.313f, 14.813f, 13.813f)
                close()
                moveTo(20.5f, 8.188f)
                lineTo(17.313f, 13.813f)
                curveTo(18.113f, 14.211f, 18.594f, 15.0f, 18.594f, 16.0f)
                lineTo(25.0f, 16.0f)
                curveTo(25.0f, 12.699f, 23.199f, 9.789f, 20.5f, 8.188f)
                close()
                moveTo(10.906f, 11.188f)
                lineTo(12.188f, 13.5f)
                curveTo(12.086f, 13.699f, 12.008f, 13.801f, 11.906f, 14.0f)
                lineTo(9.313f, 14.0f)
                curveTo(9.613f, 13.0f, 10.207f, 11.988f, 10.906f, 11.188f)
                close()
                moveTo(21.094f, 11.188f)
                curveTo(21.895f, 11.988f, 22.387f, 13.0f, 22.688f, 14.0f)
                lineTo(20.094f, 14.0f)
                curveTo(19.992f, 13.801f, 19.914f, 13.602f, 19.813f, 13.5f)
                close()
                moveTo(16.0f, 14.406f)
                curveTo(15.102f, 14.406f, 14.406f, 15.102f, 14.406f, 16.0f)
                curveTo(14.406f, 16.898f, 15.102f, 17.594f, 16.0f, 17.594f)
                curveTo(16.898f, 17.594f, 17.594f, 16.898f, 17.594f, 16.0f)
                curveTo(17.594f, 15.102f, 16.898f, 14.406f, 16.0f, 14.406f)
                close()
                moveTo(14.688f, 18.188f)
                lineTo(11.5f, 23.813f)
                curveTo(12.801f, 24.613f, 14.398f, 25.0f, 16.0f, 25.0f)
                curveTo(17.602f, 25.0f, 19.199f, 24.613f, 20.5f, 23.813f)
                lineTo(17.313f, 18.188f)
                curveTo(16.914f, 18.387f, 16.5f, 18.5f, 16.0f, 18.5f)
                curveTo(15.5f, 18.5f, 15.086f, 18.387f, 14.688f, 18.188f)
                close()
                moveTo(15.688f, 20.5f)
                lineTo(16.313f, 20.5f)
                lineTo(17.594f, 22.813f)
                curveTo(17.094f, 22.914f, 16.5f, 23.0f, 16.0f, 23.0f)
                curveTo(15.5f, 23.0f, 14.906f, 22.914f, 14.406f, 22.813f)
                close()
            }
        }
        .build()
        return _radiationAltSolid!!
    }

private var _radiationAltSolid: ImageVector? = null
