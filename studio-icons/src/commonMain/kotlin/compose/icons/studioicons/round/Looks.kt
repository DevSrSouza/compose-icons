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

public val RoundGroup.Looks: ImageVector
    get() {
        if (_looks != null) {
            return _looks!!
        }
        _looks = Builder(name = "Looks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveToRelative(-3.47f, 0.0f, -6.36f, 2.54f, -6.91f, 5.86f)
                curveToRelative(-0.1f, 0.6f, 0.39f, 1.14f, 1.0f, 1.14f)
                curveToRelative(0.49f, 0.0f, 0.9f, -0.36f, 0.98f, -0.85f)
                curveTo(7.48f, 13.79f, 9.53f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(4.52f, 1.79f, 4.93f, 4.15f)
                curveToRelative(0.08f, 0.49f, 0.49f, 0.85f, 0.98f, 0.85f)
                curveToRelative(0.61f, 0.0f, 1.09f, -0.54f, 0.99f, -1.14f)
                curveTo(18.36f, 12.54f, 15.47f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(6.3f, 6.0f, 1.61f, 10.34f, 1.05f, 15.9f)
                curveToRelative(-0.05f, 0.59f, 0.41f, 1.1f, 1.01f, 1.1f)
                curveToRelative(0.51f, 0.0f, 0.94f, -0.38f, 0.99f, -0.88f)
                curveTo(3.49f, 11.57f, 7.34f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveToRelative(8.51f, 3.57f, 8.96f, 8.12f)
                curveToRelative(0.05f, 0.5f, 0.48f, 0.88f, 0.99f, 0.88f)
                curveToRelative(0.59f, 0.0f, 1.06f, -0.51f, 1.0f, -1.1f)
                curveTo(22.39f, 10.34f, 17.7f, 6.0f, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _looks!!
    }

private var _looks: ImageVector? = null
