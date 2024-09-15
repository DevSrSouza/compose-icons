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

public val LineAwesomeIcons.FillDripSolid: ImageVector
    get() {
        if (_fillDripSolid != null) {
            return _fillDripSolid!!
        }
        _fillDripSolid = Builder(name = "FillDripSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.301f, 3.301f)
                lineTo(9.9f, 4.699f)
                lineTo(11.699f, 6.5f)
                lineTo(4.801f, 13.4f)
                curveTo(3.601f, 14.6f, 3.601f, 16.499f, 4.801f, 17.699f)
                lineTo(4.9f, 17.801f)
                lineTo(11.199f, 24.1f)
                curveTo(12.399f, 25.3f, 14.3f, 25.3f, 15.5f, 24.1f)
                lineTo(23.1f, 16.5f)
                lineTo(23.801f, 15.801f)
                lineTo(14.1f, 6.1f)
                lineTo(13.301f, 5.301f)
                lineTo(13.1f, 5.1f)
                lineTo(11.301f, 3.301f)
                close()
                moveTo(13.1f, 7.9f)
                lineTo(21.0f, 15.801f)
                lineTo(18.801f, 18.0f)
                lineTo(7.898f, 18.0f)
                lineTo(6.199f, 16.301f)
                curveTo(5.799f, 15.901f, 5.799f, 15.201f, 6.199f, 14.801f)
                lineTo(13.1f, 7.9f)
                close()
                moveTo(25.0f, 19.301f)
                lineTo(24.199f, 20.5f)
                curveTo(24.199f, 20.5f, 23.7f, 21.299f, 23.1f, 22.199f)
                curveTo(22.8f, 22.699f, 22.6f, 23.1f, 22.4f, 23.6f)
                curveTo(22.2f, 24.1f, 22.0f, 24.4f, 22.0f, 25.0f)
                curveTo(22.0f, 26.6f, 23.4f, 28.0f, 25.0f, 28.0f)
                curveTo(26.6f, 28.0f, 28.0f, 26.6f, 28.0f, 25.0f)
                curveTo(28.0f, 24.4f, 27.8f, 24.0f, 27.6f, 23.5f)
                curveTo(27.4f, 23.0f, 27.1f, 22.5f, 26.9f, 22.1f)
                curveTo(26.4f, 21.2f, 25.801f, 20.4f, 25.801f, 20.4f)
                lineTo(25.0f, 19.301f)
                close()
            }
        }
        .build()
        return _fillDripSolid!!
    }

private var _fillDripSolid: ImageVector? = null
