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

public val MaterialDesignIcons.TransferRight: ImageVector
    get() {
        if (_transferRight != null) {
            return _transferRight!!
        }
        _transferRight = Builder(name = "TransferRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                moveTo(7.0f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                moveTo(11.0f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                moveTo(15.0f, 19.25f)
                verticalLineTo(4.75f)
                lineTo(22.25f, 12.0f)
                lineTo(15.0f, 19.25f)
                close()
            }
        }
        .build()
        return _transferRight!!
    }

private var _transferRight: ImageVector? = null
