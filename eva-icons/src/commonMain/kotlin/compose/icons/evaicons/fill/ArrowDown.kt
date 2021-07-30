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

public val FillGroup.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) {
            return _arrowDown!!
        }
        _arrowDown = Builder(name = "ArrowDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 24.0f)
                lineToRelative(0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                lineToRelative(0.0f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, true, -1.33f, -0.64f)
                lineToRelative(-4.21f, -5.1f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 6.2f, 9.05f)
                arcTo(1.76f, 1.76f, 0.0f, false, true, 7.79f, 8.0f)
                horizontalLineToRelative(8.42f)
                arcTo(1.76f, 1.76f, 0.0f, false, true, 17.8f, 9.05f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -0.26f, 2.21f)
                lineToRelative(-4.21f, 5.1f)
                arcTo(1.72f, 1.72f, 0.0f, false, true, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
