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

public val SimpleIcons.Opel: ImageVector
    get() {
        if (_opel != null) {
            return _opel!!
        }
        _opel = Builder(name = "Opel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.7911f, 12.8922f)
                curveToRelative(-0.124f, -0.008f, -2.515f, -0.16f, -2.529f, -0.162f)
                curveToRelative(0.021f, -0.257f, 0.033f, -0.514f, 0.033f, -0.771f)
                curveToRelative(-0.034f, -5.1489f, -4.2349f, -9.2969f, -9.3849f, -9.2629f)
                curveToRelative(-4.306f, 0.028f, -8.0326f, 3.0015f, -9.0159f, 7.1939f)
                lineTo(0.8373f, 9.8902f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, false, -0.285f, 0.139f)
                lineToRelative(-0.514f, 0.73f)
                curveToRelative(-0.094f, 0.113f, -0.004f, 0.297f, 0.144f, 0.29f)
                curveToRelative(0.144f, 0.009f, 2.485f, 0.153f, 2.529f, 0.157f)
                arcToRelative(9.4481f, 9.4481f, 0.0f, false, false, -0.033f, 0.771f)
                curveToRelative(-0.001f, 5.15f, 4.1731f, 9.3256f, 9.3231f, 9.3266f)
                curveToRelative(4.3492f, 8.0E-4f, 8.1214f, -3.0051f, 9.0916f, -7.2446f)
                horizontalLineToRelative(2.056f)
                arcToRelative(0.3574f, 0.3574f, 0.0f, false, false, 0.285f, -0.141f)
                lineToRelative(0.529f, -0.727f)
                curveToRelative(0.0971f, -0.126f, -0.0099f, -0.329f, -0.1719f, -0.299f)
                close()
                moveTo(11.9683f, 3.7254f)
                curveToRelative(4.552f, 0.0044f, 8.2414f, 3.6929f, 8.2469f, 8.2449f)
                curveToRelative(0.0f, 0.234f, -0.013f, 0.465f, -0.031f, 0.694f)
                lineToRelative(-6.8929f, -0.437f)
                lineToRelative(2.992f, -2.056f)
                curveToRelative(0.124f, -0.079f, 0.061f, -0.288f, -0.087f, -0.283f)
                lineTo(3.9914f, 9.8883f)
                curveToRelative(0.9507f, -3.6276f, 4.2268f, -6.1587f, 7.9769f, -6.1629f)
                close()
                moveTo(11.9683f, 20.2171f)
                curveToRelative(-4.5518f, -0.0061f, -8.2399f, -3.6951f, -8.2449f, -8.2469f)
                curveToRelative(0.0f, -0.234f, 0.0f, -0.465f, 0.031f, -0.694f)
                lineToRelative(6.8949f, 0.429f)
                lineToRelative(-2.986f, 2.056f)
                curveToRelative(-0.124f, 0.082f, -0.06f, 0.29f, 0.09f, 0.285f)
                horizontalLineToRelative(12.1948f)
                curveToRelative(-0.9491f, 3.631f, -4.2268f, 6.1657f, -7.9798f, 6.1709f)
                close()
            }
        }
        .build()
        return _opel!!
    }

private var _opel: ImageVector? = null
