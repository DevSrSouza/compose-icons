package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.OpenFolder: ImageVector
    get() {
        if (_openFolder != null) {
            return _openFolder!!
        }
        _openFolder = Builder(name = "OpenFolder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.7472f, 3.0f)
                lineTo(17.2535f, 3.0017f)
                curveTo(19.2574f, 3.0026f, 20.8939f, 4.5747f, 20.9979f, 6.553f)
                lineTo(21.0032f, 6.7522f)
                verticalLineTo(11.2447f)
                curveTo(21.0032f, 11.6589f, 20.6674f, 11.9947f, 20.2532f, 11.9947f)
                curveTo(19.8735f, 11.9947f, 19.5597f, 11.7126f, 19.51f, 11.3465f)
                lineTo(19.5032f, 11.2447f)
                verticalLineTo(6.7524f)
                curveTo(19.5029f, 5.5615f, 18.5777f, 4.5866f, 17.4071f, 4.5069f)
                lineTo(17.2531f, 4.5017f)
                lineTo(6.7465f, 4.5f)
                curveTo(5.5688f, 4.4991f, 4.6022f, 5.404f, 4.5047f, 6.5569f)
                lineTo(4.4969f, 6.7156f)
                lineTo(4.4995f, 17.2517f)
                curveTo(4.5001f, 18.4426f, 5.4253f, 19.4173f, 6.596f, 19.4969f)
                lineTo(6.75f, 19.5021f)
                horizontalLineTo(11.2463f)
                curveTo(11.6605f, 19.5021f, 11.9963f, 19.8379f, 11.9963f, 20.2521f)
                curveTo(11.9963f, 20.6318f, 11.7142f, 20.9456f, 11.3481f, 20.9952f)
                lineTo(11.2463f, 21.0021f)
                horizontalLineTo(6.7498f)
                curveTo(4.7459f, 21.0015f, 3.1092f, 19.4296f, 3.0048f, 17.4514f)
                lineTo(2.9995f, 17.2522f)
                lineTo(2.9976f, 6.7526f)
                lineTo(3.0018f, 6.5492f)
                curveTo(3.1023f, 4.6365f, 4.6358f, 3.1037f, 6.5481f, 3.005f)
                lineTo(6.7472f, 3.0f)
                close()
                moveTo(9.9408f, 9.0018f)
                lineTo(15.9964f, 9.0012f)
                curveTo(16.5486f, 9.0012f, 16.9964f, 9.4489f, 16.9964f, 10.0012f)
                curveTo(16.9964f, 10.514f, 16.6103f, 10.9367f, 16.113f, 10.9945f)
                lineTo(15.9964f, 11.0012f)
                lineTo(12.4166f, 11.001f)
                lineTo(18.9605f, 17.5428f)
                curveTo(19.321f, 17.9032f, 19.3489f, 18.4704f, 19.0439f, 18.8628f)
                lineTo(18.9608f, 18.957f)
                curveTo(18.6004f, 19.3175f, 18.0331f, 19.3454f, 17.6408f, 19.0404f)
                lineTo(17.5465f, 18.9573f)
                lineTo(10.9986f, 12.412f)
                lineTo(10.9988f, 16.0024f)
                curveTo(10.9988f, 16.5152f, 10.6128f, 16.9379f, 10.1154f, 16.9957f)
                lineTo(9.9988f, 17.0024f)
                curveTo(9.486f, 17.0024f, 9.0633f, 16.6164f, 9.0056f, 16.119f)
                lineTo(8.9988f, 16.0024f)
                verticalLineTo(10.0012f)
                lineTo(9.0023f, 9.9172f)
                lineTo(9.0178f, 9.8116f)
                lineTo(9.0268f, 9.766f)
                lineTo(9.0458f, 9.7002f)
                lineTo(9.0821f, 9.6012f)
                lineTo(9.1459f, 9.4795f)
                curveTo(9.1874f, 9.4115f, 9.2367f, 9.349f, 9.2925f, 9.2933f)
                lineTo(9.4019f, 9.1985f)
                lineTo(9.5236f, 9.1205f)
                lineTo(9.6255f, 9.0725f)
                lineTo(9.7141f, 9.0416f)
                lineTo(9.8254f, 9.0154f)
                lineTo(9.9408f, 9.0018f)
                lineTo(15.9964f, 9.0012f)
                lineTo(9.9408f, 9.0018f)
                close()
            }
        }
        .build()
        return _openFolder!!
    }

private var _openFolder: ImageVector? = null
