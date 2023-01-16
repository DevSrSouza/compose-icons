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

public val MaterialDesignIcons.LampsOutline: ImageVector
    get() {
        if (_lampsOutline != null) {
            return _lampsOutline!!
        }
        _lampsOutline = Builder(name = "LampsOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 4.0f)
                lineTo(9.35f, 7.0f)
                horizontalLineTo(4.65f)
                lineTo(5.5f, 4.0f)
                horizontalLineTo(8.5f)
                moveTo(10.0f, 2.0f)
                horizontalLineTo(4.0f)
                lineTo(2.0f, 9.0f)
                horizontalLineTo(12.0f)
                lineTo(10.0f, 2.0f)
                moveTo(6.0f, 10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                moveTo(18.5f, 10.0f)
                lineTo(19.35f, 13.0f)
                horizontalLineTo(14.65f)
                lineTo(15.5f, 10.0f)
                horizontalLineTo(18.5f)
                moveTo(20.0f, 8.0f)
                horizontalLineTo(14.0f)
                lineTo(12.0f, 15.0f)
                horizontalLineTo(22.0f)
                lineTo(20.0f, 8.0f)
                moveTo(16.0f, 16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _lampsOutline!!
    }

private var _lampsOutline: ImageVector? = null
