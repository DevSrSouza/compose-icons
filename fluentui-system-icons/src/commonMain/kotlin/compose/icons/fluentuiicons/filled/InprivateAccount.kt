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

public val FilledGroup.InprivateAccount: ImageVector
    get() {
        if (_inprivateAccount != null) {
            return _inprivateAccount!!
        }
        _inprivateAccount = Builder(name = "InprivateAccount", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7543f, 13.9999f)
                curveTo(18.9624f, 13.9999f, 19.948f, 14.9525f, 20.0009f, 16.1475f)
                lineTo(20.0001f, 16.25f)
                lineTo(12.0037f, 16.2499f)
                verticalLineTo(17.249f)
                lineTo(19.9789f, 17.2502f)
                curveTo(19.9181f, 17.7818f, 19.7443f, 18.2935f, 19.4702f, 18.7512f)
                lineTo(12.0037f, 18.749f)
                verticalLineTo(19.7499f)
                lineTo(18.6422f, 19.751f)
                curveTo(17.0813f, 21.2569f, 14.8525f, 22.0011f, 12.0001f, 22.0011f)
                curveTo(8.8543f, 22.0011f, 6.4682f, 21.0959f, 4.9019f, 19.2617f)
                curveTo(4.3222f, 18.5827f, 4.0037f, 17.7193f, 4.0037f, 16.8265f)
                verticalLineTo(16.2488f)
                curveTo(4.0037f, 15.0068f, 5.0105f, 13.9999f, 6.2525f, 13.9999f)
                horizontalLineTo(17.7543f)
                close()
                moveTo(12.0001f, 2.0f)
                curveTo(13.6359f, 2.0f, 15.0881f, 2.7855f, 16.0003f, 3.9998f)
                lineTo(12.0031f, 4.0f)
                lineTo(12.0027f, 4.999f)
                lineTo(16.5843f, 5.0005f)
                curveTo(16.7883f, 5.4675f, 16.923f, 5.9718f, 16.9755f, 6.5003f)
                lineTo(12.0027f, 6.499f)
                verticalLineTo(7.499f)
                lineTo(16.9755f, 7.5007f)
                curveTo(16.9228f, 8.0292f, 16.788f, 8.5335f, 16.5838f, 9.0005f)
                lineTo(12.0027f, 8.999f)
                lineTo(12.0031f, 10.0f)
                lineTo(15.9996f, 10.0012f)
                curveTo(15.0873f, 11.215f, 13.6354f, 12.0f, 12.0001f, 12.0f)
                curveTo(9.2387f, 12.0f, 7.0001f, 9.7614f, 7.0001f, 7.0f)
                curveTo(7.0001f, 4.2386f, 9.2387f, 2.0f, 12.0001f, 2.0f)
                close()
            }
        }
        .build()
        return _inprivateAccount!!
    }

private var _inprivateAccount: ImageVector? = null
