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

public val SimpleIcons.Sourcehut: ImageVector
    get() {
        if (_sourcehut != null) {
            return _sourcehut!!
        }
        _sourcehut = Builder(name = "Sourcehut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.371f, 0.0f, 0.0f, 5.371f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.371f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.371f, 12.0f, -12.0f)
                reflectiveCurveTo(18.629f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.677f)
                arcTo(9.675f, 9.675f, 0.0f, false, true, 2.323f, 12.0f)
                arcTo(9.675f, 9.675f, 0.0f, false, true, 12.0f, 2.323f)
                arcTo(9.675f, 9.675f, 0.0f, false, true, 21.677f, 12.0f)
                arcTo(9.675f, 9.675f, 0.0f, false, true, 12.0f, 21.677f)
                close()
            }
        }
        .build()
        return _sourcehut!!
    }

private var _sourcehut: ImageVector? = null
