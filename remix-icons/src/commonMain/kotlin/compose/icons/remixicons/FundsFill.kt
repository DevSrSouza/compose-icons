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

public val RemixIcons.FundsFill: ImageVector
    get() {
        if (_fundsFill != null) {
            return _fundsFill!!
        }
        _fundsFill = Builder(name = "FundsFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.897f, 17.86f)
                lineToRelative(3.91f, -3.91f)
                lineToRelative(2.829f, 2.828f)
                lineToRelative(4.571f, -4.57f)
                lineTo(17.0f, 14.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(-3.157f, 3.157f)
                lineToRelative(-2.828f, -2.829f)
                lineToRelative(-4.946f, 4.946f)
                arcTo(9.965f, 9.965f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                arcToRelative(9.987f, 9.987f, 0.0f, false, true, -8.103f, -4.14f)
                close()
            }
        }
        .build()
        return _fundsFill!!
    }

private var _fundsFill: ImageVector? = null
