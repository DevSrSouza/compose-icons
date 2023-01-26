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

public val BaselineGroup.ThumbUpOffAlt: ImageVector
    get() {
        if (_thumbUpOffAlt != null) {
            return _thumbUpOffAlt!!
        }
        _thumbUpOffAlt = Builder(name = "ThumbUpOffAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.11f, 5.72f)
                lineToRelative(-0.57f, 2.89f)
                curveToRelative(-0.12f, 0.59f, 0.04f, 1.2f, 0.42f, 1.66f)
                curveToRelative(0.38f, 0.46f, 0.94f, 0.73f, 1.54f, 0.73f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(1.08f)
                lineTo(17.43f, 18.0f)
                horizontalLineTo(9.34f)
                curveToRelative(-0.18f, 0.0f, -0.34f, -0.16f, -0.34f, -0.34f)
                verticalLineTo(9.82f)
                lineToRelative(4.11f, -4.1f)
                moveTo(14.0f, 2.0f)
                lineTo(7.59f, 8.41f)
                curveTo(7.21f, 8.79f, 7.0f, 9.3f, 7.0f, 9.83f)
                verticalLineToRelative(7.83f)
                curveTo(7.0f, 18.95f, 8.05f, 20.0f, 9.34f, 20.0f)
                horizontalLineToRelative(8.1f)
                curveToRelative(0.71f, 0.0f, 1.36f, -0.37f, 1.72f, -0.97f)
                lineToRelative(2.67f, -6.15f)
                curveToRelative(0.11f, -0.25f, 0.17f, -0.52f, 0.17f, -0.8f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(0.92f, -4.65f)
                curveToRelative(0.05f, -0.22f, 0.02f, -0.46f, -0.08f, -0.66f)
                curveToRelative(-0.23f, -0.45f, -0.52f, -0.86f, -0.88f, -1.22f)
                lineTo(14.0f, 2.0f)
                close()
                moveTo(4.0f, 9.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _thumbUpOffAlt!!
    }

private var _thumbUpOffAlt: ImageVector? = null
