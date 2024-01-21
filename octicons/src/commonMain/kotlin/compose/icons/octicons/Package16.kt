package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Package16: ImageVector
    get() {
        if (_package16 != null) {
            return _package16!!
        }
        _package16 = Builder(name = "Package16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.878f, 0.392f)
                lineToRelative(5.25f, 3.045f)
                curveToRelative(0.54f, 0.314f, 0.872f, 0.89f, 0.872f, 1.514f)
                verticalLineToRelative(6.098f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -0.872f, 1.514f)
                lineToRelative(-5.25f, 3.045f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.756f, 0.0f)
                lineToRelative(-5.25f, -3.045f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 11.049f)
                lineTo(1.0f, 4.951f)
                curveToRelative(0.0f, -0.624f, 0.332f, -1.201f, 0.872f, -1.514f)
                lineTo(7.122f, 0.392f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.756f, 0.0f)
                close()
                moveTo(7.875f, 1.69f)
                lineToRelative(-4.63f, 2.685f)
                lineTo(8.0f, 7.133f)
                lineToRelative(4.755f, -2.758f)
                lineToRelative(-4.63f, -2.685f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, false, -0.25f, 0.0f)
                close()
                moveTo(2.5f, 5.677f)
                verticalLineToRelative(5.372f)
                curveToRelative(0.0f, 0.09f, 0.047f, 0.171f, 0.125f, 0.216f)
                lineToRelative(4.625f, 2.683f)
                lineTo(7.25f, 8.432f)
                close()
                moveTo(8.75f, 13.948f)
                lineTo(13.375f, 11.265f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.125f, -0.216f)
                lineTo(13.5f, 5.677f)
                lineTo(8.75f, 8.432f)
                close()
            }
        }
        .build()
        return _package16!!
    }

private var _package16: ImageVector? = null
