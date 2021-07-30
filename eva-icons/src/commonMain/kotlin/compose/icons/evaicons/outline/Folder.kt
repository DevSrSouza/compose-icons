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

public val OutlineGroup.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(19.5f, 20.5f)
                horizontalLineTo(4.5f)
                arcTo(2.47f, 2.47f, 0.0f, false, true, 2.0f, 18.07f)
                verticalLineTo(5.93f)
                arcTo(2.47f, 2.47f, 0.0f, false, true, 4.5f, 3.5f)
                horizontalLineTo(9.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.77f, 0.37f)
                lineToRelative(2.6f, 3.18f)
                horizontalLineToRelative(7.0f)
                arcTo(2.47f, 2.47f, 0.0f, false, true, 22.0f, 9.48f)
                verticalLineToRelative(8.59f)
                arcTo(2.47f, 2.47f, 0.0f, false, true, 19.5f, 20.5f)
                close()
                moveTo(4.0f, 13.76f)
                verticalLineToRelative(4.31f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, false, 0.5f, 0.43f)
                horizontalLineToRelative(15.0f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, false, 0.5f, -0.43f)
                verticalLineTo(9.48f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, false, -0.5f, -0.43f)
                horizontalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.77f, -0.37f)
                lineTo(8.63f, 5.5f)
                horizontalLineTo(4.5f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, false, -0.5f, 0.43f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
