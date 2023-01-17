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

public val Octicons.Diff16: ImageVector
    get() {
        if (_diff16 != null) {
            return _diff16!!
        }
        _diff16 = Builder(name = "Diff16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.75f, 1.75f)
                verticalLineTo(5.0f)
                horizontalLineTo(12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(8.75f)
                verticalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(6.5f)
                horizontalLineTo(4.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.0f, 5.0f)
                horizontalLineToRelative(3.25f)
                verticalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(4.0f, 13.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(4.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.0f, 13.0f)
                close()
            }
        }
        .build()
        return _diff16!!
    }

private var _diff16: ImageVector? = null
