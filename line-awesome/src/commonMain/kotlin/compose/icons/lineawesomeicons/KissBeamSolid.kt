package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.KissBeamSolid: ImageVector
    get() {
        if (_kissBeamSolid != null) {
            return _kissBeamSolid!!
        }
        _kissBeamSolid = Builder(name = "KissBeamSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.0f, 12.0f)
                curveTo(8.906f, 12.0f, 7.391f, 13.207f, 7.391f, 13.207f)
                lineTo(8.609f, 14.793f)
                curveTo(8.609f, 14.793f, 9.693f, 14.0f, 11.002f, 14.0f)
                curveTo(12.311f, 14.0f, 13.393f, 14.793f, 13.393f, 14.793f)
                lineTo(14.611f, 13.207f)
                curveTo(14.609f, 13.207f, 13.094f, 12.0f, 11.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveTo(18.906f, 12.0f, 17.391f, 13.207f, 17.391f, 13.207f)
                lineTo(18.609f, 14.793f)
                curveTo(18.609f, 14.793f, 19.693f, 14.0f, 21.002f, 14.0f)
                curveTo(22.311f, 14.0f, 23.393f, 14.793f, 23.393f, 14.793f)
                lineTo(24.611f, 13.207f)
                curveTo(24.609f, 13.207f, 23.094f, 12.0f, 21.0f, 12.0f)
                close()
                moveTo(15.0f, 17.008f)
                lineTo(15.0f, 18.498f)
                curveTo(15.902f, 18.498f, 16.477f, 18.913f, 16.477f, 19.129f)
                curveTo(16.477f, 19.344f, 15.905f, 19.754f, 15.01f, 19.758f)
                curveTo(15.006f, 19.758f, 15.003f, 19.758f, 15.0f, 19.758f)
                lineTo(15.0f, 19.76f)
                lineTo(15.0f, 21.248f)
                lineTo(15.0f, 21.25f)
                curveTo(15.003f, 21.25f, 15.006f, 21.25f, 15.01f, 21.25f)
                curveTo(15.905f, 21.253f, 16.477f, 21.664f, 16.477f, 21.879f)
                curveTo(16.477f, 22.095f, 15.901f, 22.51f, 15.0f, 22.51f)
                lineTo(15.0f, 24.0f)
                curveTo(16.669f, 24.0f, 17.977f, 23.068f, 17.977f, 21.879f)
                curveTo(17.977f, 21.347f, 17.705f, 20.873f, 17.266f, 20.504f)
                curveTo(17.705f, 20.135f, 17.977f, 19.661f, 17.977f, 19.129f)
                curveTo(17.977f, 17.94f, 16.669f, 17.008f, 15.0f, 17.008f)
                close()
            }
        }
        .build()
        return _kissBeamSolid!!
    }

private var _kissBeamSolid: ImageVector? = null
