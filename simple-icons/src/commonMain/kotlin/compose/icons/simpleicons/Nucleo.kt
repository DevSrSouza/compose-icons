package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Nucleo: VectorAsset
    get() {
        if (_nucleo != null) {
            return _nucleo!!
        }
        _nucleo = VectorAssetBuilder(name = "Nucleo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7993f, 12.0f)
                arcTo(1.7994f, 1.7994f, 0.0f, false, true, 12.0f, 13.7994f)
                arcTo(1.7994f, 1.7994f, 0.0f, false, true, 10.2006f, 12.0f)
                arcTo(1.7994f, 1.7994f, 0.0f, false, true, 12.0f, 10.2006f)
                arcTo(1.7994f, 1.7994f, 0.0f, false, true, 13.7993f, 12.0f)
                moveToRelative(1.4731f, 3.2622f)
                arcToRelative(35.2223f, 35.2223f, 0.0f, false, true, -3.3126f, 2.9618f)
                arcToRelative(44.0775f, 44.0775f, 0.0f, false, true, -3.3126f, -2.9618f)
                arcToRelative(35.2127f, 35.2127f, 0.0f, false, true, -2.9611f, -3.3126f)
                arcTo(35.2127f, 35.2127f, 0.0f, false, true, 8.6472f, 8.637f)
                arcToRelative(43.9342f, 43.9342f, 0.0f, false, true, 3.3126f, -2.9611f)
                arcToRelative(43.9342f, 43.9342f, 0.0f, false, true, 3.3126f, 2.9611f)
                arcToRelative(35.1287f, 35.1287f, 0.0f, false, true, 2.9611f, 3.3126f)
                arcToRelative(29.2652f, 29.2652f, 0.0f, false, true, -2.961f, 3.3126f)
                moveToRelative(1.004f, -7.5806f)
                arcToRelative(40.9184f, 40.9184f, 0.0f, false, false, -3.1621f, -2.861f)
                curveToRelative(2.9611f, -2.1592f, 5.722f, -3.4632f, 7.6292f, -3.4632f)
                arcToRelative(1.8893f, 1.8893f, 0.0f, false, true, 1.4053f, 0.4523f)
                curveToRelative(1.1042f, 1.1042f, 0.2507f, 4.2662f, -2.359f, 8.0803f)
                horizontalLineToRelative(1.656f)
                arcToRelative(25.0968f, 25.0968f, 0.0f, false, false, 1.4054f, -2.4592f)
                curveToRelative(1.4053f, -3.0115f, 1.506f, -5.32f, 0.2999f, -6.5748f)
                arcToRelative(3.6587f, 3.6587f, 0.0f, false, false, -2.458f, -0.8517f)
                curveToRelative(-3.2124f, 0.0f, -8.3333f, 3.0115f, -12.9997f, 7.6773f)
                arcToRelative(40.9184f, 40.9184f, 0.0f, false, false, -2.861f, 3.162f)
                curveTo(1.721f, 6.5792f, 0.6672f, 2.9655f, 1.8212f, 1.8115f)
                arcToRelative(1.9685f, 1.9685f, 0.0f, false, true, 1.4053f, -0.4523f)
                curveToRelative(1.707f, 0.0f, 4.1157f, 1.0545f, 6.6755f, 2.8112f)
                verticalLineTo(2.5642f)
                curveTo(7.3924f, 0.9076f, 5.0335f, 0.0043f, 3.2264f, 0.0043f)
                arcToRelative(3.2292f, 3.2292f, 0.0f, false, false, -2.359f, 0.8535f)
                curveToRelative(-1.2547f, 1.2548f, -1.103f, 3.5633f, 0.3017f, 6.5748f)
                curveToRelative(1.3045f, 2.8106f, 3.6635f, 5.9223f, 6.5244f, 8.8337f)
                arcToRelative(40.9184f, 40.9184f, 0.0f, false, false, 3.1621f, 2.861f)
                curveToRelative(-2.9108f, 2.1592f, -5.722f, 3.463f, -7.6293f, 3.463f)
                arcToRelative(1.8917f, 1.8917f, 0.0f, false, true, -1.4052f, -0.454f)
                curveToRelative(-1.1042f, -1.1042f, -0.2508f, -4.2662f, 2.359f, -8.0808f)
                horizontalLineTo(2.5743f)
                arcToRelative(25.167f, 25.167f, 0.0f, false, false, -1.4053f, 2.459f)
                curveToRelative(-1.4047f, 3.014f, -1.506f, 5.322f, -0.3017f, 6.5779f)
                arcToRelative(3.2316f, 3.2316f, 0.0f, false, false, 2.359f, 0.8529f)
                curveToRelative(3.2124f, 0.0f, 8.3321f, -3.0115f, 12.9997f, -7.6772f)
                arcToRelative(40.808f, 40.808f, 0.0f, false, false, 2.861f, -3.1621f)
                curveToRelative(3.1092f, 4.2645f, 4.166f, 7.8782f, 3.0114f, 9.0303f)
                arcToRelative(1.8905f, 1.8905f, 0.0f, false, true, -1.4052f, 0.4517f)
                curveToRelative(-1.7064f, 0.0f, -4.1158f, -1.0538f, -6.6756f, -2.8106f)
                verticalLineToRelative(1.656f)
                curveToRelative(2.5598f, 1.6086f, 4.9188f, 2.5623f, 6.6756f, 2.5623f)
                arcToRelative(3.2292f, 3.2292f, 0.0f, false, false, 2.3589f, -0.8535f)
                curveToRelative(1.2548f, -1.2548f, 1.1042f, -3.5633f, -0.2999f, -6.5748f)
                curveToRelative(-1.256f, -2.861f, -3.6149f, -5.9727f, -6.4759f, -8.8858f)
                close()
            }
        }
        .build()
        return _nucleo!!
    }

private var _nucleo: VectorAsset? = null
