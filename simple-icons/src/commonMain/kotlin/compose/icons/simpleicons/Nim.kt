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

public val SimpleIcons.Nim: ImageVector
    get() {
        if (_nim != null) {
            return _nim!!
        }
        _nim = Builder(name = "Nim", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.095f, 3.2f)
                reflectiveCurveToRelative(-0.92f, 0.778f, -1.857f, 1.55f)
                curveToRelative(-0.964f, -0.032f, -2.856f, 0.199f, -3.88f, 0.598f)
                curveTo(5.412f, 4.708f, 4.582f, 4.0f, 4.582f, 4.0f)
                reflectiveCurveToRelative(-0.709f, 1.305f, -1.154f, 2.07f)
                curveToRelative(-0.662f, 0.377f, -1.325f, 0.8f, -1.917f, 1.36f)
                curveTo(0.824f, 7.14f, 0.026f, 6.782f, 0.0f, 6.77f)
                curveToRelative(0.911f, 1.967f, 1.524f, 3.936f, 3.19f, 5.12f)
                curveToRelative(2.654f, -4.483f, 14.983f, -4.07f, 17.691f, -0.025f)
                curveToRelative(1.75f, -0.977f, 2.43f, -3.078f, 3.119f, -5.018f)
                curveToRelative(-0.075f, 0.026f, -1.012f, 0.362f, -1.619f, 0.61f)
                curveToRelative(-0.363f, -0.423f, -1.217f, -1.072f, -1.702f, -1.385f)
                arcToRelative(96.008f, 96.008f, 0.0f, false, false, -1.131f, -2.122f)
                reflectiveCurveToRelative(-0.794f, 0.632f, -1.715f, 1.322f)
                curveToRelative(-1.243f, -0.246f, -2.747f, -0.544f, -4.012f, -0.47f)
                arcTo(52.988f, 52.988f, 0.0f, false, true, 12.095f, 3.2f)
                close()
                moveTo(0.942f, 10.95f)
                lineToRelative(2.189f, 5.67f)
                curveToRelative(3.801f, 5.367f, 13.508f, 5.74f, 17.74f, 0.105f)
                curveToRelative(1.001f, -2.415f, 2.352f, -5.808f, 2.352f, -5.808f)
                curveToRelative(-1.086f, 1.72f, -2.852f, 2.909f, -3.94f, 3.549f)
                curveToRelative(-0.774f, 0.453f, -2.558f, 0.727f, -2.558f, 0.727f)
                lineToRelative(-4.684f, -2.597f)
                lineToRelative(-4.71f, 2.545f)
                reflectiveCurveToRelative(-1.761f, -0.303f, -2.558f, -0.701f)
                curveToRelative(-1.608f, -0.92f, -2.69f, -2.004f, -3.83f, -3.49f)
                close()
            }
        }
        .build()
        return _nim!!
    }

private var _nim: ImageVector? = null
