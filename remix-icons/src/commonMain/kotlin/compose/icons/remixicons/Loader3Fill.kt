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

public val RemixIcons.Loader3Fill: ImageVector
    get() {
        if (_loader3Fill != null) {
            return _loader3Fill!!
        }
        _loader3Fill = Builder(name = "Loader3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.055f, 13.0f)
                lineTo(5.07f, 13.0f)
                arcToRelative(7.002f, 7.002f, 0.0f, false, false, 13.858f, 0.0f)
                horizontalLineToRelative(2.016f)
                arcToRelative(9.001f, 9.001f, 0.0f, false, true, -17.89f, 0.0f)
                close()
                moveTo(3.055f, 11.0f)
                arcToRelative(9.001f, 9.001f, 0.0f, false, true, 17.89f, 0.0f)
                lineTo(18.93f, 11.0f)
                arcToRelative(7.002f, 7.002f, 0.0f, false, false, -13.858f, 0.0f)
                lineTo(3.055f, 11.0f)
                close()
            }
        }
        .build()
        return _loader3Fill!!
    }

private var _loader3Fill: ImageVector? = null
