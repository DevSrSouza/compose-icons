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

public val FillGroup.Droplet: ImageVector
    get() {
        if (_droplet != null) {
            return _droplet!!
        }
        _droplet = Builder(name = "Droplet", defaultWidth = 24.2.dp, defaultHeight = 24.2.dp,
                viewportWidth = 24.2f, viewportHeight = 24.2f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.1992f, 8.0E-4f)
                lineToRelative(23.9992f, 0.2011f)
                lineToRelative(-0.2011f, 23.9992f)
                lineToRelative(-23.9992f, -0.2011f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.1f)
                arcToRelative(7.4f, 7.4f, 0.0f, false, true, -5.28f, -2.28f)
                arcTo(7.73f, 7.73f, 0.0f, false, true, 6.82f, 8.05f)
                lineTo(11.46f, 3.4f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, true, 0.71f, -0.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.71f, 0.31f)
                lineToRelative(4.56f, 4.72f)
                arcToRelative(7.73f, 7.73f, 0.0f, false, true, -0.09f, 10.77f)
                arcTo(7.33f, 7.33f, 0.0f, false, true, 12.0f, 21.1f)
                close()
            }
        }
        .build()
        return _droplet!!
    }

private var _droplet: ImageVector? = null
