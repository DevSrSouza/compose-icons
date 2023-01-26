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

public val RoundGroup.PlayForWork: ImageVector
    get() {
        if (_playForWork != null) {
            return _playForWork!!
        }
        _playForWork = Builder(name = "PlayForWork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                verticalLineToRelative(4.59f)
                lineTo(8.71f, 10.59f)
                curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f)
                lineToRelative(3.29f, 3.29f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f)
                lineToRelative(3.29f, -3.29f)
                curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f)
                lineTo(13.0f, 10.59f)
                lineTo(13.0f, 6.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                close()
                moveTo(7.1f, 14.0f)
                curveToRelative(-0.61f, 0.0f, -1.11f, 0.55f, -0.99f, 1.15f)
                curveTo(6.65f, 17.91f, 9.08f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveToRelative(5.35f, -2.09f, 5.89f, -4.85f)
                curveToRelative(0.12f, -0.6f, -0.38f, -1.15f, -0.99f, -1.15f)
                curveToRelative(-0.49f, 0.0f, -0.88f, 0.35f, -0.98f, 0.83f)
                curveTo(15.53f, 16.64f, 13.93f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveToRelative(-3.53f, -1.36f, -3.91f, -3.17f)
                curveToRelative(-0.1f, -0.48f, -0.5f, -0.83f, -0.99f, -0.83f)
                close()
            }
        }
        .build()
        return _playForWork!!
    }

private var _playForWork: ImageVector? = null
