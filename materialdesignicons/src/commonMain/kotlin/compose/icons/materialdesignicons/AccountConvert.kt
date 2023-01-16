package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.AccountConvert: ImageVector
    get() {
        if (_accountConvert != null) {
            return _accountConvert!!
        }
        _accountConvert = Builder(name = "AccountConvert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(11.34f, 0.03f)
                lineTo(15.15f, 3.84f)
                lineTo(16.5f, 2.5f)
                curveTo(19.75f, 4.07f, 22.09f, 7.24f, 22.45f, 11.0f)
                horizontalLineTo(23.95f)
                curveTo(23.44f, 4.84f, 18.29f, 0.0f, 12.0f, 0.0f)
                moveTo(12.0f, 4.0f)
                curveTo(10.07f, 4.0f, 8.5f, 5.57f, 8.5f, 7.5f)
                curveTo(8.5f, 9.43f, 10.07f, 11.0f, 12.0f, 11.0f)
                curveTo(13.93f, 11.0f, 15.5f, 9.43f, 15.5f, 7.5f)
                curveTo(15.5f, 5.57f, 13.93f, 4.0f, 12.0f, 4.0f)
                moveTo(0.05f, 13.0f)
                curveTo(0.56f, 19.16f, 5.71f, 24.0f, 12.0f, 24.0f)
                lineTo(12.66f, 23.97f)
                lineTo(8.85f, 20.16f)
                lineTo(7.5f, 21.5f)
                curveTo(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13.0f)
                horizontalLineTo(0.05f)
                moveTo(12.0f, 13.0f)
                curveTo(8.13f, 13.0f, 5.0f, 14.57f, 5.0f, 16.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.5f)
                curveTo(19.0f, 14.57f, 15.87f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _accountConvert!!
    }

private var _accountConvert: ImageVector? = null
