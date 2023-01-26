package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PanoramaVerticalSelect: ImageVector
    get() {
        if (_panoramaVerticalSelect != null) {
            return _panoramaVerticalSelect!!
        }
        _panoramaVerticalSelect = Builder(name = "PanoramaVerticalSelect", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.49f, 11.99f)
                curveToRelative(0.0f, -5.25f, 1.54f, -9.01f, 1.92f, -10.0f)
                lineToRelative(-16.82f, 0.0f)
                curveToRelative(0.76f, 2.16f, 1.9f, 5.21f, 1.9f, 10.0f)
                curveToRelative(0.0f, 4.78f, -1.17f, 7.91f, -1.9f, 10.0f)
                lineToRelative(16.81f, 0.0f)
                curveTo(19.66f, 19.91f, 18.49f, 16.76f, 18.49f, 11.99f)
                close()
            }
        }
        .build()
        return _panoramaVerticalSelect!!
    }

private var _panoramaVerticalSelect: ImageVector? = null
