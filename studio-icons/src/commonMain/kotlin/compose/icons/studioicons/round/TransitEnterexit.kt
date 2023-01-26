package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.TransitEnterexit: ImageVector
    get() {
        if (_transitEnterexit != null) {
            return _transitEnterexit!!
        }
        _transitEnterexit = Builder(name = "TransitEnterexit", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 18.0f)
                horizontalLineTo(8.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(9.5f)
                curveTo(6.0f, 8.67f, 6.67f, 8.0f, 7.5f, 8.0f)
                reflectiveCurveTo(9.0f, 8.67f, 9.0f, 9.5f)
                verticalLineToRelative(3.27f)
                lineTo(14.95f, 7.0f)
                curveToRelative(0.57f, -0.55f, 1.48f, -0.54f, 2.04f, 0.02f)
                reflectiveCurveToRelative(0.56f, 1.47f, 0.01f, 2.04f)
                lineTo(11.15f, 15.0f)
                horizontalLineToRelative(3.35f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _transitEnterexit!!
    }

private var _transitEnterexit: ImageVector? = null
