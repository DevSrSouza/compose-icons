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

public val MaterialDesignIcons.FolderQuestion: ImageVector
    get() {
        if (_folderQuestion != null) {
            return _folderQuestion!!
        }
        _folderQuestion = Builder(name = "FolderQuestion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineTo(12.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 20.0f, 22.0f, 19.1f, 22.0f, 18.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f)
                moveTo(16.8f, 18.0f)
                horizontalLineTo(15.3f)
                verticalLineTo(16.5f)
                horizontalLineTo(16.8f)
                verticalLineTo(18.0f)
                moveTo(16.8f, 15.8f)
                horizontalLineTo(15.3f)
                curveTo(15.3f, 13.4f, 17.5f, 13.5f, 17.5f, 12.0f)
                curveTo(17.5f, 11.2f, 16.8f, 10.5f, 16.0f, 10.5f)
                reflectiveCurveTo(14.5f, 11.2f, 14.5f, 12.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 10.3f, 14.3f, 9.0f, 16.0f, 9.0f)
                reflectiveCurveTo(19.0f, 10.3f, 19.0f, 12.0f)
                curveTo(19.0f, 13.9f, 16.8f, 14.1f, 16.8f, 15.8f)
                close()
            }
        }
        .build()
        return _folderQuestion!!
    }

private var _folderQuestion: ImageVector? = null
