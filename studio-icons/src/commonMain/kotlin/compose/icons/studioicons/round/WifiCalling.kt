package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.WifiCalling: ImageVector
    get() {
        if (_wifiCalling != null) {
            return _wifiCalling!!
        }
        _wifiCalling = Builder(name = "WifiCalling", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 4.95f)
                curveTo(21.79f, 4.78f, 19.67f, 3.0f, 16.5f, 3.0f)
                curveToRelative(-3.18f, 0.0f, -5.29f, 1.78f, -5.5f, 1.95f)
                lineTo(16.5f, 12.0f)
                lineTo(22.0f, 4.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2f, 15.28f)
                lineToRelative(-2.54f, -0.29f)
                curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f)
                lineToRelative(-1.84f, 1.84f)
                curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                lineToRelative(1.85f, -1.85f)
                curveToRelative(0.43f, -0.43f, 0.64f, -1.04f, 0.57f, -1.64f)
                lineTo(8.72f, 4.8f)
                curveTo(8.6f, 3.79f, 7.75f, 3.03f, 6.73f, 3.03f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f)
                curveTo(3.53f, 13.64f, 10.36f, 20.47f, 18.9f, 21.0f)
                curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f)
                verticalLineToRelative(-1.73f)
                curveTo(20.97f, 16.25f, 20.21f, 15.4f, 19.2f, 15.28f)
                close()
            }
        }
        .build()
        return _wifiCalling!!
    }

private var _wifiCalling: ImageVector? = null
