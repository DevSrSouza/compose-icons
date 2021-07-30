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

public val FillGroup.Printer: ImageVector
    get() {
        if (_printer != null) {
            return _printer!!
        }
        _printer = Builder(name = "Printer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(19.36f, 7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(5.0f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, false, -1.83f, -2.0f)
                horizontalLineTo(7.83f)
                arcTo(1.92f, 1.92f, 0.0f, false, false, 6.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.64f)
                arcTo(2.66f, 2.66f, 0.0f, false, false, 2.0f, 9.67f)
                verticalLineToRelative(6.66f)
                arcTo(2.66f, 2.66f, 0.0f, false, false, 4.64f, 19.0f)
                horizontalLineTo(5.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                horizontalLineToRelative(0.86f)
                arcTo(2.66f, 2.66f, 0.0f, false, false, 22.0f, 16.33f)
                verticalLineTo(9.67f)
                arcTo(2.66f, 2.66f, 0.0f, false, false, 19.36f, 7.0f)
                close()
                moveTo(8.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(7.5f, 19.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _printer!!
    }

private var _printer: ImageVector? = null
