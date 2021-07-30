package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Contao: ImageVector
    get() {
        if (_contao != null) {
            return _contao!!
        }
        _contao = Builder(name = "Contao", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(45.4f, 305.0f)
                curveToRelative(14.4f, 67.1f, 26.4f, 129.0f, 68.2f, 175.0f)
                horizontalLineTo(34.0f)
                curveToRelative(-18.7f, 0.0f, -34.0f, -15.2f, -34.0f, -34.0f)
                verticalLineTo(66.0f)
                curveToRelative(0.0f, -18.7f, 15.2f, -34.0f, 34.0f, -34.0f)
                horizontalLineToRelative(57.7f)
                curveTo(77.9f, 44.6f, 65.6f, 59.2f, 54.8f, 75.6f)
                curveToRelative(-45.4f, 70.0f, -27.0f, 146.8f, -9.4f, 229.4f)
                close()
                moveTo(478.0f, 32.0f)
                horizontalLineToRelative(-90.2f)
                curveToRelative(21.4f, 21.4f, 39.2f, 49.5f, 52.7f, 84.1f)
                lineToRelative(-137.1f, 29.3f)
                curveToRelative(-14.9f, -29.0f, -37.8f, -53.3f, -82.6f, -43.9f)
                curveToRelative(-24.6f, 5.3f, -41.0f, 19.3f, -48.3f, 34.6f)
                curveToRelative(-8.8f, 18.7f, -13.2f, 39.8f, 8.2f, 140.3f)
                curveToRelative(21.1f, 100.2f, 33.7f, 117.7f, 49.5f, 131.2f)
                curveToRelative(12.9f, 11.1f, 33.4f, 17.0f, 58.3f, 11.7f)
                curveToRelative(44.5f, -9.4f, 55.7f, -40.7f, 57.4f, -73.2f)
                lineToRelative(137.4f, -29.6f)
                curveToRelative(3.2f, 71.5f, -18.7f, 125.2f, -57.4f, 163.6f)
                horizontalLineTo(478.0f)
                curveToRelative(18.7f, 0.0f, 34.0f, -15.2f, 34.0f, -34.0f)
                verticalLineTo(66.0f)
                curveToRelative(0.0f, -18.8f, -15.2f, -34.0f, -34.0f, -34.0f)
                close()
            }
        }
        .build()
        return _contao!!
    }

private var _contao: ImageVector? = null
