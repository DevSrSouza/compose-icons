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

public val LineAwesomeIcons.ChairSolid: ImageVector
    get() {
        if (_chairSolid != null) {
            return _chairSolid!!
        }
        _chairSolid = Builder(name = "ChairSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                lineTo(11.0f, 16.438f)
                curveTo(10.898f, 16.465f, 10.777f, 16.504f, 10.688f, 16.531f)
                curveTo(10.203f, 16.68f, 9.867f, 16.836f, 9.625f, 17.0f)
                curveTo(9.504f, 17.082f, 9.391f, 17.168f, 9.313f, 17.25f)
                curveTo(9.234f, 17.332f, 9.125f, 17.5f, 9.125f, 17.5f)
                lineTo(9.0f, 17.719f)
                lineTo(9.0f, 20.0f)
                lineTo(10.0f, 20.0f)
                lineTo(10.0f, 28.0f)
                lineTo(12.0f, 28.0f)
                lineTo(12.0f, 20.0f)
                lineTo(20.0f, 20.0f)
                lineTo(20.0f, 28.0f)
                lineTo(22.0f, 28.0f)
                lineTo(22.0f, 20.0f)
                lineTo(23.0f, 20.0f)
                lineTo(23.0f, 17.719f)
                lineTo(22.875f, 17.5f)
                curveTo(22.875f, 17.5f, 22.766f, 17.332f, 22.688f, 17.25f)
                curveTo(22.609f, 17.168f, 22.496f, 17.082f, 22.375f, 17.0f)
                curveTo(22.133f, 16.836f, 21.797f, 16.68f, 21.313f, 16.531f)
                curveTo(21.223f, 16.504f, 21.102f, 16.465f, 21.0f, 16.438f)
                lineTo(21.0f, 4.0f)
                lineTo(19.0f, 4.0f)
                lineTo(19.0f, 5.0f)
                lineTo(13.0f, 5.0f)
                lineTo(13.0f, 4.0f)
                close()
                moveTo(13.0f, 7.0f)
                lineTo(15.0f, 7.0f)
                lineTo(15.0f, 16.031f)
                curveTo(14.242f, 16.051f, 13.563f, 16.07f, 13.0f, 16.125f)
                close()
                moveTo(17.0f, 7.0f)
                lineTo(19.0f, 7.0f)
                lineTo(19.0f, 16.125f)
                curveTo(18.438f, 16.07f, 17.758f, 16.051f, 17.0f, 16.031f)
                close()
            }
        }
        .build()
        return _chairSolid!!
    }

private var _chairSolid: ImageVector? = null
