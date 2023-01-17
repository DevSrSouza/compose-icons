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

public val SimpleIcons.Kuula: ImageVector
    get() {
        if (_kuula != null) {
            return _kuula!!
        }
        _kuula = Builder(name = "Kuula", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.388f, 0.0f, 0.0f, 5.388f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.388f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.388f, 12.0f, -12.0f)
                reflectiveCurveTo(18.612f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 2.547f)
                arcTo(9.433f, 9.433f, 0.0f, false, true, 21.453f, 12.0f)
                arcTo(9.433f, 9.433f, 0.0f, false, true, 12.0f, 21.453f)
                arcTo(9.433f, 9.433f, 0.0f, false, true, 2.547f, 12.0f)
                arcTo(9.433f, 9.433f, 0.0f, false, true, 12.0f, 2.547f)
                close()
                moveTo(11.394f, 7.913f)
                lineTo(15.766f, 7.22f)
                lineTo(17.776f, 11.164f)
                lineTo(14.646f, 14.294f)
                lineTo(10.702f, 12.284f)
                close()
            }
        }
        .build()
        return _kuula!!
    }

private var _kuula: ImageVector? = null
