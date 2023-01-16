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

public val MaterialDesignIcons.AccountReactivateOutline: ImageVector
    get() {
        if (_accountReactivateOutline != null) {
            return _accountReactivateOutline!!
        }
        _accountReactivateOutline = Builder(name = "AccountReactivateOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 9.0f)
                horizontalLineTo(16.5f)
                lineTo(18.36f, 7.14f)
                curveTo(16.9f, 5.23f, 14.59f, 4.0f, 12.0f, 4.0f)
                curveTo(7.58f, 4.0f, 4.0f, 7.58f, 4.0f, 12.0f)
                curveTo(4.0f, 13.83f, 4.61f, 15.5f, 5.64f, 16.85f)
                curveTo(6.86f, 15.45f, 9.15f, 14.5f, 12.0f, 14.5f)
                curveTo(14.85f, 14.5f, 17.15f, 15.45f, 18.36f, 16.85f)
                curveTo(19.39f, 15.5f, 20.0f, 13.83f, 20.0f, 12.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 17.5f, 17.5f, 22.0f, 12.0f, 22.0f)
                curveTo(6.5f, 22.0f, 2.0f, 17.5f, 2.0f, 12.0f)
                curveTo(2.0f, 6.5f, 6.5f, 2.0f, 12.0f, 2.0f)
                curveTo(15.14f, 2.0f, 17.95f, 3.45f, 19.78f, 5.72f)
                lineTo(21.5f, 4.0f)
                verticalLineTo(9.0f)
                moveTo(12.0f, 20.0f)
                curveTo(13.9f, 20.0f, 15.64f, 19.34f, 17.0f, 18.24f)
                curveTo(16.36f, 17.23f, 14.45f, 16.5f, 12.0f, 16.5f)
                curveTo(9.55f, 16.5f, 7.64f, 17.23f, 7.0f, 18.24f)
                curveTo(8.36f, 19.34f, 10.1f, 20.0f, 12.0f, 20.0f)
                moveTo(12.0f, 6.0f)
                curveTo(13.93f, 6.0f, 15.5f, 7.57f, 15.5f, 9.5f)
                curveTo(15.5f, 11.43f, 13.93f, 13.0f, 12.0f, 13.0f)
                curveTo(10.07f, 13.0f, 8.5f, 11.43f, 8.5f, 9.5f)
                curveTo(8.5f, 7.57f, 10.07f, 6.0f, 12.0f, 6.0f)
                moveTo(12.0f, 8.0f)
                curveTo(11.17f, 8.0f, 10.5f, 8.67f, 10.5f, 9.5f)
                curveTo(10.5f, 10.33f, 11.17f, 11.0f, 12.0f, 11.0f)
                curveTo(12.83f, 11.0f, 13.5f, 10.33f, 13.5f, 9.5f)
                curveTo(13.5f, 8.67f, 12.83f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _accountReactivateOutline!!
    }

private var _accountReactivateOutline: ImageVector? = null
