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

public val FillGroup.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) {
            return _arrowRight!!
        }
        _arrowRight = Builder(name = "ArrowRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineToRelative(-24.0f, -0.0f)
                lineToRelative(-0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.46f, 18.0f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, true, -0.91f, -0.2f)
                arcTo(1.76f, 1.76f, 0.0f, false, true, 8.5f, 16.21f)
                verticalLineTo(7.79f)
                arcTo(1.76f, 1.76f, 0.0f, false, true, 9.55f, 6.2f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 2.21f, 0.26f)
                lineToRelative(5.1f, 4.21f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, 0.0f, 2.66f)
                lineToRelative(-5.1f, 4.21f)
                arcTo(2.06f, 2.06f, 0.0f, false, true, 10.46f, 18.0f)
                close()
            }
        }
        .build()
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
