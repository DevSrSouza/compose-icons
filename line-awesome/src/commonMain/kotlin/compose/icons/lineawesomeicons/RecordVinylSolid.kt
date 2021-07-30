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

public val LineAwesomeIcons.RecordVinylSolid: ImageVector
    get() {
        if (_recordVinylSolid != null) {
            return _recordVinylSolid!!
        }
        _recordVinylSolid = Builder(name = "RecordVinylSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3828f, 4.0f, 4.0f, 9.3828f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6172f, 28.0f, 28.0f, 22.6172f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3828f, 22.6172f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.5352f, 6.0f, 26.0f, 10.4648f, 26.0f, 16.0f)
                curveTo(26.0f, 21.5352f, 21.5352f, 26.0f, 16.0f, 26.0f)
                curveTo(10.4648f, 26.0f, 6.0f, 21.5352f, 6.0f, 16.0f)
                curveTo(6.0f, 10.4648f, 10.4648f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(21.5313f, 9.0625f)
                lineTo(19.625f, 10.9375f)
                lineTo(21.0625f, 12.375f)
                lineTo(22.9375f, 10.4688f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(13.25f, 11.0f, 11.0f, 13.25f, 11.0f, 16.0f)
                curveTo(11.0f, 18.75f, 13.25f, 21.0f, 16.0f, 21.0f)
                curveTo(18.75f, 21.0f, 21.0f, 18.75f, 21.0f, 16.0f)
                curveTo(21.0f, 13.25f, 18.75f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(17.668f, 13.0f, 19.0f, 14.332f, 19.0f, 16.0f)
                curveTo(19.0f, 17.668f, 17.668f, 19.0f, 16.0f, 19.0f)
                curveTo(14.332f, 19.0f, 13.0f, 17.668f, 13.0f, 16.0f)
                curveTo(13.0f, 14.332f, 14.332f, 13.0f, 16.0f, 13.0f)
                close()
                moveTo(16.0f, 15.0f)
                curveTo(15.4492f, 15.0f, 15.0f, 15.4492f, 15.0f, 16.0f)
                curveTo(15.0f, 16.5508f, 15.4492f, 17.0f, 16.0f, 17.0f)
                curveTo(16.5508f, 17.0f, 17.0f, 16.5508f, 17.0f, 16.0f)
                curveTo(17.0f, 15.4492f, 16.5508f, 15.0f, 16.0f, 15.0f)
                close()
                moveTo(10.9375f, 19.625f)
                lineTo(9.0625f, 21.5313f)
                lineTo(10.4688f, 22.9375f)
                lineTo(12.375f, 21.0625f)
                close()
            }
        }
        .build()
        return _recordVinylSolid!!
    }

private var _recordVinylSolid: ImageVector? = null
