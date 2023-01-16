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

public val MaterialDesignIcons.BottleSodaOutline: ImageVector
    get() {
        if (_bottleSodaOutline != null) {
            return _bottleSodaOutline!!
        }
        _bottleSodaOutline = Builder(name = "BottleSodaOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4f, 9.58f)
                curveTo(12.9f, 7.89f, 13.0f, 4.0f, 13.0f, 4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                reflectiveCurveTo(11.1f, 7.89f, 9.6f, 9.58f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 11.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 22.0f)
                horizontalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 20.0f)
                verticalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.4f, 9.58f)
                moveTo(13.0f, 20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                lineTo(11.1f, 10.91f)
                arcTo(6.26f, 6.26f, 0.0f, false, false, 12.0f, 9.5f)
                arcTo(6.26f, 6.26f, 0.0f, false, false, 12.9f, 10.91f)
                lineTo(13.0f, 11.0f)
                close()
            }
        }
        .build()
        return _bottleSodaOutline!!
    }

private var _bottleSodaOutline: ImageVector? = null
