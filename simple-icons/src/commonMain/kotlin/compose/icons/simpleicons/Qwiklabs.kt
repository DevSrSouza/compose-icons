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

public val SimpleIcons.Qwiklabs: ImageVector
    get() {
        if (_qwiklabs != null) {
            return _qwiklabs!!
        }
        _qwiklabs = Builder(name = "Qwiklabs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.346f, 18.205f)
                arcTo(6.464f, 6.464f, 0.0f, false, false, 12.0f, 5.72f)
                arcToRelative(6.462f, 6.462f, 0.0f, false, false, -2.346f, 12.485f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, 0.961f, -0.623f)
                verticalLineToRelative(-5.4f)
                arcToRelative(1.385f, 1.385f, 0.0f, true, true, 2.77f, 0.0f)
                verticalLineToRelative(5.4f)
                arcToRelative(0.692f, 0.692f, 0.0f, false, false, 0.961f, 0.623f)
                close()
                moveTo(15.155f, 23.763f)
                curveTo(20.252f, 22.378f, 24.0f, 17.718f, 24.0f, 12.182f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                reflectiveCurveToRelative(-12.0f, 5.373f, -12.0f, 12.0f)
                curveToRelative(0.0f, 5.536f, 3.748f, 10.196f, 8.845f, 11.581f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.049f, 0.013f)
                lineToRelative(0.059f, 0.016f)
                lineToRelative(0.001f, -0.002f)
                arcToRelative(1.385f, 1.385f, 0.0f, false, false, 0.635f, -2.695f)
                arcToRelative(9.231f, 9.231f, 0.0f, true, true, 4.824f, -0.001f)
                arcToRelative(1.385f, 1.385f, 0.0f, false, false, 0.635f, 2.695f)
                lineToRelative(0.001f, 0.002f)
                lineToRelative(0.059f, -0.016f)
                lineToRelative(0.049f, -0.013f)
                close()
            }
        }
        .build()
        return _qwiklabs!!
    }

private var _qwiklabs: ImageVector? = null
