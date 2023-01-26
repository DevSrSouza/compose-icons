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

public val RoundGroup.Unsubscribe: ImageVector
    get() {
        if (_unsubscribe != null) {
            return _unsubscribe!!
        }
        _unsubscribe = Builder(name = "Unsubscribe", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 11.5f)
                curveToRelative(0.92f, 0.0f, 1.75f, 0.26f, 2.49f, 0.69f)
                lineTo(20.99f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -1.99f, -2.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.55f)
                curveToRelative(-0.02f, -0.17f, -0.05f, -0.33f, -0.05f, -0.5f)
                curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f)
                close()
                moveTo(12.89f, 10.05f)
                curveToRelative(-0.56f, 0.28f, -1.23f, 0.28f, -1.79f, 0.0f)
                lineToRelative(-5.61f, -2.8f)
                curveToRelative(-0.3f, -0.15f, -0.49f, -0.46f, -0.49f, -0.8f)
                curveToRelative(0.0f, -0.66f, 0.7f, -1.1f, 1.29f, -0.8f)
                lineTo(12.0f, 8.5f)
                lineToRelative(5.71f, -2.85f)
                curveToRelative(0.59f, -0.3f, 1.29f, 0.13f, 1.29f, 0.8f)
                curveToRelative(0.0f, 0.34f, -0.19f, 0.65f, -0.49f, 0.8f)
                lineToRelative(-5.62f, 2.8f)
                close()
                moveTo(18.5f, 13.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.5f, 16.5f)
                curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _unsubscribe!!
    }

private var _unsubscribe: ImageVector? = null
