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

public val RoundGroup.Park: ImageVector
    get() {
        if (_park != null) {
            return _park!!
        }
        _park = Builder(name = "Park", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.96f, 12.0f)
                horizontalLineToRelative(0.08f)
                curveToRelative(0.81f, 0.0f, 1.28f, -0.91f, 0.82f, -1.57f)
                lineToRelative(-5.08f, -7.25f)
                curveToRelative(-0.4f, -0.57f, -1.24f, -0.57f, -1.64f, 0.0f)
                lineTo(6.1f, 10.43f)
                curveTo(5.64f, 11.09f, 6.12f, 12.0f, 6.93f, 12.0f)
                horizontalLineToRelative(0.04f)
                lineToRelative(-2.9f, 4.46f)
                curveTo(3.63f, 17.12f, 4.11f, 18.0f, 4.91f, 18.0f)
                horizontalLineToRelative(5.08f)
                verticalLineToRelative(2.02f)
                curveToRelative(0.0f, 1.09f, 0.89f, 1.98f, 1.98f, 1.98f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.09f, 0.0f, 1.98f, -0.89f, 1.98f, -1.98f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(5.15f)
                curveToRelative(0.8f, 0.0f, 1.28f, -0.89f, 0.83f, -1.55f)
                lineTo(16.96f, 12.0f)
                close()
            }
        }
        .build()
        return _park!!
    }

private var _park: ImageVector? = null
