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

public val Octicons.Stop16: ImageVector
    get() {
        if (_stop16 != null) {
            return _stop16!!
        }
        _stop16 = Builder(name = "Stop16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.47f, 0.22f)
                arcTo(0.749f, 0.749f, 0.0f, false, true, 5.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.199f, 0.0f, 0.389f, 0.079f, 0.53f, 0.22f)
                lineToRelative(4.25f, 4.25f)
                curveToRelative(0.141f, 0.14f, 0.22f, 0.331f, 0.22f, 0.53f)
                verticalLineToRelative(6.0f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.22f, 0.53f)
                lineToRelative(-4.25f, 4.25f)
                arcTo(0.749f, 0.749f, 0.0f, false, true, 11.0f, 16.0f)
                lineTo(5.0f, 16.0f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.53f, -0.22f)
                lineTo(0.22f, 11.53f)
                arcTo(0.749f, 0.749f, 0.0f, false, true, 0.0f, 11.0f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -0.199f, 0.079f, -0.389f, 0.22f, -0.53f)
                close()
                moveTo(5.31f, 1.5f)
                lineTo(1.5f, 5.31f)
                verticalLineToRelative(5.38f)
                lineToRelative(3.81f, 3.81f)
                horizontalLineToRelative(5.38f)
                lineToRelative(3.81f, -3.81f)
                lineTo(14.5f, 5.31f)
                lineTo(10.69f, 1.5f)
                close()
                moveTo(8.0f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-3.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 4.0f)
                close()
                moveTo(8.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _stop16!!
    }

private var _stop16: ImageVector? = null
