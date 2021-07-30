package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Slickpic: ImageVector
    get() {
        if (_slickpic != null) {
            return _slickpic!!
        }
        _slickpic = Builder(name = "Slickpic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.483f, 18.308f)
                lineTo(6.056f, 14.085f)
                lineToRelative(2.52f, -9.201f)
                lineTo(24.0f, 9.104f)
                lineToRelative(-2.517f, 9.204f)
                close()
                moveTo(8.069f, 12.938f)
                lineToRelative(12.263f, 3.354f)
                lineToRelative(1.654f, -6.033f)
                lineTo(9.72f, 6.9f)
                lineToRelative(-1.65f, 6.034f)
                verticalLineToRelative(0.004f)
                close()
                moveTo(8.526f, 15.795f)
                lineToRelative(-4.891f, 1.311f)
                lineToRelative(-1.625f, -6.045f)
                lineToRelative(4.146f, -1.11f)
                lineToRelative(0.501f, -1.835f)
                lineTo(0.0f, 9.902f)
                lineToRelative(2.478f, 9.215f)
                lineToRelative(9.178f, -2.467f)
            }
        }
        .build()
        return _slickpic!!
    }

private var _slickpic: ImageVector? = null
