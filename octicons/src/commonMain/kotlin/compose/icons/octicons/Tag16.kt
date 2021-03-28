package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Tag16: ImageVector
    get() {
        if (_tag16 != null) {
            return _tag16!!
        }
        _tag16 = Builder(name = "Tag16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.5f, 7.775f)
                lineTo(2.5f, 2.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(5.025f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.177f, 0.073f)
                lineToRelative(6.25f, 6.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, 0.354f)
                lineToRelative(-5.025f, 5.025f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.354f, 0.0f)
                lineToRelative(-6.25f, -6.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.073f, -0.177f)
                close()
                moveTo(1.0f, 7.775f)
                lineTo(1.0f, 2.75f)
                curveTo(1.0f, 1.784f, 1.784f, 1.0f, 2.75f, 1.0f)
                horizontalLineToRelative(5.025f)
                curveToRelative(0.464f, 0.0f, 0.91f, 0.184f, 1.238f, 0.513f)
                lineToRelative(6.25f, 6.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, 2.474f)
                lineToRelative(-5.026f, 5.026f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -2.474f, 0.0f)
                lineToRelative(-6.25f, -6.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 7.775f)
                close()
                moveTo(6.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _tag16!!
    }

private var _tag16: ImageVector? = null
