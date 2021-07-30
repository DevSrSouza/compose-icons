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

public val FillGroup.ArrowIosBack: ImageVector
    get() {
        if (_arrowIosBack != null) {
            return _arrowIosBack!!
        }
        _arrowIosBack = Builder(name = "ArrowIosBack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(13.83f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.78f, -0.37f)
                lineToRelative(-4.83f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.27f)
                lineToRelative(5.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.54f, 1.28f)
                lineTo(10.29f, 12.0f)
                lineToRelative(4.32f, 5.36f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.83f, 19.0f)
                close()
            }
        }
        .build()
        return _arrowIosBack!!
    }

private var _arrowIosBack: ImageVector? = null
