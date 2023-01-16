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

public val MaterialDesignIcons.AccountRemove: ImageVector
    get() {
        if (_accountRemove != null) {
            return _accountRemove!!
        }
        _accountRemove = Builder(name = "AccountRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                curveTo(17.67f, 14.0f, 23.0f, 15.33f, 23.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                curveTo(7.0f, 15.33f, 12.33f, 14.0f, 15.0f, 14.0f)
                moveTo(15.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 15.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 19.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 15.0f, 12.0f)
                moveTo(5.0f, 9.59f)
                lineTo(7.12f, 7.46f)
                lineTo(8.54f, 8.88f)
                lineTo(6.41f, 11.0f)
                lineTo(8.54f, 13.12f)
                lineTo(7.12f, 14.54f)
                lineTo(5.0f, 12.41f)
                lineTo(2.88f, 14.54f)
                lineTo(1.46f, 13.12f)
                lineTo(3.59f, 11.0f)
                lineTo(1.46f, 8.88f)
                lineTo(2.88f, 7.46f)
                lineTo(5.0f, 9.59f)
                close()
            }
        }
        .build()
        return _accountRemove!!
    }

private var _accountRemove: ImageVector? = null
