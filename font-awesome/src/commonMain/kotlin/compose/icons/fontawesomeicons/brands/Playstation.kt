package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Playstation: ImageVector
    get() {
        if (_playstation != null) {
            return _playstation!!
        }
        _playstation = Builder(name = "Playstation", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(570.9f, 372.3f)
                curveToRelative(-11.3f, 14.2f, -38.8f, 24.3f, -38.8f, 24.3f)
                lineTo(327.0f, 470.2f)
                verticalLineToRelative(-54.3f)
                lineToRelative(150.9f, -53.8f)
                curveToRelative(17.1f, -6.1f, 19.8f, -14.8f, 5.8f, -19.4f)
                curveToRelative(-13.9f, -4.6f, -39.1f, -3.3f, -56.2f, 2.9f)
                lineTo(327.0f, 381.1f)
                verticalLineToRelative(-56.4f)
                curveToRelative(23.2f, -7.8f, 47.1f, -13.6f, 75.7f, -16.8f)
                curveToRelative(40.9f, -4.5f, 90.9f, 0.6f, 130.2f, 15.5f)
                curveToRelative(44.2f, 14.0f, 49.2f, 34.7f, 38.0f, 48.9f)
                close()
                moveTo(346.5f, 279.8f)
                verticalLineToRelative(-139.0f)
                curveToRelative(0.0f, -16.3f, -3.0f, -31.3f, -18.3f, -35.6f)
                curveToRelative(-11.7f, -3.8f, -19.0f, 7.1f, -19.0f, 23.4f)
                verticalLineToRelative(347.9f)
                lineToRelative(-93.8f, -29.8f)
                lineTo(215.4f, 32.0f)
                curveToRelative(39.9f, 7.4f, 98.0f, 24.9f, 129.2f, 35.4f)
                curveTo(424.1f, 94.7f, 451.0f, 128.7f, 451.0f, 205.2f)
                curveToRelative(0.0f, 74.5f, -46.0f, 102.8f, -104.5f, 74.6f)
                close()
                moveTo(43.2f, 410.2f)
                curveToRelative(-45.4f, -12.8f, -53.0f, -39.5f, -32.3f, -54.8f)
                curveToRelative(19.1f, -14.2f, 51.7f, -24.9f, 51.7f, -24.9f)
                lineToRelative(134.5f, -47.8f)
                verticalLineToRelative(54.5f)
                lineToRelative(-96.8f, 34.6f)
                curveToRelative(-17.1f, 6.1f, -19.7f, 14.8f, -5.8f, 19.4f)
                curveToRelative(13.9f, 4.6f, 39.1f, 3.3f, 56.2f, -2.9f)
                lineToRelative(46.4f, -16.9f)
                verticalLineToRelative(48.8f)
                curveToRelative(-51.6f, 9.3f, -101.4f, 7.3f, -153.9f, -10.0f)
                close()
            }
        }
        .build()
        return _playstation!!
    }

private var _playstation: ImageVector? = null
