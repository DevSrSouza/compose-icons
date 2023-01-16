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

public val MaterialDesignIcons.ContentSaveEdit: ImageVector
    get() {
        if (_contentSaveEdit != null) {
            return _contentSaveEdit!!
        }
        _contentSaveEdit = Builder(name = "ContentSaveEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 19.0f)
                lineTo(10.14f, 18.86f)
                curveTo(8.9f, 18.5f, 8.0f, 17.36f, 8.0f, 16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 11.0f, 13.0f)
                curveTo(12.36f, 13.0f, 13.5f, 13.9f, 13.86f, 15.14f)
                lineTo(20.0f, 9.0f)
                verticalLineTo(7.0f)
                lineTo(16.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                moveTo(4.0f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                moveTo(20.04f, 12.13f)
                curveTo(19.9f, 12.13f, 19.76f, 12.19f, 19.65f, 12.3f)
                lineTo(18.65f, 13.3f)
                lineTo(20.7f, 15.35f)
                lineTo(21.7f, 14.35f)
                curveTo(21.92f, 14.14f, 21.92f, 13.79f, 21.7f, 13.58f)
                lineTo(20.42f, 12.3f)
                curveTo(20.31f, 12.19f, 20.18f, 12.13f, 20.04f, 12.13f)
                moveTo(18.07f, 13.88f)
                lineTo(12.0f, 19.94f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.06f)
                lineTo(20.12f, 15.93f)
                lineTo(18.07f, 13.88f)
                close()
            }
        }
        .build()
        return _contentSaveEdit!!
    }

private var _contentSaveEdit: ImageVector? = null
