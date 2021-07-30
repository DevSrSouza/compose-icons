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

public val SimpleIcons.Daf: ImageVector
    get() {
        if (_daf != null) {
            return _daf!!
        }
        _daf = Builder(name = "Daf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.649f, 12.782f)
                horizontalLineToRelative(-2.643f)
                lineTo(17.006f, 8.723f)
                lineTo(24.0f, 8.723f)
                verticalLineToRelative(1.183f)
                horizontalLineToRelative(-4.351f)
                verticalLineToRelative(0.723f)
                horizontalLineToRelative(4.277f)
                verticalLineToRelative(1.147f)
                horizontalLineToRelative(-4.277f)
                close()
                moveTo(12.139f, 9.743f)
                lineToRelative(-1.831f, 3.05f)
                lineTo(7.76f, 12.793f)
                lineToRelative(2.414f, -4.07f)
                horizontalLineToRelative(3.924f)
                lineToRelative(2.424f, 4.07f)
                horizontalLineToRelative(-5.364f)
                lineToRelative(0.64f, -1.06f)
                horizontalLineToRelative(1.534f)
                close()
                moveTo(0.004f, 12.785f)
                lineTo(0.004f, 8.741f)
                horizontalLineToRelative(4.99f)
                curveToRelative(1.62f, 0.0f, 2.773f, 0.738f, 2.773f, 1.994f)
                curveToRelative(0.0f, 1.196f, -0.914f, 2.05f, -2.82f, 2.05f)
                close()
                moveTo(4.012f, 11.751f)
                curveToRelative(0.621f, 0.0f, 0.985f, -0.53f, 0.985f, -0.935f)
                curveToRelative(0.0f, -0.413f, -0.325f, -0.896f, -0.967f, -0.896f)
                lineTo(2.671f, 9.92f)
                verticalLineToRelative(1.831f)
                close()
                moveTo(0.0f, 13.731f)
                horizontalLineToRelative(23.926f)
                verticalLineToRelative(1.546f)
                lineTo(0.0f, 15.277f)
                close()
            }
        }
        .build()
        return _daf!!
    }

private var _daf: ImageVector? = null
