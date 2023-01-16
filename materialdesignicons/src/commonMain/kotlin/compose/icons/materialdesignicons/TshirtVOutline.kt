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

public val MaterialDesignIcons.TshirtVOutline: ImageVector
    get() {
        if (_tshirtVOutline != null) {
            return _tshirtVOutline!!
        }
        _tshirtVOutline = Builder(name = "TshirtVOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 21.0f)
                horizontalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 20.0f)
                verticalLineTo(12.07f)
                lineTo(5.7f, 13.12f)
                curveTo(5.31f, 13.5f, 4.68f, 13.5f, 4.29f, 13.12f)
                lineTo(1.46f, 10.29f)
                curveTo(1.07f, 9.9f, 1.07f, 9.27f, 1.46f, 8.88f)
                lineTo(7.34f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 4.1f, 10.0f, 6.0f, 12.0f, 7.25f)
                curveTo(14.0f, 6.0f, 15.0f, 4.1f, 15.0f, 3.0f)
                horizontalLineTo(16.66f)
                lineTo(22.54f, 8.88f)
                curveTo(22.93f, 9.27f, 22.93f, 9.9f, 22.54f, 10.29f)
                lineTo(19.71f, 13.12f)
                curveTo(19.32f, 13.5f, 18.69f, 13.5f, 18.3f, 13.12f)
                lineTo(17.0f, 12.07f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 21.0f)
                moveTo(20.42f, 9.58f)
                lineTo(16.11f, 5.28f)
                curveTo(15.0f, 7.0f, 14.0f, 8.25f, 12.0f, 9.25f)
                curveTo(10.0f, 8.25f, 9.0f, 7.0f, 7.89f, 5.28f)
                lineTo(3.58f, 9.58f)
                lineTo(5.0f, 11.0f)
                lineTo(8.0f, 9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                lineTo(19.0f, 11.0f)
                lineTo(20.42f, 9.58f)
                close()
            }
        }
        .build()
        return _tshirtVOutline!!
    }

private var _tshirtVOutline: ImageVector? = null
