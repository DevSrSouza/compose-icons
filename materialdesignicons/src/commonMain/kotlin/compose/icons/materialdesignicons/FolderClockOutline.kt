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

public val MaterialDesignIcons.FolderClockOutline: ImageVector
    get() {
        if (_folderClockOutline != null) {
            return _folderClockOutline!!
        }
        _folderClockOutline = Builder(name = "FolderClockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15.0f, 17.0f)
                verticalLineTo(12.0f)
                moveTo(19.0f, 8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.29f)
                curveTo(9.1f, 17.37f, 9.0f, 16.7f, 9.0f, 16.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 16.0f, 9.0f)
                curveTo(17.07f, 9.0f, 18.09f, 9.24f, 19.0f, 9.67f)
                verticalLineTo(8.0f)
                moveTo(3.0f, 20.0f)
                curveTo(1.89f, 20.0f, 1.0f, 19.1f, 1.0f, 18.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 4.0f)
                horizontalLineTo(9.0f)
                lineTo(11.0f, 6.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 8.0f)
                verticalLineTo(11.1f)
                curveTo(22.24f, 12.36f, 23.0f, 14.09f, 23.0f, 16.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 16.0f, 23.0f)
                curveTo(13.62f, 23.0f, 11.5f, 21.81f, 10.25f, 20.0f)
                horizontalLineTo(3.0f)
                moveTo(16.0f, 11.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 11.0f, 16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 16.0f, 21.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 21.0f, 16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 16.0f, 11.0f)
                close()
            }
        }
        .build()
        return _folderClockOutline!!
    }

private var _folderClockOutline: ImageVector? = null
