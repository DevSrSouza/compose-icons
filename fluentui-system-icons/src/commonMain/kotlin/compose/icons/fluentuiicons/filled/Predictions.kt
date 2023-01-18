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

public val FilledGroup.Predictions: ImageVector
    get() {
        if (_predictions != null) {
            return _predictions!!
        }
        _predictions = Builder(name = "Predictions", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6825f, 14.926f)
                lineTo(17.9673f, 18.7802f)
                curveTo(18.2336f, 19.5789f, 17.8933f, 20.4541f, 17.1573f, 20.8632f)
                curveTo(15.7856f, 21.6256f, 14.0643f, 22.0f, 12.0f, 22.0f)
                curveTo(9.9358f, 22.0f, 8.2144f, 21.6256f, 6.8427f, 20.8632f)
                curveTo(6.1068f, 20.4541f, 5.7664f, 19.579f, 6.0327f, 18.7802f)
                lineTo(7.3175f, 14.926f)
                curveTo(8.6183f, 15.9138f, 10.2407f, 16.5f, 12.0f, 16.5f)
                curveTo(13.7593f, 16.5f, 15.3817f, 15.9138f, 16.6825f, 14.926f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(13.3366f, 2.0f, 14.5824f, 2.3885f, 15.6308f, 3.0587f)
                curveTo(15.5482f, 3.372f, 15.4224f, 3.6028f, 15.2626f, 3.7626f)
                curveTo(15.01f, 4.0151f, 14.5804f, 4.1827f, 13.9379f, 4.2336f)
                lineTo(13.7158f, 4.2463f)
                lineTo(13.3373f, 4.2559f)
                curveTo(11.168f, 4.4147f, 11.2222f, 7.75f, 13.5f, 7.75f)
                curveTo(14.3902f, 7.75f, 14.9565f, 7.9314f, 15.2626f, 8.2374f)
                curveTo(15.5151f, 8.49f, 15.6827f, 8.9196f, 15.7336f, 9.5621f)
                lineTo(15.7463f, 9.7842f)
                lineTo(15.7559f, 10.1627f)
                curveTo(15.8521f, 11.4768f, 17.114f, 11.975f, 18.094f, 11.6571f)
                curveTo(17.0078f, 13.9296f, 14.6873f, 15.5f, 12.0f, 15.5f)
                curveTo(8.2721f, 15.5f, 5.25f, 12.4779f, 5.25f, 8.75f)
                curveTo(5.25f, 5.0221f, 8.2721f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(18.25f, 2.0f)
                curveTo(18.25f, 3.1496f, 18.5199f, 3.9592f, 19.0303f, 4.4697f)
                curveTo(19.5015f, 4.9409f, 20.2276f, 5.2071f, 21.2407f, 5.2452f)
                lineTo(21.5f, 5.25f)
                curveTo(22.4583f, 5.25f, 22.4983f, 6.6276f, 21.6198f, 6.7424f)
                lineTo(21.5f, 6.75f)
                curveTo(20.3504f, 6.75f, 19.5408f, 7.0199f, 19.0303f, 7.5303f)
                curveTo(18.5591f, 8.0015f, 18.2929f, 8.7276f, 18.2548f, 9.7407f)
                lineTo(18.25f, 10.0f)
                curveTo(18.25f, 11.0f, 16.75f, 11.0f, 16.75f, 10.0f)
                curveTo(16.75f, 8.8504f, 16.4801f, 8.0408f, 15.9697f, 7.5303f)
                curveTo(15.4985f, 7.0591f, 14.7724f, 6.7929f, 13.7593f, 6.7548f)
                lineTo(13.5f, 6.75f)
                curveTo(12.5417f, 6.75f, 12.5017f, 5.3724f, 13.3802f, 5.2576f)
                lineTo(13.5f, 5.25f)
                curveTo(14.6496f, 5.25f, 15.4592f, 4.9801f, 15.9697f, 4.4697f)
                curveTo(16.4801f, 3.9592f, 16.75f, 3.1496f, 16.75f, 2.0f)
                curveTo(16.75f, 1.0f, 18.25f, 1.0f, 18.25f, 2.0f)
                close()
            }
        }
        .build()
        return _predictions!!
    }

private var _predictions: ImageVector? = null
