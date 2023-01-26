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

public val OutlineGroup.SlowMotionVideo: ImageVector
    get() {
        if (_slowMotionVideo != null) {
            return _slowMotionVideo!!
        }
        _slowMotionVideo = Builder(name = "SlowMotionVideo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.05f, 9.79f)
                lineTo(10.0f, 7.5f)
                verticalLineToRelative(9.0f)
                lineToRelative(3.05f, -2.29f)
                lineTo(16.0f, 12.0f)
                lineToRelative(-2.95f, -2.21f)
                close()
                moveTo(13.05f, 9.79f)
                lineTo(10.0f, 7.5f)
                verticalLineToRelative(9.0f)
                lineToRelative(3.05f, -2.29f)
                lineTo(16.0f, 12.0f)
                lineToRelative(-2.95f, -2.21f)
                close()
                moveTo(13.05f, 9.79f)
                lineTo(10.0f, 7.5f)
                verticalLineToRelative(9.0f)
                lineToRelative(3.05f, -2.29f)
                lineTo(16.0f, 12.0f)
                lineToRelative(-2.95f, -2.21f)
                close()
                moveTo(11.0f, 4.07f)
                lineTo(11.0f, 2.05f)
                curveToRelative(-2.01f, 0.2f, -3.84f, 1.0f, -5.32f, 2.21f)
                lineTo(7.1f, 5.69f)
                curveToRelative(1.11f, -0.86f, 2.44f, -1.44f, 3.9f, -1.62f)
                close()
                moveTo(5.69f, 7.1f)
                lineTo(4.26f, 5.68f)
                curveTo(3.05f, 7.16f, 2.25f, 8.99f, 2.05f, 11.0f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.18f, -1.46f, 0.76f, -2.79f, 1.62f, -3.9f)
                close()
                moveTo(4.07f, 13.0f)
                lineTo(2.05f, 13.0f)
                curveToRelative(0.2f, 2.01f, 1.0f, 3.84f, 2.21f, 5.32f)
                lineToRelative(1.43f, -1.43f)
                curveToRelative(-0.86f, -1.1f, -1.44f, -2.43f, -1.62f, -3.89f)
                close()
                moveTo(5.68f, 19.74f)
                curveTo(7.16f, 20.95f, 9.0f, 21.75f, 11.0f, 21.95f)
                verticalLineToRelative(-2.02f)
                curveToRelative(-1.46f, -0.18f, -2.79f, -0.76f, -3.9f, -1.62f)
                lineToRelative(-1.42f, 1.43f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, 5.16f, -3.92f, 9.42f, -8.95f, 9.95f)
                verticalLineToRelative(-2.02f)
                curveTo(16.97f, 19.41f, 20.0f, 16.05f, 20.0f, 12.0f)
                reflectiveCurveToRelative(-3.03f, -7.41f, -6.95f, -7.93f)
                lineTo(13.05f, 2.05f)
                curveTo(18.08f, 2.58f, 22.0f, 6.84f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _slowMotionVideo!!
    }

private var _slowMotionVideo: ImageVector? = null
