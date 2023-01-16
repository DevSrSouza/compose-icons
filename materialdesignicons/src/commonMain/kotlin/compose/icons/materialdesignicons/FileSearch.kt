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

public val MaterialDesignIcons.FileSearch: ImageVector
    get() {
        if (_fileSearch != null) {
            return _fileSearch!!
        }
        _fileSearch = Builder(name = "FileSearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(12.59f, 21.75f, 12.2f, 21.44f, 11.86f, 21.1f)
                curveTo(9.22f, 18.67f, 9.05f, 14.56f, 11.5f, 11.92f)
                curveTo(13.69f, 9.5f, 17.33f, 9.13f, 20.0f, 11.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                moveTo(13.0f, 9.0f)
                verticalLineTo(3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(13.0f)
                moveTo(20.31f, 18.9f)
                curveTo(21.64f, 16.79f, 21.0f, 14.0f, 18.91f, 12.68f)
                curveTo(16.8f, 11.35f, 14.0f, 12.0f, 12.69f, 14.08f)
                curveTo(11.35f, 16.19f, 12.0f, 18.97f, 14.09f, 20.3f)
                curveTo(15.55f, 21.23f, 17.41f, 21.23f, 18.88f, 20.32f)
                lineTo(22.0f, 23.39f)
                lineTo(23.39f, 22.0f)
                lineTo(20.31f, 18.9f)
                moveTo(16.5f, 19.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.5f, 19.0f)
                close()
            }
        }
        .build()
        return _fileSearch!!
    }

private var _fileSearch: ImageVector? = null