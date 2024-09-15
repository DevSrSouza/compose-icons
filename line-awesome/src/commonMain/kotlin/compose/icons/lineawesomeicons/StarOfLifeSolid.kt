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

public val LineAwesomeIcons.StarOfLifeSolid: ImageVector
    get() {
        if (_starOfLifeSolid != null) {
            return _starOfLifeSolid!!
        }
        _starOfLifeSolid = Builder(name = "StarOfLifeSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                lineTo(13.0f, 10.805f)
                lineTo(7.107f, 7.402f)
                lineTo(4.107f, 12.6f)
                lineTo(10.0f, 16.0f)
                lineTo(4.107f, 19.4f)
                lineTo(7.107f, 24.598f)
                lineTo(13.0f, 21.195f)
                lineTo(13.0f, 28.0f)
                lineTo(19.0f, 28.0f)
                lineTo(19.0f, 21.195f)
                lineTo(24.893f, 24.598f)
                lineTo(27.893f, 19.4f)
                lineTo(22.0f, 16.0f)
                lineTo(27.893f, 12.6f)
                lineTo(24.893f, 7.402f)
                lineTo(19.0f, 10.805f)
                lineTo(19.0f, 4.0f)
                lineTo(13.0f, 4.0f)
                close()
                moveTo(15.0f, 6.0f)
                lineTo(17.0f, 6.0f)
                lineTo(17.0f, 14.27f)
                lineTo(24.16f, 10.135f)
                lineTo(25.16f, 11.865f)
                lineTo(18.0f, 16.0f)
                lineTo(25.16f, 20.135f)
                lineTo(24.16f, 21.865f)
                lineTo(17.0f, 17.73f)
                lineTo(17.0f, 26.0f)
                lineTo(15.0f, 26.0f)
                lineTo(15.0f, 17.73f)
                lineTo(7.84f, 21.865f)
                lineTo(6.84f, 20.135f)
                lineTo(14.0f, 16.0f)
                lineTo(6.84f, 11.865f)
                lineTo(7.84f, 10.135f)
                lineTo(15.0f, 14.27f)
                lineTo(15.0f, 6.0f)
                close()
            }
        }
        .build()
        return _starOfLifeSolid!!
    }

private var _starOfLifeSolid: ImageVector? = null
