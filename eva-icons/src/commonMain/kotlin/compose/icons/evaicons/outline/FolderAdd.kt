package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.FolderAdd: ImageVector
    get() {
        if (_folderAdd != null) {
            return _folderAdd!!
        }
        _folderAdd = Builder(name = "FolderAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(14.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 7.05f)
                horizontalLineToRelative(-7.0f)
                lineTo(9.87f, 3.87f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.1f, 3.5f)
                lineTo(4.5f, 3.5f)
                arcTo(2.47f, 2.47f, 0.0f, false, false, 2.0f, 5.93f)
                lineTo(2.0f, 18.07f)
                arcTo(2.47f, 2.47f, 0.0f, false, false, 4.5f, 20.5f)
                horizontalLineToRelative(15.0f)
                arcTo(2.47f, 2.47f, 0.0f, false, false, 22.0f, 18.07f)
                lineTo(22.0f, 9.48f)
                arcTo(2.47f, 2.47f, 0.0f, false, false, 19.5f, 7.05f)
                close()
                moveTo(20.0f, 18.05f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, true, -0.5f, 0.43f)
                lineTo(4.5f, 18.48f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, true, -0.5f, -0.43f)
                lineTo(4.0f, 5.93f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, true, 0.5f, -0.43f)
                lineTo(8.63f, 5.5f)
                lineToRelative(2.6f, 3.18f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.77f, 0.37f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, true, 0.5f, 0.43f)
                close()
            }
        }
        .build()
        return _folderAdd!!
    }

private var _folderAdd: ImageVector? = null
