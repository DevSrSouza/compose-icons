package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.CreativeCommonsLine: ImageVector
    get() {
        if (_creativeCommonsLine != null) {
            return _creativeCommonsLine!!
        }
        _creativeCommonsLine = Builder(name = "CreativeCommonsLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(9.0f, 8.0f)
                curveToRelative(1.105f, 0.0f, 2.105f, 0.448f, 2.829f, 1.173f)
                lineToRelative(-1.414f, 1.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -0.001f, 2.828f)
                lineToRelative(1.414f, 1.413f)
                arcTo(4.001f, 4.001f, 0.0f, false, true, 5.0f, 12.0f)
                curveToRelative(0.0f, -2.208f, 1.792f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveToRelative(1.105f, 0.0f, 2.105f, 0.448f, 2.829f, 1.173f)
                lineToRelative(-1.414f, 1.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -0.001f, 2.828f)
                lineToRelative(1.414f, 1.413f)
                arcTo(4.001f, 4.001f, 0.0f, false, true, 12.0f, 12.0f)
                curveToRelative(0.0f, -2.208f, 1.792f, -4.0f, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _creativeCommonsLine!!
    }

private var _creativeCommonsLine: ImageVector? = null
