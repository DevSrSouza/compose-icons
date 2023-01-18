package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.HeartCircleSharp: ImageVector
    get() {
        if (_heartCircleSharp != null) {
            return _heartCircleSharp!!
        }
        _heartCircleSharp = Builder(name = "HeartCircleSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(330.69f, 300.82f)
                curveTo(322.19f, 311.18f, 291.0f, 339.3f, 256.0f, 364.33f)
                curveToRelative(-35.0f, -25.0f, -66.19f, -53.15f, -74.69f, -63.51f)
                curveToRelative(-20.0f, -24.37f, -29.58f, -49.4f, -29.3f, -76.5f)
                curveToRelative(0.31f, -31.06f, 25.22f, -56.33f, 55.53f, -56.33f)
                curveToRelative(22.0f, 0.0f, 37.3f, 12.41f, 46.19f, 22.76f)
                lineTo(256.0f, 193.5f)
                lineToRelative(2.27f, -2.75f)
                curveTo(267.0f, 180.29f, 282.42f, 168.0f, 304.46f, 168.0f)
                curveToRelative(30.31f, 0.0f, 55.22f, 25.27f, 55.53f, 56.33f)
                curveTo(360.27f, 251.42f, 350.68f, 276.45f, 330.69f, 300.82f)
                close()
            }
        }
        .build()
        return _heartCircleSharp!!
    }

private var _heartCircleSharp: ImageVector? = null
