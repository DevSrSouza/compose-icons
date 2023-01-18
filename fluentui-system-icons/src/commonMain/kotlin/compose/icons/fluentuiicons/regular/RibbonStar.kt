package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.RibbonStar: ImageVector
    get() {
        if (_ribbonStar != null) {
            return _ribbonStar!!
        }
        _ribbonStar = Builder(name = "RibbonStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.2288f, 5.6423f)
                lineTo(13.1414f, 7.495f)
                lineTo(15.1853f, 7.7904f)
                curveTo(15.3946f, 7.8206f, 15.4783f, 8.0778f, 15.3268f, 8.2254f)
                lineTo(13.8485f, 9.6659f)
                lineTo(14.1975f, 11.7013f)
                curveTo(14.2332f, 11.9097f, 14.0144f, 12.0686f, 13.8273f, 11.97f)
                lineTo(12.0001f, 11.0076f)
                lineTo(10.1728f, 11.97f)
                curveTo(9.9857f, 12.0686f, 9.7667f, 11.9096f, 9.8027f, 11.7011f)
                lineTo(10.1534f, 9.6659f)
                lineTo(8.6734f, 8.2255f)
                curveTo(8.5218f, 8.078f, 8.6054f, 7.8206f, 8.8148f, 7.7904f)
                lineTo(10.8587f, 7.495f)
                lineTo(11.7713f, 5.6423f)
                curveTo(11.8648f, 5.4525f, 12.1354f, 5.4525f, 12.2288f, 5.6423f)
                close()
                moveTo(19.0f, 9.0f)
                curveTo(19.0f, 5.134f, 15.866f, 2.0f, 12.0f, 2.0f)
                curveTo(8.134f, 2.0f, 5.0f, 5.134f, 5.0f, 9.0f)
                curveTo(5.0f, 10.907f, 5.7626f, 12.6359f, 6.9994f, 13.8983f)
                lineTo(7.0008f, 21.2502f)
                lineTo(7.0077f, 21.3547f)
                curveTo(7.0807f, 21.8973f, 7.715f, 22.1927f, 8.1826f, 21.8634f)
                lineTo(11.9991f, 19.1757f)
                lineTo(15.8175f, 21.8635f)
                lineTo(15.907f, 21.918f)
                curveTo(16.3926f, 22.1706f, 16.9992f, 21.8221f, 16.9992f, 21.2502f)
                lineTo(17.0006f, 13.8983f)
                curveTo(18.2374f, 12.6359f, 19.0f, 10.907f, 19.0f, 9.0f)
                close()
                moveTo(15.4994f, 15.0639f)
                lineTo(15.4992f, 19.8051f)
                lineTo(12.4306f, 17.6452f)
                lineTo(12.3298f, 17.5853f)
                curveTo(12.0866f, 17.4657f, 11.7937f, 17.4857f, 11.5671f, 17.6453f)
                lineTo(8.5008f, 19.8047f)
                lineTo(8.5006f, 15.0639f)
                curveTo(9.5301f, 15.6592f, 10.7252f, 16.0f, 12.0f, 16.0f)
                curveTo(13.2748f, 16.0f, 14.4699f, 15.6592f, 15.4994f, 15.0639f)
                close()
                moveTo(6.5f, 9.0f)
                curveTo(6.5f, 5.9624f, 8.9624f, 3.5f, 12.0f, 3.5f)
                curveTo(15.0376f, 3.5f, 17.5f, 5.9624f, 17.5f, 9.0f)
                curveTo(17.5f, 12.0376f, 15.0376f, 14.5f, 12.0f, 14.5f)
                curveTo(8.9624f, 14.5f, 6.5f, 12.0376f, 6.5f, 9.0f)
                close()
            }
        }
        .build()
        return _ribbonStar!!
    }

private var _ribbonStar: ImageVector? = null
