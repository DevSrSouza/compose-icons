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

public val MaterialDesignIcons.QrcodeEdit: ImageVector
    get() {
        if (_qrcodeEdit != null) {
            return _qrcodeEdit!!
        }
        _qrcodeEdit = Builder(name = "QrcodeEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                moveTo(1.0f, 1.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(1.0f)
                moveTo(3.0f, 3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                moveTo(5.0f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                moveTo(1.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(13.0f)
                moveTo(3.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                moveTo(13.0f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                moveTo(21.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                moveTo(19.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                moveTo(22.7f, 3.35f)
                lineTo(21.7f, 4.35f)
                lineTo(19.65f, 2.35f)
                lineTo(20.65f, 1.35f)
                curveTo(20.85f, 1.14f, 21.19f, 1.13f, 21.42f, 1.35f)
                lineTo(22.7f, 2.58f)
                curveTo(22.91f, 2.78f, 22.92f, 3.12f, 22.7f, 3.35f)
                moveTo(13.0f, 8.94f)
                lineTo(19.07f, 2.88f)
                lineTo(21.12f, 4.93f)
                lineTo(15.06f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.94f)
                close()
            }
        }
        .build()
        return _qrcodeEdit!!
    }

private var _qrcodeEdit: ImageVector? = null
