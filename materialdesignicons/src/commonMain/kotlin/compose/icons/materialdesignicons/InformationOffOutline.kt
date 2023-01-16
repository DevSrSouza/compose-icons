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

public val MaterialDesignIcons.InformationOffOutline: ImageVector
    get() {
        if (_informationOffOutline != null) {
            return _informationOffOutline!!
        }
        _informationOffOutline = Builder(name = "InformationOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(4.1f, 6.0f)
                curveTo(2.8f, 7.6f, 2.0f, 9.7f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5f, 6.5f, 22.0f, 12.0f, 22.0f)
                curveTo(14.3f, 22.0f, 16.4f, 21.2f, 18.0f, 19.9f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(12.0f, 20.0f)
                curveTo(7.6f, 20.0f, 4.0f, 16.4f, 4.0f, 12.0f)
                curveTo(4.0f, 10.3f, 4.6f, 8.7f, 5.5f, 7.4f)
                lineTo(11.0f, 12.9f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.9f)
                lineTo(16.6f, 18.5f)
                curveTo(15.3f, 19.4f, 13.7f, 20.0f, 12.0f, 20.0f)
                moveTo(8.2f, 5.0f)
                lineTo(6.7f, 3.5f)
                curveTo(8.3f, 2.6f, 10.1f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                curveTo(22.0f, 13.9f, 21.4f, 15.7f, 20.5f, 17.3f)
                lineTo(19.0f, 15.8f)
                curveTo(19.6f, 14.7f, 20.0f, 13.4f, 20.0f, 12.0f)
                curveTo(20.0f, 7.6f, 16.4f, 4.0f, 12.0f, 4.0f)
                curveTo(10.6f, 4.0f, 9.3f, 4.4f, 8.2f, 5.0f)
                moveTo(11.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _informationOffOutline!!
    }

private var _informationOffOutline: ImageVector? = null
