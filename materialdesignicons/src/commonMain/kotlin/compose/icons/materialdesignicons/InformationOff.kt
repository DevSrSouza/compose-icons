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

public val MaterialDesignIcons.InformationOff: ImageVector
    get() {
        if (_informationOff != null) {
            return _informationOff!!
        }
        _informationOff = Builder(name = "InformationOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(13.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.9f)
                lineTo(13.0f, 14.9f)
                verticalLineTo(17.0f)
                moveTo(11.0f, 7.8f)
                lineTo(6.7f, 3.5f)
                curveTo(8.3f, 2.6f, 10.1f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                curveTo(22.0f, 13.9f, 21.4f, 15.7f, 20.5f, 17.3f)
                lineTo(12.2f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.8f)
                close()
            }
        }
        .build()
        return _informationOff!!
    }

private var _informationOff: ImageVector? = null
