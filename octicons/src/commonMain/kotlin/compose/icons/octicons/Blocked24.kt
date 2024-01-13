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

public val Octicons.Blocked24: ImageVector
    get() {
        if (_blocked24 != null) {
            return _blocked24!!
        }
        _blocked24 = Builder(name = "Blocked24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.638f, 2.22f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.53f, -0.22f)
                horizontalLineToRelative(7.664f)
                curveToRelative(0.199f, 0.0f, 0.389f, 0.079f, 0.53f, 0.22f)
                lineToRelative(5.418f, 5.418f)
                curveToRelative(0.141f, 0.14f, 0.22f, 0.332f, 0.22f, 0.53f)
                verticalLineToRelative(7.664f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.22f, 0.53f)
                lineToRelative(-5.418f, 5.418f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.53f, 0.22f)
                horizontalLineTo(8.168f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.53f, -0.22f)
                lineToRelative(-5.42f, -5.418f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, -0.219f, -0.53f)
                verticalLineTo(8.168f)
                curveToRelative(0.0f, -0.199f, 0.079f, -0.389f, 0.22f, -0.53f)
                lineToRelative(5.418f, -5.42f)
                close()
                moveTo(8.48f, 3.5f)
                lineTo(3.5f, 8.48f)
                verticalLineToRelative(7.04f)
                lineToRelative(4.98f, 4.98f)
                horizontalLineToRelative(7.04f)
                lineToRelative(4.98f, -4.98f)
                verticalLineTo(8.48f)
                lineTo(15.52f, 3.5f)
                close()
                moveTo(7.0f, 11.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        .build()
        return _blocked24!!
    }

private var _blocked24: ImageVector? = null
