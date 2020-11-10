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

public val SimpleIcons.SuperUser: VectorAsset
    get() {
        if (_superUser != null) {
            return _superUser!!
        }
        _superUser = VectorAssetBuilder(name = "SuperUser", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.863f, 14.479f)
                curveToRelative(-1.48f, 0.421f, -2.489f, 1.287f, -2.489f, 2.716f)
                verticalLineToRelative(4.081f)
                curveToRelative(0.0f, 3.048f, -2.907f, 2.714f, -6.517f, 2.714f)
                horizontalLineToRelative(-0.555f)
                curveToRelative(-0.225f, 0.0f, -0.359f, -0.084f, -0.359f, -0.28f)
                verticalLineToRelative(-1.398f)
                curveToRelative(0.0f, -0.194f, 0.12f, -0.279f, 0.345f, -0.279f)
                horizontalLineToRelative(0.45f)
                curveToRelative(2.16f, 0.0f, 3.675f, 0.475f, 3.675f, -1.26f)
                verticalLineToRelative(-3.917f)
                curveToRelative(0.0f, -1.199f, 0.84f, -2.88f, 2.521f, -3.493f)
                curveToRelative(0.119f, -0.031f, 0.135f, -0.085f, 0.135f, -0.141f)
                reflectiveCurveToRelative(-0.03f, -0.139f, -0.135f, -0.195f)
                curveToRelative(-1.53f, -0.7f, -2.521f, -1.844f, -2.521f, -3.217f)
                lineTo(15.413f, 5.385f)
                curveToRelative(0.0f, -1.707f, -1.5f, -3.412f, -3.659f, -3.412f)
                horizontalLineToRelative(-0.451f)
                curveToRelative(-0.225f, 0.0f, -0.33f, -0.084f, -0.33f, -0.279f)
                lineTo(10.973f, 0.301f)
                curveToRelative(0.0f, -0.195f, 0.15f, -0.281f, 0.375f, -0.281f)
                horizontalLineToRelative(0.556f)
                curveToRelative(3.6f, 0.0f, 6.54f, 2.572f, 6.54f, 5.62f)
                verticalLineToRelative(3.72f)
                curveToRelative(0.0f, 1.409f, 1.004f, 2.22f, 2.52f, 2.744f)
                curveToRelative(0.556f, 0.165f, 0.869f, 0.196f, 0.869f, 0.646f)
                verticalLineToRelative(1.17f)
                curveToRelative(0.03f, 0.256f, -0.239f, 0.375f, -0.914f, 0.57f)
                lineToRelative(-0.056f, -0.011f)
                close()
                moveTo(8.092f, 23.97f)
                horizontalLineToRelative(-5.59f)
                curveToRelative(-0.225f, 0.0f, -0.336f, -0.056f, -0.336f, -0.252f)
                lineTo(2.166f, 0.279f)
                curveToRelative(0.0f, -0.164f, 0.104f, -0.279f, 0.33f, -0.279f)
                lineTo(8.03f, 0.0f)
                curveToRelative(0.226f, 0.0f, 0.36f, 0.084f, 0.36f, 0.279f)
                verticalLineToRelative(1.455f)
                curveToRelative(0.0f, 0.195f, -0.121f, 0.252f, -0.346f, 0.252f)
                lineTo(5.572f, 1.986f)
                curveToRelative(-0.305f, 0.0f, -0.42f, 0.111f, -0.42f, 0.307f)
                verticalLineToRelative(19.41f)
                curveToRelative(0.0f, 0.196f, 0.115f, 0.27f, 0.367f, 0.27f)
                horizontalLineToRelative(2.517f)
                curveToRelative(0.226f, 0.0f, 0.363f, 0.076f, 0.363f, 0.255f)
                verticalLineToRelative(1.484f)
                curveToRelative(0.029f, 0.166f, -0.084f, 0.255f, -0.308f, 0.255f)
                verticalLineToRelative(0.003f)
                close()
                moveTo(12.967f, 10.936f)
                horizontalLineToRelative(-1.485f)
                curveToRelative(-0.362f, 0.0f, -0.642f, -0.281f, -0.642f, -0.59f)
                lineTo(10.84f, 9.003f)
                curveToRelative(0.0f, -0.335f, 0.307f, -0.585f, 0.642f, -0.585f)
                horizontalLineToRelative(1.485f)
                curveToRelative(0.359f, 0.0f, 0.642f, 0.277f, 0.642f, 0.585f)
                verticalLineToRelative(1.343f)
                curveToRelative(0.0f, 0.336f, -0.31f, 0.588f, -0.645f, 0.588f)
                lineToRelative(0.003f, 0.002f)
                close()
            }
        }
        .build()
        return _superUser!!
    }

private var _superUser: VectorAsset? = null
