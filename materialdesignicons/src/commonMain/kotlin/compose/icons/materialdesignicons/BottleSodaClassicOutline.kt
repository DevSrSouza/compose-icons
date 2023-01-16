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

public val MaterialDesignIcons.BottleSodaClassicOutline: ImageVector
    get() {
        if (_bottleSodaClassicOutline != null) {
            return _bottleSodaClassicOutline!!
        }
        _bottleSodaClassicOutline = Builder(name = "BottleSodaClassicOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.91f)
                curveTo(10.65f, 5.79f, 9.0f, 7.5f, 8.0f, 9.0f)
                verticalLineTo(13.77f)
                curveTo(9.32f, 14.96f, 9.32f, 17.04f, 8.0f, 18.23f)
                verticalLineTo(20.0f)
                curveTo(8.0f, 21.11f, 8.9f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(15.11f, 22.0f, 16.0f, 21.11f, 16.0f, 20.0f)
                verticalLineTo(18.23f)
                curveTo(14.68f, 17.04f, 14.68f, 14.96f, 16.0f, 13.77f)
                verticalLineTo(9.0f)
                curveTo(15.0f, 7.5f, 13.35f, 5.79f, 13.09f, 4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.0f)
                moveTo(12.0f, 6.5f)
                curveTo(12.24f, 7.0f, 13.54f, 8.5f, 13.9f, 8.91f)
                lineTo(14.0f, 9.0f)
                verticalLineTo(13.0f)
                curveTo(13.35f, 13.87f, 13.0f, 14.92f, 13.0f, 16.0f)
                curveTo(13.0f, 17.08f, 13.35f, 18.13f, 14.0f, 19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                curveTo(10.65f, 18.13f, 11.0f, 17.08f, 11.0f, 16.0f)
                curveTo(11.0f, 14.92f, 10.65f, 13.87f, 10.0f, 13.0f)
                verticalLineTo(9.0f)
                lineTo(10.1f, 8.91f)
                curveTo(10.46f, 8.5f, 11.76f, 7.0f, 12.0f, 6.5f)
                close()
            }
        }
        .build()
        return _bottleSodaClassicOutline!!
    }

private var _bottleSodaClassicOutline: ImageVector? = null
