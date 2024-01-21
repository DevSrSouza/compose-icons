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

public val Octicons.Bold24: ImageVector
    get() {
        if (_bold24 != null) {
            return _bold24!!
        }
        _bold24 = Builder(name = "Bold24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(5.0f)
                arcToRelative(4.752f, 4.752f, 0.0f, false, true, 3.888f, 7.479f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 14.0f, 20.5f)
                lineTo(7.25f, 20.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                close()
                moveTo(8.5f, 13.0f)
                verticalLineToRelative(5.0f)
                lineTo(14.0f, 18.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                close()
                moveTo(8.5f, 10.5f)
                horizontalLineToRelative(3.751f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 12.25f, 6.0f)
                lineTo(8.5f, 6.0f)
                close()
            }
        }
        .build()
        return _bold24!!
    }

private var _bold24: ImageVector? = null
