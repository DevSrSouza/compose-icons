package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Bedtime: ImageVector
    get() {
        if (_bedtime != null) {
            return _bedtime!!
        }
        _bedtime = Builder(name = "Bedtime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.27f, 4.49f)
                curveToRelative(-1.63f, 7.54f, 3.75f, 12.41f, 7.66f, 13.8f)
                curveTo(15.54f, 19.38f, 13.81f, 20.0f, 12.0f, 20.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                curveTo(4.0f, 8.55f, 6.2f, 5.6f, 9.27f, 4.49f)
                moveTo(11.99f, 2.01f)
                curveTo(6.4f, 2.01f, 2.0f, 6.54f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                curveToRelative(3.71f, 0.0f, 6.93f, -2.02f, 8.66f, -5.02f)
                curveToRelative(-7.51f, -0.25f, -12.09f, -8.43f, -8.32f, -14.97f)
                curveTo(12.22f, 2.01f, 12.11f, 2.01f, 11.99f, 2.01f)
                lineTo(11.99f, 2.01f)
                close()
            }
        }
        .build()
        return _bedtime!!
    }

private var _bedtime: ImageVector? = null
