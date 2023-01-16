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

public val MaterialDesignIcons.AccountOffOutline: ImageVector
    get() {
        if (_accountOffOutline != null) {
            return _accountOffOutline!!
        }
        _accountOffOutline = Builder(name = "AccountOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 7.0f)
                lineTo(4.03f, 5.75f)
                lineTo(13.26f, 15.0f)
                lineTo(20.0f, 21.72f)
                lineTo(18.73f, 23.0f)
                lineTo(15.73f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 15.14f, 6.61f, 13.92f, 9.09f, 13.36f)
                lineTo(2.75f, 7.0f)
                moveTo(20.0f, 17.0f)
                verticalLineTo(19.18f)
                lineTo(18.1f, 17.28f)
                verticalLineTo(17.0f)
                curveTo(18.1f, 16.74f, 17.6f, 16.35f, 16.8f, 16.0f)
                lineTo(14.0f, 13.18f)
                curveTo(16.71f, 13.63f, 20.0f, 14.91f, 20.0f, 17.0f)
                moveTo(5.9f, 17.0f)
                verticalLineTo(18.1f)
                horizontalLineTo(13.83f)
                lineTo(10.72f, 15.0f)
                curveTo(8.19f, 15.3f, 5.9f, 16.45f, 5.9f, 17.0f)
                moveTo(12.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 8.0f)
                curveTo(16.0f, 9.95f, 14.6f, 11.58f, 12.75f, 11.93f)
                lineTo(8.07f, 7.25f)
                curveTo(8.42f, 5.4f, 10.05f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _accountOffOutline!!
    }

private var _accountOffOutline: ImageVector? = null
