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

public val LineAwesomeIcons.SprayCanSolid: ImageVector
    get() {
        if (_sprayCanSolid != null) {
            return _sprayCanSolid!!
        }
        _sprayCanSolid = Builder(name = "SprayCanSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(12.0f, 8.0f)
                lineTo(14.0f, 8.0f)
                lineTo(14.0f, 9.063f)
                curveTo(9.898f, 9.5f, 8.125f, 12.531f, 8.125f, 12.531f)
                lineTo(8.0f, 12.75f)
                lineTo(8.0f, 30.0f)
                lineTo(22.0f, 30.0f)
                lineTo(22.0f, 12.75f)
                lineTo(21.875f, 12.531f)
                curveTo(21.875f, 12.531f, 20.102f, 9.5f, 16.0f, 9.063f)
                lineTo(16.0f, 8.0f)
                lineTo(18.0f, 8.0f)
                lineTo(18.0f, 2.0f)
                close()
                moveTo(24.0f, 2.0f)
                curveTo(23.449f, 2.0f, 23.0f, 2.449f, 23.0f, 3.0f)
                curveTo(23.0f, 3.551f, 23.449f, 4.0f, 24.0f, 4.0f)
                curveTo(24.551f, 4.0f, 25.0f, 3.551f, 25.0f, 3.0f)
                curveTo(25.0f, 2.449f, 24.551f, 2.0f, 24.0f, 2.0f)
                close()
                moveTo(14.0f, 4.0f)
                lineTo(16.0f, 4.0f)
                lineTo(16.0f, 6.0f)
                lineTo(14.0f, 6.0f)
                close()
                moveTo(21.0f, 4.0f)
                curveTo(20.449f, 4.0f, 20.0f, 4.449f, 20.0f, 5.0f)
                curveTo(20.0f, 5.551f, 20.449f, 6.0f, 21.0f, 6.0f)
                curveTo(21.551f, 6.0f, 22.0f, 5.551f, 22.0f, 5.0f)
                curveTo(22.0f, 4.449f, 21.551f, 4.0f, 21.0f, 4.0f)
                close()
                moveTo(24.0f, 6.0f)
                curveTo(23.449f, 6.0f, 23.0f, 6.449f, 23.0f, 7.0f)
                curveTo(23.0f, 7.551f, 23.449f, 8.0f, 24.0f, 8.0f)
                curveTo(24.551f, 8.0f, 25.0f, 7.551f, 25.0f, 7.0f)
                curveTo(25.0f, 6.449f, 24.551f, 6.0f, 24.0f, 6.0f)
                close()
                moveTo(15.0f, 11.0f)
                curveTo(16.738f, 11.0f, 17.91f, 11.48f, 18.688f, 12.0f)
                lineTo(11.313f, 12.0f)
                curveTo(12.09f, 11.48f, 13.262f, 11.0f, 15.0f, 11.0f)
                close()
                moveTo(10.0f, 14.0f)
                lineTo(20.0f, 14.0f)
                lineTo(20.0f, 28.0f)
                lineTo(10.0f, 28.0f)
                close()
                moveTo(15.0f, 18.0f)
                curveTo(13.355f, 18.0f, 12.0f, 19.355f, 12.0f, 21.0f)
                curveTo(12.0f, 22.645f, 13.355f, 24.0f, 15.0f, 24.0f)
                curveTo(16.645f, 24.0f, 18.0f, 22.645f, 18.0f, 21.0f)
                curveTo(18.0f, 19.355f, 16.645f, 18.0f, 15.0f, 18.0f)
                close()
                moveTo(15.0f, 20.0f)
                curveTo(15.563f, 20.0f, 16.0f, 20.438f, 16.0f, 21.0f)
                curveTo(16.0f, 21.563f, 15.563f, 22.0f, 15.0f, 22.0f)
                curveTo(14.438f, 22.0f, 14.0f, 21.563f, 14.0f, 21.0f)
                curveTo(14.0f, 20.438f, 14.438f, 20.0f, 15.0f, 20.0f)
                close()
            }
        }
        .build()
        return _sprayCanSolid!!
    }

private var _sprayCanSolid: ImageVector? = null
