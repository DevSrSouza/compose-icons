package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Pentagon: ImageVector
    get() {
        if (_pentagon != null) {
            return _pentagon!!
        }
        _pentagon = Builder(name = "Pentagon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.2f, 3.394f)
                lineToRelative(7.033f, 5.237f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.7f, 2.247f)
                lineToRelative(-2.973f, 8.764f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.894f, 1.358f)
                horizontalLineToRelative(-8.12f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.9f, -1.373f)
                lineToRelative(-2.896f, -8.765f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.696f, -2.225f)
                lineToRelative(6.958f, -5.237f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.397f, -0.006f)
                close()
            }
        }
        .build()
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
