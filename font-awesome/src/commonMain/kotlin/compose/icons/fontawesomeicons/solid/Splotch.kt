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

public val SolidGroup.Splotch: ImageVector
    get() {
        if (_splotch != null) {
            return _splotch!!
        }
        _splotch = Builder(name = "Splotch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(287.6f, 0.1f)
                curveToRelative(-19.7f, 0.0f, -38.3f, 9.1f, -50.4f, 24.6f)
                lineTo(205.9f, 64.9f)
                curveToRelative(-17.9f, 23.0f, -46.0f, 35.6f, -75.1f, 33.7f)
                lineTo(59.1f, 94.0f)
                curveToRelative(-13.5f, -0.9f, -26.9f, 3.2f, -37.7f, 11.6f)
                curveTo(-1.3f, 123.2f, -6.7f, 155.2f, 8.8f, 179.4f)
                lineToRelative(44.5f, 69.2f)
                curveToRelative(7.1f, 11.0f, 10.8f, 23.8f, 10.8f, 36.8f)
                curveToRelative(0.0f, 11.9f, -3.1f, 23.5f, -9.0f, 33.8f)
                lineTo(27.4f, 367.7f)
                curveToRelative(-10.0f, 17.5f, -10.0f, 39.1f, 0.0f, 56.6f)
                curveToRelative(12.1f, 21.2f, 36.4f, 32.3f, 60.4f, 27.7f)
                lineToRelative(67.0f, -13.0f)
                curveToRelative(5.5f, -1.1f, 11.2f, -1.6f, 16.8f, -1.6f)
                horizontalLineTo(180.0f)
                curveToRelative(20.9f, 0.0f, 41.0f, 7.4f, 56.9f, 20.9f)
                lineToRelative(45.0f, 38.2f)
                curveToRelative(11.8f, 10.0f, 26.9f, 15.6f, 42.4f, 15.6f)
                curveToRelative(37.8f, 0.0f, 67.7f, -31.9f, 65.4f, -69.6f)
                lineToRelative(-3.1f, -50.6f)
                curveToRelative(-1.0f, -16.8f, 6.6f, -32.9f, 20.1f, -42.8f)
                lineToRelative(82.5f, -60.2f)
                curveToRelative(14.2f, -10.4f, 22.7f, -27.0f, 22.7f, -44.6f)
                curveToRelative(0.0f, -23.2f, -14.5f, -43.9f, -36.3f, -51.8f)
                lineToRelative(-58.2f, -21.2f)
                curveToRelative(-24.4f, -8.9f, -42.9f, -29.1f, -49.7f, -54.2f)
                lineTo(349.3f, 47.4f)
                curveTo(341.8f, 19.5f, 316.5f, 0.1f, 287.6f, 0.1f)
                close()
            }
        }
        .build()
        return _splotch!!
    }

private var _splotch: ImageVector? = null
