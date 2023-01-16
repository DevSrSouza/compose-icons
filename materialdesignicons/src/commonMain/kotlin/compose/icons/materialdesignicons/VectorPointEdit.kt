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

public val MaterialDesignIcons.VectorPointEdit: ImageVector
    get() {
        if (_vectorPointEdit != null) {
            return _vectorPointEdit!!
        }
        _vectorPointEdit = Builder(name = "VectorPointEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                moveTo(11.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                moveTo(21.2f, 13.0f)
                curveTo(21.1f, 13.0f, 20.9f, 13.1f, 20.8f, 13.2f)
                lineTo(19.8f, 14.2f)
                lineTo(21.9f, 16.3f)
                lineTo(22.9f, 15.3f)
                curveTo(23.1f, 15.1f, 23.1f, 14.7f, 22.9f, 14.5f)
                lineTo(21.6f, 13.2f)
                curveTo(21.4f, 13.1f, 21.3f, 13.0f, 21.2f, 13.0f)
                moveTo(19.1f, 14.8f)
                lineTo(13.0f, 20.9f)
                verticalLineTo(23.0f)
                horizontalLineTo(15.1f)
                lineTo(21.2f, 16.8f)
                lineTo(19.1f, 14.8f)
                close()
            }
        }
        .build()
        return _vectorPointEdit!!
    }

private var _vectorPointEdit: ImageVector? = null
