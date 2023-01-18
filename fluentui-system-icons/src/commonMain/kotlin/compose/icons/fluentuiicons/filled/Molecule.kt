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

public val FilledGroup.Molecule: ImageVector
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
                curveTo(7.2961f, 18.0f, 8.4482f, 17.3836f, 9.1792f, 16.4279f)
                lineTo(13.066f, 18.371f)
                curveTo(13.0228f, 18.5738f, 13.0f, 18.7843f, 13.0f, 19.0f)
                curveTo(13.0f, 20.6569f, 14.3431f, 22.0f, 16.0f, 22.0f)
                curveTo(17.6569f, 22.0f, 19.0f, 20.6569f, 19.0f, 19.0f)
                curveTo(19.0f, 17.3431f, 17.6569f, 16.0f, 16.0f, 16.0f)
                curveTo(15.0972f, 16.0f, 14.2876f, 16.3988f, 13.7376f, 17.0298f)
                lineTo(9.8507f, 15.0866f)
                curveTo(9.948f, 14.7411f, 10.0f, 14.3766f, 10.0f, 14.0f)
                curveTo(10.0f, 13.4977f, 9.9074f, 13.0171f, 9.7384f, 12.5742f)
                lineTo(12.601f, 10.667f)
                curveTo(13.493f, 11.4942f, 14.6874f, 12.0f, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _molecule!!
    }

private var _molecule: ImageVector? = null
