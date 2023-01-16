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

public val MaterialDesignIcons.UndoVariant: ImageVector
    get() {
        if (_undoVariant != null) {
            return _undoVariant!!
        }
        _undoVariant = Builder(name = "UndoVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 7.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 20.0f, 13.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 13.5f, 20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.5f)
                curveTo(16.0f, 18.0f, 18.0f, 16.0f, 18.0f, 13.5f)
                curveTo(18.0f, 11.0f, 16.0f, 9.0f, 13.5f, 9.0f)
                horizontalLineTo(7.83f)
                lineTo(10.91f, 12.09f)
                lineTo(9.5f, 13.5f)
                lineTo(4.0f, 8.0f)
                lineTo(9.5f, 2.5f)
                lineTo(10.92f, 3.91f)
                lineTo(7.83f, 7.0f)
                horizontalLineTo(13.5f)
                moveTo(6.0f, 18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _undoVariant!!
    }

private var _undoVariant: ImageVector? = null
