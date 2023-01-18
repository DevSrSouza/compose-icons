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

public val RegularGroup.PersonHeart: ImageVector
    get() {
        if (_personHeart != null) {
            return _personHeart!!
        }
        _personHeart = Builder(name = "PersonHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1092f, 15.4992f)
                curveTo(10.1572f, 14.9841f, 10.2943f, 14.4758f, 10.5207f, 13.9992f)
                horizontalLineTo(4.2528f)
                curveTo(3.0108f, 13.9992f, 2.0039f, 15.0061f, 2.0039f, 16.2481f)
                verticalLineTo(16.8258f)
                curveTo(2.0039f, 17.7185f, 2.3224f, 18.582f, 2.9022f, 19.2609f)
                curveTo(4.4685f, 21.0952f, 6.8545f, 22.0004f, 10.0004f, 22.0004f)
                curveTo(11.4131f, 22.0004f, 12.6729f, 21.8178f, 13.7743f, 21.4506f)
                lineTo(12.5593f, 20.2356f)
                curveTo(11.7962f, 20.4118f, 10.9441f, 20.5004f, 10.0004f, 20.5004f)
                curveTo(7.2621f, 20.5004f, 5.2962f, 19.7546f, 4.0429f, 18.2869f)
                curveTo(3.695f, 17.8795f, 3.5039f, 17.3614f, 3.5039f, 16.8258f)
                verticalLineTo(16.2481f)
                curveTo(3.5039f, 15.8345f, 3.8392f, 15.4992f, 4.2528f, 15.4992f)
                horizontalLineTo(10.1092f)
                close()
                moveTo(10.0004f, 2.0039f)
                curveTo(12.7618f, 2.0039f, 15.0004f, 4.2425f, 15.0004f, 7.0039f)
                curveTo(15.0004f, 9.7653f, 12.7618f, 12.0039f, 10.0004f, 12.0039f)
                curveTo(7.2389f, 12.0039f, 5.0004f, 9.7653f, 5.0004f, 7.0039f)
                curveTo(5.0004f, 4.2425f, 7.2389f, 2.0039f, 10.0004f, 2.0039f)
                close()
                moveTo(10.0004f, 3.5039f)
                curveTo(8.0674f, 3.5039f, 6.5004f, 5.0709f, 6.5004f, 7.0039f)
                curveTo(6.5004f, 8.9369f, 8.0674f, 10.5039f, 10.0004f, 10.5039f)
                curveTo(11.9334f, 10.5039f, 13.5004f, 8.9369f, 13.5004f, 7.0039f)
                curveTo(13.5004f, 5.0709f, 11.9334f, 3.5039f, 10.0004f, 3.5039f)
                close()
                moveTo(17.0439f, 22.996f)
                curveTo(16.8519f, 22.9961f, 16.6599f, 22.9228f, 16.5135f, 22.7764f)
                lineTo(12.1052f, 18.3681f)
                curveTo(10.7514f, 17.0142f, 10.7514f, 14.8192f, 12.1052f, 13.4654f)
                curveTo(13.4591f, 12.1116f, 15.6541f, 12.1116f, 17.0079f, 13.4654f)
                lineTo(17.0439f, 13.5014f)
                lineTo(17.0799f, 13.4654f)
                curveTo(18.4337f, 12.1116f, 20.6287f, 12.1116f, 21.9826f, 13.4654f)
                curveTo(23.3364f, 14.8192f, 23.3364f, 17.0142f, 21.9826f, 18.3681f)
                lineTo(17.5743f, 22.7764f)
                curveTo(17.4279f, 22.9228f, 17.2359f, 22.9961f, 17.0439f, 22.996f)
                close()
            }
        }
        .build()
        return _personHeart!!
    }

private var _personHeart: ImageVector? = null
