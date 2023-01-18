package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PlayBackOutline: ImageVector
    get() {
        if (_playBackOutline != null) {
            return _playBackOutline!!
        }
        _playBackOutline = Builder(name = "PlayBackOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(480.0f, 145.52f)
                verticalLineToRelative(221.0f)
                curveToRelative(0.0f, 13.28f, -13.0f, 21.72f, -23.63f, 15.35f)
                lineTo(267.5f, 268.8f)
                curveToRelative(-9.24f, -5.53f, -9.24f, -20.07f, 0.0f, -25.6f)
                lineToRelative(188.87f, -113.0f)
                curveTo(467.0f, 123.8f, 480.0f, 132.24f, 480.0f, 145.52f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(251.43f, 145.52f)
                verticalLineToRelative(221.0f)
                curveToRelative(0.0f, 13.28f, -13.0f, 21.72f, -23.63f, 15.35f)
                lineTo(38.93f, 268.8f)
                curveToRelative(-9.24f, -5.53f, -9.24f, -20.07f, 0.0f, -25.6f)
                lineToRelative(188.87f, -113.0f)
                curveTo(238.44f, 123.8f, 251.43f, 132.24f, 251.43f, 145.52f)
                close()
            }
        }
        .build()
        return _playBackOutline!!
    }

private var _playBackOutline: ImageVector? = null
