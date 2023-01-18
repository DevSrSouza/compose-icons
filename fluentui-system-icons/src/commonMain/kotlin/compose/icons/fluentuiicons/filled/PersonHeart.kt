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

public val FilledGroup.PersonHeart: ImageVector
    get() {
        if (_personHeart != null) {
            return _personHeart!!
        }
        _personHeart = Builder(name = "PersonHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3981f, 19.0744f)
                curveTo(10.0254f, 17.7017f, 9.733f, 15.6579f, 10.5207f, 13.9992f)
                horizontalLineTo(4.2528f)
                curveTo(3.0108f, 13.9992f, 2.0039f, 15.0061f, 2.0039f, 16.2481f)
                verticalLineTo(17.1681f)
                curveTo(2.0039f, 17.7401f, 2.1823f, 18.298f, 2.5143f, 18.7639f)
                curveTo(4.0564f, 20.9282f, 6.5794f, 22.0004f, 10.0004f, 22.0004f)
                curveTo(11.4131f, 22.0004f, 12.673f, 21.8175f, 13.7742f, 21.4504f)
                lineTo(11.3981f, 19.0744f)
                close()
                moveTo(10.0004f, 2.0039f)
                curveTo(12.7618f, 2.0039f, 15.0004f, 4.2425f, 15.0004f, 7.0039f)
                curveTo(15.0004f, 9.7653f, 12.7618f, 12.0039f, 10.0004f, 12.0039f)
                curveTo(7.2389f, 12.0039f, 5.0004f, 9.7653f, 5.0004f, 7.0039f)
                curveTo(5.0004f, 4.2425f, 7.2389f, 2.0039f, 10.0004f, 2.0039f)
                close()
                moveTo(17.0439f, 22.9952f)
                curveTo(16.8519f, 22.9953f, 16.6599f, 22.922f, 16.5135f, 22.7756f)
                lineTo(12.1052f, 18.3673f)
                curveTo(10.7514f, 17.0134f, 10.7514f, 14.8184f, 12.1052f, 13.4646f)
                curveTo(13.4591f, 12.1108f, 15.6541f, 12.1108f, 17.0079f, 13.4646f)
                lineTo(17.0439f, 13.5006f)
                lineTo(17.0799f, 13.4646f)
                curveTo(18.4337f, 12.1108f, 20.6287f, 12.1108f, 21.9826f, 13.4646f)
                curveTo(23.3364f, 14.8184f, 23.3364f, 17.0134f, 21.9826f, 18.3673f)
                lineTo(17.5743f, 22.7756f)
                curveTo(17.4279f, 22.922f, 17.2359f, 22.9953f, 17.0439f, 22.9952f)
                close()
            }
        }
        .build()
        return _personHeart!!
    }

private var _personHeart: ImageVector? = null
