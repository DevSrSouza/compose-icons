package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Bookstack: ImageVector
    get() {
        if (_bookstack != null) {
            return _bookstack!!
        }
        _bookstack = Builder(name = "Bookstack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.3013f, 17.6146f)
                curveToRelative(-0.1299f, -0.3387f, -0.5228f, -1.5119f, -0.1337f, -2.4314f)
                lineToRelative(9.8273f, 5.6738f)
                arcToRelative(0.329f, 0.329f, 0.0f, false, false, 0.3299f, 0.0f)
                lineTo(24.0f, 12.9616f)
                verticalLineToRelative(2.3542f)
                lineToRelative(-13.8401f, 7.9906f)
                lineToRelative(-9.8586f, -5.6918f)
                close()
                moveTo(0.1911f, 8.9628f)
                curveToRelative(-0.2882f, 0.8769f, 0.0149f, 2.0581f, 0.1236f, 2.4261f)
                lineToRelative(9.8452f, 5.6841f)
                lineTo(24.0f, 9.0823f)
                lineTo(24.0f, 6.7275f)
                lineTo(10.3248f, 14.623f)
                arcToRelative(0.329f, 0.329f, 0.0f, false, true, -0.3299f, 0.0f)
                lineTo(0.1911f, 8.9628f)
                close()
                moveTo(13.3609f, 7.0267f)
                curveToRelative(-0.1819f, 0.1113f, -0.4394f, 0.0015f, -0.4852f, -0.2064f)
                lineToRelative(-0.2805f, -1.1336f)
                lineToRelative(-2.1254f, -0.1752f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, -0.1378f, -0.6145f)
                lineToRelative(5.5782f, -3.2207f)
                lineToRelative(-1.7021f, -0.9826f)
                lineTo(0.6979f, 8.4935f)
                lineToRelative(9.462f, 5.463f)
                lineToRelative(13.5104f, -7.8004f)
                lineToRelative(-4.401f, -2.5407f)
                lineToRelative(-5.9084f, 3.4113f)
                close()
                moveTo(13.1788f, 5.2981f)
                lineTo(13.4109f, 6.2361f)
                lineTo(18.6093f, 3.2347f)
                lineTo(16.5698f, 2.0572f)
                lineTo(11.5758f, 4.9406f)
                lineTo(12.8857f, 5.0486f)
                arcToRelative(0.3302f, 0.3302f, 0.0f, false, true, 0.2931f, 0.2495f)
                close()
                moveTo(24.0f, 9.845f)
                lineToRelative(-13.6752f, 7.8954f)
                arcToRelative(0.329f, 0.329f, 0.0f, false, true, -0.3299f, 0.0f)
                lineTo(0.1678f, 12.0667f)
                curveToRelative(-0.3891f, 0.919f, 0.003f, 2.0914f, 0.1332f, 2.4311f)
                lineToRelative(9.8589f, 5.692f)
                lineTo(24.0f, 12.1993f)
                lineTo(24.0f, 9.845f)
                close()
            }
        }
        .build()
        return _bookstack!!
    }

private var _bookstack: ImageVector? = null
