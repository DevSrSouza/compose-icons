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

public val RegularGroup.Molecule: ImageVector
    get() {
        if (_molecule != null) {
            return _molecule!!
        }
        _molecule = Builder(name = "Molecule", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                curveTo(18.7614f, 12.0f, 21.0f, 9.7614f, 21.0f, 7.0f)
                curveTo(21.0f, 4.2386f, 18.7614f, 2.0f, 16.0f, 2.0f)
                curveTo(13.2386f, 2.0f, 11.0f, 4.2386f, 11.0f, 7.0f)
                curveTo(11.0f, 7.9064f, 11.2412f, 8.7565f, 11.6629f, 9.4895f)
                lineTo(8.9491f, 11.2976f)
                curveTo(8.2179f, 10.5f, 7.1673f, 10.0f, 6.0f, 10.0f)
                curveTo(3.7909f, 10.0f, 2.0f, 11.7909f, 2.0f, 14.0f)
                curveTo(2.0f, 16.2091f, 3.7909f, 18.0f, 6.0f, 18.0f)
                curveTo(7.296f, 18.0f, 8.448f, 17.3837f, 9.179f, 16.4281f)
                lineTo(13.066f, 18.3714f)
                curveTo(13.0227f, 18.5741f, 13.0f, 18.7844f, 13.0f, 19.0f)
                curveTo(13.0f, 20.6569f, 14.3431f, 22.0f, 16.0f, 22.0f)
                curveTo(17.6569f, 22.0f, 19.0f, 20.6569f, 19.0f, 19.0f)
                curveTo(19.0f, 17.3431f, 17.6569f, 16.0f, 16.0f, 16.0f)
                curveTo(15.0971f, 16.0f, 14.2874f, 16.3989f, 13.7374f, 17.03f)
                lineTo(9.8506f, 15.0869f)
                curveTo(9.9479f, 14.7413f, 10.0f, 14.3767f, 10.0f, 14.0f)
                curveTo(10.0f, 13.4977f, 9.9074f, 13.0171f, 9.7384f, 12.5742f)
                lineTo(12.601f, 10.667f)
                curveTo(13.493f, 11.4942f, 14.6874f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(16.0f, 10.5f)
                curveTo(14.067f, 10.5f, 12.5f, 8.933f, 12.5f, 7.0f)
                curveTo(12.5f, 5.067f, 14.067f, 3.5f, 16.0f, 3.5f)
                curveTo(17.933f, 3.5f, 19.5f, 5.067f, 19.5f, 7.0f)
                curveTo(19.5f, 8.933f, 17.933f, 10.5f, 16.0f, 10.5f)
                close()
                moveTo(6.0f, 16.5f)
                curveTo(4.6193f, 16.5f, 3.5f, 15.3807f, 3.5f, 14.0f)
                curveTo(3.5f, 12.6193f, 4.6193f, 11.5f, 6.0f, 11.5f)
                curveTo(7.3807f, 11.5f, 8.5f, 12.6193f, 8.5f, 14.0f)
                curveTo(8.5f, 15.3807f, 7.3807f, 16.5f, 6.0f, 16.5f)
                close()
                moveTo(17.5f, 19.0f)
                curveTo(17.5f, 19.8284f, 16.8284f, 20.5f, 16.0f, 20.5f)
                curveTo(15.1716f, 20.5f, 14.5f, 19.8284f, 14.5f, 19.0f)
                curveTo(14.5f, 18.1716f, 15.1716f, 17.5f, 16.0f, 17.5f)
                curveTo(16.8284f, 17.5f, 17.5f, 18.1716f, 17.5f, 19.0f)
                close()
            }
        }
        .build()
        return _molecule!!
    }

private var _molecule: ImageVector? = null
