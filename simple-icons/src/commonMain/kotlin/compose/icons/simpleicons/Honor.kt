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

public val SimpleIcons.Honor: ImageVector
    get() {
        if (_honor != null) {
            return _honor!!
        }
        _honor = Builder(name = "Honor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.601f, 9.753f)
                verticalLineToRelative(1.823f)
                lineTo(0.807f, 11.576f)
                lineTo(0.807f, 9.753f)
                lineTo(0.0f, 9.753f)
                verticalLineToRelative(4.498f)
                horizontalLineToRelative(0.807f)
                verticalLineToRelative(-1.874f)
                horizontalLineToRelative(1.794f)
                verticalLineToRelative(1.874f)
                horizontalLineToRelative(0.807f)
                lineTo(3.408f, 9.753f)
                horizontalLineToRelative(-0.807f)
                close()
                moveTo(21.272f, 10.554f)
                horizontalLineToRelative(0.898f)
                curveToRelative(0.369f, 0.0f, 0.667f, 0.297f, 0.667f, 0.662f)
                arcToRelative(0.665f, 0.665f, 0.0f, false, true, -0.667f, 0.663f)
                horizontalLineToRelative(-0.898f)
                verticalLineToRelative(-1.325f)
                close()
                moveTo(20.466f, 9.753f)
                verticalLineToRelative(4.498f)
                horizontalLineToRelative(0.806f)
                verticalLineToRelative(-2.002f)
                lineToRelative(1.68f, 2.002f)
                lineTo(24.0f, 14.251f)
                lineToRelative(-1.376f, -1.64f)
                arcToRelative(1.462f, 1.462f, 0.0f, false, false, -0.444f, -2.858f)
                horizontalLineToRelative(-1.716f)
                horizontalLineToRelative(0.002f)
                close()
                moveTo(12.836f, 9.739f)
                verticalLineToRelative(2.807f)
                lineToRelative(-1.959f, -2.807f)
                horizontalLineToRelative(-0.644f)
                verticalLineToRelative(4.498f)
                horizontalLineToRelative(0.807f)
                verticalLineToRelative(-2.82f)
                lineToRelative(1.968f, 2.82f)
                horizontalLineToRelative(0.633f)
                lineTo(13.641f, 9.739f)
                horizontalLineToRelative(-0.805f)
                close()
                moveTo(5.304f, 11.999f)
                curveToRelative(0.0f, -0.832f, 0.68f, -1.506f, 1.517f, -1.506f)
                arcTo(1.51f, 1.51f, 0.0f, false, true, 8.337f, 12.0f)
                curveToRelative(0.0f, 0.832f, -0.679f, 1.506f, -1.516f, 1.506f)
                curveToRelative(-0.403f, 0.0f, -0.789f, -0.159f, -1.073f, -0.441f)
                arcTo(1.504f, 1.504f, 0.0f, false, true, 5.304f, 12.0f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(4.497f, 12.0f)
                curveToRelative(0.0f, 0.933f, 0.566f, 1.774f, 1.434f, 2.132f)
                curveToRelative(0.869f, 0.357f, 1.868f, 0.16f, 2.533f, -0.5f)
                curveToRelative(0.664f, -0.66f, 0.863f, -1.653f, 0.503f, -2.515f)
                arcToRelative(2.324f, 2.324f, 0.0f, false, false, -2.146f, -1.425f)
                arcToRelative(2.316f, 2.316f, 0.0f, false, false, -2.323f, 2.307f)
                lineTo(4.497f, 12.0f)
                close()
                moveTo(15.537f, 11.999f)
                arcToRelative(1.513f, 1.513f, 0.0f, false, true, 1.518f, -1.506f)
                curveToRelative(0.838f, 0.0f, 1.516f, 0.675f, 1.516f, 1.507f)
                arcToRelative(1.513f, 1.513f, 0.0f, false, true, -1.518f, 1.506f)
                curveToRelative(-0.402f, 0.0f, -0.788f, -0.159f, -1.072f, -0.441f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.444f, -1.066f)
                close()
                moveTo(14.73f, 12.0f)
                curveToRelative(0.0f, 0.933f, 0.566f, 1.774f, 1.434f, 2.132f)
                curveToRelative(0.868f, 0.357f, 1.868f, 0.16f, 2.532f, -0.5f)
                curveToRelative(0.665f, -0.66f, 0.864f, -1.653f, 0.504f, -2.515f)
                arcToRelative(2.325f, 2.325f, 0.0f, false, false, -2.147f, -1.425f)
                arcToRelative(2.316f, 2.316f, 0.0f, false, false, -2.323f, 2.307f)
                lineTo(14.73f, 12.0f)
                close()
            }
        }
        .build()
        return _honor!!
    }

private var _honor: ImageVector? = null
