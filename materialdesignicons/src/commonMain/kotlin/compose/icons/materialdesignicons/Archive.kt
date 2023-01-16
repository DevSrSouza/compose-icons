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

public val MaterialDesignIcons.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(name = "Archive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                moveTo(4.0f, 8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                moveTo(9.5f, 11.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 9.0f, 11.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.5f, 11.0f)
                horizontalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _archive!!
    }

private var _archive: ImageVector? = null
