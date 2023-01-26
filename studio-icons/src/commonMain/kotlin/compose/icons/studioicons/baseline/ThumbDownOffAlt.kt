package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.ThumbDownOffAlt: ImageVector
    get() {
        if (_thumbDownOffAlt != null) {
            return _thumbDownOffAlt!!
        }
        _thumbDownOffAlt = Builder(name = "ThumbDownOffAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.89f, 18.28f)
                lineToRelative(0.57f, -2.89f)
                curveToRelative(0.12f, -0.59f, -0.04f, -1.2f, -0.42f, -1.66f)
                curveToRelative(-0.38f, -0.46f, -0.94f, -0.73f, -1.54f, -0.73f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(-1.08f)
                lineTo(6.57f, 6.0f)
                horizontalLineToRelative(8.09f)
                curveToRelative(0.18f, 0.0f, 0.34f, 0.16f, 0.34f, 0.34f)
                verticalLineToRelative(7.84f)
                lineToRelative(-4.11f, 4.1f)
                moveTo(10.0f, 22.0f)
                lineToRelative(6.41f, -6.41f)
                curveToRelative(0.38f, -0.38f, 0.59f, -0.89f, 0.59f, -1.42f)
                lineTo(17.0f, 6.34f)
                curveTo(17.0f, 5.05f, 15.95f, 4.0f, 14.66f, 4.0f)
                horizontalLineToRelative(-8.1f)
                curveToRelative(-0.71f, 0.0f, -1.36f, 0.37f, -1.72f, 0.97f)
                lineToRelative(-2.67f, 6.15f)
                curveToRelative(-0.11f, 0.25f, -0.17f, 0.52f, -0.17f, 0.8f)
                lineTo(2.0f, 13.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(5.5f)
                lineToRelative(-0.92f, 4.65f)
                curveToRelative(-0.05f, 0.22f, -0.02f, 0.46f, 0.08f, 0.66f)
                curveToRelative(0.23f, 0.45f, 0.52f, 0.86f, 0.88f, 1.22f)
                lineTo(10.0f, 22.0f)
                close()
                moveTo(20.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                lineTo(22.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _thumbDownOffAlt!!
    }

private var _thumbDownOffAlt: ImageVector? = null
