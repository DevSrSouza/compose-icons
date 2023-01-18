package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.CameraLensFill: ImageVector
    get() {
        if (_cameraLensFill != null) {
            return _cameraLensFill!!
        }
        _cameraLensFill = Builder(name = "CameraLensFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.827f, 21.763f)
                lineTo(14.31f, 14.0f)
                lineToRelative(3.532f, 6.117f)
                arcTo(9.955f, 9.955f, 0.0f, false, true, 12.0f, 22.0f)
                curveToRelative(-0.746f, 0.0f, -1.473f, -0.082f, -2.173f, -0.237f)
                close()
                moveTo(7.89f, 21.12f)
                arcTo(10.028f, 10.028f, 0.0f, false, true, 2.458f, 15.0f)
                horizontalLineToRelative(8.965f)
                lineTo(7.89f, 21.119f)
                close()
                moveTo(2.05f, 13.0f)
                arcToRelative(9.964f, 9.964f, 0.0f, false, true, 2.583f, -7.761f)
                lineTo(9.112f, 13.0f)
                lineTo(2.05f, 13.0f)
                close()
                moveTo(6.159f, 3.883f)
                arcTo(9.955f, 9.955f, 0.0f, false, true, 12.0f, 2.0f)
                curveToRelative(0.746f, 0.0f, 1.473f, 0.082f, 2.173f, 0.237f)
                lineTo(9.69f, 10.0f)
                lineTo(6.159f, 3.883f)
                close()
                moveTo(16.11f, 2.88f)
                arcTo(10.028f, 10.028f, 0.0f, false, true, 21.542f, 9.0f)
                horizontalLineToRelative(-8.965f)
                lineToRelative(3.533f, -6.119f)
                close()
                moveTo(21.95f, 11.0f)
                arcToRelative(9.964f, 9.964f, 0.0f, false, true, -2.583f, 7.761f)
                lineTo(14.888f, 11.0f)
                horizontalLineToRelative(7.064f)
                close()
            }
        }
        .build()
        return _cameraLensFill!!
    }

private var _cameraLensFill: ImageVector? = null
