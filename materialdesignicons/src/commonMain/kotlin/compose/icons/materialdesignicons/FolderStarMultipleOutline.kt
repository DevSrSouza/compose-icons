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

public val MaterialDesignIcons.FolderStarMultipleOutline: ImageVector
    get() {
        if (_folderStarMultipleOutline != null) {
            return _folderStarMultipleOutline!!
        }
        _folderStarMultipleOutline = Builder(name = "FolderStarMultipleOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                curveTo(0.895f, 22.0f, 0.0f, 21.11f, 0.0f, 20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.0f)
                moveTo(12.78f, 10.05f)
                lineTo(15.81f, 9.79f)
                lineTo(17.0f, 7.0f)
                lineTo(18.19f, 9.79f)
                lineTo(21.22f, 10.05f)
                lineTo(18.92f, 12.04f)
                lineTo(19.61f, 15.0f)
                lineTo(17.0f, 13.47f)
                lineTo(14.39f, 15.0f)
                lineTo(15.08f, 12.04f)
                lineTo(12.78f, 10.05f)
                moveTo(24.0f, 6.0f)
                verticalLineTo(16.0f)
                curveTo(24.0f, 17.11f, 23.11f, 18.0f, 22.0f, 18.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 18.0f, 4.0f, 17.11f, 4.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.89f, 4.9f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(12.0f)
                lineTo(14.0f, 4.0f)
                horizontalLineTo(22.0f)
                curveTo(23.11f, 4.0f, 24.0f, 4.9f, 24.0f, 6.0f)
                moveTo(22.0f, 6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _folderStarMultipleOutline!!
    }

private var _folderStarMultipleOutline: ImageVector? = null
