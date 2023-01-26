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

public val BaselineGroup.Transcribe: ImageVector
    get() {
        if (_transcribe != null) {
            return _transcribe!!
        }
        _transcribe = Builder(name = "Transcribe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.93f, 16.0f)
                lineToRelative(1.63f, -1.63f)
                curveToRelative(-2.77f, -3.02f, -2.77f, -7.56f, 0.0f, -10.74f)
                lineTo(17.93f, 2.0f)
                curveTo(14.03f, 5.89f, 14.02f, 11.95f, 17.93f, 16.0f)
                close()
                moveTo(22.92f, 10.95f)
                curveToRelative(-0.84f, -1.18f, -0.84f, -2.71f, 0.0f, -3.89f)
                lineToRelative(-1.68f, -1.69f)
                curveToRelative(-2.02f, 2.02f, -2.02f, 5.07f, 0.0f, 7.27f)
                lineTo(22.92f, 10.95f)
                close()
                moveTo(9.0f, 13.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveTo(5.0f, 6.79f, 5.0f, 9.0f)
                curveTo(5.0f, 11.21f, 6.79f, 13.0f, 9.0f, 13.0f)
                close()
                moveTo(15.39f, 15.56f)
                curveTo(13.71f, 14.7f, 11.53f, 14.0f, 9.0f, 14.0f)
                curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f)
                curveTo(1.61f, 16.07f, 1.0f, 17.1f, 1.0f, 18.22f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.78f)
                curveTo(17.0f, 17.1f, 16.39f, 16.07f, 15.39f, 15.56f)
                close()
            }
        }
        .build()
        return _transcribe!!
    }

private var _transcribe: ImageVector? = null
