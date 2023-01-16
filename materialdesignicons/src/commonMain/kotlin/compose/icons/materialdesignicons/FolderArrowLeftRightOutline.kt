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

public val MaterialDesignIcons.FolderArrowLeftRightOutline: ImageVector
    get() {
        if (_folderArrowLeftRightOutline != null) {
            return _folderArrowLeftRightOutline!!
        }
        _folderArrowLeftRightOutline = Builder(name = "FolderArrowLeftRightOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 19.34f, 13.04f, 19.67f, 13.09f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.11f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.89f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 6.0f, 22.0f, 6.89f, 22.0f, 8.0f)
                verticalLineTo(13.81f)
                curveTo(21.39f, 13.46f, 20.72f, 13.22f, 20.0f, 13.09f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 18.33f, 13.0f, 18.66f, 13.0f, 19.0f)
                moveTo(23.0f, 17.0f)
                lineTo(20.0f, 14.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.5f)
                lineTo(23.0f, 17.0f)
                moveTo(18.0f, 18.5f)
                lineTo(15.0f, 21.0f)
                lineTo(18.0f, 23.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _folderArrowLeftRightOutline!!
    }

private var _folderArrowLeftRightOutline: ImageVector? = null
