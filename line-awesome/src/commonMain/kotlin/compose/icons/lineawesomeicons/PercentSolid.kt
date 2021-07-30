package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.PercentSolid: ImageVector
    get() {
        if (_percentSolid != null) {
            return _percentSolid!!
        }
        _percentSolid = Builder(name = "PercentSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 6.0f)
                curveTo(7.5781f, 6.0f, 6.0f, 7.5781f, 6.0f, 9.5f)
                lineTo(6.0f, 12.5f)
                curveTo(6.0f, 14.4219f, 7.5781f, 16.0f, 9.5f, 16.0f)
                curveTo(11.4219f, 16.0f, 13.0f, 14.4219f, 13.0f, 12.5f)
                lineTo(13.0f, 9.5f)
                curveTo(13.0f, 7.5781f, 11.4219f, 6.0f, 9.5f, 6.0f)
                close()
                moveTo(20.75f, 6.0f)
                lineTo(8.75f, 26.0f)
                lineTo(11.25f, 26.0f)
                lineTo(23.25f, 6.0f)
                close()
                moveTo(9.5f, 8.0f)
                curveTo(10.3398f, 8.0f, 11.0f, 8.6602f, 11.0f, 9.5f)
                lineTo(11.0f, 12.5f)
                curveTo(11.0f, 13.3398f, 10.3398f, 14.0f, 9.5f, 14.0f)
                curveTo(8.6602f, 14.0f, 8.0f, 13.3398f, 8.0f, 12.5f)
                lineTo(8.0f, 9.5f)
                curveTo(8.0f, 8.6602f, 8.6602f, 8.0f, 9.5f, 8.0f)
                close()
                moveTo(22.5f, 16.0f)
                curveTo(20.5781f, 16.0f, 19.0f, 17.5781f, 19.0f, 19.5f)
                lineTo(19.0f, 22.5f)
                curveTo(19.0f, 24.4219f, 20.5781f, 26.0f, 22.5f, 26.0f)
                curveTo(24.4219f, 26.0f, 26.0f, 24.4219f, 26.0f, 22.5f)
                lineTo(26.0f, 19.5f)
                curveTo(26.0f, 17.5781f, 24.4219f, 16.0f, 22.5f, 16.0f)
                close()
                moveTo(22.5f, 18.0f)
                curveTo(23.3398f, 18.0f, 24.0f, 18.6602f, 24.0f, 19.5f)
                lineTo(24.0f, 22.5f)
                curveTo(24.0f, 23.3398f, 23.3398f, 24.0f, 22.5f, 24.0f)
                curveTo(21.6602f, 24.0f, 21.0f, 23.3398f, 21.0f, 22.5f)
                lineTo(21.0f, 19.5f)
                curveTo(21.0f, 18.6602f, 21.6602f, 18.0f, 22.5f, 18.0f)
                close()
            }
        }
        .build()
        return _percentSolid!!
    }

private var _percentSolid: ImageVector? = null
