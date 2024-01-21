package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Quicklook: ImageVector
    get() {
        if (_quicklook != null) {
            return _quicklook!!
        }
        _quicklook = Builder(name = "Quicklook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.682f, 19.189f)
                lineToRelative(-0.002f, -0.002f)
                lineToRelative(-3.07f, -3.068f)
                arcToRelative(7.027f, 7.027f, 0.0f, false, false, 1.332f, -4.12f)
                arcToRelative(7.068f, 7.068f, 0.0f, false, false, -7.068f, -7.067f)
                lineTo(13.874f, 1.037f)
                arcTo(1.04f, 1.04f, 0.0f, false, false, 12.653f, 0.016f)
                lineTo(1.67f, 1.965f)
                arcToRelative(0.832f, 0.832f, 0.0f, false, false, -0.687f, 0.818f)
                verticalLineToRelative(18.434f)
                curveToRelative(0.0f, 0.403f, 0.29f, 0.748f, 0.687f, 0.818f)
                lineToRelative(10.982f, 1.949f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, 1.22f, -1.022f)
                verticalLineToRelative(-3.894f)
                arcToRelative(7.027f, 7.027f, 0.0f, false, false, 4.12f, -1.332f)
                lineToRelative(3.069f, 3.07f)
                curveToRelative(0.446f, 0.446f, 1.17f, 0.447f, 1.617f, 0.0f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.447f, -0.447f, 0.448f, -1.17f, 0.002f, -1.617f)
                close()
                moveTo(13.874f, 18.569f)
                arcToRelative(6.576f, 6.576f, 0.0f, false, true, -6.569f, -6.57f)
                arcToRelative(6.576f, 6.576f, 0.0f, false, true, 6.569f, -6.567f)
                arcTo(6.576f, 6.576f, 0.0f, false, true, 20.442f, 12.0f)
                arcToRelative(6.576f, 6.576f, 0.0f, false, true, -6.568f, 6.568f)
                close()
                moveTo(19.154f, 11.999f)
                arcToRelative(5.287f, 5.287f, 0.0f, false, true, -5.28f, 5.282f)
                curveToRelative(-2.913f, 0.0f, -5.282f, -2.369f, -5.282f, -5.28f)
                reflectiveCurveToRelative(2.37f, -5.282f, 5.282f, -5.282f)
                arcToRelative(5.287f, 5.287f, 0.0f, false, true, 5.28f, 5.28f)
                close()
            }
        }
        .build()
        return _quicklook!!
    }

private var _quicklook: ImageVector? = null
