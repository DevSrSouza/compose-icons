package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Vignette: ImageVector
    get() {
        if (_vignette != null) {
            return _vignette!!
        }
        _vignette = Builder(name = "Vignette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 3.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(22.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -2.69f, -8.0f, -6.0f)
                reflectiveCurveToRelative(3.58f, -6.0f, 8.0f, -6.0f)
                reflectiveCurveToRelative(8.0f, 2.69f, 8.0f, 6.0f)
                reflectiveCurveToRelative(-3.58f, 6.0f, -8.0f, 6.0f)
                close()
            }
        }
        .build()
        return _vignette!!
    }

private var _vignette: ImageVector? = null
