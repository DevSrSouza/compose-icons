package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.TriangleMinus: ImageVector
    get() {
        if (_triangleMinus != null) {
            return _triangleMinus!!
        }
        _triangleMinus = Builder(name = "TriangleMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.363f, 3.591f)
                lineToRelative(-8.106f, 13.534f)
                arcToRelative(1.914f, 1.914f, 0.0f, false, false, 1.636f, 2.871f)
                horizontalLineToRelative(16.214f)
                arcToRelative(1.914f, 1.914f, 0.0f, false, false, 1.636f, -2.87f)
                lineToRelative(-8.106f, -13.536f)
                arcToRelative(1.914f, 1.914f, 0.0f, false, false, -3.274f, 0.0f)
                verticalLineToRelative(0.001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                horizontalLineToRelative(6.0f)
            }
        }
        .build()
        return _triangleMinus!!
    }

private var _triangleMinus: ImageVector? = null
