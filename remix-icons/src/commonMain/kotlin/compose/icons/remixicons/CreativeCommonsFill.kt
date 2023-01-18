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

public val RemixIcons.CreativeCommonsFill: ImageVector
    get() {
        if (_creativeCommonsFill != null) {
            return _creativeCommonsFill!!
        }
        _creativeCommonsFill = Builder(name = "CreativeCommonsFill", defaultWidth = 24.0.dp,
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
                moveTo(9.0f, 8.0f)
                curveToRelative(-2.208f, 0.0f, -4.0f, 1.792f, -4.0f, 4.0f)
                arcToRelative(4.001f, 4.001f, 0.0f, false, false, 6.669f, 2.979f)
                lineToRelative(0.159f, -0.151f)
                lineToRelative(-1.414f, -1.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -0.125f, -2.943f)
                lineToRelative(0.126f, 0.116f)
                lineToRelative(1.414f, -1.414f)
                arcTo(3.988f, 3.988f, 0.0f, false, false, 9.0f, 8.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveToRelative(-2.208f, 0.0f, -4.0f, 1.792f, -4.0f, 4.0f)
                arcToRelative(4.001f, 4.001f, 0.0f, false, false, 6.669f, 2.979f)
                lineToRelative(0.159f, -0.151f)
                lineToRelative(-1.414f, -1.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -0.125f, -2.943f)
                lineToRelative(0.126f, 0.116f)
                lineToRelative(1.414f, -1.414f)
                arcTo(3.988f, 3.988f, 0.0f, false, false, 16.0f, 8.0f)
                close()
            }
        }
        .build()
        return _creativeCommonsFill!!
    }

private var _creativeCommonsFill: ImageVector? = null
