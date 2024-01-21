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

public val SimpleIcons.Pretzel: ImageVector
    get() {
        if (_pretzel != null) {
            return _pretzel!!
        }
        _pretzel = Builder(name = "Pretzel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.439f, 0.03f)
                lineTo(10.757f, 6.516f)
                arcToRelative(0.305f, 0.305f, 0.0f, false, false, -0.142f, 0.236f)
                verticalLineToRelative(5.426f)
                lineToRelative(2.72f, 1.704f)
                verticalLineToRelative(-5.54f)
                arcToRelative(0.303f, 0.303f, 0.0f, false, true, 0.143f, -0.235f)
                lineToRelative(6.24f, -3.48f)
                arcToRelative(0.286f, 0.286f, 0.0f, false, true, 0.415f, 0.237f)
                verticalLineTo(15.186f)
                arcToRelative(2.807f, 2.807f, 0.0f, false, true, -1.38f, 2.555f)
                arcToRelative(2.827f, 2.827f, 0.0f, false, true, -2.909f, -0.02f)
                lineToRelative(-6.24f, -3.951f)
                lineToRelative(-0.03f, -0.03f)
                arcToRelative(5.569f, 5.569f, 0.0f, false, false, -6.245f, 0.333f)
                arcToRelative(5.524f, 5.524f, 0.0f, false, false, -1.977f, 5.917f)
                arcToRelative(5.462f, 5.462f, 0.0f, false, false, 2.662f, 3.331f)
                arcTo(5.656f, 5.656f, 0.0f, false, false, 6.676f, 24.0f)
                arcToRelative(5.961f, 5.961f, 0.0f, false, false, 1.597f, -0.236f)
                arcToRelative(5.544f, 5.544f, 0.0f, false, false, 3.43f, -2.919f)
                lineToRelative(0.09f, -0.236f)
                lineToRelative(-2.308f, -1.474f)
                lineToRelative(-0.237f, 0.56f)
                arcToRelative(2.792f, 2.792f, 0.0f, false, true, -1.74f, 1.478f)
                arcToRelative(2.836f, 2.836f, 0.0f, false, true, -2.189f, -0.236f)
                arcToRelative(2.738f, 2.738f, 0.0f, false, true, -1.36f, -1.704f)
                curveToRelative(-0.413f, -1.42f, 0.414f, -2.949f, 1.805f, -3.45f)
                curveToRelative(0.294f, -0.105f, 0.604f, -0.153f, 0.916f, -0.142f)
                arcToRelative(2.834f, 2.834f, 0.0f, false, true, 1.449f, 0.413f)
                lineToRelative(6.241f, 3.977f)
                horizontalLineToRelative(0.03f)
                arcToRelative(5.558f, 5.558f, 0.0f, false, false, 2.898f, 0.797f)
                arcToRelative(5.968f, 5.968f, 0.0f, false, false, 1.597f, -0.236f)
                arcToRelative(5.572f, 5.572f, 0.0f, false, false, 2.896f, -2.049f)
                arcToRelative(5.544f, 5.544f, 0.0f, false, false, 1.067f, -3.377f)
                verticalLineTo(0.266f)
                arcTo(0.29f, 0.29f, 0.0f, false, false, 22.576f, 0.0f)
                arcToRelative(0.293f, 0.293f, 0.0f, false, false, -0.137f, 0.03f)
                close()
            }
        }
        .build()
        return _pretzel!!
    }

private var _pretzel: ImageVector? = null
