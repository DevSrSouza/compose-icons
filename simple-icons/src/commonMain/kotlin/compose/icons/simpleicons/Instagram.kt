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

public val SimpleIcons.Instagram: ImageVector
    get() {
        if (_instagram != null) {
            return _instagram!!
        }
        _instagram = Builder(name = "Instagram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(8.74f, 0.0f, 8.333f, 0.015f, 7.053f, 0.072f)
                curveTo(5.775f, 0.132f, 4.905f, 0.333f, 4.14f, 0.63f)
                curveToRelative(-0.789f, 0.306f, -1.459f, 0.717f, -2.126f, 1.384f)
                reflectiveCurveTo(0.935f, 3.35f, 0.63f, 4.14f)
                curveTo(0.333f, 4.905f, 0.131f, 5.775f, 0.072f, 7.053f)
                curveTo(0.012f, 8.333f, 0.0f, 8.74f, 0.0f, 12.0f)
                reflectiveCurveToRelative(0.015f, 3.667f, 0.072f, 4.947f)
                curveToRelative(0.06f, 1.277f, 0.261f, 2.148f, 0.558f, 2.913f)
                curveToRelative(0.306f, 0.788f, 0.717f, 1.459f, 1.384f, 2.126f)
                curveToRelative(0.667f, 0.666f, 1.336f, 1.079f, 2.126f, 1.384f)
                curveToRelative(0.766f, 0.296f, 1.636f, 0.499f, 2.913f, 0.558f)
                curveTo(8.333f, 23.988f, 8.74f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(3.667f, -0.015f, 4.947f, -0.072f)
                curveToRelative(1.277f, -0.06f, 2.148f, -0.262f, 2.913f, -0.558f)
                curveToRelative(0.788f, -0.306f, 1.459f, -0.718f, 2.126f, -1.384f)
                curveToRelative(0.666f, -0.667f, 1.079f, -1.335f, 1.384f, -2.126f)
                curveToRelative(0.296f, -0.765f, 0.499f, -1.636f, 0.558f, -2.913f)
                curveToRelative(0.06f, -1.28f, 0.072f, -1.687f, 0.072f, -4.947f)
                reflectiveCurveToRelative(-0.015f, -3.667f, -0.072f, -4.947f)
                curveToRelative(-0.06f, -1.277f, -0.262f, -2.149f, -0.558f, -2.913f)
                curveToRelative(-0.306f, -0.789f, -0.718f, -1.459f, -1.384f, -2.126f)
                curveTo(21.319f, 1.347f, 20.651f, 0.935f, 19.86f, 0.63f)
                curveToRelative(-0.765f, -0.297f, -1.636f, -0.499f, -2.913f, -0.558f)
                curveTo(15.667f, 0.012f, 15.26f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 2.16f)
                curveToRelative(3.203f, 0.0f, 3.585f, 0.016f, 4.85f, 0.071f)
                curveToRelative(1.17f, 0.055f, 1.805f, 0.249f, 2.227f, 0.415f)
                curveToRelative(0.562f, 0.217f, 0.96f, 0.477f, 1.382f, 0.896f)
                curveToRelative(0.419f, 0.42f, 0.679f, 0.819f, 0.896f, 1.381f)
                curveToRelative(0.164f, 0.422f, 0.36f, 1.057f, 0.413f, 2.227f)
                curveToRelative(0.057f, 1.266f, 0.07f, 1.646f, 0.07f, 4.85f)
                reflectiveCurveToRelative(-0.015f, 3.585f, -0.074f, 4.85f)
                curveToRelative(-0.061f, 1.17f, -0.256f, 1.805f, -0.421f, 2.227f)
                curveToRelative(-0.224f, 0.562f, -0.479f, 0.96f, -0.899f, 1.382f)
                curveToRelative(-0.419f, 0.419f, -0.824f, 0.679f, -1.38f, 0.896f)
                curveToRelative(-0.42f, 0.164f, -1.065f, 0.36f, -2.235f, 0.413f)
                curveToRelative(-1.274f, 0.057f, -1.649f, 0.07f, -4.859f, 0.07f)
                curveToRelative(-3.211f, 0.0f, -3.586f, -0.015f, -4.859f, -0.074f)
                curveToRelative(-1.171f, -0.061f, -1.816f, -0.256f, -2.236f, -0.421f)
                curveToRelative(-0.569f, -0.224f, -0.96f, -0.479f, -1.379f, -0.899f)
                curveToRelative(-0.421f, -0.419f, -0.69f, -0.824f, -0.9f, -1.38f)
                curveToRelative(-0.165f, -0.42f, -0.359f, -1.065f, -0.42f, -2.235f)
                curveToRelative(-0.045f, -1.26f, -0.061f, -1.649f, -0.061f, -4.844f)
                curveToRelative(0.0f, -3.196f, 0.016f, -3.586f, 0.061f, -4.861f)
                curveToRelative(0.061f, -1.17f, 0.255f, -1.814f, 0.42f, -2.234f)
                curveToRelative(0.21f, -0.57f, 0.479f, -0.96f, 0.9f, -1.381f)
                curveToRelative(0.419f, -0.419f, 0.81f, -0.689f, 1.379f, -0.898f)
                curveToRelative(0.42f, -0.166f, 1.051f, -0.361f, 2.221f, -0.421f)
                curveToRelative(1.275f, -0.045f, 1.65f, -0.06f, 4.859f, -0.06f)
                lineToRelative(0.045f, 0.03f)
                close()
                moveTo(12.0f, 5.838f)
                curveToRelative(-3.405f, 0.0f, -6.162f, 2.76f, -6.162f, 6.162f)
                curveToRelative(0.0f, 3.405f, 2.76f, 6.162f, 6.162f, 6.162f)
                curveToRelative(3.405f, 0.0f, 6.162f, -2.76f, 6.162f, -6.162f)
                curveToRelative(0.0f, -3.405f, -2.76f, -6.162f, -6.162f, -6.162f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(19.846f, 5.595f)
                curveToRelative(0.0f, 0.795f, -0.646f, 1.44f, -1.44f, 1.44f)
                curveToRelative(-0.795f, 0.0f, -1.44f, -0.646f, -1.44f, -1.44f)
                curveToRelative(0.0f, -0.794f, 0.646f, -1.439f, 1.44f, -1.439f)
                curveToRelative(0.793f, -0.001f, 1.44f, 0.645f, 1.44f, 1.439f)
                close()
            }
        }
        .build()
        return _instagram!!
    }

private var _instagram: ImageVector? = null
