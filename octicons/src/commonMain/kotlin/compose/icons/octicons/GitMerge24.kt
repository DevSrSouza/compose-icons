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

public val Octicons.GitMerge24: ImageVector
    get() {
        if (_gitMerge24 != null) {
            return _gitMerge24!!
        }
        _gitMerge24 = Builder(name = "GitMerge24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, 6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.5f, 0.0f)
                close()
                moveTo(2.5f, 19.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, 6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.5f, 0.0f)
                close()
                moveTo(2.5f, 4.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, 6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.5f, 0.0f)
                close()
                moveTo(5.75f, 6.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -0.001f, -3.501f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 5.75f, 6.5f)
                close()
                moveTo(5.75f, 21.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -0.001f, -3.501f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 5.75f, 21.0f)
                close()
                moveTo(18.25f, 15.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -0.001f, -3.501f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 18.25f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 7.25f)
                curveToRelative(0.0f, 2.9f, 2.35f, 5.25f, 5.25f, 5.25f)
                horizontalLineToRelative(4.5f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(-4.5f)
                arcTo(6.75f, 6.75f, 0.0f, false, true, 5.0f, 7.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.75f, 16.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 5.0f, 16.0f)
                verticalLineTo(8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                close()
            }
        }
        .build()
        return _gitMerge24!!
    }

private var _gitMerge24: ImageVector? = null
