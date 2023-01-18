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

public val RemixIcons.ChatQuoteFill: ImageVector
    get() {
        if (_chatQuoteFill != null) {
            return _chatQuoteFill!!
        }
        _chatQuoteFill = Builder(name = "ChatQuoteFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(6.455f, 19.0f)
                lineTo(2.0f, 22.5f)
                lineTo(2.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(10.962f, 8.1f)
                lineToRelative(-0.447f, -0.688f)
                curveTo(8.728f, 8.187f, 7.5f, 9.755f, 7.5f, 11.505f)
                curveToRelative(0.0f, 0.995f, 0.277f, 1.609f, 0.792f, 2.156f)
                curveToRelative(0.324f, 0.344f, 0.837f, 0.589f, 1.374f, 0.589f)
                curveToRelative(0.966f, 0.0f, 1.75f, -0.784f, 1.75f, -1.75f)
                curveToRelative(0.0f, -0.92f, -0.711f, -1.661f, -1.614f, -1.745f)
                curveToRelative(-0.16f, -0.015f, -0.324f, -0.012f, -0.479f, 0.01f)
                verticalLineToRelative(-0.092f)
                curveToRelative(0.006f, -0.422f, 0.092f, -1.633f, 1.454f, -2.466f)
                lineToRelative(0.185f, -0.107f)
                lineToRelative(-0.447f, -0.688f)
                close()
                moveTo(15.515f, 7.412f)
                curveToRelative(-1.787f, 0.775f, -3.015f, 2.343f, -3.015f, 4.093f)
                curveToRelative(0.0f, 0.995f, 0.277f, 1.609f, 0.792f, 2.156f)
                curveToRelative(0.324f, 0.344f, 0.837f, 0.589f, 1.374f, 0.589f)
                curveToRelative(0.966f, 0.0f, 1.75f, -0.784f, 1.75f, -1.75f)
                curveToRelative(0.0f, -0.92f, -0.711f, -1.661f, -1.614f, -1.745f)
                curveToRelative(-0.16f, -0.015f, -0.324f, -0.012f, -0.479f, 0.01f)
                curveToRelative(0.0f, -0.313f, -0.029f, -1.762f, 1.639f, -2.665f)
                close()
            }
        }
        .build()
        return _chatQuoteFill!!
    }

private var _chatQuoteFill: ImageVector? = null
