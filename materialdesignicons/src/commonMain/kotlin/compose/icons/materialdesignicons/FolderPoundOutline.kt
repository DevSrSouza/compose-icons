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

public val MaterialDesignIcons.FolderPoundOutline: ImageVector
    get() {
        if (_folderPoundOutline != null) {
            return _folderPoundOutline!!
        }
        _folderPoundOutline = Builder(name = "FolderPoundOutline", defaultWidth = 24.0.dp,
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
                curveTo(2.89f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 18.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 6.89f, 21.1f, 6.0f, 20.0f, 6.0f)
                moveTo(19.0f, 12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.5f)
                lineTo(18.0f, 9.0f)
                horizontalLineTo(17.0f)
                lineTo(16.5f, 11.0f)
                horizontalLineTo(14.5f)
                lineTo(15.0f, 9.0f)
                horizontalLineTo(14.0f)
                lineTo(13.5f, 11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.25f)
                lineTo(12.75f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.5f)
                lineTo(12.0f, 17.0f)
                horizontalLineTo(13.0f)
                lineTo(13.5f, 15.0f)
                horizontalLineTo(15.5f)
                lineTo(15.0f, 17.0f)
                horizontalLineTo(16.0f)
                lineTo(16.5f, 15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.75f)
                lineTo(17.25f, 12.0f)
                horizontalLineTo(19.0f)
                moveTo(15.75f, 14.0f)
                horizontalLineTo(13.75f)
                lineTo(14.25f, 12.0f)
                horizontalLineTo(16.25f)
                lineTo(15.75f, 14.0f)
                close()
            }
        }
        .build()
        return _folderPoundOutline!!
    }

private var _folderPoundOutline: ImageVector? = null
