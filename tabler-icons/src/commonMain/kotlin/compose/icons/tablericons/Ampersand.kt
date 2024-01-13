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

public val TablerIcons.Ampersand: ImageVector
    get() {
        if (_ampersand != null) {
            return _ampersand!!
        }
        _ampersand = Builder(name = "Ampersand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 20.0f)
                lineToRelative(-10.403f, -10.972f)
                arcToRelative(2.948f, 2.948f, 0.0f, false, true, 0.0f, -4.165f)
                arcToRelative(2.94f, 2.94f, 0.0f, false, true, 4.161f, 0.0f)
                arcToRelative(2.948f, 2.948f, 0.0f, false, true, 0.0f, 4.165f)
                lineToRelative(-4.68f, 4.687f)
                arcToRelative(3.685f, 3.685f, 0.0f, false, false, 0.0f, 5.207f)
                arcToRelative(3.675f, 3.675f, 0.0f, false, false, 5.2f, 0.0f)
                lineToRelative(5.722f, -5.922f)
            }
        }
        .build()
        return _ampersand!!
    }

private var _ampersand: ImageVector? = null
