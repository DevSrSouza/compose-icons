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

public val MaterialDesignIcons.FileMoveOutline: ImageVector
    get() {
        if (_fileMoveOutline != null) {
            return _fileMoveOutline!!
        }
        _fileMoveOutline = Builder(name = "FileMoveOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 20.41f, 4.12f, 20.8f, 4.34f, 21.12f)
                curveTo(4.41f, 21.23f, 4.5f, 21.33f, 4.59f, 21.41f)
                curveTo(4.95f, 21.78f, 5.45f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(13.53f)
                curveTo(13.0f, 21.42f, 12.61f, 20.75f, 12.35f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                curveTo(18.7f, 12.0f, 19.37f, 12.12f, 20.0f, 12.34f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                moveTo(18.0f, 23.0f)
                lineTo(23.0f, 18.5f)
                lineTo(20.0f, 15.8f)
                lineTo(18.0f, 14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _fileMoveOutline!!
    }

private var _fileMoveOutline: ImageVector? = null
