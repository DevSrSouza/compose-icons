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

public val FilledGroup.SportSoccer: ImageVector
    get() {
        if (_sportSoccer != null) {
            return _sportSoccer!!
        }
        _sportSoccer = Builder(name = "SportSoccer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.2443f, 4.3726f)
                lineTo(11.252f, 6.1721f)
                verticalLineTo(8.3659f)
                lineTo(8.4606f, 10.3939f)
                lineTo(6.4169f, 9.687f)
                lineTo(5.8303f, 6.1532f)
                curveTo(6.5197f, 5.426f, 7.3362f, 4.8206f, 8.2443f, 4.3726f)
                close()
                moveTo(3.6214f, 13.4394f)
                lineTo(5.9485f, 11.1122f)
                lineTo(7.9871f, 11.8174f)
                lineTo(9.0698f, 15.1497f)
                lineTo(8.1009f, 16.725f)
                lineTo(4.8071f, 16.5312f)
                curveTo(4.223f, 15.6059f, 3.8125f, 14.56f, 3.6214f, 13.4394f)
                close()
                moveTo(10.5299f, 20.3733f)
                lineTo(9.3457f, 17.5643f)
                lineTo(10.3094f, 15.9974f)
                horizontalLineTo(13.6806f)
                lineTo(14.5926f, 17.5783f)
                lineTo(13.553f, 20.3585f)
                curveTo(13.0495f, 20.4514f, 12.5304f, 20.5f, 12.0f, 20.5f)
                curveTo(11.4986f, 20.5f, 11.0074f, 20.4566f, 10.5299f, 20.3733f)
                close()
                moveTo(18.892f, 16.9761f)
                lineTo(15.8675f, 16.7865f)
                lineTo(14.9302f, 15.1618f)
                lineTo(16.0169f, 11.8174f)
                lineTo(18.0296f, 11.1213f)
                lineTo(20.3416f, 13.6417f)
                curveTo(20.1016f, 14.8681f, 19.5979f, 16.0f, 18.892f, 16.9761f)
                close()
                moveTo(18.172f, 6.1556f)
                lineTo(17.5831f, 9.6885f)
                lineTo(15.5434f, 10.3939f)
                lineTo(12.752f, 8.3659f)
                verticalLineTo(6.1717f)
                lineTo(15.7543f, 4.3719f)
                curveTo(16.6639f, 4.8205f, 17.4818f, 5.427f, 18.172f, 6.1556f)
                close()
            }
        }
        .build()
        return _sportSoccer!!
    }

private var _sportSoccer: ImageVector? = null
