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

public val RemixIcons.FingerprintLine: ImageVector
    get() {
        if (_fingerprintLine != null) {
            return _fingerprintLine!!
        }
        _fingerprintLine = Builder(name = "FingerprintLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 13.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.77f, -0.664f, 5.445f, -1.915f, 7.846f)
                lineToRelative(-0.227f, 0.42f)
                lineToRelative(-1.747f, -0.974f)
                curveToRelative(1.16f, -2.08f, 1.81f, -4.41f, 1.882f, -6.836f)
                lineTo(15.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(-0.005f, 0.379f)
                arcToRelative(12.941f, 12.941f, 0.0f, false, true, -2.691f, 7.549f)
                lineToRelative(-0.231f, 0.29f)
                lineToRelative(-1.55f, -1.264f)
                arcToRelative(10.944f, 10.944f, 0.0f, false, false, 2.471f, -6.588f)
                lineTo(11.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.235f, -0.82f, 4.344f, -2.271f, 5.977f)
                lineToRelative(-0.212f, 0.23f)
                lineToRelative(-1.448f, -1.38f)
                arcToRelative(6.969f, 6.969f, 0.0f, false, false, 1.925f, -4.524f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, -5.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, 9.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.698f, -0.202f, 3.37f, -0.597f, 4.99f)
                lineToRelative(-0.139f, 0.539f)
                lineToRelative(-1.93f, -0.526f)
                curveToRelative(0.392f, -1.437f, 0.613f, -2.922f, 0.658f, -4.435f)
                lineTo(19.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 7.808f, 5.394f)
                lineTo(6.383f, 3.968f)
                arcTo(8.962f, 8.962f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(4.968f, 5.383f)
                lineToRelative(1.426f, 1.425f)
                arcToRelative(6.966f, 6.966f, 0.0f, false, false, -1.39f, 3.951f)
                lineTo(5.0f, 11.0f)
                lineTo(5.004f, 13.0f)
                curveToRelative(0.0f, 1.12f, -0.264f, 2.203f, -0.762f, 3.177f)
                lineToRelative(-0.156f, 0.29f)
                lineToRelative(-1.737f, -0.992f)
                curveToRelative(0.38f, -0.665f, 0.602f, -1.407f, 0.646f, -2.183f)
                lineTo(3.004f, 13.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(8.94f, 8.94f, 0.0f, false, true, 1.964f, -5.617f)
                close()
            }
        }
        .build()
        return _fingerprintLine!!
    }

private var _fingerprintLine: ImageVector? = null
