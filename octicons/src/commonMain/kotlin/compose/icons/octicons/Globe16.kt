package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
                    pathFillType = EvenOdd) {
                moveTo(1.543f, 7.25f)
                horizontalLineToRelative(2.733f)
                curveToRelative(0.144f, -2.074f, 0.866f, -3.756f, 1.58f, -4.948f)
                curveToRelative(0.12f, -0.197f, 0.237f, -0.381f, 0.353f, -0.552f)
                arcToRelative(6.506f, 6.506f, 0.0f, false, false, -4.666f, 5.5f)
                close()
                moveTo(4.276f, 8.75f)
                lineTo(1.543f, 8.75f)
                arcToRelative(6.506f, 6.506f, 0.0f, false, false, 4.666f, 5.5f)
                arcToRelative(11.13f, 11.13f, 0.0f, false, true, -0.352f, -0.552f)
                curveToRelative(-0.715f, -1.192f, -1.437f, -2.874f, -1.581f, -4.948f)
                close()
                moveTo(5.78f, 8.75f)
                horizontalLineToRelative(4.44f)
                arcToRelative(9.637f, 9.637f, 0.0f, false, true, -1.363f, 4.177f)
                curveToRelative(-0.306f, 0.51f, -0.612f, 0.919f, -0.857f, 1.215f)
                arcToRelative(9.978f, 9.978f, 0.0f, false, true, -0.857f, -1.215f)
                arcTo(9.637f, 9.637f, 0.0f, false, true, 5.78f, 8.75f)
                close()
                moveTo(10.22f, 7.25f)
                lineTo(5.78f, 7.25f)
                arcToRelative(9.637f, 9.637f, 0.0f, false, true, 1.363f, -4.177f)
                curveToRelative(0.306f, -0.51f, 0.612f, -0.919f, 0.857f, -1.215f)
                curveToRelative(0.245f, 0.296f, 0.55f, 0.705f, 0.857f, 1.215f)
                arcTo(9.638f, 9.638f, 0.0f, false, true, 10.22f, 7.25f)
                close()
                moveTo(11.724f, 8.75f)
                curveToRelative(-0.144f, 2.074f, -0.866f, 3.756f, -1.58f, 4.948f)
                curveToRelative(-0.12f, 0.197f, -0.237f, 0.381f, -0.353f, 0.552f)
                arcToRelative(6.506f, 6.506f, 0.0f, false, false, 4.666f, -5.5f)
                horizontalLineToRelative(-2.733f)
                close()
                moveTo(14.457f, 7.25f)
                horizontalLineToRelative(-2.733f)
                curveToRelative(-0.144f, -2.074f, -0.866f, -3.756f, -1.58f, -4.948f)
                arcToRelative(11.738f, 11.738f, 0.0f, false, false, -0.353f, -0.552f)
                arcToRelative(6.506f, 6.506f, 0.0f, false, true, 4.666f, 5.5f)
                close()
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _globe16!!
    }

private var _globe16: ImageVector? = null
