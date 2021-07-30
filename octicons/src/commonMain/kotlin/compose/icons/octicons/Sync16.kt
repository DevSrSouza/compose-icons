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

public val Octicons.Sync16: ImageVector
    get() {
        if (_sync16 != null) {
            return _sync16!!
        }
        _sync16 = Builder(name = "Sync16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 2.5f)
                arcToRelative(5.487f, 5.487f, 0.0f, false, false, -4.131f, 1.869f)
                lineToRelative(1.204f, 1.204f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 4.896f, 6.0f)
                horizontalLineTo(1.25f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 1.0f, 5.75f)
                verticalLineTo(2.104f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.427f, -0.177f)
                lineToRelative(1.38f, 1.38f)
                arcTo(7.001f, 7.001f, 0.0f, false, true, 14.95f, 7.16f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.49f, 0.178f)
                arcTo(5.501f, 5.501f, 0.0f, false, false, 8.0f, 2.5f)
                close()
                moveTo(1.705f, 8.005f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.834f, 0.656f)
                arcToRelative(5.501f, 5.501f, 0.0f, false, false, 9.592f, 2.97f)
                lineToRelative(-1.204f, -1.204f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.177f, -0.427f)
                horizontalLineToRelative(3.646f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(3.646f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.427f, 0.177f)
                lineToRelative(-1.38f, -1.38f)
                arcTo(7.001f, 7.001f, 0.0f, false, true, 1.05f, 8.84f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.656f, -0.834f)
                close()
            }
        }
        .build()
        return _sync16!!
    }

private var _sync16: ImageVector? = null
