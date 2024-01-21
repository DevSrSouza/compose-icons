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

public val Octicons.FeedRocket16: ImageVector
    get() {
        if (_feedRocket16 != null) {
            return _feedRocket16!!
        }
        _feedRocket16 = Builder(name = "FeedRocket16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(11.031f, 4.0f)
                arcToRelative(4.38f, 4.38f, 0.0f, false, false, -3.097f, 1.283f)
                lineToRelative(-0.23f, 0.229f)
                curveToRelative(-0.156f, 0.157f, -0.308f, 0.32f, -0.452f, 0.49f)
                lineTo(5.65f, 6.002f)
                arcToRelative(0.876f, 0.876f, 0.0f, false, false, -0.746f, 0.417f)
                lineToRelative(-0.856f, 1.388f)
                arcToRelative(0.377f, 0.377f, 0.0f, false, false, 0.21f, 0.556f)
                lineToRelative(1.552f, 0.477f)
                lineToRelative(1.35f, 1.35f)
                lineToRelative(0.478f, 1.553f)
                arcToRelative(0.374f, 0.374f, 0.0f, false, false, 0.555f, 0.21f)
                lineToRelative(1.389f, -0.855f)
                arcToRelative(0.876f, 0.876f, 0.0f, false, false, 0.416f, -0.746f)
                lineTo(9.998f, 8.747f)
                curveToRelative(0.17f, -0.144f, 0.333f, -0.295f, 0.49f, -0.452f)
                lineToRelative(0.23f, -0.23f)
                arcTo(4.379f, 4.379f, 0.0f, false, false, 12.0f, 4.969f)
                verticalLineToRelative(-0.093f)
                arcTo(0.876f, 0.876f, 0.0f, false, false, 11.124f, 4.0f)
                close()
                moveTo(5.924f, 11.144f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(0.809f, 0.809f, 0.0f, false, false, -1.33f, -0.881f)
                curveToRelative(-0.395f, 0.394f, -0.564f, 1.258f, -0.62f, 1.62f)
                arcToRelative(0.12f, 0.12f, 0.0f, false, false, 0.035f, 0.108f)
                arcToRelative(0.12f, 0.12f, 0.0f, false, false, 0.108f, 0.035f)
                curveToRelative(0.362f, -0.056f, 1.226f, -0.225f, 1.62f, -0.619f)
                arcToRelative(0.803f, 0.803f, 0.0f, false, false, 0.188f, -0.263f)
                close()
            }
        }
        .build()
        return _feedRocket16!!
    }

private var _feedRocket16: ImageVector? = null
