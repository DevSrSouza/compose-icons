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

public val RegularGroup.Rhombus: ImageVector
    get() {
        if (_rhombus != null) {
            return _rhombus!!
        }
        _rhombus = Builder(name = "Rhombus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.8072f, 5.4079f)
                curveTo(6.1506f, 4.5571f, 6.9762f, 4.0f, 7.8937f, 4.0f)
                horizontalLineTo(20.752f)
                curveTo(22.3468f, 4.0f, 23.4353f, 5.6132f, 22.8385f, 7.0921f)
                lineTo(18.1971f, 18.5921f)
                curveTo(17.8537f, 19.4429f, 17.0281f, 20.0f, 16.1106f, 20.0f)
                horizontalLineTo(3.2522f)
                curveTo(1.6575f, 20.0f, 0.5689f, 18.3868f, 1.1658f, 16.9079f)
                lineTo(5.8072f, 5.4079f)
                close()
                moveTo(7.8937f, 5.5f)
                curveTo(7.5878f, 5.5f, 7.3126f, 5.6857f, 7.1982f, 5.9693f)
                lineTo(2.5568f, 17.4693f)
                curveTo(2.3578f, 17.9623f, 2.7206f, 18.5f, 3.2522f, 18.5f)
                horizontalLineTo(16.1106f)
                curveTo(16.4165f, 18.5f, 16.6917f, 18.3143f, 16.8061f, 18.0307f)
                lineTo(21.4475f, 6.5307f)
                curveTo(21.6464f, 6.0377f, 21.2836f, 5.5f, 20.752f, 5.5f)
                horizontalLineTo(7.8937f)
                close()
            }
        }
        .build()
        return _rhombus!!
    }

private var _rhombus: ImageVector? = null
