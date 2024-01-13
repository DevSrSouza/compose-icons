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

public val SimpleIcons.Mantine: ImageVector
    get() {
        if (_mantine != null) {
            return _mantine!!
        }
        _mantine = Builder(name = "Mantine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.377f, 0.0f, 0.0f, 5.377f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.377f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.377f, 12.0f, -12.0f)
                reflectiveCurveTo(18.623f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(10.387f, 6.15f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, true, 0.59f, 0.176f)
                curveToRelative(0.43f, 0.317f, 0.825f, 0.68f, 1.177f, 1.082f)
                horizontalLineToRelative(2.588f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, true, 0.912f, 0.906f)
                arcToRelative(0.909f, 0.909f, 0.0f, false, true, -0.912f, 0.907f)
                horizontalLineToRelative(-1.43f)
                curveToRelative(0.4f, 0.908f, 0.604f, 1.889f, 0.602f, 2.88f)
                arcToRelative(7.133f, 7.133f, 0.0f, false, true, -0.601f, 2.883f)
                horizontalLineToRelative(1.427f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, true, 0.914f, 0.907f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, true, -0.914f, 0.906f)
                horizontalLineToRelative(-2.588f)
                arcToRelative(7.399f, 7.399f, 0.0f, false, true, -1.175f, 1.082f)
                arcToRelative(0.919f, 0.919f, 0.0f, false, true, -1.28f, -0.19f)
                arcToRelative(0.904f, 0.904f, 0.0f, false, true, 0.191f, -1.268f)
                arcToRelative(5.322f, 5.322f, 0.0f, false, false, 2.2f, -4.32f)
                curveToRelative(0.0f, -1.715f, -0.801f, -3.29f, -2.2f, -4.32f)
                arcToRelative(0.906f, 0.906f, 0.0f, false, true, -0.191f, -1.268f)
                lineTo(9.7f, 6.513f)
                arcToRelative(0.916f, 0.916f, 0.0f, false, true, 0.688f, -0.363f)
                close()
                moveTo(9.609f, 10.445f)
                arcToRelative(1.36f, 1.36f, 0.0f, false, true, 1.354f, 1.354f)
                verticalLineToRelative(0.033f)
                arcToRelative(1.36f, 1.36f, 0.0f, false, true, -1.354f, 1.32f)
                arcToRelative(1.36f, 1.36f, 0.0f, false, true, -1.353f, -1.32f)
                verticalLineToRelative(-0.033f)
                arcToRelative(1.36f, 1.36f, 0.0f, false, true, 1.353f, -1.354f)
                close()
            }
        }
        .build()
        return _mantine!!
    }

private var _mantine: ImageVector? = null
