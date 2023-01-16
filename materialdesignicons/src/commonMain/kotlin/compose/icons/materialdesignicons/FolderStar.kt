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

public val MaterialDesignIcons.FolderStar: ImageVector
    get() {
        if (_folderStar != null) {
            return _folderStar!!
        }
        _folderStar = Builder(name = "FolderStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineTo(12.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 18.0f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 6.0f)
                moveTo(17.94f, 17.0f)
                lineTo(15.0f, 15.28f)
                lineTo(12.06f, 17.0f)
                lineTo(12.84f, 13.67f)
                lineTo(10.25f, 11.43f)
                lineTo(13.66f, 11.14f)
                lineTo(15.0f, 8.0f)
                lineTo(16.34f, 11.14f)
                lineTo(19.75f, 11.43f)
                lineTo(17.16f, 13.67f)
                lineTo(17.94f, 17.0f)
                close()
            }
        }
        .build()
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
