package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Tag24: ImageVector
    get() {
        if (_tag24 != null) {
            return _tag24!!
        }
        _tag24 = Builder(name = "Tag24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 6.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 1.0f)
                horizontalLineToRelative(8.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.06f, 0.44f)
                lineToRelative(10.25f, 10.25f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 2.12f)
                lineToRelative(-8.44f, 8.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.12f, 0.0f)
                lineTo(1.44f, 12.0f)
                arcTo(1.497f, 1.497f, 0.0f, false, true, 1.0f, 10.94f)
                lineTo(1.0f, 2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 1.0f)
                close()
                moveTo(2.5f, 2.5f)
                verticalLineToRelative(8.44f)
                lineToRelative(10.25f, 10.25f)
                lineToRelative(8.44f, -8.44f)
                lineTo(10.94f, 2.5f)
                close()
            }
        }
        .build()
        return _tag24!!
    }

private var _tag24: ImageVector? = null
