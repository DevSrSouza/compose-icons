package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.EmpireKred: VectorAsset
    get() {
        if (_empireKred != null) {
            return _empireKred!!
        }
        _empireKred = VectorAssetBuilder(name = "EmpireKred", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.996f, 4.685f)
                curveToRelative(0.0f, -2.08f, -1.674f, -3.774f, -3.727f, -3.774f)
                lineTo(3.72f, 0.911f)
                curveTo(1.665f, 0.91f, -0.005f, 2.604f, -0.005f, 4.69f)
                verticalLineToRelative(7.536f)
                curveToRelative(0.0f, 0.336f, 0.045f, 0.667f, 0.135f, 0.997f)
                curveToRelative(0.03f, 0.134f, 0.07f, 0.264f, 0.12f, 0.39f)
                curveToRelative(0.25f, 0.623f, 0.653f, 1.17f, 1.173f, 1.593f)
                curveToRelative(0.51f, 0.524f, 1.17f, 1.095f, 1.965f, 1.71f)
                lineToRelative(0.105f, 0.074f)
                lineToRelative(0.435f, 0.33f)
                lineToRelative(0.52f, 0.397f)
                curveToRelative(1.19f, 0.912f, 3.205f, 2.453f, 6.165f, 4.71f)
                curveToRelative(0.483f, 0.366f, 1.038f, 0.676f, 1.383f, 0.676f)
                curveToRelative(0.343f, 0.0f, 0.902f, -0.31f, 1.383f, -0.676f)
                curveToRelative(2.96f, -2.257f, 4.972f, -3.798f, 6.164f, -4.71f)
                lineToRelative(0.972f, -0.74f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(0.11f, -0.085f)
                curveToRelative(0.798f, -0.612f, 1.463f, -1.19f, 1.968f, -1.71f)
                curveToRelative(0.514f, -0.418f, 0.908f, -0.96f, 1.15f, -1.576f)
                curveToRelative(0.166f, -0.44f, 0.252f, -0.906f, 0.254f, -1.376f)
                verticalLineToRelative(-7.15f)
                horizontalLineToRelative(-0.003f)
                lineToRelative(0.003f, -0.003f)
                verticalLineToRelative(-0.39f)
                close()
                moveTo(19.856f, 10.927f)
                curveToRelative(-0.093f, -0.017f, -0.188f, -0.032f, -0.283f, -0.045f)
                curveToRelative(-0.105f, 0.0f, -0.226f, -0.015f, -0.33f, -0.015f)
                curveToRelative(-0.278f, -0.006f, -0.556f, 0.05f, -0.81f, 0.164f)
                curveToRelative(-0.214f, 0.1f, -0.4f, 0.248f, -0.54f, 0.436f)
                curveToRelative(-0.135f, 0.196f, -0.23f, 0.415f, -0.286f, 0.646f)
                curveToRelative(-0.06f, 0.254f, -0.09f, 0.524f, -0.09f, 0.81f)
                verticalLineToRelative(2.88f)
                lineTo(12.49f, 15.803f)
                lineTo(8.756f, 10.22f)
                lineTo(7.2f, 11.795f)
                verticalLineToRelative(3.975f)
                lineTo(4.48f, 15.77f)
                lineTo(4.48f, 3.4f)
                horizontalLineToRelative(2.716f)
                lineTo(7.196f, 8.53f)
                lineToRelative(4.83f, -5.127f)
                horizontalLineToRelative(3.396f)
                lineToRelative(-4.83f, 4.885f)
                lineToRelative(5.166f, 7.293f)
                lineTo(15.758f, 9.402f)
                horizontalLineToRelative(1.662f)
                verticalLineToRelative(1.182f)
                horizontalLineToRelative(0.023f)
                curveToRelative(0.084f, -0.195f, 0.195f, -0.38f, 0.33f, -0.547f)
                curveToRelative(0.144f, -0.168f, 0.3f, -0.312f, 0.483f, -0.43f)
                curveToRelative(0.18f, -0.106f, 0.375f, -0.21f, 0.58f, -0.27f)
                curveToRelative(0.205f, -0.06f, 0.42f, -0.09f, 0.64f, -0.09f)
                curveToRelative(0.114f, 0.0f, 0.24f, 0.03f, 0.38f, 0.06f)
                verticalLineToRelative(1.62f)
                close()
            }
        }
        .build()
        return _empireKred!!
    }

private var _empireKred: VectorAsset? = null
