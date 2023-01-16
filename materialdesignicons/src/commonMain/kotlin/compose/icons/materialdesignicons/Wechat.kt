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

public val MaterialDesignIcons.Wechat: ImageVector
    get() {
        if (_wechat != null) {
            return _wechat!!
        }
        _wechat = Builder(name = "Wechat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 4.0f)
                curveTo(5.36f, 4.0f, 2.0f, 6.69f, 2.0f, 10.0f)
                curveTo(2.0f, 11.89f, 3.08f, 13.56f, 4.78f, 14.66f)
                lineTo(4.0f, 17.0f)
                lineTo(6.5f, 15.5f)
                curveTo(7.39f, 15.81f, 8.37f, 16.0f, 9.41f, 16.0f)
                curveTo(9.15f, 15.37f, 9.0f, 14.7f, 9.0f, 14.0f)
                curveTo(9.0f, 10.69f, 12.13f, 8.0f, 16.0f, 8.0f)
                curveTo(16.19f, 8.0f, 16.38f, 8.0f, 16.56f, 8.03f)
                curveTo(15.54f, 5.69f, 12.78f, 4.0f, 9.5f, 4.0f)
                moveTo(6.5f, 6.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.5f, 7.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.5f, 8.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.5f, 7.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.5f, 6.5f)
                moveTo(11.5f, 6.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.5f, 7.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.5f, 8.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.5f, 7.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.5f, 6.5f)
                moveTo(16.0f, 9.0f)
                curveTo(12.69f, 9.0f, 10.0f, 11.24f, 10.0f, 14.0f)
                curveTo(10.0f, 16.76f, 12.69f, 19.0f, 16.0f, 19.0f)
                curveTo(16.67f, 19.0f, 17.31f, 18.92f, 17.91f, 18.75f)
                lineTo(20.0f, 20.0f)
                lineTo(19.38f, 18.13f)
                curveTo(20.95f, 17.22f, 22.0f, 15.71f, 22.0f, 14.0f)
                curveTo(22.0f, 11.24f, 19.31f, 9.0f, 16.0f, 9.0f)
                moveTo(14.0f, 11.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 12.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 13.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 12.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 11.5f)
                moveTo(18.0f, 11.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 12.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 13.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 12.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 11.5f)
                close()
            }
        }
        .build()
        return _wechat!!
    }

private var _wechat: ImageVector? = null
