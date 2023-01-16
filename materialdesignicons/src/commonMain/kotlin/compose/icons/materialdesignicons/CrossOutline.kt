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

public val MaterialDesignIcons.CrossOutline: ImageVector
    get() {
        if (_crossOutline != null) {
            return _crossOutline!!
        }
        _crossOutline = Builder(name = "CrossOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 6.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(23.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.5f)
                moveTo(19.0f, 11.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _crossOutline!!
    }

private var _crossOutline: ImageVector? = null
