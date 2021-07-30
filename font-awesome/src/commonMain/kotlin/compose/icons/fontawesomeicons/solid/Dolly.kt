package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Dolly: ImageVector
    get() {
        if (_dolly != null) {
            return _dolly!!
        }
        _dolly = Builder(name = "Dolly", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(294.2f, 277.7f)
                curveToRelative(18.0f, 5.0f, 34.7f, 13.4f, 49.5f, 24.7f)
                lineToRelative(161.5f, -53.8f)
                curveToRelative(8.4f, -2.8f, 12.9f, -11.9f, 10.1f, -20.2f)
                lineTo(454.9f, 47.2f)
                curveToRelative(-2.8f, -8.4f, -11.9f, -12.9f, -20.2f, -10.1f)
                lineToRelative(-61.1f, 20.4f)
                lineToRelative(33.1f, 99.4f)
                lineTo(346.0f, 177.0f)
                lineToRelative(-33.1f, -99.4f)
                lineToRelative(-61.6f, 20.5f)
                curveToRelative(-8.4f, 2.8f, -12.9f, 11.9f, -10.1f, 20.2f)
                lineToRelative(53.0f, 159.4f)
                close()
                moveTo(575.2f, 326.4f)
                lineTo(565.0f, 296.0f)
                curveToRelative(-2.8f, -8.4f, -11.9f, -12.9f, -20.2f, -10.1f)
                lineToRelative(-213.5f, 71.2f)
                curveToRelative(-17.2f, -22.0f, -43.6f, -36.4f, -73.5f, -37.0f)
                lineTo(158.4f, 21.9f)
                curveTo(154.0f, 8.8f, 141.8f, 0.0f, 128.0f, 0.0f)
                lineTo(16.0f, 0.0f)
                curveTo(7.2f, 0.0f, 0.0f, 7.2f, 0.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(88.9f)
                lineToRelative(92.2f, 276.7f)
                curveToRelative(-26.1f, 20.4f, -41.7f, 53.6f, -36.0f, 90.5f)
                curveToRelative(6.1f, 39.4f, 37.9f, 72.3f, 77.3f, 79.2f)
                curveToRelative(60.2f, 10.7f, 112.3f, -34.8f, 113.4f, -92.6f)
                lineToRelative(213.3f, -71.2f)
                curveToRelative(8.3f, -2.8f, 12.9f, -11.8f, 10.1f, -20.2f)
                close()
                moveTo(256.0f, 464.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _dolly!!
    }

private var _dolly: ImageVector? = null
