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

public val SimpleIcons.Emberdotjs: ImageVector
    get() {
        if (_emberdotjs != null) {
            return _emberdotjs!!
        }
        _emberdotjs = Builder(name = "Emberdotjs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(12.29f, 4.38f)
                curveToRelative(1.66f, -0.03f, 2.83f, 0.42f, 3.84f, 1.85f)
                curveToRelative(2.25f, 5.58f, -6.0f, 8.4f, -6.0f, 8.4f)
                reflectiveCurveToRelative(-0.23f, 1.48f, 2.02f, 1.42f)
                curveToRelative(2.78f, 0.0f, 5.7f, -2.15f, 6.81f, -3.06f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, true, 0.9f, 0.05f)
                lineToRelative(0.84f, 0.87f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, true, 0.01f, 0.9f)
                curveToRelative(-0.72f, 0.8f, -2.42f, 2.46f, -4.97f, 3.53f)
                curveToRelative(0.0f, 0.0f, -4.26f, 1.97f, -7.13f, 0.1f)
                arcToRelative(4.95f, 4.95f, 0.0f, false, true, -2.38f, -3.83f)
                reflectiveCurveToRelative(-2.08f, -0.11f, -3.42f, -0.63f)
                curveToRelative(-1.33f, -0.52f, 0.01f, -2.1f, 0.01f, -2.1f)
                reflectiveCurveToRelative(0.42f, -0.65f, 1.2f, 0.0f)
                reflectiveCurveToRelative(2.24f, 0.36f, 2.24f, 0.36f)
                curveToRelative(0.13f, -1.03f, 0.35f, -2.38f, 0.98f, -3.81f)
                curveToRelative(1.34f, -3.0f, 3.38f, -4.01f, 5.05f, -4.05f)
                close()
                moveTo(12.62f, 7.18f)
                curveToRelative(-1.1f, 0.07f, -2.8f, 1.78f, -2.88f, 4.93f)
                curveToRelative(0.0f, 0.0f, 0.75f, 0.23f, 2.41f, -0.91f)
                curveToRelative(1.67f, -1.14f, 2.0f, -2.97f, 1.11f, -3.81f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, false, -0.64f, -0.21f)
                close()
            }
        }
        .build()
        return _emberdotjs!!
    }

private var _emberdotjs: ImageVector? = null
