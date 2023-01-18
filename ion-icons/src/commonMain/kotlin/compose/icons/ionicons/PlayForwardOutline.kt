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

public val IonIcons.PlayForwardOutline: ImageVector
    get() {
        if (_playForwardOutline != null) {
            return _playForwardOutline!!
        }
        _playForwardOutline = Builder(name = "PlayForwardOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 145.52f)
                verticalLineToRelative(221.0f)
                curveToRelative(0.0f, 13.28f, 13.0f, 21.72f, 23.63f, 15.35f)
                lineToRelative(188.87f, -113.0f)
                curveToRelative(9.24f, -5.53f, 9.24f, -20.07f, 0.0f, -25.6f)
                lineToRelative(-188.87f, -113.0f)
                curveTo(45.0f, 123.8f, 32.0f, 132.24f, 32.0f, 145.52f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(260.57f, 145.52f)
                verticalLineToRelative(221.0f)
                curveToRelative(0.0f, 13.28f, 13.0f, 21.72f, 23.63f, 15.35f)
                lineToRelative(188.87f, -113.0f)
                curveToRelative(9.24f, -5.53f, 9.24f, -20.07f, 0.0f, -25.6f)
                lineToRelative(-188.87f, -113.0f)
                curveTo(273.56f, 123.8f, 260.57f, 132.24f, 260.57f, 145.52f)
                close()
            }
        }
        .build()
        return _playForwardOutline!!
    }

private var _playForwardOutline: ImageVector? = null
