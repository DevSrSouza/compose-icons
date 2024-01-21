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

public val Octicons.Globe16: ImageVector
    get() {
        if (_globe16 != null) {
            return _globe16!!
        }
        _globe16 = Builder(name = "Globe16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(5.78f, 8.75f)
                arcToRelative(9.64f, 9.64f, 0.0f, false, false, 1.363f, 4.177f)
                curveToRelative(0.255f, 0.426f, 0.542f, 0.832f, 0.857f, 1.215f)
                curveToRelative(0.245f, -0.296f, 0.551f, -0.705f, 0.857f, -1.215f)
                arcTo(9.64f, 9.64f, 0.0f, false, false, 10.22f, 8.75f)
                close()
                moveTo(10.22f, 7.25f)
                arcToRelative(9.64f, 9.64f, 0.0f, false, false, -1.363f, -4.177f)
                curveToRelative(-0.307f, -0.51f, -0.612f, -0.919f, -0.857f, -1.215f)
                arcToRelative(9.927f, 9.927f, 0.0f, false, false, -0.857f, 1.215f)
                arcTo(9.64f, 9.64f, 0.0f, false, false, 5.78f, 7.25f)
                close()
                moveTo(4.276f, 8.75f)
                lineTo(1.543f, 8.75f)
                arcToRelative(6.507f, 6.507f, 0.0f, false, false, 4.666f, 5.5f)
                curveToRelative(-0.123f, -0.181f, -0.24f, -0.365f, -0.352f, -0.552f)
                curveToRelative(-0.715f, -1.192f, -1.437f, -2.874f, -1.581f, -4.948f)
                close()
                moveTo(1.543f, 7.25f)
                horizontalLineToRelative(2.733f)
                curveToRelative(0.144f, -2.074f, 0.866f, -3.756f, 1.58f, -4.948f)
                curveToRelative(0.12f, -0.197f, 0.237f, -0.381f, 0.353f, -0.552f)
                arcToRelative(6.507f, 6.507f, 0.0f, false, false, -4.666f, 5.5f)
                close()
                moveTo(11.724f, 8.75f)
                curveToRelative(-0.144f, 2.074f, -0.866f, 3.756f, -1.58f, 4.948f)
                curveToRelative(-0.12f, 0.197f, -0.237f, 0.381f, -0.353f, 0.552f)
                arcToRelative(6.507f, 6.507f, 0.0f, false, false, 4.666f, -5.5f)
                close()
                moveTo(14.457f, 7.25f)
                arcToRelative(6.507f, 6.507f, 0.0f, false, false, -4.666f, -5.5f)
                curveToRelative(0.123f, 0.181f, 0.24f, 0.365f, 0.353f, 0.552f)
                curveToRelative(0.714f, 1.192f, 1.436f, 2.874f, 1.58f, 4.948f)
                close()
            }
        }
        .build()
        return _globe16!!
    }

private var _globe16: ImageVector? = null
