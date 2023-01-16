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

public val MaterialDesignIcons.Trello: ImageVector
    get() {
        if (_trello != null) {
            return _trello!!
        }
        _trello = Builder(name = "Trello", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 2.0f)
                horizontalLineTo(4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.0f, 4.5f)
                verticalLineTo(19.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.5f, 22.0f)
                horizontalLineTo(19.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 22.0f, 19.5f)
                verticalLineTo(4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.5f, 2.0f)
                moveTo(10.7f, 17.2f)
                arcTo(1.2f, 1.2f, 0.0f, false, true, 9.5f, 18.4f)
                horizontalLineTo(5.8f)
                curveTo(5.14f, 18.4f, 4.6f, 17.86f, 4.6f, 17.2f)
                verticalLineTo(5.8f)
                arcTo(1.2f, 1.2f, 0.0f, false, true, 5.8f, 4.6f)
                horizontalLineTo(9.5f)
                curveTo(10.16f, 4.6f, 10.7f, 5.14f, 10.7f, 5.8f)
                verticalLineTo(17.2f)
                moveTo(19.4f, 12.2f)
                curveTo(19.4f, 12.86f, 18.86f, 13.4f, 18.2f, 13.4f)
                horizontalLineTo(14.5f)
                curveTo(13.84f, 13.4f, 13.3f, 12.86f, 13.3f, 12.2f)
                verticalLineTo(5.8f)
                curveTo(13.3f, 5.14f, 13.84f, 4.6f, 14.5f, 4.6f)
                horizontalLineTo(18.2f)
                curveTo(18.86f, 4.6f, 19.4f, 5.14f, 19.4f, 5.8f)
                verticalLineTo(12.2f)
                close()
            }
        }
        .build()
        return _trello!!
    }

private var _trello: ImageVector? = null
