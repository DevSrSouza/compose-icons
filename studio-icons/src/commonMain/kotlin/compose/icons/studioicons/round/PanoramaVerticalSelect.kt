package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.PanoramaVerticalSelect: ImageVector
    get() {
        if (_panoramaVerticalSelect != null) {
            return _panoramaVerticalSelect!!
        }
        _panoramaVerticalSelect = Builder(name = "PanoramaVerticalSelect", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 12.0f)
                curveToRelative(0.0f, -3.89f, 0.84f, -6.95f, 1.43f, -8.69f)
                curveTo(20.15f, 2.67f, 19.67f, 2.0f, 18.98f, 2.0f)
                lineTo(5.0f, 2.0f)
                curveTo(4.32f, 2.0f, 3.84f, 2.66f, 4.05f, 3.31f)
                curveTo(4.74f, 5.36f, 5.5f, 8.1f, 5.5f, 12.0f)
                curveToRelative(0.0f, 3.87f, -0.76f, 6.66f, -1.45f, 8.69f)
                curveTo(3.84f, 21.34f, 4.32f, 22.0f, 5.0f, 22.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.68f, 0.0f, 1.17f, -0.66f, 0.95f, -1.31f)
                curveTo(19.27f, 18.66f, 18.5f, 15.86f, 18.5f, 12.0f)
                close()
            }
        }
        .build()
        return _panoramaVerticalSelect!!
    }

private var _panoramaVerticalSelect: ImageVector? = null
