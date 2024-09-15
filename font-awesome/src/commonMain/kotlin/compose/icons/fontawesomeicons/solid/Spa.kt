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

public val SolidGroup.Spa: ImageVector
    get() {
        if (_spa != null) {
            return _spa!!
        }
        _spa = Builder(name = "Spa", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(568.25f, 192.0f)
                curveToRelative(-29.04f, 0.13f, -135.01f, 6.16f, -213.84f, 83.0f)
                curveToRelative(-33.12f, 29.63f, -53.36f, 63.3f, -66.41f, 94.86f)
                curveToRelative(-13.05f, -31.56f, -33.29f, -65.23f, -66.41f, -94.86f)
                curveToRelative(-78.83f, -76.84f, -184.8f, -82.87f, -213.84f, -83.0f)
                curveToRelative(-4.41f, -0.02f, -7.79f, 3.4f, -7.75f, 7.82f)
                curveToRelative(0.23f, 27.92f, 7.14f, 126.14f, 88.77f, 199.3f)
                curveTo(172.79f, 480.94f, 256.0f, 480.0f, 288.0f, 480.0f)
                reflectiveCurveToRelative(115.19f, 0.95f, 199.23f, -80.88f)
                curveToRelative(81.64f, -73.17f, 88.54f, -171.38f, 88.77f, -199.3f)
                curveToRelative(0.04f, -4.42f, -3.34f, -7.84f, -7.75f, -7.82f)
                close()
                moveTo(287.98f, 302.6f)
                curveToRelative(12.82f, -18.85f, 27.6f, -35.78f, 44.09f, -50.52f)
                curveToRelative(19.09f, -18.61f, 39.58f, -33.3f, 60.26f, -45.18f)
                curveToRelative(-16.44f, -70.5f, -51.72f, -133.05f, -96.73f, -172.22f)
                curveToRelative(-4.11f, -3.58f, -11.02f, -3.58f, -15.14f, 0.0f)
                curveToRelative(-44.99f, 39.14f, -80.27f, 101.63f, -96.74f, 172.07f)
                curveToRelative(20.37f, 11.7f, 40.5f, 26.14f, 59.22f, 44.39f)
                arcToRelative(282.77f, 282.77f, 0.0f, false, true, 45.04f, 51.46f)
                close()
            }
        }
        .build()
        return _spa!!
    }

private var _spa: ImageVector? = null
