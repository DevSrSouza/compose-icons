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

public val MaterialDesignIcons.FolderPound: ImageVector
    get() {
        if (_folderPound != null) {
            return _folderPound!!
        }
        _folderPound = Builder(name = "FolderPound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.25f, 13.0f)
                horizontalLineTo(17.25f)
                lineTo(16.75f, 15.0f)
                horizontalLineTo(14.75f)
                lineTo(15.25f, 13.0f)
                moveTo(22.0f, 8.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 20.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.89f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 8.0f)
                moveTo(20.0f, 12.0f)
                horizontalLineTo(18.5f)
                lineTo(19.0f, 10.0f)
                horizontalLineTo(18.0f)
                lineTo(17.5f, 12.0f)
                horizontalLineTo(15.5f)
                lineTo(16.0f, 10.0f)
                horizontalLineTo(15.0f)
                lineTo(14.5f, 12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.25f)
                lineTo(13.75f, 15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.5f)
                lineTo(13.0f, 18.0f)
                horizontalLineTo(14.0f)
                lineTo(14.5f, 16.0f)
                horizontalLineTo(16.5f)
                lineTo(16.0f, 18.0f)
                horizontalLineTo(17.0f)
                lineTo(17.5f, 16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.75f)
                lineTo(18.25f, 13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _folderPound!!
    }

private var _folderPound: ImageVector? = null
