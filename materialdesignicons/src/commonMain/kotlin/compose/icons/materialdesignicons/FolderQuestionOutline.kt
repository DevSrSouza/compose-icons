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

public val MaterialDesignIcons.FolderQuestionOutline: ImageVector
    get() {
        if (_folderQuestionOutline != null) {
            return _folderQuestionOutline!!
        }
        _folderQuestionOutline = Builder(name = "FolderQuestionOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
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
                moveTo(19.0f, 11.7f)
                curveTo(19.0f, 13.4f, 17.0f, 13.5f, 17.0f, 15.0f)
                horizontalLineTo(15.7f)
                curveTo(15.7f, 12.8f, 17.7f, 13.0f, 17.7f, 11.7f)
                curveTo(17.7f, 11.0f, 17.1f, 10.4f, 16.4f, 10.4f)
                curveTo(15.7f, 10.4f, 15.1f, 11.0f, 15.1f, 11.7f)
                horizontalLineTo(13.8f)
                curveTo(13.8f, 10.2f, 15.0f, 9.0f, 16.5f, 9.0f)
                reflectiveCurveTo(19.0f, 10.2f, 19.0f, 11.7f)
                moveTo(17.0f, 15.7f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.7f)
                verticalLineTo(15.7f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _folderQuestionOutline!!
    }

private var _folderQuestionOutline: ImageVector? = null
