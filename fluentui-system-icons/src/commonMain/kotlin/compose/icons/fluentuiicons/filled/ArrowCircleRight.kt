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

public val FilledGroup.ArrowCircleRight: ImageVector
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
                moveTo(12.7813f, 7.469f)
                lineTo(12.6972f, 7.3963f)
                curveTo(12.4362f, 7.2027f, 12.078f, 7.2003f, 11.8146f, 7.3892f)
                lineTo(11.7206f, 7.469f)
                lineTo(11.648f, 7.5531f)
                curveTo(11.4544f, 7.8141f, 11.452f, 8.1723f, 11.6409f, 8.4357f)
                lineTo(11.7206f, 8.5296f)
                lineTo(14.4403f, 11.2493f)
                horizontalLineTo(7.7503f)
                lineTo(7.6485f, 11.2561f)
                curveTo(7.3157f, 11.3013f, 7.0523f, 11.5647f, 7.0071f, 11.8975f)
                lineTo(7.0003f, 11.9993f)
                lineTo(7.0071f, 12.1011f)
                curveTo(7.0523f, 12.4339f, 7.3157f, 12.6973f, 7.6485f, 12.7424f)
                lineTo(7.7503f, 12.7493f)
                horizontalLineTo(14.4403f)
                lineTo(11.72f, 15.4697f)
                lineTo(11.6474f, 15.5538f)
                curveTo(11.4295f, 15.8474f, 11.4536f, 16.264f, 11.7198f, 16.5303f)
                curveTo(11.9861f, 16.7967f, 12.4027f, 16.8209f, 12.6964f, 16.6032f)
                lineTo(12.7805f, 16.5306f)
                lineTo(16.782f, 12.5306f)
                lineTo(16.8547f, 12.4464f)
                curveTo(17.0484f, 12.1854f, 17.0508f, 11.8272f, 16.8619f, 11.5638f)
                lineTo(16.7821f, 11.4698f)
                lineTo(12.7813f, 7.469f)
                lineTo(12.6972f, 7.3963f)
                lineTo(12.7813f, 7.469f)
                close()
            }
        }
        .build()
        return _arrowCircleRight!!
    }

private var _arrowCircleRight: ImageVector? = null
