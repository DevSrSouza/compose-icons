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

public val OutlineGroup.Maximize: ImageVector
    get() {
        if (_maximize != null) {
            return _maximize!!
        }
        _maximize = Builder(name = "Maximize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(20.71f, 19.29f)
                lineToRelative(-3.4f, -3.39f)
                arcTo(7.92f, 7.92f, 0.0f, false, false, 19.0f, 11.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, 4.9f, -1.69f)
                lineToRelative(3.39f, 3.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.71f, 19.29f)
                close()
                moveTo(5.0f, 11.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.0f, 6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 5.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _maximize!!
    }

private var _maximize: ImageVector? = null
