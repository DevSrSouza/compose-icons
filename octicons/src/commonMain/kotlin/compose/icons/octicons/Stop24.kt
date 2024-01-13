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

public val Octicons.Stop24: ImageVector
    get() {
        if (_stop24 != null) {
            return _stop24!!
        }
        _stop24 = Builder(name = "Stop24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-4.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 12.0f, 7.0f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.328f, 1.47f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.53f, -0.22f)
                horizontalLineToRelative(8.284f)
                curveToRelative(0.199f, 0.0f, 0.389f, 0.079f, 0.53f, 0.22f)
                lineToRelative(5.858f, 5.858f)
                curveToRelative(0.141f, 0.14f, 0.22f, 0.33f, 0.22f, 0.53f)
                verticalLineToRelative(8.284f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.22f, 0.53f)
                lineToRelative(-5.858f, 5.858f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.53f, 0.22f)
                lineTo(7.858f, 22.75f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.53f, -0.22f)
                lineTo(1.47f, 16.672f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.22f, -0.53f)
                lineTo(1.25f, 7.858f)
                curveToRelative(0.0f, -0.199f, 0.079f, -0.389f, 0.22f, -0.53f)
                close()
                moveTo(8.168f, 2.75f)
                lineTo(2.75f, 8.169f)
                verticalLineToRelative(7.662f)
                lineToRelative(5.419f, 5.419f)
                horizontalLineToRelative(7.662f)
                lineToRelative(5.419f, -5.418f)
                lineTo(21.25f, 8.168f)
                lineTo(15.832f, 2.75f)
                close()
            }
        }
        .build()
        return _stop24!!
    }

private var _stop24: ImageVector? = null
