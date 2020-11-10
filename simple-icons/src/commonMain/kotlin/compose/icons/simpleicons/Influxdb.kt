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

public val SimpleIcons.Influxdb: VectorAsset
    get() {
        if (_influxdb != null) {
            return _influxdb!!
        }
        _influxdb = VectorAssetBuilder(name = "Influxdb", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.775f, 14.443f)
                lineTo(21.482f, 4.5f)
                curveToRelative(-0.128f, -0.536f, -0.621f, -1.093f, -1.178f, -1.243f)
                lineTo(9.868f, 0.043f)
                curveTo(9.739f, 0.0f, 9.589f, 0.0f, 9.418f, 0.0f)
                curveToRelative(-0.45f, 0.0f, -0.9f, 0.171f, -1.222f, 0.45f)
                lineTo(0.718f, 7.414f)
                curveTo(0.31f, 7.78f, 0.096f, 8.507f, 0.225f, 9.021f)
                lineToRelative(2.443f, 10.65f)
                curveToRelative(0.128f, 0.536f, 0.621f, 1.093f, 1.178f, 1.243f)
                lineToRelative(9.772f, 3.043f)
                curveToRelative(0.128f, 0.043f, 0.278f, 0.043f, 0.45f, 0.043f)
                curveToRelative(0.45f, 0.0f, 0.9f, -0.171f, 1.221f, -0.45f)
                lineToRelative(7.993f, -7.436f)
                curveToRelative(0.407f, -0.428f, 0.622f, -1.114f, 0.493f, -1.671f)
                close()
                moveTo(10.961f, 2.4f)
                lineToRelative(7.178f, 2.207f)
                curveToRelative(0.279f, 0.086f, 0.279f, 0.214f, 0.0f, 0.279f)
                lineToRelative(-3.771f, 0.857f)
                curveToRelative(-0.279f, 0.086f, -0.686f, -0.043f, -0.879f, -0.257f)
                lineToRelative(-2.614f, -2.829f)
                curveToRelative(-0.236f, -0.236f, -0.193f, -0.343f, 0.086f, -0.257f)
                close()
                moveTo(15.439f, 15.257f)
                curveToRelative(0.086f, 0.279f, -0.107f, 0.45f, -0.385f, 0.364f)
                lineToRelative(-7.736f, -2.4f)
                curveToRelative(-0.279f, -0.085f, -0.343f, -0.321f, -0.129f, -0.514f)
                lineTo(13.104f, 7.2f)
                curveToRelative(0.214f, -0.214f, 0.45f, -0.129f, 0.514f, 0.15f)
                close()
                moveTo(2.69f, 8.25f)
                lineTo(8.968f, 2.4f)
                curveToRelative(0.214f, -0.214f, 0.536f, -0.171f, 0.75f, 0.021f)
                lineToRelative(3.15f, 3.408f)
                curveToRelative(0.214f, 0.214f, 0.171f, 0.535f, -0.022f, 0.75f)
                lineToRelative(-6.278f, 5.85f)
                curveToRelative(-0.214f, 0.214f, -0.536f, 0.171f, -0.75f, -0.022f)
                lineTo(2.668f, 9.0f)
                curveToRelative(-0.214f, -0.236f, -0.193f, -0.579f, 0.021f, -0.75f)
                close()
                moveTo(4.212f, 17.507f)
                lineToRelative(-1.65f, -7.286f)
                curveToRelative(-0.086f, -0.278f, 0.043f, -0.342f, 0.235f, -0.128f)
                lineToRelative(2.615f, 2.828f)
                curveToRelative(0.214f, 0.215f, 0.278f, 0.622f, 0.214f, 0.9f)
                lineToRelative(-1.136f, 3.686f)
                curveToRelative(-0.085f, 0.3f, -0.214f, 0.3f, -0.278f, 0.0f)
                close()
                moveTo(13.405f, 21.793f)
                lineToRelative(-8.208f, -2.55f)
                arcToRelative(0.555f, 0.555f, 0.0f, false, true, -0.364f, -0.686f)
                lineToRelative(1.372f, -4.414f)
                arcToRelative(0.555f, 0.555f, 0.0f, false, true, 0.685f, -0.364f)
                lineToRelative(8.207f, 2.528f)
                curveToRelative(0.279f, 0.086f, 0.45f, 0.386f, 0.365f, 0.686f)
                lineToRelative(-1.372f, 4.414f)
                arcToRelative(0.598f, 0.598f, 0.0f, false, true, -0.685f, 0.386f)
                close()
                moveTo(20.69f, 15.814f)
                lineToRelative(-5.485f, 5.1f)
                curveToRelative(-0.215f, 0.215f, -0.322f, 0.129f, -0.236f, -0.15f)
                lineToRelative(1.136f, -3.685f)
                curveToRelative(0.085f, -0.279f, 0.385f, -0.579f, 0.685f, -0.622f)
                lineToRelative(3.772f, -0.857f)
                curveToRelative(0.278f, -0.107f, 0.321f, 0.021f, 0.128f, 0.214f)
                close()
                moveTo(21.29f, 14.7f)
                lineToRelative(-4.521f, 1.029f)
                curveToRelative(-0.279f, 0.085f, -0.579f, -0.108f, -0.643f, -0.386f)
                lineToRelative(-1.929f, -8.357f)
                curveToRelative(-0.085f, -0.279f, 0.108f, -0.579f, 0.386f, -0.643f)
                lineToRelative(4.522f, -1.029f)
                curveToRelative(0.278f, -0.085f, 0.578f, 0.107f, 0.642f, 0.386f)
                lineToRelative(1.929f, 8.357f)
                curveToRelative(0.064f, 0.322f, -0.107f, 0.6f, -0.386f, 0.643f)
                close()
            }
        }
        .build()
        return _influxdb!!
    }

private var _influxdb: VectorAsset? = null
