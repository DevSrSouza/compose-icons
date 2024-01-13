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

public val SimpleIcons.Tina: ImageVector
    get() {
        if (_tina != null) {
            return _tina!!
        }
        _tina = Builder(name = "Tina", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.46f, 10.662f)
                curveTo(15.626f, 9.697f, 16.143f, 3.996f, 16.648f, 1.947f)
                curveTo(17.153f, -0.103f, 19.241f, 0.001f, 19.241f, 0.001f)
                curveTo(19.241f, 0.001f, 18.699f, 0.945f, 18.92f, 1.649f)
                curveTo(19.141f, 2.353f, 20.656f, 2.982f, 20.656f, 2.982f)
                lineTo(20.329f, 3.843f)
                curveTo(20.329f, 3.843f, 19.647f, 3.756f, 19.241f, 4.568f)
                curveTo(18.835f, 5.38f, 19.502f, 13.421f, 19.502f, 13.421f)
                curveTo(19.502f, 13.421f, 17.062f, 18.234f, 17.062f, 20.266f)
                curveTo(17.062f, 22.298f, 18.024f, 24.0f, 18.024f, 24.0f)
                lineTo(16.674f, 24.0f)
                curveTo(16.674f, 24.0f, 14.694f, 21.644f, 14.288f, 20.467f)
                curveTo(13.882f, 19.289f, 14.045f, 18.112f, 14.045f, 18.112f)
                curveTo(14.045f, 18.112f, 11.893f, 17.99f, 9.984f, 18.112f)
                curveTo(8.076f, 18.234f, 6.803f, 19.874f, 6.574f, 20.792f)
                curveTo(6.344f, 21.709f, 6.249f, 24.0f, 6.249f, 24.0f)
                lineTo(5.182f, 24.0f)
                curveTo(4.532f, 21.996f, 4.016f, 21.278f, 4.296f, 20.266f)
                curveTo(5.072f, 17.462f, 4.919f, 15.872f, 4.74f, 15.164f)
                curveTo(4.56f, 14.456f, 3.345f, 13.838f, 3.345f, 13.838f)
                curveTo(3.94f, 12.625f, 4.548f, 12.042f, 7.162f, 11.981f)
                curveTo(9.775f, 11.921f, 13.294f, 11.627f, 14.46f, 10.662f)
                close()
                moveTo(9.277f, 18.871f)
                curveTo(9.277f, 18.871f, 9.413f, 22.579f, 10.669f, 24.0f)
                lineTo(9.413f, 24.0f)
                curveTo(7.949f, 22.7f, 7.673f, 20.148f, 7.673f, 20.148f)
                curveTo(7.754f, 19.824f, 8.638f, 19.079f, 9.277f, 18.871f)
                close()
            }
        }
        .build()
        return _tina!!
    }

private var _tina: ImageVector? = null
