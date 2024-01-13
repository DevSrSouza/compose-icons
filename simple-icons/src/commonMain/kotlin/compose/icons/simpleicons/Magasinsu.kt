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

public val SimpleIcons.Magasinsu: ImageVector
    get() {
        if (_magasinsu != null) {
            return _magasinsu!!
        }
        _magasinsu = Builder(name = "Magasinsu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.49f, 7.179f)
                horizontalLineToRelative(-3.51f)
                curveToRelative(-0.642f, 0.0f, -0.73f, 0.26f, -0.73f, 0.654f)
                verticalLineToRelative(5.7f)
                curveToRelative(-0.044f, 1.305f, -0.53f, 1.723f, -1.46f, 1.723f)
                curveToRelative(-0.956f, 0.0f, -1.444f, -0.44f, -1.464f, -1.828f)
                verticalLineTo(7.833f)
                curveToRelative(0.0f, -0.393f, -0.092f, -0.654f, -0.734f, -0.654f)
                horizontalLineToRelative(-3.51f)
                verticalLineToRelative(6.78f)
                curveToRelative(0.0f, 1.5f, 0.29f, 2.134f, 0.912f, 2.778f)
                curveToRelative(0.962f, 1.0f, 2.645f, 1.423f, 4.794f, 1.423f)
                curveToRelative(2.15f, 0.0f, 3.834f, -0.422f, 4.798f, -1.423f)
                curveToRelative(0.62f, -0.644f, 0.911f, -1.278f, 0.911f, -2.778f)
                close()
                moveTo(14.26f, 0.906f)
                curveTo(8.425f, -0.23f, 2.7f, 3.809f, 1.47f, 9.924f)
                curveTo(0.246f, 16.042f, 3.98f, 21.92f, 9.817f, 23.054f)
                curveToRelative(5.84f, 1.132f, 11.565f, -2.905f, 12.792f, -9.02f)
                curveTo(23.834f, 7.917f, 20.1f, 2.038f, 14.261f, 0.904f)
                moveToRelative(-2.465f, 21.384f)
                curveToRelative(-5.664f, 0.0f, -10.253f, -4.582f, -10.253f, -10.234f)
                curveToRelative(0.0f, -5.65f, 4.59f, -10.23f, 10.253f, -10.23f)
                curveToRelative(5.661f, 0.0f, 10.253f, 4.58f, 10.253f, 10.23f)
                curveToRelative(0.0f, 5.652f, -4.592f, 10.234f, -10.253f, 10.234f)
                moveTo(0.026f, 11.136f)
                curveTo(-0.4f, 17.289f, 4.367f, 22.646f, 10.869f, 23.2f)
                curveToRelative(-0.348f, -0.03f, -0.699f, -0.08f, -1.052f, -0.147f)
                curveTo(3.981f, 21.92f, 0.244f, 16.04f, 1.471f, 9.924f)
                curveTo(2.69f, 3.85f, 8.346f, -0.172f, 14.14f, 0.884f)
                curveToRelative(-0.488f, -0.094f, -0.98f, -0.16f, -1.486f, -0.196f)
                curveTo(6.041f, 0.235f, 0.46f, 4.91f, 0.028f, 11.138f)
                moveTo(13.388f, 0.755f)
                arcToRelative(7.678f, 7.678f, 0.0f, false, false, -0.774f, -0.037f)
                arcToRelative(9.913f, 9.913f, 0.0f, false, true, 1.648f, 0.186f)
                curveToRelative(5.836f, 1.134f, 9.573f, 7.01f, 8.346f, 13.128f)
                curveToRelative(-1.228f, 6.114f, -6.953f, 10.153f, -12.79f, 9.02f)
                arcToRelative(10.052f, 10.052f, 0.0f, false, true, -0.767f, -0.182f)
                curveToRelative(0.992f, 0.306f, 2.06f, 0.473f, 3.183f, 0.473f)
                curveToRelative(1.126f, 0.0f, 1.996f, -0.152f, 2.827f, -0.34f)
                curveToRelative(3.604f, -0.816f, 6.523f, -3.342f, 7.98f, -6.506f)
                curveToRelative(0.635f, -1.421f, 0.961f, -2.96f, 0.959f, -4.515f)
                curveToRelative(-0.001f, -6.26f, -4.916f, -10.743f, -10.613f, -11.226f)
            }
        }
        .build()
        return _magasinsu!!
    }

private var _magasinsu: ImageVector? = null
