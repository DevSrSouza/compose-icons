package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Megaphone16: ImageVector
    get() {
        if (_megaphone16 != null) {
            return _megaphone16!!
        }
        _megaphone16 = Builder(name = "Megaphone16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.25f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                curveToRelative(0.0f, 2.142f, 0.456f, 3.828f, 0.733f, 4.653f)
                arcToRelative(0.122f, 0.122f, 0.0f, false, false, 0.05f, 0.064f)
                arcToRelative(0.212f, 0.212f, 0.0f, false, false, 0.117f, 0.033f)
                horizontalLineToRelative(1.31f)
                curveToRelative(0.085f, 0.0f, 0.18f, -0.042f, 0.258f, -0.152f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, false, 0.075f, -0.366f)
                arcTo(16.743f, 16.743f, 0.0f, false, true, 6.0f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                curveToRelative(0.0f, 1.588f, 0.25f, 2.926f, 0.494f, 3.85f)
                curveToRelative(0.293f, 1.113f, -0.504f, 2.4f, -1.783f, 2.4f)
                horizontalLineTo(4.9f)
                curveToRelative(-0.686f, 0.0f, -1.35f, -0.41f, -1.589f, -1.12f)
                arcTo(16.4f, 16.4f, 0.0f, false, true, 2.5f, 9.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 3.25f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                lineTo(4.0f, 10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                close()
                moveTo(4.0f, 3.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.59f, 0.082f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 16.0f, 0.75f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.189f, 0.608f)
                lineToRelative(-0.002f, -0.001f)
                horizontalLineToRelative(0.001f)
                lineToRelative(-0.014f, -0.01f)
                arcToRelative(5.775f, 5.775f, 0.0f, false, false, -0.422f, -0.25f)
                arcToRelative(10.63f, 10.63f, 0.0f, false, false, -1.469f, -0.64f)
                curveTo(11.576f, 10.484f, 9.536f, 10.0f, 6.75f, 10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                curveToRelative(2.964f, 0.0f, 5.174f, 0.516f, 6.658f, 1.043f)
                curveToRelative(0.423f, 0.151f, 0.787f, 0.302f, 1.092f, 0.443f)
                verticalLineTo(2.014f)
                curveToRelative(-0.305f, 0.14f, -0.669f, 0.292f, -1.092f, 0.443f)
                curveTo(11.924f, 2.984f, 9.713f, 3.5f, 6.75f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                curveToRelative(2.786f, 0.0f, 4.826f, -0.484f, 6.155f, -0.957f)
                curveToRelative(0.665f, -0.236f, 1.154f, -0.47f, 1.47f, -0.64f)
                curveToRelative(0.144f, -0.077f, 0.284f, -0.161f, 0.421f, -0.25f)
                lineToRelative(0.014f, -0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.78f, -0.061f)
                close()
            }
        }
        .build()
        return _megaphone16!!
    }

private var _megaphone16: ImageVector? = null
