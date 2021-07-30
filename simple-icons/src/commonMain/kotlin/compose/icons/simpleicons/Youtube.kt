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

public val SimpleIcons.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(name = "Youtube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.498f, 6.186f)
                arcToRelative(3.016f, 3.016f, 0.0f, false, false, -2.122f, -2.136f)
                curveTo(19.505f, 3.545f, 12.0f, 3.545f, 12.0f, 3.545f)
                reflectiveCurveToRelative(-7.505f, 0.0f, -9.377f, 0.505f)
                arcTo(3.017f, 3.017f, 0.0f, false, false, 0.502f, 6.186f)
                curveTo(0.0f, 8.07f, 0.0f, 12.0f, 0.0f, 12.0f)
                reflectiveCurveToRelative(0.0f, 3.93f, 0.502f, 5.814f)
                arcToRelative(3.016f, 3.016f, 0.0f, false, false, 2.122f, 2.136f)
                curveToRelative(1.871f, 0.505f, 9.376f, 0.505f, 9.376f, 0.505f)
                reflectiveCurveToRelative(7.505f, 0.0f, 9.377f, -0.505f)
                arcToRelative(3.015f, 3.015f, 0.0f, false, false, 2.122f, -2.136f)
                curveTo(24.0f, 15.93f, 24.0f, 12.0f, 24.0f, 12.0f)
                reflectiveCurveToRelative(0.0f, -3.93f, -0.502f, -5.814f)
                close()
                moveTo(9.545f, 15.568f)
                verticalLineTo(8.432f)
                lineTo(15.818f, 12.0f)
                lineToRelative(-6.273f, 3.568f)
                close()
            }
        }
        .build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null
