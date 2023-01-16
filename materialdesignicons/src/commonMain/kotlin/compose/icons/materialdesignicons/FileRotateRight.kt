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

public val MaterialDesignIcons.FileRotateRight: ImageVector
    get() {
        if (_fileRotateRight != null) {
            return _fileRotateRight!!
        }
        _fileRotateRight = Builder(name = "FileRotateRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 20.0f)
                curveTo(3.9f, 20.0f, 3.0f, 19.11f, 3.0f, 18.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 7.9f, 3.9f, 7.0f, 5.0f, 7.0f)
                horizontalLineTo(9.0f)
                lineTo(13.0f, 11.0f)
                verticalLineTo(18.0f)
                curveTo(13.0f, 19.11f, 12.11f, 20.0f, 11.0f, 20.0f)
                horizontalLineTo(5.0f)
                moveTo(11.0f, 11.83f)
                lineTo(8.17f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.83f)
                moveTo(20.0f, 11.0f)
                horizontalLineTo(23.0f)
                lineTo(19.0f, 15.0f)
                lineTo(15.0f, 11.0f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 7.69f, 15.31f, 5.0f, 12.0f, 5.0f)
                lineTo(11.0f, 5.08f)
                verticalLineTo(3.06f)
                lineTo(12.0f, 3.0f)
                curveTo(16.42f, 3.0f, 20.0f, 6.58f, 20.0f, 11.0f)
            }
        }
        .build()
        return _fileRotateRight!!
    }

private var _fileRotateRight: ImageVector? = null
