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

public val FilledGroup.DualScreenVerticalScroll: ImageVector
    get() {
        if (_dualScreenVerticalScroll != null) {
            return _dualScreenVerticalScroll!!
        }
        _dualScreenVerticalScroll = Builder(name = "DualScreenVerticalScroll", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2451f, 4.0044f)
                curveTo(21.2116f, 4.0044f, 21.9951f, 4.7879f, 21.9951f, 5.7544f)
                verticalLineTo(18.2495f)
                curveTo(21.9951f, 19.216f, 21.2116f, 19.9995f, 20.2451f, 19.9995f)
                horizontalLineTo(12.9976f)
                curveTo(12.9108f, 19.9995f, 12.8255f, 19.9932f, 12.7421f, 19.981f)
                lineTo(12.742f, 4.0229f)
                curveTo(12.8254f, 4.0107f, 12.9108f, 4.0044f, 12.9976f, 4.0044f)
                horizontalLineTo(20.2451f)
                close()
                moveTo(10.9976f, 4.0019f)
                curveTo(11.0809f, 4.0019f, 11.1629f, 4.0078f, 11.2431f, 4.0191f)
                lineTo(11.2428f, 19.98f)
                curveTo(11.1627f, 19.9913f, 11.0808f, 19.9971f, 10.9976f, 19.9971f)
                horizontalLineTo(3.75f)
                curveTo(2.7835f, 19.9971f, 2.0f, 19.2136f, 2.0f, 18.2471f)
                verticalLineTo(5.7519f)
                curveTo(2.0f, 4.7854f, 2.7835f, 4.0019f, 3.75f, 4.0019f)
                horizontalLineTo(10.9976f)
                close()
                moveTo(15.7019f, 13.402f)
                curveTo(15.4103f, 13.1814f, 14.9935f, 13.2017f, 14.7247f, 13.4654f)
                curveTo(14.4559f, 13.7292f, 14.4278f, 14.1456f, 14.6429f, 14.4412f)
                lineTo(14.7147f, 14.526f)
                lineTo(16.9676f, 16.8218f)
                lineTo(17.0523f, 16.8961f)
                curveTo(17.3184f, 17.0968f, 17.688f, 17.0966f, 17.954f, 16.8958f)
                lineTo(18.0386f, 16.8215f)
                lineTo(20.2886f, 14.5257f)
                lineTo(20.3604f, 14.4408f)
                curveTo(20.5752f, 14.1451f, 20.5468f, 13.7287f, 20.2779f, 13.4651f)
                curveTo(20.009f, 13.2015f, 19.5921f, 13.1815f, 19.3007f, 13.4023f)
                lineTo(19.2173f, 13.4758f)
                lineTo(17.5026f, 15.2254f)
                lineTo(15.7853f, 13.4754f)
                lineTo(15.7019f, 13.402f)
                close()
                moveTo(18.0386f, 7.2258f)
                curveTo(17.7714f, 6.9531f, 17.348f, 6.9282f, 17.0523f, 7.1511f)
                lineTo(16.9676f, 7.2254f)
                lineTo(14.7147f, 9.5212f)
                curveTo(14.4246f, 9.8168f, 14.429f, 10.2917f, 14.7247f, 10.5818f)
                curveTo(14.9935f, 10.8456f, 15.4103f, 10.8659f, 15.7019f, 10.6452f)
                lineTo(15.7853f, 10.5718f)
                lineTo(17.5026f, 8.8219f)
                lineTo(19.2173f, 10.5715f)
                curveTo(19.5072f, 10.8673f, 19.9821f, 10.8721f, 20.2779f, 10.5822f)
                curveTo(20.5468f, 10.3186f, 20.5752f, 9.9022f, 20.3604f, 9.6064f)
                lineTo(20.2886f, 9.5216f)
                lineTo(18.0386f, 7.2258f)
                close()
            }
        }
        .build()
        return _dualScreenVerticalScroll!!
    }

private var _dualScreenVerticalScroll: ImageVector? = null
