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

public val Octicons.Alert24: ImageVector
    get() {
        if (_alert24 != null) {
            return _alert24!!
        }
        _alert24 = Builder(name = "Alert24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 17.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(12.75f, 9.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.836f, 3.244f)
                curveToRelative(0.963f, -1.665f, 3.365f, -1.665f, 4.328f, 0.0f)
                lineToRelative(8.967f, 15.504f)
                curveToRelative(0.963f, 1.667f, -0.24f, 3.752f, -2.165f, 3.752f)
                lineTo(3.034f, 22.5f)
                curveToRelative(-1.926f, 0.0f, -3.128f, -2.085f, -2.165f, -3.752f)
                close()
                moveTo(12.866f, 3.995f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, -1.732f, 0.0f)
                lineTo(2.168f, 19.499f)
                arcTo(1.002f, 1.002f, 0.0f, false, false, 3.034f, 21.0f)
                horizontalLineToRelative(17.932f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, 0.866f, -1.5f)
                lineTo(12.866f, 3.994f)
                close()
            }
        }
        .build()
        return _alert24!!
    }

private var _alert24: ImageVector? = null
