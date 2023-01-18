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

public val RemixIcons.MoreLine: ImageVector
    get() {
        if (_moreLine != null) {
            return _moreLine!!
        }
        _moreLine = Builder(name = "MoreLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 10.5f)
                curveToRelative(-0.825f, 0.0f, -1.5f, 0.675f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.675f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveTo(6.0f, 12.825f, 6.0f, 12.0f)
                reflectiveCurveToRelative(-0.675f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.5f, 10.5f)
                curveToRelative(-0.825f, 0.0f, -1.5f, 0.675f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.675f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveTo(21.0f, 12.825f, 21.0f, 12.0f)
                reflectiveCurveToRelative(-0.675f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(12.0f, 10.5f)
                curveToRelative(-0.825f, 0.0f, -1.5f, 0.675f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.675f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.675f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.675f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _moreLine!!
    }

private var _moreLine: ImageVector? = null
