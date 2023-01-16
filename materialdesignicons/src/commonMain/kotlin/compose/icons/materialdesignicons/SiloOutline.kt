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

public val MaterialDesignIcons.SiloOutline: ImageVector
    get() {
        if (_siloOutline != null) {
            return _siloOutline!!
        }
        _siloOutline = Builder(name = "SiloOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 2.0f)
                curveTo(11.85f, 2.0f, 14.6f, 4.53f, 14.96f, 7.78f)
                lineTo(22.0f, 12.0f)
                verticalLineTo(14.0f)
                lineTo(20.0f, 12.8f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.6f)
                lineTo(15.0f, 9.8f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 8.5f, 2.0f)
                moveTo(8.5f, 4.0f)
                curveTo(6.54f, 4.0f, 4.87f, 5.25f, 4.26f, 7.0f)
                horizontalLineTo(12.74f)
                curveTo(12.13f, 5.25f, 10.46f, 4.0f, 8.5f, 4.0f)
                moveTo(6.0f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                moveTo(6.0f, 15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                moveTo(6.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _siloOutline!!
    }

private var _siloOutline: ImageVector? = null
