package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Diamond16: ImageVector
    get() {
        if (_diamond16 != null) {
            return _diamond16!!
        }
        _diamond16 = Builder(name = "Diamond16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.527f, 9.237f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, -2.474f)
                lineTo(6.777f, 0.512f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.475f, 0.0f)
                lineToRelative(6.251f, 6.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, 2.475f)
                lineToRelative(-6.25f, 6.251f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -2.475f, 0.0f)
                lineTo(0.527f, 9.238f)
                close()
                moveTo(1.587f, 7.823f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, 0.354f)
                lineToRelative(6.251f, 6.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.354f, 0.0f)
                lineToRelative(6.25f, -6.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.354f)
                lineToRelative(-6.25f, -6.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.354f, 0.0f)
                lineToRelative(-6.25f, 6.25f)
                close()
            }
        }
        .build()
        return _diamond16!!
    }

private var _diamond16: ImageVector? = null
