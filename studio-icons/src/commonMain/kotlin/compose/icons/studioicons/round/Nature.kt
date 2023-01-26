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

public val RoundGroup.Nature: ImageVector
    get() {
        if (_nature != null) {
            return _nature!!
        }
        _nature = Builder(name = "Nature", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 16.12f)
                curveToRelative(3.37f, -0.4f, 6.01f, -3.19f, 6.16f, -6.64f)
                curveToRelative(0.17f, -3.87f, -3.02f, -7.25f, -6.89f, -7.31f)
                curveToRelative(-3.92f, -0.05f, -7.1f, 3.1f, -7.1f, 7.0f)
                curveToRelative(0.0f, 3.47f, 2.52f, 6.34f, 5.83f, 6.89f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.88f)
                close()
            }
        }
        .build()
        return _nature!!
    }

private var _nature: ImageVector? = null
