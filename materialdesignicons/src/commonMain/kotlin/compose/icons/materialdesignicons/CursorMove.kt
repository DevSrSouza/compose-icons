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

public val MaterialDesignIcons.CursorMove: ImageVector
    get() {
        if (_cursorMove != null) {
            return _cursorMove!!
        }
        _cursorMove = Builder(name = "CursorMove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.75f)
                lineTo(22.25f, 12.0f)
                lineTo(18.0f, 16.25f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.25f)
                lineTo(12.0f, 22.25f)
                lineTo(7.75f, 18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.25f)
                lineTo(1.75f, 12.0f)
                lineTo(6.0f, 7.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.75f)
                lineTo(12.0f, 1.75f)
                lineTo(16.25f, 6.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _cursorMove!!
    }

private var _cursorMove: ImageVector? = null
