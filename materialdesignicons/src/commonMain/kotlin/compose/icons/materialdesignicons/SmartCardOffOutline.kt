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

public val MaterialDesignIcons.SmartCardOffOutline: ImageVector
    get() {
        if (_smartCardOffOutline != null) {
            return _smartCardOffOutline!!
        }
        _smartCardOffOutline = Builder(name = "SmartCardOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                horizontalLineTo(16.2f)
                lineTo(15.0f, 11.8f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                moveTo(22.0f, 3.0f)
                horizontalLineTo(6.2f)
                lineTo(8.2f, 5.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.8f)
                lineTo(23.5f, 20.29f)
                curveTo(23.79f, 19.94f, 24.0f, 19.5f, 24.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.96f, 3.91f, 23.09f, 3.04f, 22.0f, 3.0f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.11f, 21.0f)
                horizontalLineTo(2.0f)
                curveTo(0.911f, 20.96f, 0.036f, 20.09f, 0.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(0.028f, 4.17f, 0.545f, 3.47f, 1.27f, 3.16f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(17.11f, 19.0f)
                lineTo(14.0f, 15.89f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.75f)
                curveTo(4.0f, 14.09f, 7.34f, 13.25f, 9.0f, 13.25f)
                curveTo(9.78f, 13.25f, 10.91f, 13.44f, 11.91f, 13.8f)
                lineTo(9.91f, 11.8f)
                curveTo(9.63f, 11.92f, 9.33f, 12.0f, 9.0f, 12.0f)
                curveTo(7.62f, 12.0f, 6.5f, 10.88f, 6.5f, 9.5f)
                curveTo(6.5f, 9.17f, 6.58f, 8.87f, 6.7f, 8.59f)
                lineTo(3.11f, 5.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.11f)
                close()
            }
        }
        .build()
        return _smartCardOffOutline!!
    }

private var _smartCardOffOutline: ImageVector? = null
