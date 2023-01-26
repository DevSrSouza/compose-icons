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

public val RoundGroup.SimCardDownload: ImageVector
    get() {
        if (_simCardDownload != null) {
            return _simCardDownload!!
        }
        _simCardDownload = Builder(name = "SimCardDownload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                horizontalLineToRelative(-7.17f)
                curveTo(10.3f, 2.0f, 9.79f, 2.21f, 9.41f, 2.59f)
                lineTo(4.59f, 7.41f)
                curveTo(4.21f, 7.79f, 4.0f, 8.3f, 4.0f, 8.83f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 2.9f, 19.1f, 2.0f, 18.0f, 2.0f)
                close()
                moveTo(11.65f, 16.65f)
                lineToRelative(-2.79f, -2.79f)
                curveTo(8.54f, 13.54f, 8.76f, 13.0f, 9.21f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(-2.99f)
                curveToRelative(0.0f, -0.55f, 0.44f, -0.99f, 0.99f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveTo(12.55f, 9.0f, 13.0f, 9.45f, 13.0f, 10.01f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(1.79f)
                curveToRelative(0.45f, 0.0f, 0.67f, 0.54f, 0.35f, 0.85f)
                lineToRelative(-2.79f, 2.79f)
                curveTo(12.16f, 16.84f, 11.84f, 16.84f, 11.65f, 16.65f)
                close()
            }
        }
        .build()
        return _simCardDownload!!
    }

private var _simCardDownload: ImageVector? = null
