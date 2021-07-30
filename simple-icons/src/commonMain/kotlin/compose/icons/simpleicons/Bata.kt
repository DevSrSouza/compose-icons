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

public val SimpleIcons.Bata: ImageVector
    get() {
        if (_bata != null) {
            return _bata!!
        }
        _bata = Builder(name = "Bata", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.397f, 13.003f)
                curveToRelative(0.244f, -1.308f, 1.795f, -1.974f, 2.936f, -1.91f)
                curveToRelative(0.436f, 0.025f, 0.82f, 0.154f, 1.039f, 0.41f)
                curveToRelative(0.09f, -0.09f, 0.18f, -0.192f, 0.269f, -0.282f)
                curveToRelative(0.051f, -0.051f, 0.205f, -0.038f, 0.346f, -0.013f)
                curveToRelative(0.154f, 0.026f, 0.32f, 0.09f, 0.423f, 0.09f)
                curveToRelative(0.103f, 0.0f, 0.36f, -0.077f, 0.603f, -0.115f)
                curveToRelative(0.243f, -0.039f, 0.461f, -0.026f, 0.423f, 0.064f)
                lineToRelative(-0.218f, 0.538f)
                lineToRelative(-0.705f, 1.73f)
                curveToRelative(-0.141f, 0.347f, 0.41f, 0.257f, 1.166f, -0.55f)
                curveToRelative(0.129f, 0.09f, 0.193f, 0.102f, 0.321f, 0.423f)
                curveToRelative(-0.654f, 0.564f, -1.27f, 0.961f, -2.128f, 1.256f)
                curveToRelative(-0.77f, 0.27f, -1.346f, -0.115f, -1.526f, -0.756f)
                curveToRelative(-1.102f, 1.025f, -2.628f, 1.013f, -3.064f, -0.141f)
                curveToRelative(-0.718f, 0.359f, -1.564f, 0.73f, -1.923f, 0.833f)
                curveToRelative(-0.282f, 0.077f, -0.526f, 0.141f, -0.77f, 0.141f)
                curveToRelative(-0.384f, 0.0f, -0.794f, -0.346f, -0.666f, -0.872f)
                curveToRelative(-0.628f, 0.282f, -1.128f, 0.462f, -1.846f, 0.705f)
                curveToRelative(-0.77f, 0.27f, -1.218f, -0.025f, -1.398f, -0.666f)
                curveToRelative(-1.102f, 1.025f, -2.628f, 1.013f, -3.064f, -0.141f)
                curveToRelative(-0.436f, 0.205f, -1.025f, 0.513f, -1.577f, 0.73f)
                curveToRelative(-0.884f, 0.398f, -1.923f, 0.321f, -2.692f, -0.487f)
                lineToRelative(0.257f, -0.397f)
                curveToRelative(0.359f, 0.384f, 0.807f, 0.372f, 1.153f, 0.051f)
                curveToRelative(0.372f, -0.333f, 0.603f, -0.974f, 0.436f, -1.513f)
                curveToRelative(-0.077f, -0.23f, -0.333f, -0.41f, -0.833f, -0.384f)
                lineToRelative(0.154f, -0.41f)
                curveToRelative(0.5f, -0.013f, 0.897f, -0.09f, 1.115f, -0.398f)
                curveToRelative(0.308f, -0.449f, 0.308f, -1.128f, -0.346f, -1.115f)
                arcToRelative(1.34f, 1.34f, 0.0f, false, false, -0.41f, 0.077f)
                curveToRelative(-0.116f, 0.333f, -0.308f, 0.73f, -0.475f, 1.14f)
                curveToRelative(-0.371f, 0.95f, -0.782f, 2.0f, -1.256f, 2.68f)
                curveToRelative(-0.564f, 0.808f, -1.18f, 0.962f, -1.667f, 0.936f)
                curveToRelative(-0.512f, -0.039f, -0.91f, -0.192f, -1.474f, -0.692f)
                curveToRelative(0.0f, -0.218f, 0.013f, -0.308f, 0.064f, -0.577f)
                curveToRelative(0.218f, 0.269f, 0.898f, 0.564f, 1.115f, 0.243f)
                curveToRelative(0.488f, -0.718f, 1.026f, -2.102f, 1.436f, -3.0f)
                curveToRelative(-0.359f, 0.116f, -0.705f, 0.346f, -1.18f, 0.68f)
                curveToRelative(0.0f, -0.051f, -0.153f, -0.18f, -0.153f, -0.334f)
                curveToRelative(0.77f, -0.884f, 2.115f, -1.423f, 3.026f, -1.615f)
                curveToRelative(1.397f, -0.295f, 2.884f, 0.128f, 3.115f, 1.013f)
                curveToRelative(0.154f, 0.59f, -0.538f, 1.14f, -1.192f, 1.218f)
                curveToRelative(0.372f, 0.218f, 0.769f, 0.602f, 0.872f, 1.077f)
                curveToRelative(0.05f, 0.23f, 0.038f, 0.487f, -0.039f, 0.73f)
                curveToRelative(0.218f, -0.102f, 0.487f, -0.23f, 0.654f, -0.307f)
                curveToRelative(0.27f, -1.885f, 3.192f, -2.487f, 3.987f, -1.59f)
                lineToRelative(0.27f, -0.282f)
                curveToRelative(0.05f, -0.051f, 0.204f, -0.038f, 0.346f, -0.013f)
                curveToRelative(0.153f, 0.026f, 0.32f, 0.09f, 0.423f, 0.09f)
                curveToRelative(0.102f, 0.0f, 0.359f, -0.077f, 0.602f, -0.115f)
                curveToRelative(0.244f, -0.039f, 0.462f, -0.026f, 0.423f, 0.064f)
                lineToRelative(-0.91f, 2.269f)
                curveToRelative(-0.205f, 0.513f, 1.308f, -0.398f, 1.397f, -0.449f)
                lineToRelative(0.654f, -1.384f)
                lineToRelative(-0.666f, 0.012f)
                lineToRelative(0.115f, -0.564f)
                horizontalLineToRelative(0.744f)
                curveToRelative(0.128f, -0.166f, 0.153f, -0.359f, 0.32f, -0.474f)
                curveToRelative(0.218f, -0.167f, 0.718f, -0.077f, 0.949f, -0.23f)
                curveToRelative(0.205f, -0.129f, 0.359f, -0.321f, 0.538f, -0.629f)
                curveToRelative(0.154f, -0.256f, 0.744f, -0.192f, 0.628f, 0.051f)
                lineToRelative(-0.512f, 1.295f)
                horizontalLineToRelative(0.653f)
                curveToRelative(0.308f, 0.013f, 0.039f, 0.539f, -0.307f, 0.539f)
                lineToRelative(-0.539f, 0.012f)
                lineToRelative(-0.628f, 1.629f)
                curveToRelative(-0.205f, 0.5f, 0.59f, 0.025f, 1.192f, -0.32f)
                close()
                moveTo(11.385f, 11.888f)
                curveToRelative(-0.077f, -0.244f, -0.282f, -0.308f, -0.475f, -0.295f)
                curveToRelative(-0.436f, 0.051f, -0.859f, 0.538f, -1.077f, 0.872f)
                curveToRelative(-0.346f, 0.538f, -0.269f, 1.346f, 0.295f, 1.192f)
                curveToRelative(0.577f, -0.154f, 1.36f, -1.41f, 1.257f, -1.77f)
                close()
                moveTo(21.051f, 11.888f)
                curveToRelative(-0.077f, -0.244f, -0.282f, -0.308f, -0.474f, -0.295f)
                curveToRelative(-0.436f, 0.051f, -0.86f, 0.538f, -1.077f, 0.872f)
                curveToRelative(-0.346f, 0.538f, -0.27f, 1.346f, 0.295f, 1.192f)
                curveToRelative(0.577f, -0.154f, 1.359f, -1.41f, 1.256f, -1.77f)
                close()
            }
        }
        .build()
        return _bata!!
    }

private var _bata: ImageVector? = null
