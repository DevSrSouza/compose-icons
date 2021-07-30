package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Paw: ImageVector
    get() {
        if (_paw != null) {
            return _paw!!
        }
        _paw = Builder(name = "Paw", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 224.0f)
                curveToRelative(-79.41f, 0.0f, -192.0f, 122.76f, -192.0f, 200.25f)
                curveToRelative(0.0f, 34.9f, 26.81f, 55.75f, 71.74f, 55.75f)
                curveToRelative(48.84f, 0.0f, 81.09f, -25.08f, 120.26f, -25.08f)
                curveToRelative(39.51f, 0.0f, 71.85f, 25.08f, 120.26f, 25.08f)
                curveToRelative(44.93f, 0.0f, 71.74f, -20.85f, 71.74f, -55.75f)
                curveTo(448.0f, 346.76f, 335.41f, 224.0f, 256.0f, 224.0f)
                close()
                moveTo(108.72f, 211.39f)
                curveToRelative(-10.4f, -34.65f, -42.44f, -57.09f, -71.56f, -50.13f)
                curveToRelative(-29.12f, 6.96f, -44.29f, 40.69f, -33.89f, 75.34f)
                curveToRelative(10.4f, 34.65f, 42.44f, 57.09f, 71.56f, 50.13f)
                curveToRelative(29.12f, -6.96f, 44.29f, -40.69f, 33.89f, -75.34f)
                close()
                moveTo(193.44f, 190.61f)
                curveToRelative(30.94f, -8.14f, 46.42f, -49.94f, 34.58f, -93.36f)
                reflectiveCurveToRelative(-46.52f, -72.01f, -77.46f, -63.87f)
                reflectiveCurveToRelative(-46.42f, 49.94f, -34.58f, 93.36f)
                curveToRelative(11.84f, 43.42f, 46.53f, 72.02f, 77.46f, 63.87f)
                close()
                moveTo(474.83f, 161.27f)
                curveToRelative(-29.12f, -6.96f, -61.15f, 15.48f, -71.56f, 50.13f)
                curveToRelative(-10.4f, 34.65f, 4.77f, 68.38f, 33.89f, 75.34f)
                curveToRelative(29.12f, 6.96f, 61.15f, -15.48f, 71.56f, -50.13f)
                curveToRelative(10.4f, -34.65f, -4.77f, -68.38f, -33.89f, -75.34f)
                close()
                moveTo(318.56f, 190.61f)
                curveToRelative(30.94f, 8.14f, 65.62f, -20.45f, 77.46f, -63.87f)
                curveToRelative(11.84f, -43.42f, -3.64f, -85.21f, -34.58f, -93.36f)
                reflectiveCurveToRelative(-65.62f, 20.45f, -77.46f, 63.87f)
                curveToRelative(-11.84f, 43.42f, 3.64f, 85.22f, 34.58f, 93.36f)
                close()
            }
        }
        .build()
        return _paw!!
    }

private var _paw: ImageVector? = null
