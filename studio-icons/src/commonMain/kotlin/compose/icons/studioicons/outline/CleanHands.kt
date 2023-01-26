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

public val OutlineGroup.CleanHands: ImageVector
    get() {
        if (_cleanHands != null) {
            return _cleanHands!!
        }
        _cleanHands = Builder(name = "CleanHands", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.99f, 5.0f)
                lineToRelative(0.63f, 1.37f)
                lineTo(18.99f, 7.0f)
                lineToRelative(-1.37f, 0.63f)
                lineTo(16.99f, 9.0f)
                lineToRelative(-0.63f, -1.37f)
                lineTo(14.99f, 7.0f)
                lineToRelative(1.37f, -0.63f)
                lineTo(16.99f, 5.0f)
                moveTo(20.0f, 14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, -2.0f, -4.0f, -2.0f, -4.0f)
                reflectiveCurveToRelative(-2.0f, 2.9f, -2.0f, 4.0f)
                curveTo(18.0f, 13.1f, 18.9f, 14.0f, 20.0f, 14.0f)
                close()
                moveTo(11.0f, 6.1f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.57f, 0.0f, 1.1f, 0.17f, 1.55f, 0.45f)
                lineToRelative(1.43f, -1.43f)
                curveTo(15.15f, 2.39f, 14.13f, 2.0f, 13.0f, 2.0f)
                curveToRelative(-1.47f, 0.0f, -5.44f, 0.0f, -5.5f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.11f)
                curveTo(7.22f, 6.48f, 5.8f, 7.79f, 5.25f, 9.5f)
                horizontalLineToRelative(2.16f)
                curveTo(7.94f, 8.61f, 8.89f, 8.0f, 10.0f, 8.0f)
                curveToRelative(1.62f, 0.0f, 2.94f, 1.29f, 2.99f, 2.9f)
                lineTo(15.0f, 11.65f)
                verticalLineTo(11.0f)
                curveTo(15.0f, 8.58f, 13.28f, 6.56f, 11.0f, 6.1f)
                close()
                moveTo(22.0f, 19.0f)
                verticalLineToRelative(1.0f)
                lineToRelative(-8.0f, 2.5f)
                lineToRelative(-7.0f, -1.94f)
                verticalLineTo(22.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(7.97f)
                lineToRelative(6.16f, 2.3f)
                curveTo(16.25f, 13.72f, 17.0f, 14.8f, 17.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                curveTo(20.66f, 16.0f, 22.0f, 17.34f, 22.0f, 19.0f)
                close()
                moveTo(5.0f, 20.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(19.9f, 18.57f)
                curveToRelative(-0.16f, -0.33f, -0.51f, -0.56f, -0.9f, -0.56f)
                horizontalLineToRelative(-5.35f)
                curveToRelative(-0.54f, 0.0f, -1.07f, -0.09f, -1.58f, -0.26f)
                lineToRelative(-2.38f, -0.79f)
                lineToRelative(0.63f, -1.9f)
                lineToRelative(2.38f, 0.79f)
                curveTo(13.01f, 15.95f, 15.0f, 16.0f, 15.0f, 16.0f)
                curveToRelative(0.0f, -0.37f, -0.23f, -0.7f, -0.57f, -0.83f)
                lineTo(8.61f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(5.48f)
                lineToRelative(6.97f, 1.93f)
                lineTo(19.9f, 18.57f)
                close()
            }
        }
        .build()
        return _cleanHands!!
    }

private var _cleanHands: ImageVector? = null
