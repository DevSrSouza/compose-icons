package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ShareSquare: ImageVector
    get() {
        if (_shareSquare != null) {
            return _shareSquare!!
        }
        _shareSquare = Builder(name = "ShareSquare", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(568.482f, 177.448f)
                lineTo(424.479f, 313.433f)
                curveTo(409.3f, 327.768f, 384.0f, 317.14f, 384.0f, 295.985f)
                verticalLineToRelative(-71.963f)
                curveToRelative(-144.575f, 0.97f, -205.566f, 35.113f, -164.775f, 171.353f)
                curveToRelative(4.483f, 14.973f, -12.846f, 26.567f, -25.006f, 17.33f)
                curveTo(155.252f, 383.105f, 120.0f, 326.488f, 120.0f, 269.339f)
                curveToRelative(0.0f, -143.937f, 117.599f, -172.5f, 264.0f, -173.312f)
                verticalLineTo(24.012f)
                curveToRelative(0.0f, -21.174f, 25.317f, -31.768f, 40.479f, -17.448f)
                lineToRelative(144.003f, 135.988f)
                curveToRelative(10.02f, 9.463f, 10.028f, 25.425f, 0.0f, 34.896f)
                close()
                moveTo(384.0f, 379.128f)
                verticalLineTo(448.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(128.0f)
                horizontalLineToRelative(50.916f)
                arcToRelative(11.99f, 11.99f, 0.0f, false, false, 8.648f, -3.693f)
                curveToRelative(14.953f, -15.568f, 32.237f, -27.89f, 51.014f, -37.676f)
                curveTo(185.708f, 80.83f, 181.584f, 64.0f, 169.033f, 64.0f)
                horizontalLineTo(48.0f)
                curveTo(21.49f, 64.0f, 0.0f, 85.49f, 0.0f, 112.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                verticalLineToRelative(-88.806f)
                curveToRelative(0.0f, -8.288f, -8.197f, -14.066f, -16.011f, -11.302f)
                arcToRelative(71.83f, 71.83f, 0.0f, false, true, -34.189f, 3.377f)
                curveToRelative(-7.27f, -1.046f, -13.8f, 4.514f, -13.8f, 11.859f)
                close()
            }
        }
        .build()
        return _shareSquare!!
    }

private var _shareSquare: ImageVector? = null
