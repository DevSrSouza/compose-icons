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

public val MaterialDesignIcons.AccountCheckOutline: ImageVector
    get() {
        if (_accountCheckOutline != null) {
            return _accountCheckOutline!!
        }
        _accountCheckOutline = Builder(name = "AccountCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.1f, 12.5f)
                lineTo(22.5f, 13.91f)
                lineTo(15.97f, 20.5f)
                lineTo(12.5f, 17.0f)
                lineTo(13.9f, 15.59f)
                lineTo(15.97f, 17.67f)
                lineTo(21.1f, 12.5f)
                moveTo(11.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 15.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 4.0f)
                moveTo(11.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 6.0f)
                moveTo(11.0f, 13.0f)
                curveTo(11.68f, 13.0f, 12.5f, 13.09f, 13.41f, 13.26f)
                lineTo(11.74f, 14.93f)
                lineTo(11.0f, 14.9f)
                curveTo(8.03f, 14.9f, 4.9f, 16.36f, 4.9f, 17.0f)
                verticalLineTo(18.1f)
                horizontalLineTo(11.1f)
                lineTo(13.0f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                curveTo(3.0f, 14.34f, 8.33f, 13.0f, 11.0f, 13.0f)
                close()
            }
        }
        .build()
        return _accountCheckOutline!!
    }

private var _accountCheckOutline: ImageVector? = null
