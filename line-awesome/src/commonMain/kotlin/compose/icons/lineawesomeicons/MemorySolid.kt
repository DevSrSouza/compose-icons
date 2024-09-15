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

public val LineAwesomeIcons.MemorySolid: ImageVector
    get() {
        if (_memorySolid != null) {
            return _memorySolid!!
        }
        _memorySolid = Builder(name = "MemorySolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                lineTo(2.0f, 25.0f)
                lineTo(15.0f, 25.0f)
                lineTo(15.0f, 24.0f)
                curveTo(15.0f, 23.445f, 15.445f, 23.0f, 16.0f, 23.0f)
                curveTo(16.555f, 23.0f, 17.0f, 23.445f, 17.0f, 24.0f)
                lineTo(17.0f, 25.0f)
                lineTo(30.0f, 25.0f)
                lineTo(30.0f, 7.0f)
                close()
                moveTo(4.0f, 9.0f)
                lineTo(28.0f, 9.0f)
                lineTo(28.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                close()
                moveTo(6.0f, 11.0f)
                lineTo(6.0f, 16.0f)
                lineTo(12.0f, 16.0f)
                lineTo(12.0f, 11.0f)
                close()
                moveTo(13.0f, 11.0f)
                lineTo(13.0f, 16.0f)
                lineTo(19.0f, 16.0f)
                lineTo(19.0f, 11.0f)
                close()
                moveTo(20.0f, 11.0f)
                lineTo(20.0f, 16.0f)
                lineTo(26.0f, 16.0f)
                lineTo(26.0f, 11.0f)
                close()
                moveTo(8.0f, 13.0f)
                lineTo(10.0f, 13.0f)
                lineTo(10.0f, 14.0f)
                lineTo(8.0f, 14.0f)
                close()
                moveTo(15.0f, 13.0f)
                lineTo(17.0f, 13.0f)
                lineTo(17.0f, 14.0f)
                lineTo(15.0f, 14.0f)
                close()
                moveTo(22.0f, 13.0f)
                lineTo(24.0f, 13.0f)
                lineTo(24.0f, 14.0f)
                lineTo(22.0f, 14.0f)
                close()
                moveTo(4.0f, 20.0f)
                lineTo(28.0f, 20.0f)
                lineTo(28.0f, 23.0f)
                lineTo(18.594f, 23.0f)
                curveTo(18.152f, 21.891f, 17.258f, 21.0f, 16.0f, 21.0f)
                curveTo(14.742f, 21.0f, 13.848f, 21.891f, 13.406f, 23.0f)
                lineTo(4.0f, 23.0f)
                close()
            }
        }
        .build()
        return _memorySolid!!
    }

private var _memorySolid: ImageVector? = null
