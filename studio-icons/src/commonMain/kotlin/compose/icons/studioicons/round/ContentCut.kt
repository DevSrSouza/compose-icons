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

public val RoundGroup.ContentCut: ImageVector
    get() {
        if (_contentCut != null) {
            return _contentCut!!
        }
        _contentCut = Builder(name = "ContentCut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.64f, 7.64f)
                curveToRelative(0.29f, -0.62f, 0.42f, -1.33f, 0.34f, -2.09f)
                curveToRelative(-0.19f, -1.73f, -1.54f, -3.2f, -3.26f, -3.49f)
                curveToRelative(-2.77f, -0.48f, -5.14f, 1.89f, -4.66f, 4.65f)
                curveToRelative(0.3f, 1.72f, 1.76f, 3.07f, 3.49f, 3.26f)
                curveToRelative(0.76f, 0.08f, 1.46f, -0.05f, 2.09f, -0.34f)
                lineTo(10.0f, 12.0f)
                lineToRelative(-2.36f, 2.36f)
                curveToRelative(-0.62f, -0.29f, -1.33f, -0.42f, -2.09f, -0.34f)
                curveToRelative(-1.73f, 0.19f, -3.2f, 1.54f, -3.49f, 3.26f)
                curveToRelative(-0.48f, 2.77f, 1.89f, 5.13f, 4.65f, 4.65f)
                curveToRelative(1.72f, -0.3f, 3.07f, -1.76f, 3.26f, -3.49f)
                curveToRelative(0.08f, -0.76f, -0.05f, -1.46f, -0.34f, -2.09f)
                lineTo(12.0f, 14.0f)
                lineToRelative(7.59f, 7.59f)
                curveToRelative(0.89f, 0.89f, 2.41f, 0.26f, 2.41f, -1.0f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0.0f, -0.37f, -0.15f, -0.73f, -0.41f, -1.0f)
                lineTo(9.64f, 7.64f)
                close()
                moveTo(6.0f, 8.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.89f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(6.0f, 20.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.89f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(12.0f, 12.5f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(19.59f, 2.41f)
                lineTo(13.0f, 9.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(6.59f, -6.59f)
                curveToRelative(0.26f, -0.26f, 0.41f, -0.62f, 0.41f, -1.0f)
                lineTo(22.0f, 3.4f)
                curveToRelative(0.0f, -1.25f, -1.52f, -1.88f, -2.41f, -0.99f)
                close()
            }
        }
        .build()
        return _contentCut!!
    }

private var _contentCut: ImageVector? = null
