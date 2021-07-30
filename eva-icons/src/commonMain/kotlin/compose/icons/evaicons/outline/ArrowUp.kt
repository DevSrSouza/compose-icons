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

public val OutlineGroup.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) {
            return _arrowUp!!
        }
        _arrowUp = Builder(name = "ArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                lineToRelative(-0.0f, 24.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(-0.0f, -24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.21f, 16.0f)
                horizontalLineTo(7.79f)
                arcTo(1.76f, 1.76f, 0.0f, false, true, 6.2f, 15.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 0.26f, -2.21f)
                lineToRelative(4.21f, -5.1f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, true, 2.66f, 0.0f)
                lineToRelative(4.21f, 5.1f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 17.8f, 15.0f)
                arcTo(1.76f, 1.76f, 0.0f, false, true, 16.21f, 16.0f)
                close()
                moveTo(8.0f, 14.0f)
                horizontalLineToRelative(7.9f)
                lineTo(12.0f, 9.18f)
                close()
            }
        }
        .build()
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
