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

public val MaterialDesignIcons.AccountTieOutline: ImageVector
    get() {
        if (_accountTieOutline != null) {
            return _accountTieOutline!!
        }
        _accountTieOutline = Builder(name = "AccountTieOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.36f, 12.76f)
                curveTo(18.31f, 13.42f, 20.0f, 14.5f, 20.0f, 16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 14.5f, 5.69f, 13.42f, 7.65f, 12.76f)
                lineTo(8.27f, 14.0f)
                lineTo(8.5f, 14.5f)
                curveTo(7.0f, 14.96f, 5.9f, 15.62f, 5.9f, 16.0f)
                verticalLineTo(19.1f)
                horizontalLineTo(10.12f)
                lineTo(11.0f, 14.03f)
                lineTo(10.06f, 12.15f)
                curveTo(10.68f, 12.08f, 11.33f, 12.03f, 12.0f, 12.03f)
                curveTo(12.67f, 12.03f, 13.32f, 12.08f, 13.94f, 12.15f)
                lineTo(13.0f, 14.03f)
                lineTo(13.88f, 19.1f)
                horizontalLineTo(18.1f)
                verticalLineTo(16.0f)
                curveTo(18.1f, 15.62f, 17.0f, 14.96f, 15.5f, 14.5f)
                lineTo(15.73f, 14.0f)
                lineTo(16.36f, 12.76f)
                moveTo(12.0f, 5.0f)
                curveTo(10.9f, 5.0f, 10.0f, 5.9f, 10.0f, 7.0f)
                curveTo(10.0f, 8.1f, 10.9f, 9.0f, 12.0f, 9.0f)
                curveTo(13.1f, 9.0f, 14.0f, 8.1f, 14.0f, 7.0f)
                curveTo(14.0f, 5.9f, 13.1f, 5.0f, 12.0f, 5.0f)
                moveTo(12.0f, 11.0f)
                curveTo(9.79f, 11.0f, 8.0f, 9.21f, 8.0f, 7.0f)
                curveTo(8.0f, 4.79f, 9.79f, 3.0f, 12.0f, 3.0f)
                curveTo(14.21f, 3.0f, 16.0f, 4.79f, 16.0f, 7.0f)
                curveTo(16.0f, 9.21f, 14.21f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _accountTieOutline!!
    }

private var _accountTieOutline: ImageVector? = null
