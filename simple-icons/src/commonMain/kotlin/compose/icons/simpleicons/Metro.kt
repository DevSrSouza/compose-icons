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

public val SimpleIcons.Metro: ImageVector
    get() {
        if (_metro != null) {
            return _metro!!
        }
        _metro = Builder(name = "Metro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.655f, 0.0f, -1.31f, 0.143f, -1.807f, 0.43f)
                lineToRelative(-7.31f, 4.22f)
                curveToRelative(-0.99f, 0.574f, -1.806f, 1.98f, -1.806f, 3.129f)
                verticalLineToRelative(8.442f)
                curveToRelative(0.0f, 1.14f, 0.813f, 2.555f, 1.805f, 3.128f)
                lineToRelative(7.311f, 4.221f)
                curveToRelative(0.994f, 0.573f, 2.619f, 0.573f, 3.612f, 0.0f)
                lineToRelative(7.311f, -4.22f)
                curveToRelative(0.994f, -0.574f, 1.807f, -1.982f, 1.807f, -3.129f)
                lineTo(22.923f, 7.779f)
                curveToRelative(0.0f, -1.14f, -0.813f, -2.555f, -1.807f, -3.128f)
                lineTo(13.806f, 0.43f)
                curveTo(13.308f, 0.143f, 12.653f, 0.0f, 11.998f, 0.0f)
                close()
                moveTo(12.005f, 2.606f)
                curveToRelative(0.29f, 0.0f, 0.577f, 0.073f, 0.834f, 0.209f)
                lineToRelative(4.718f, 2.724f)
                lineToRelative(-1.76f, 1.067f)
                lineTo(12.0f, 4.414f)
                lineTo(8.21f, 6.602f)
                lineTo(6.448f, 5.534f)
                lineToRelative(4.71f, -2.72f)
                curveToRelative(0.26f, -0.137f, 0.551f, -0.21f, 0.847f, -0.208f)
                close()
                moveTo(19.582f, 6.843f)
                arcToRelative(0.905f, 0.905f, 0.0f, false, true, 0.909f, 0.9f)
                curveToRelative(-0.001f, 2.472f, 0.0f, 5.432f, -0.008f, 8.313f)
                arcToRelative(1.761f, 1.761f, 0.0f, false, true, -0.84f, 1.46f)
                lineToRelative(-6.8f, 3.927f)
                arcToRelative(1.694f, 1.694f, 0.0f, false, true, -0.843f, 0.215f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -0.844f, -0.215f)
                lineToRelative(-6.802f, -3.927f)
                arcToRelative(1.763f, 1.763f, 0.0f, false, true, -0.842f, -1.46f)
                lineTo(3.512f, 7.75f)
                arcToRelative(0.905f, 0.905f, 0.0f, false, true, 1.376f, -0.765f)
                curveTo(7.188f, 8.381f, 9.626f, 9.835f, 12.0f, 11.3f)
                curveToRelative(2.375f, -1.443f, 4.757f, -2.897f, 7.115f, -4.322f)
                arcToRelative(0.895f, 0.895f, 0.0f, false, true, 0.467f, -0.135f)
                close()
                moveTo(5.32f, 9.355f)
                verticalLineToRelative(6.632f)
                lineTo(12.0f, 19.844f)
                lineToRelative(6.682f, -3.857f)
                lineTo(18.682f, 9.355f)
                lineToRelative(-6.213f, 3.773f)
                arcToRelative(0.899f, 0.899f, 0.0f, false, true, -0.937f, 0.0f)
                close()
            }
        }
        .build()
        return _metro!!
    }

private var _metro: ImageVector? = null
