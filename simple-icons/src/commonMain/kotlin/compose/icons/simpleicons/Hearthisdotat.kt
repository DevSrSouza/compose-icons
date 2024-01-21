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

public val SimpleIcons.Hearthisdotat: ImageVector
    get() {
        if (_hearthisdotat != null) {
            return _hearthisdotat!!
        }
        _hearthisdotat = Builder(name = "Hearthisdotat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.485f, 3.515f)
                curveTo(15.799f, -1.17f, 8.2f, -1.17f, 3.515f, 3.515f)
                curveToRelative(-4.687f, 4.686f, -4.687f, 12.285f, 0.0f, 16.97f)
                curveToRelative(4.685f, 4.686f, 12.284f, 4.686f, 16.97f, 0.0f)
                curveToRelative(4.687f, -4.685f, 4.687f, -12.284f, 0.0f, -16.97f)
                close()
                moveTo(14.675f, 17.948f)
                curveToRelative(-0.252f, 0.252f, -1.25f, 0.562f, -1.25f, -0.012f)
                curveToRelative(0.0f, -0.573f, -0.157f, -3.089f, -2.028f, -4.958f)
                curveToRelative(-1.88f, -1.88f, -4.55f, -2.192f, -5.056f, -2.192f)
                curveToRelative(-0.506f, 0.0f, -0.331f, -1.0f, -0.078f, -1.252f)
                curveToRelative(0.253f, -0.253f, 0.558f, -0.15f, 1.064f, -0.15f)
                curveToRelative(0.0f, 0.0f, 3.445f, 0.464f, 5.326f, 2.345f)
                curveToRelative(1.868f, 1.869f, 2.173f, 5.153f, 2.173f, 5.153f)
                curveToRelative(0.0f, 0.463f, 0.102f, 0.813f, -0.15f, 1.066f)
                close()
                moveTo(18.697f, 17.439f)
                curveToRelative(-0.36f, 0.36f, -1.786f, 0.803f, -1.786f, -0.015f)
                curveToRelative(0.0f, -0.82f, -0.224f, -4.41f, -2.893f, -7.079f)
                curveTo(11.335f, 7.662f, 7.524f, 7.217f, 6.8f, 7.217f)
                curveToRelative(-0.723f, 0.0f, -0.473f, -1.426f, -0.113f, -1.787f)
                curveToRelative(0.361f, -0.36f, 0.799f, -0.214f, 1.52f, -0.214f)
                curveToRelative(0.0f, 0.0f, 4.918f, 0.663f, 7.603f, 3.348f)
                curveToRelative(2.666f, 2.667f, 3.1f, 7.356f, 3.1f, 7.356f)
                curveToRelative(0.0f, 0.658f, 0.147f, 1.158f, -0.214f, 1.52f)
                close()
            }
        }
        .build()
        return _hearthisdotat!!
    }

private var _hearthisdotat: ImageVector? = null
