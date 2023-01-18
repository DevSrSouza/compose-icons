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

public val RegularGroup.ArrowCircleRight: ImageVector
    get() {
        if (_arrowCircleRight != null) {
            return _arrowCircleRight!!
        }
        _arrowCircleRight = Builder(name = "ArrowCircleRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 2.0f)
                curveTo(17.5238f, 2.0f, 22.001f, 6.4771f, 22.001f, 12.0f)
                curveTo(22.001f, 17.5228f, 17.5238f, 22.0f, 12.001f, 22.0f)
                curveTo(6.4781f, 22.0f, 2.001f, 17.5228f, 2.001f, 12.0f)
                curveTo(2.001f, 6.4771f, 6.4781f, 2.0f, 12.001f, 2.0f)
                close()
                moveTo(12.001f, 3.5f)
                curveTo(7.3066f, 3.5f, 3.501f, 7.3056f, 3.501f, 12.0f)
                curveTo(3.501f, 16.6944f, 7.3066f, 20.5f, 12.001f, 20.5f)
                curveTo(16.6954f, 20.5f, 20.501f, 16.6944f, 20.501f, 12.0f)
                curveTo(20.501f, 7.3056f, 16.6954f, 3.5f, 12.001f, 3.5f)
                close()
                moveTo(11.648f, 7.5531f)
                lineTo(11.7206f, 7.469f)
                curveTo(11.9869f, 7.2027f, 12.4036f, 7.1785f, 12.6972f, 7.3963f)
                lineTo(12.7813f, 7.469f)
                lineTo(16.7821f, 11.4698f)
                curveTo(17.0484f, 11.7361f, 17.0726f, 12.1528f, 16.8547f, 12.4464f)
                lineTo(16.782f, 12.5306f)
                lineTo(12.7805f, 16.5306f)
                curveTo(12.4876f, 16.8234f, 12.0127f, 16.8233f, 11.7198f, 16.5303f)
                curveTo(11.4536f, 16.264f, 11.4295f, 15.8474f, 11.6474f, 15.5538f)
                lineTo(11.72f, 15.4697f)
                lineTo(14.442f, 12.749f)
                lineTo(7.7503f, 12.7493f)
                curveTo(7.3706f, 12.7493f, 7.0568f, 12.4671f, 7.0071f, 12.1011f)
                lineTo(7.0003f, 11.9993f)
                curveTo(7.0003f, 11.6196f, 7.2824f, 11.3058f, 7.6485f, 11.2561f)
                lineTo(7.7503f, 11.2493f)
                lineTo(14.44f, 11.249f)
                lineTo(11.7206f, 8.5296f)
                curveTo(11.4544f, 8.2634f, 11.4302f, 7.8467f, 11.648f, 7.5531f)
                lineTo(11.7206f, 7.469f)
                lineTo(11.648f, 7.5531f)
                close()
            }
        }
        .build()
        return _arrowCircleRight!!
    }

private var _arrowCircleRight: ImageVector? = null
