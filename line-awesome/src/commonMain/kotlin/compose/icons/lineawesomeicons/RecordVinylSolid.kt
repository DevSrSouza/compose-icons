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
                curveTo(9.383f, 4.0f, 4.0f, 9.383f, 4.0f, 16.0f)
                curveTo(4.0f, 22.617f, 9.383f, 28.0f, 16.0f, 28.0f)
                curveTo(22.617f, 28.0f, 28.0f, 22.617f, 28.0f, 16.0f)
                curveTo(28.0f, 9.383f, 22.617f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.535f, 6.0f, 26.0f, 10.465f, 26.0f, 16.0f)
                curveTo(26.0f, 21.535f, 21.535f, 26.0f, 16.0f, 26.0f)
                curveTo(10.465f, 26.0f, 6.0f, 21.535f, 6.0f, 16.0f)
                curveTo(6.0f, 10.465f, 10.465f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(21.531f, 9.063f)
                lineTo(19.625f, 10.938f)
                lineTo(21.063f, 12.375f)
                lineTo(22.938f, 10.469f)
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
                curveTo(15.449f, 15.0f, 15.0f, 15.449f, 15.0f, 16.0f)
                curveTo(15.0f, 16.551f, 15.449f, 17.0f, 16.0f, 17.0f)
                curveTo(16.551f, 17.0f, 17.0f, 16.551f, 17.0f, 16.0f)
                curveTo(17.0f, 15.449f, 16.551f, 15.0f, 16.0f, 15.0f)
                close()
                moveTo(10.938f, 19.625f)
                lineTo(9.063f, 21.531f)
                lineTo(10.469f, 22.938f)
                lineTo(12.375f, 21.063f)
                close()
            }
        }
        .build()
        return _recordVinylSolid!!
    }

private var _recordVinylSolid: ImageVector? = null
