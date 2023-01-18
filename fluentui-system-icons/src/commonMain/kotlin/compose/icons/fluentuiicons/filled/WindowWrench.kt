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

public val FilledGroup.WindowWrench: ImageVector
    get() {
        if (_windowWrench != null) {
            return _windowWrench!!
        }
        _windowWrench = Builder(name = "WindowWrench", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(11.0443f)
                curveTo(11.1356f, 20.5185f, 11.3675f, 20.0584f, 11.7402f, 19.6857f)
                lineTo(11.9259f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 19.5f, 4.5f, 18.7165f, 4.5f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(11.0322f)
                curveTo(19.6717f, 11.0516f, 19.8426f, 11.0798f, 20.0118f, 11.1167f)
                curveTo(20.4824f, 11.2194f, 20.8258f, 11.5286f, 21.0f, 11.9084f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(20.1305f, 12.5103f)
                curveTo(20.1309f, 12.3199f, 20.0145f, 12.1408f, 19.7988f, 12.0938f)
                curveTo(19.6998f, 12.0722f, 19.6001f, 12.0543f, 19.5f, 12.0402f)
                curveTo(18.276f, 11.8672f, 16.9883f, 12.2515f, 16.0469f, 13.1928f)
                curveTo(14.8381f, 14.4015f, 14.548f, 16.1809f, 15.1764f, 17.6635f)
                lineTo(12.4474f, 20.3928f)
                curveTo(12.271f, 20.5692f, 12.1467f, 20.778f, 12.0747f, 21.0f)
                curveTo(11.903f, 21.5288f, 12.0273f, 22.1326f, 12.4474f, 22.5527f)
                curveTo(13.0438f, 23.1491f, 14.0109f, 23.1491f, 14.6074f, 22.5527f)
                lineTo(17.3367f, 19.8231f)
                curveTo(18.8194f, 20.451f, 20.5985f, 20.1608f, 21.807f, 18.9523f)
                curveTo(22.8255f, 17.934f, 23.1918f, 16.5106f, 22.9061f, 15.2009f)
                curveTo(22.8292f, 14.8481f, 22.3989f, 14.7608f, 22.1436f, 15.0161f)
                lineTo(20.2393f, 16.9202f)
                curveTo(20.2114f, 16.9481f, 20.1827f, 16.9747f, 20.1532f, 17.0f)
                curveTo(19.96f, 17.1659f, 19.7351f, 17.2756f, 19.5f, 17.3291f)
                curveTo(19.0051f, 17.4418f, 18.4649f, 17.3056f, 18.0795f, 16.9202f)
                curveTo(17.483f, 16.3237f, 17.483f, 15.3566f, 18.0795f, 14.7602f)
                lineTo(19.9836f, 12.8563f)
                curveTo(20.0828f, 12.7571f, 20.1303f, 12.6314f, 20.1305f, 12.5103f)
                close()
                moveTo(17.7203f, 21.0f)
                curveTo(17.6814f, 20.9905f, 17.6426f, 20.9805f, 17.6038f, 20.9701f)
                lineTo(17.574f, 21.0f)
                horizontalLineTo(17.7203f)
                close()
            }
        }
        .build()
        return _windowWrench!!
    }

private var _windowWrench: ImageVector? = null
