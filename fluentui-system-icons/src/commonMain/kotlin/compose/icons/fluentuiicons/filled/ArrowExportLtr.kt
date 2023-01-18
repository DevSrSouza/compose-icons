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

public val FilledGroup.ArrowExportLtr: ImageVector
    get() {
        if (_arrowExportLtr != null) {
            return _arrowExportLtr!!
        }
        _arrowExportLtr = Builder(name = "ArrowExportLtr", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 4.5039f)
                curveTo(3.1297f, 4.5039f, 3.4435f, 4.7861f, 3.4931f, 5.1521f)
                lineTo(3.5f, 5.2539f)
                verticalLineTo(18.7525f)
                curveTo(3.5f, 19.1667f, 3.1642f, 19.5025f, 2.75f, 19.5025f)
                curveTo(2.3703f, 19.5025f, 2.0565f, 19.2204f, 2.0069f, 18.8543f)
                lineTo(2.0f, 18.7525f)
                verticalLineTo(5.2539f)
                curveTo(2.0f, 4.8397f, 2.3358f, 4.5039f, 2.75f, 4.5039f)
                close()
                moveTo(15.2098f, 6.387f)
                lineTo(15.293f, 6.2928f)
                curveTo(15.6535f, 5.9324f, 16.2207f, 5.9047f, 16.613f, 6.2098f)
                lineTo(16.7072f, 6.293f)
                lineTo(21.7038f, 11.2906f)
                curveTo(22.064f, 11.651f, 22.0919f, 12.2178f, 21.7873f, 12.6101f)
                lineTo(21.7042f, 12.7043f)
                lineTo(16.7076f, 17.7077f)
                curveTo(16.3173f, 18.0985f, 15.6842f, 18.099f, 15.2934f, 17.7087f)
                curveTo(14.9326f, 17.3485f, 14.9045f, 16.7813f, 15.2093f, 16.3888f)
                lineTo(15.2924f, 16.2945f)
                lineTo(18.581f, 12.9999f)
                lineTo(6.0f, 13.0f)
                curveTo(5.4872f, 13.0f, 5.0645f, 12.614f, 5.0067f, 12.1166f)
                lineTo(5.0f, 12.0f)
                curveTo(5.0f, 11.4872f, 5.386f, 11.0645f, 5.8834f, 11.0068f)
                lineTo(6.0f, 11.0f)
                lineTo(18.584f, 10.9999f)
                lineTo(15.2928f, 7.7071f)
                curveTo(14.9324f, 7.3465f, 14.9047f, 6.7793f, 15.2098f, 6.387f)
                lineTo(15.293f, 6.2928f)
                lineTo(15.2098f, 6.387f)
                close()
            }
        }
        .build()
        return _arrowExportLtr!!
    }

private var _arrowExportLtr: ImageVector? = null
