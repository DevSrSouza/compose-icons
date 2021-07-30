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

public val SimpleIcons.Coderwall: ImageVector
    get() {
        if (_coderwall != null) {
            return _coderwall!!
        }
        _coderwall = Builder(name = "Coderwall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.354f, 18.708f)
                curveToRelative(1.46f, 0.0f, 2.646f, 1.185f, 2.646f, 2.646f)
                curveTo(24.0f, 22.814f, 22.814f, 24.0f, 21.354f, 24.0f)
                reflectiveCurveToRelative(-2.646f, -1.186f, -2.646f, -2.646f)
                curveToRelative(0.0f, -1.458f, 1.185f, -2.646f, 2.646f, -2.646f)
                close()
                moveTo(12.0f, 9.354f)
                curveToRelative(1.46f, 0.0f, 2.646f, 1.186f, 2.646f, 2.646f)
                reflectiveCurveTo(13.46f, 14.646f, 12.0f, 14.646f)
                reflectiveCurveTo(9.354f, 13.46f, 9.354f, 12.0f)
                reflectiveCurveTo(10.54f, 9.354f, 12.0f, 9.354f)
                close()
                moveTo(21.354f, 9.354f)
                curveTo(22.814f, 9.354f, 24.0f, 10.54f, 24.0f, 12.0f)
                reflectiveCurveToRelative(-1.186f, 2.646f, -2.646f, 2.646f)
                reflectiveCurveTo(18.708f, 13.46f, 18.708f, 12.0f)
                reflectiveCurveToRelative(1.185f, -2.646f, 2.646f, -2.646f)
                close()
                moveTo(12.0f, 0.0f)
                curveToRelative(1.46f, 0.0f, 2.646f, 1.185f, 2.646f, 2.646f)
                curveToRelative(0.0f, 1.46f, -1.186f, 2.646f, -2.646f, 2.646f)
                reflectiveCurveTo(9.354f, 4.106f, 9.354f, 2.646f)
                reflectiveCurveTo(10.54f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(2.646f, 0.0f)
                curveToRelative(1.46f, 0.0f, 2.646f, 1.185f, 2.646f, 2.646f)
                curveToRelative(0.0f, 1.46f, -1.186f, 2.646f, -2.646f, 2.646f)
                reflectiveCurveTo(0.0f, 4.106f, 0.0f, 2.646f)
                reflectiveCurveTo(1.186f, 0.0f, 2.646f, 0.0f)
                close()
                moveTo(21.354f, 0.0f)
                curveTo(22.814f, 0.0f, 24.0f, 1.185f, 24.0f, 2.646f)
                curveToRelative(0.0f, 1.46f, -1.186f, 2.646f, -2.646f, 2.646f)
                reflectiveCurveToRelative(-2.646f, -1.186f, -2.646f, -2.646f)
                reflectiveCurveTo(19.893f, 0.0f, 21.354f, 0.0f)
                close()
            }
        }
        .build()
        return _coderwall!!
    }

private var _coderwall: ImageVector? = null
