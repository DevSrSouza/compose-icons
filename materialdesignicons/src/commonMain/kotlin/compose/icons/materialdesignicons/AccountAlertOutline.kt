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

public val MaterialDesignIcons.AccountAlertOutline: ImageVector
    get() {
        if (_accountAlertOutline != null) {
            return _accountAlertOutline!!
        }
        _accountAlertOutline = Builder(name = "AccountAlertOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                moveTo(10.0f, 13.0f)
                curveTo(12.67f, 13.0f, 18.0f, 14.34f, 18.0f, 17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 14.34f, 7.33f, 13.0f, 10.0f, 13.0f)
                moveTo(10.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 14.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 10.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 10.0f, 4.0f)
                moveTo(10.0f, 14.9f)
                curveTo(7.03f, 14.9f, 3.9f, 16.36f, 3.9f, 17.0f)
                verticalLineTo(18.1f)
                horizontalLineTo(16.1f)
                verticalLineTo(17.0f)
                curveTo(16.1f, 16.36f, 12.97f, 14.9f, 10.0f, 14.9f)
                moveTo(10.0f, 5.9f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 7.9f, 8.0f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 10.0f, 10.1f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 12.1f, 8.0f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 10.0f, 5.9f)
                close()
            }
        }
        .build()
        return _accountAlertOutline!!
    }

private var _accountAlertOutline: ImageVector? = null
