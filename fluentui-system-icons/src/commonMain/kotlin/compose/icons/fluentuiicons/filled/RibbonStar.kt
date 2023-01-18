package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.RibbonStar: ImageVector
    get() {
        if (_ribbonStar != null) {
            return _ribbonStar!!
        }
        _ribbonStar = Builder(name = "RibbonStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0009f, 21.2451f)
                lineTo(17.0016f, 15.2441f)
                curveTo(15.6318f, 16.3428f, 13.8926f, 17.0f, 12.0f, 17.0f)
                curveTo(10.1084f, 17.0f, 8.3702f, 16.3435f, 7.0007f, 15.2459f)
                lineTo(7.0025f, 21.2451f)
                curveTo(7.0025f, 21.8529f, 7.6875f, 22.2082f, 8.1844f, 21.8583f)
                lineTo(12.0008f, 19.1706f)
                lineTo(15.8192f, 21.8584f)
                curveTo(16.3161f, 22.2082f, 17.0009f, 21.8528f, 17.0009f, 21.2451f)
                close()
                moveTo(19.0f, 9.0f)
                curveTo(19.0f, 5.134f, 15.866f, 2.0f, 12.0f, 2.0f)
                curveTo(8.134f, 2.0f, 5.0f, 5.134f, 5.0f, 9.0f)
                curveTo(5.0f, 12.866f, 8.134f, 16.0f, 12.0f, 16.0f)
                curveTo(15.866f, 16.0f, 19.0f, 12.866f, 19.0f, 9.0f)
                close()
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
            }
        }
        .build()
        return _ribbonStar!!
    }

private var _ribbonStar: ImageVector? = null
