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

public val FilledGroup.DualScreenSpan: ImageVector
    get() {
        if (_dualScreenSpan != null) {
            return _dualScreenSpan!!
        }
        _dualScreenSpan = Builder(name = "DualScreenSpan", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.003f, 5.7544f)
                curveTo(22.003f, 4.7879f, 21.2195f, 4.0044f, 20.253f, 4.0044f)
                horizontalLineTo(13.0054f)
                curveTo(12.9186f, 4.0044f, 12.8332f, 4.0107f, 12.7498f, 4.0229f)
                lineTo(12.7499f, 11.2507f)
                horizontalLineTo(17.5806f)
                lineTo(16.6902f, 10.249f)
                curveTo(16.415f, 9.9394f, 16.4429f, 9.4654f, 16.7525f, 9.1902f)
                curveTo(17.0621f, 8.915f, 17.5361f, 8.9429f, 17.8113f, 9.2525f)
                lineTo(19.8113f, 11.5025f)
                curveTo(20.0639f, 11.7866f, 20.0639f, 12.2148f, 19.8113f, 12.499f)
                lineTo(17.8113f, 14.749f)
                curveTo(17.5361f, 15.0586f, 17.0621f, 15.0865f, 16.7525f, 14.8113f)
                curveTo(16.4429f, 14.5361f, 16.415f, 14.0621f, 16.6902f, 13.7525f)
                lineTo(17.5806f, 12.7507f)
                horizontalLineTo(12.7499f)
                lineTo(12.7499f, 19.981f)
                curveTo(12.8333f, 19.9932f, 12.9186f, 19.9995f, 13.0054f, 19.9995f)
                horizontalLineTo(20.253f)
                curveTo(21.2195f, 19.9995f, 22.003f, 19.216f, 22.003f, 18.2495f)
                verticalLineTo(5.7544f)
                close()
                moveTo(11.2508f, 11.2507f)
                horizontalLineTo(6.4209f)
                lineTo(7.3113f, 10.249f)
                curveTo(7.5865f, 9.9394f, 7.5586f, 9.4654f, 7.249f, 9.1902f)
                curveTo(6.9394f, 8.915f, 6.4654f, 8.9429f, 6.1902f, 9.2525f)
                lineTo(4.1902f, 11.5025f)
                curveTo(3.9376f, 11.7866f, 3.9376f, 12.2148f, 4.1902f, 12.499f)
                lineTo(6.1902f, 14.749f)
                curveTo(6.4654f, 15.0586f, 6.9394f, 15.0865f, 7.249f, 14.8113f)
                curveTo(7.5586f, 14.5361f, 7.5865f, 14.0621f, 7.3113f, 13.7525f)
                lineTo(6.4209f, 12.7507f)
                horizontalLineTo(11.2508f)
                lineTo(11.2507f, 19.98f)
                curveTo(11.1705f, 19.9913f, 11.0886f, 19.9971f, 11.0054f, 19.9971f)
                horizontalLineTo(3.7578f)
                curveTo(2.7913f, 19.9971f, 2.0078f, 19.2136f, 2.0078f, 18.2471f)
                verticalLineTo(5.7519f)
                curveTo(2.0078f, 4.7854f, 2.7913f, 4.0019f, 3.7578f, 4.0019f)
                horizontalLineTo(11.0054f)
                curveTo(11.0887f, 4.0019f, 11.1707f, 4.0078f, 11.2509f, 4.0191f)
                lineTo(11.2508f, 11.2507f)
                close()
            }
        }
        .build()
        return _dualScreenSpan!!
    }

private var _dualScreenSpan: ImageVector? = null
