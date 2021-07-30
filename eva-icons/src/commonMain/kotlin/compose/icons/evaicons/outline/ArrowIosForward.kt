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

public val OutlineGroup.ArrowIosForward: ImageVector
    get() {
        if (_arrowIosForward != null) {
            return _arrowIosForward!!
        }
        _arrowIosForward = Builder(name = "ArrowIosForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(10.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.64f, -0.23f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.13f, -1.41f)
                lineTo(13.71f, 12.0f)
                lineTo(9.39f, 6.63f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.15f, -1.41f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 5.37f)
                lineToRelative(4.83f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.27f)
                lineToRelative(-5.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 19.0f)
                close()
            }
        }
        .build()
        return _arrowIosForward!!
    }

private var _arrowIosForward: ImageVector? = null
