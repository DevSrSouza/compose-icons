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

public val MaterialDesignIcons.FolderStarMultiple: ImageVector
    get() {
        if (_folderStarMultiple != null) {
            return _folderStarMultiple!!
        }
        _folderStarMultiple = Builder(name = "FolderStarMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(20.0f)
                curveTo(0.0f, 21.11f, 0.895f, 22.0f, 2.0f, 22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                moveTo(22.0f, 4.0f)
                horizontalLineTo(14.0f)
                lineTo(12.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.89f, 4.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 17.1f, 4.89f, 18.0f, 6.0f, 18.0f)
                horizontalLineTo(22.0f)
                curveTo(23.11f, 18.0f, 24.0f, 17.1f, 24.0f, 16.0f)
                verticalLineTo(6.0f)
                curveTo(24.0f, 4.89f, 23.11f, 4.0f, 22.0f, 4.0f)
                moveTo(19.94f, 15.0f)
                lineTo(17.0f, 13.27f)
                lineTo(14.06f, 15.0f)
                lineTo(14.84f, 11.66f)
                lineTo(12.25f, 9.42f)
                lineTo(15.66f, 9.13f)
                lineTo(17.0f, 6.0f)
                lineTo(18.34f, 9.13f)
                lineTo(21.75f, 9.42f)
                lineTo(19.16f, 11.66f)
                lineTo(19.94f, 15.0f)
                close()
            }
        }
        .build()
        return _folderStarMultiple!!
    }

private var _folderStarMultiple: ImageVector? = null
