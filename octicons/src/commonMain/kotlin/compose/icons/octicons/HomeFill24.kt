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

public val Octicons.HomeFill24: ImageVector
    get() {
        if (_homeFill24 != null) {
            return _homeFill24!!
        }
        _homeFill24 = Builder(name = "HomeFill24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.97f, 2.59f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.94f, 0.0f)
                lineToRelative(-7.5f, 6.363f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.0f, 10.097f)
                verticalLineTo(19.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 21.0f)
                horizontalLineToRelative(4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.75f, -0.75f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.25f)
                curveToRelative(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(4.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-9.403f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.53f, -1.144f)
                lineToRelative(-7.5f, -6.363f)
                close()
            }
        }
        .build()
        return _homeFill24!!
    }

private var _homeFill24: ImageVector? = null
