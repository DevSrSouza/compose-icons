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

public val MaterialDesignIcons.HomeOffOutline: ImageVector
    get() {
        if (_homeOffOutline != null) {
            return _homeOffOutline!!
        }
        _homeOffOutline = Builder(name = "HomeOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(6.27f, 8.16f)
                lineTo(2.0f, 12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.11f)
                lineTo(13.0f, 14.89f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(9.0f, 12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.19f)
                lineTo(7.68f, 9.57f)
                lineTo(10.11f, 12.0f)
                horizontalLineTo(9.0f)
                moveTo(15.0f, 18.0f)
                verticalLineTo(16.89f)
                lineTo(16.11f, 18.0f)
                horizontalLineTo(15.0f)
                moveTo(10.36f, 7.16f)
                lineTo(8.95f, 5.75f)
                lineTo(12.0f, 3.0f)
                lineTo(22.0f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.8f)
                lineTo(17.0f, 13.8f)
                verticalLineTo(10.19f)
                lineTo(12.0f, 5.69f)
                lineTo(10.36f, 7.16f)
                close()
            }
        }
        .build()
        return _homeOffOutline!!
    }

private var _homeOffOutline: ImageVector? = null
