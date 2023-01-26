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

public val RoundGroup.MonochromePhotos: ImageVector
    get() {
        if (_monochromePhotos != null) {
            return _monochromePhotos!!
        }
        _monochromePhotos = Builder(name = "MonochromePhotos", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                horizontalLineToRelative(-3.2f)
                lineToRelative(-1.2f, -1.34f)
                curveToRelative(-0.38f, -0.42f, -0.92f, -0.66f, -1.49f, -0.66f)
                lineTo(9.89f, 3.0f)
                curveToRelative(-0.57f, 0.0f, -1.11f, 0.24f, -1.49f, 0.66f)
                lineTo(7.2f, 5.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(22.0f, 7.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 18.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-2.8f, 0.0f, -5.0f, -2.2f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.2f, -5.0f, 5.0f, -5.0f)
                lineTo(12.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(17.0f, 13.0f)
                curveToRelative(0.0f, -2.8f, -2.2f, -5.0f, -5.0f, -5.0f)
                verticalLineToRelative(1.8f)
                curveToRelative(1.8f, 0.0f, 3.2f, 1.4f, 3.2f, 3.2f)
                reflectiveCurveToRelative(-1.4f, 3.2f, -3.2f, 3.2f)
                lineTo(12.0f, 18.0f)
                curveToRelative(2.8f, 0.0f, 5.0f, -2.2f, 5.0f, -5.0f)
                close()
                moveTo(8.8f, 13.0f)
                curveToRelative(0.0f, 1.8f, 1.4f, 3.2f, 3.2f, 3.2f)
                lineTo(12.0f, 9.8f)
                curveToRelative(-1.8f, 0.0f, -3.2f, 1.4f, -3.2f, 3.2f)
                close()
            }
        }
        .build()
        return _monochromePhotos!!
    }

private var _monochromePhotos: ImageVector? = null
