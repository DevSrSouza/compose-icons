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

public val MaterialDesignIcons.MonitorArrowDownVariant: ImageVector
    get() {
        if (_monitorArrowDownVariant != null) {
            return _monitorArrowDownVariant!!
        }
        _monitorArrowDownVariant = Builder(name = "MonitorArrowDownVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.0f)
                lineTo(22.0f, 9.0f)
                lineTo(20.6f, 7.6f)
                lineTo(18.0f, 10.2f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.2f)
                lineTo(13.4f, 7.6f)
                lineTo(12.0f, 9.0f)
                lineTo(17.0f, 14.0f)
                moveTo(23.0f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(23.0f, 17.1f, 22.1f, 18.0f, 21.0f, 18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 18.0f, 1.0f, 17.1f, 1.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(1.0f, 2.9f, 1.9f, 2.0f, 3.0f, 2.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _monitorArrowDownVariant!!
    }

private var _monitorArrowDownVariant: ImageVector? = null
