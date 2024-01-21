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

public val SimpleIcons.Nextra: ImageVector
    get() {
        if (_nextra != null) {
            return _nextra!!
        }
        _nextra = Builder(name = "Nextra", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.68f, 21.031f)
                curveToRelative(-4.98f, -4.98f, -4.98f, -13.083f, 0.0f, -18.063f)
                lineToRelative(0.978f, -0.978f)
                curveToRelative(0.22f, -0.22f, 0.342f, -0.513f, 0.342f, -0.825f)
                curveToRelative(0.0f, -0.311f, -0.122f, -0.604f, -0.342f, -0.824f)
                curveToRelative(-0.44f, -0.441f, -1.207f, -0.44f, -1.648f, 0.0f)
                lineToRelative(-0.979f, 0.978f)
                curveToRelative(-4.98f, 4.98f, -13.084f, 4.98f, -18.063f, 0.0f)
                lineTo(1.99f, 0.34f)
                arcToRelative(1.17f, 1.17f, 0.0f, false, false, -1.649f, 0.0f)
                arcToRelative(1.168f, 1.168f, 0.0f, false, false, 0.0f, 1.649f)
                lineToRelative(0.978f, 0.978f)
                curveToRelative(4.98f, 4.98f, 4.98f, 13.083f, 0.0f, 18.063f)
                lineToRelative(-0.977f, 0.978f)
                curveToRelative(-0.221f, 0.22f, -0.342f, 0.513f, -0.342f, 0.825f)
                curveToRelative(0.0f, 0.31f, 0.121f, 0.604f, 0.341f, 0.824f)
                curveToRelative(0.442f, 0.443f, 1.21f, 0.441f, 1.65f, 0.0f)
                lineToRelative(0.977f, -0.977f)
                curveToRelative(4.98f, -4.983f, 13.083f, -4.98f, 18.064f, 0.0f)
                lineToRelative(0.978f, 0.977f)
                curveToRelative(0.22f, 0.22f, 0.513f, 0.342f, 0.824f, 0.342f)
                curveToRelative(0.312f, 0.0f, 0.605f, -0.122f, 0.824f, -0.342f)
                curveToRelative(0.22f, -0.22f, 0.342f, -0.512f, 0.342f, -0.824f)
                curveToRelative(0.0f, -0.313f, -0.122f, -0.605f, -0.342f, -0.825f)
                lineToRelative(-0.977f, -0.978f)
                close()
            }
        }
        .build()
        return _nextra!!
    }

private var _nextra: ImageVector? = null
