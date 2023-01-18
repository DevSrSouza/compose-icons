package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.AngularjsFill: ImageVector
    get() {
        if (_angularjsFill != null) {
            return _angularjsFill!!
        }
        _angularjsFill = Builder(name = "AngularjsFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineToRelative(9.3f, 3.32f)
                lineToRelative(-1.418f, 12.31f)
                lineTo(12.0f, 22.0f)
                lineToRelative(-7.882f, -4.37f)
                lineTo(2.7f, 5.32f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.21f)
                lineTo(6.186f, 17.26f)
                horizontalLineToRelative(2.168f)
                lineToRelative(1.169f, -2.92f)
                horizontalLineToRelative(4.934f)
                lineToRelative(1.17f, 2.92f)
                horizontalLineToRelative(2.167f)
                lineTo(12.0f, 4.21f)
                close()
                moveTo(13.698f, 12.54f)
                horizontalLineToRelative(-3.396f)
                lineTo(12.0f, 8.45f)
                lineToRelative(1.698f, 4.09f)
                close()
            }
        }
        .build()
        return _angularjsFill!!
    }

private var _angularjsFill: ImageVector? = null
