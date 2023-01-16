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

public val MaterialDesignIcons.CursorText: ImageVector
    get() {
        if (_cursorText != null) {
            return _cursorText!!
        }
        _cursorText = Builder(name = "CursorText", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.5f)
                curveTo(12.95f, 22.0f, 12.0f, 21.55f, 12.0f, 21.0f)
                curveTo(12.0f, 21.55f, 11.05f, 22.0f, 10.5f, 22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.5f)
                curveTo(11.05f, 2.0f, 12.0f, 2.45f, 12.0f, 3.0f)
                curveTo(12.0f, 2.45f, 12.95f, 2.0f, 13.5f, 2.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 5.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
