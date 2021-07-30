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

public val SimpleIcons.Sega: ImageVector
    get() {
        if (_sega != null) {
            return _sega!!
        }
        _sega = Builder(name = "Sega", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.229f, 4.14f)
                lineToRelative(-0.006f, 3.33f)
                horizontalLineToRelative(-10.6f)
                curveToRelative(-0.219f, 0.0f, -0.397f, 0.181f, -0.397f, 0.399f)
                curveToRelative(0.0f, 0.221f, 0.18f, 0.399f, 0.397f, 0.399f)
                lineToRelative(2.76f, -0.016f)
                curveToRelative(4.346f, 0.0f, 7.868f, 3.525f, 7.868f, 7.869f)
                curveToRelative(0.0f, 4.348f, -3.522f, 7.869f, -7.869f, 7.869f)
                lineTo(2.748f, 24.0f)
                lineToRelative(0.005f, -3.375f)
                horizontalLineToRelative(10.635f)
                curveToRelative(2.487f, 0.0f, 4.504f, -2.016f, 4.504f, -4.504f)
                curveToRelative(0.0f, -2.49f, -2.017f, -4.506f, -4.506f, -4.506f)
                lineToRelative(-2.771f, -0.03f)
                curveToRelative(-2.06f, 0.0f, -3.727f, -1.666f, -3.727f, -3.72f)
                curveToRelative(0.0f, -2.061f, 1.666f, -3.726f, 3.723f, -3.726f)
                horizontalLineToRelative(10.618f)
                close()
                moveTo(2.763f, 19.843f)
                lineToRelative(-0.004f, -3.331f)
                horizontalLineToRelative(10.609f)
                curveToRelative(0.21f, 0.0f, 0.383f, -0.175f, 0.383f, -0.387f)
                curveToRelative(0.0f, -0.213f, -0.173f, -0.385f, -0.384f, -0.385f)
                horizontalLineToRelative(-2.744f)
                curveToRelative(-4.345f, 0.0f, -7.867f, -3.525f, -7.867f, -7.871f)
                reflectiveCurveTo(6.278f, 0.0f, 10.623f, 0.0f)
                lineToRelative(10.6f, 0.003f)
                lineToRelative(0.006f, 3.35f)
                lineToRelative(-10.604f, 0.003f)
                curveToRelative(-2.49f, 0.0f, -4.5f, 2.019f, -4.5f, 4.507f)
                curveToRelative(0.0f, 2.489f, 2.024f, 4.504f, 4.515f, 4.504f)
                lineToRelative(2.775f, 0.03f)
                curveToRelative(2.055f, 0.0f, 3.72f, 1.668f, 3.72f, 3.724f)
                curveToRelative(0.0f, 2.055f, -1.665f, 3.719f, -3.72f, 3.719f)
                horizontalLineTo(2.765f)
                lineToRelative(-0.002f, 0.003f)
                close()
            }
        }
        .build()
        return _sega!!
    }

private var _sega: ImageVector? = null
