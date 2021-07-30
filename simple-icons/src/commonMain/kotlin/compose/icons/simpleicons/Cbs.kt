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

public val SimpleIcons.Cbs: ImageVector
    get() {
        if (_cbs != null) {
            return _cbs!!
        }
        _cbs = Builder(name = "Cbs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.314f, 24.0f, 0.068f, 18.587f, 0.068f, 11.949f)
                curveTo(0.068f, 5.413f, 5.314f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(11.932f, 5.413f, 11.932f, 11.949f)
                curveTo(23.932f, 18.587f, 18.686f, 24.0f, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 18.894f)
                curveToRelative(5.452f, 0.0f, 9.36f, -3.473f, 11.109f, -6.945f)
                curveTo(21.875f, 9.294f, 18.172f, 5.106f, 12.0f, 5.106f)
                curveToRelative(-5.452f, 0.0f, -9.36f, 3.37f, -11.109f, 6.843f)
                curveTo(2.537f, 15.42f, 6.548f, 18.894f, 12.0f, 18.894f)
                close()
                moveTo(12.0f, 18.281f)
                curveToRelative(-3.497f, 0.0f, -6.377f, -2.86f, -6.377f, -6.332f)
                reflectiveCurveTo(8.503f, 5.617f, 12.0f, 5.617f)
                reflectiveCurveToRelative(6.377f, 2.86f, 6.377f, 6.332f)
                curveToRelative(0.0f, 3.574f, -2.88f, 6.332f, -6.377f, 6.332f)
                close()
            }
        }
        .build()
        return _cbs!!
    }

private var _cbs: ImageVector? = null
