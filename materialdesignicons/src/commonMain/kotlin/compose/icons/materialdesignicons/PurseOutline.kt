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

public val MaterialDesignIcons.PurseOutline: ImageVector
    get() {
        if (_purseOutline != null) {
            return _purseOutline!!
        }
        _purseOutline = Builder(name = "PurseOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 11.0f)
                lineTo(20.0f, 19.0f)
                horizontalLineTo(4.0f)
                lineTo(5.0f, 11.0f)
                horizontalLineTo(19.0f)
                moveTo(14.0f, 3.0f)
                horizontalLineTo(10.0f)
                lineTo(8.0f, 5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.7f)
                arcTo(1.65f, 1.65f, 0.0f, false, false, 3.0f, 10.5f)
                lineTo(2.0f, 19.1f)
                arcTo(1.74f, 1.74f, 0.0f, false, false, 3.7f, 21.0f)
                horizontalLineTo(20.3f)
                arcTo(1.74f, 1.74f, 0.0f, false, false, 22.0f, 19.1f)
                lineTo(21.0f, 10.5f)
                arcTo(1.65f, 1.65f, 0.0f, false, false, 19.3f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                lineTo(14.0f, 3.0f)
                moveTo(10.0f, 9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
            }
        }
        .build()
        return _purseOutline!!
    }

private var _purseOutline: ImageVector? = null
