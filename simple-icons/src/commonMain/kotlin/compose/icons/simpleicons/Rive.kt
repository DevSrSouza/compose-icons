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

public val SimpleIcons.Rive: ImageVector
    get() {
        if (_rive != null) {
            return _rive!!
        }
        _rive = Builder(name = "Rive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.643f, 1.475f)
                curveToRelative(0.0f, 0.814f, 0.668f, 1.475f, 1.49f, 1.475f)
                horizontalLineTo(14.49f)
                curveToRelative(1.408f, 0.0f, 2.568f, 0.43f, 3.48f, 1.29f)
                curveToRelative(0.91f, 0.861f, 1.366f, 1.967f, 1.366f, 3.32f)
                curveToRelative(0.0f, 1.25f, -0.456f, 2.274f, -1.367f, 3.072f)
                curveToRelative(-0.911f, 0.78f, -2.07f, 1.168f, -3.479f, 1.168f)
                horizontalLineTo(9.12f)
                curveToRelative(-0.824f, 0.0f, -1.491f, 0.66f, -1.491f, 1.475f)
                curveToRelative(0.0f, 0.815f, 0.667f, 1.475f, 1.491f, 1.475f)
                horizontalLineToRelative(5.93f)
                lineToRelative(5.342f, 8.482f)
                curveToRelative(0.332f, 0.512f, 0.797f, 0.768f, 1.398f, 0.768f)
                curveToRelative(0.663f, 0.0f, 1.129f, -0.256f, 1.398f, -0.768f)
                curveToRelative(0.269f, -0.533f, 0.217f, -1.096f, -0.155f, -1.69f)
                lineToRelative(-4.753f, -7.56f)
                curveToRelative(1.284f, -0.574f, 2.299f, -1.414f, 3.044f, -2.52f)
                curveToRelative(0.746f, -1.127f, 1.119f, -2.427f, 1.119f, -3.902f)
                curveToRelative(0.0f, -1.496f, -0.342f, -2.807f, -1.026f, -3.934f)
                curveToRelative(-0.662f, -1.127f, -1.594f, -2.008f, -2.795f, -2.643f)
                curveTo(17.42f, 0.327f, 16.044f, 0.0f, 14.49f, 0.0f)
                horizontalLineTo(2.134f)
                curveTo(1.311f, 0.0f, 0.643f, 0.66f, 0.643f, 1.475f)
                close()
            }
        }
        .build()
        return _rive!!
    }

private var _rive: ImageVector? = null
