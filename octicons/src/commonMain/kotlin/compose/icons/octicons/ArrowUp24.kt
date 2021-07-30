package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.ArrowUp24: ImageVector
    get() {
        if (_arrowUp24 != null) {
            return _arrowUp24!!
        }
        _arrowUp24 = Builder(name = "ArrowUp24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.47f, 10.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(5.25f, -5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                lineToRelative(5.25f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineTo(13.0f, 6.81f)
                verticalLineToRelative(12.44f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(6.81f)
                lineToRelative(-3.97f, 3.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowUp24!!
    }

private var _arrowUp24: ImageVector? = null
