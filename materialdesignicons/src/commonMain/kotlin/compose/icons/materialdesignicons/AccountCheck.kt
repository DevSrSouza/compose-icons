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

public val MaterialDesignIcons.AccountCheck: ImageVector
    get() {
        if (_accountCheck != null) {
            return _accountCheck!!
        }
        _accountCheck = Builder(name = "AccountCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(10.0f, 17.0f)
                lineTo(13.0f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 15.79f, 6.58f, 14.0f, 11.0f, 14.0f)
                lineTo(12.89f, 14.11f)
                lineTo(10.0f, 17.0f)
                moveTo(11.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 15.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 4.0f)
                close()
            }
        }
        .build()
        return _accountCheck!!
    }

private var _accountCheck: ImageVector? = null
