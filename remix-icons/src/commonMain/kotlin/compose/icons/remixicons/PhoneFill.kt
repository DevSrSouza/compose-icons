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

public val RemixIcons.PhoneFill: ImageVector
    get() {
        if (_phoneFill != null) {
            return _phoneFill!!
        }
        _phoneFill = Builder(name = "PhoneFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.42f)
                verticalLineToRelative(3.536f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.93f, 0.998f)
                curveToRelative(-0.437f, 0.03f, -0.794f, 0.046f, -1.07f, 0.046f)
                curveToRelative(-8.837f, 0.0f, -16.0f, -7.163f, -16.0f, -16.0f)
                curveToRelative(0.0f, -0.276f, 0.015f, -0.633f, 0.046f, -1.07f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.044f, 3.0f)
                horizontalLineTo(7.58f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.498f, 0.45f)
                curveToRelative(0.023f, 0.23f, 0.044f, 0.413f, 0.064f, 0.552f)
                arcTo(13.901f, 13.901f, 0.0f, false, false, 9.35f, 8.003f)
                curveToRelative(0.095f, 0.2f, 0.033f, 0.439f, -0.147f, 0.567f)
                lineToRelative(-2.158f, 1.542f)
                arcToRelative(13.047f, 13.047f, 0.0f, false, false, 6.844f, 6.844f)
                lineToRelative(1.54f, -2.154f)
                arcToRelative(0.462f, 0.462f, 0.0f, false, true, 0.573f, -0.149f)
                arcToRelative(13.901f, 13.901f, 0.0f, false, false, 4.0f, 1.205f)
                curveToRelative(0.139f, 0.02f, 0.322f, 0.042f, 0.55f, 0.064f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.449f, 0.498f)
                close()
            }
        }
        .build()
        return _phoneFill!!
    }

private var _phoneFill: ImageVector? = null
