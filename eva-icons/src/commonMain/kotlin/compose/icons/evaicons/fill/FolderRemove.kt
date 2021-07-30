package compose.icons.evaicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.FillGroup

public val FillGroup.FolderRemove: ImageVector
    get() {
        if (_folderRemove != null) {
            return _folderRemove!!
        }
        _folderRemove = Builder(name = "FolderRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 7.05f)
                horizontalLineToRelative(-7.0f)
                lineTo(9.87f, 3.87f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.1f, 3.5f)
                horizontalLineTo(4.5f)
                arcTo(2.47f, 2.47f, 0.0f, false, false, 2.0f, 5.93f)
                verticalLineTo(18.07f)
                arcTo(2.47f, 2.47f, 0.0f, false, false, 4.5f, 20.5f)
                horizontalLineToRelative(15.0f)
                arcTo(2.47f, 2.47f, 0.0f, false, false, 22.0f, 18.07f)
                verticalLineTo(9.48f)
                arcTo(2.47f, 2.47f, 0.0f, false, false, 19.5f, 7.05f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineTo(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _folderRemove!!
    }

private var _folderRemove: ImageVector? = null
