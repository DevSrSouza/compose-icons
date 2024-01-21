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

public val Octicons.Share16: ImageVector
    get() {
        if (_share16 != null) {
            return _share16!!
        }
        _share16 = Builder(name = "Share16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(6.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 12.25f, 15.0f)
                horizontalLineToRelative(-8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 13.25f)
                verticalLineToRelative(-6.5f)
                curveTo(2.0f, 5.784f, 2.784f, 5.0f, 3.75f, 5.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
                moveTo(7.823f, 0.177f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.354f, 0.0f)
                lineToRelative(2.896f, 2.896f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.177f, 0.427f)
                horizontalLineTo(8.75f)
                verticalLineToRelative(5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(5.104f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.177f, -0.427f)
                close()
            }
        }
        .build()
        return _share16!!
    }

private var _share16: ImageVector? = null
