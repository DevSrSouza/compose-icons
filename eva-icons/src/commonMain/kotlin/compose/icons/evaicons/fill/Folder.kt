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

public val FillGroup.Folder: ImageVector
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
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
