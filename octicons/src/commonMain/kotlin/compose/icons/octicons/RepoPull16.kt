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

public val Octicons.RepoPull16: ImageVector
    get() {
        if (_repoPull16 != null) {
            return _repoPull16!!
        }
        _repoPull16 = Builder(name = "RepoPull16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.5f, 0.0f)
                horizontalLineToRelative(8.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineTo(6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(1.5f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.708f)
                arcTo(2.486f, 2.486f, 0.0f, false, true, 3.5f, 9.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 1.0f, 11.5f)
                verticalLineToRelative(-9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.21f, 13.479f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.061f, 1.061f)
                lineToRelative(2.504f, -2.505f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.061f)
                lineTo(13.271f, 8.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.061f, 1.06f)
                lineToRelative(1.224f, 1.225f)
                horizontalLineTo(8.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.685f)
                lineToRelative(-1.225f, 1.224f)
                close()
            }
        }
        .build()
        return _repoPull16!!
    }

private var _repoPull16: ImageVector? = null
