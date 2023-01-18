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

public val FilledGroup.ArrowExportRtl: ImageVector
    get() {
        if (_arrowExportRtl != null) {
            return _arrowExportRtl!!
        }
        _arrowExportRtl = Builder(name = "ArrowExportRtl", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.2471f, 4.5039f)
                curveTo(20.8674f, 4.5039f, 20.5536f, 4.7861f, 20.5039f, 5.1521f)
                lineTo(20.4971f, 5.2539f)
                verticalLineTo(18.7525f)
                curveTo(20.4971f, 19.1667f, 20.8329f, 19.5025f, 21.2471f, 19.5025f)
                curveTo(21.6268f, 19.5025f, 21.9406f, 19.2204f, 21.9902f, 18.8543f)
                lineTo(21.9971f, 18.7525f)
                verticalLineTo(5.2539f)
                curveTo(21.9971f, 4.8397f, 21.6613f, 4.5039f, 21.2471f, 4.5039f)
                close()
                moveTo(8.7873f, 6.387f)
                lineTo(8.7041f, 6.2928f)
                curveTo(8.3436f, 5.9324f, 7.7764f, 5.9047f, 7.3841f, 6.2098f)
                lineTo(7.2899f, 6.293f)
                lineTo(2.2933f, 11.2906f)
                curveTo(1.933f, 11.651f, 1.9052f, 12.2178f, 2.2098f, 12.6101f)
                lineTo(2.2929f, 12.7043f)
                lineTo(7.2895f, 17.7077f)
                curveTo(7.6797f, 18.0985f, 8.3129f, 18.099f, 8.7037f, 17.7087f)
                curveTo(9.0644f, 17.3485f, 9.0925f, 16.7813f, 8.7878f, 16.3888f)
                lineTo(8.7047f, 16.2945f)
                lineTo(5.4161f, 12.9999f)
                lineTo(17.9971f, 13.0f)
                curveTo(18.5099f, 13.0f, 18.9326f, 12.614f, 18.9903f, 12.1166f)
                lineTo(18.9971f, 12.0f)
                curveTo(18.9971f, 11.4872f, 18.611f, 11.0645f, 18.1137f, 11.0068f)
                lineTo(17.9971f, 11.0f)
                lineTo(5.4131f, 10.9999f)
                lineTo(8.7043f, 7.7071f)
                curveTo(9.0647f, 7.3465f, 9.0924f, 6.7793f, 8.7873f, 6.387f)
                lineTo(8.7041f, 6.2928f)
                lineTo(8.7873f, 6.387f)
                close()
            }
        }
        .build()
        return _arrowExportRtl!!
    }

private var _arrowExportRtl: ImageVector? = null
