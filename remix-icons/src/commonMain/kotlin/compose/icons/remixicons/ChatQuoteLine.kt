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

public val RemixIcons.ChatQuoteLine: ImageVector
    get() {
        if (_chatQuoteLine != null) {
            return _chatQuoteLine!!
        }
        _chatQuoteLine = Builder(name = "ChatQuoteLine", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(20.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(13.385f)
                lineTo(5.763f, 17.0f)
                lineTo(20.0f, 17.0f)
                lineTo(20.0f, 5.0f)
                close()
                moveTo(10.515f, 7.412f)
                lineToRelative(0.447f, 0.688f)
                curveToRelative(-1.668f, 0.903f, -1.639f, 2.352f, -1.639f, 2.664f)
                curveToRelative(0.155f, -0.02f, 0.318f, -0.024f, 0.48f, -0.009f)
                curveToRelative(0.902f, 0.084f, 1.613f, 0.825f, 1.613f, 1.745f)
                curveToRelative(0.0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
                curveToRelative(-0.537f, 0.0f, -1.05f, -0.245f, -1.374f, -0.59f)
                curveToRelative(-0.515f, -0.546f, -0.792f, -1.16f, -0.792f, -2.155f)
                curveToRelative(0.0f, -1.75f, 1.228f, -3.318f, 3.015f, -4.093f)
                close()
                moveTo(15.515f, 7.412f)
                lineToRelative(0.447f, 0.688f)
                curveToRelative(-1.668f, 0.903f, -1.639f, 2.352f, -1.639f, 2.664f)
                curveToRelative(0.155f, -0.02f, 0.318f, -0.024f, 0.48f, -0.009f)
                curveToRelative(0.902f, 0.084f, 1.613f, 0.825f, 1.613f, 1.745f)
                curveToRelative(0.0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
                curveToRelative(-0.537f, 0.0f, -1.05f, -0.245f, -1.374f, -0.59f)
                curveToRelative(-0.515f, -0.546f, -0.792f, -1.16f, -0.792f, -2.155f)
                curveToRelative(0.0f, -1.75f, 1.228f, -3.318f, 3.015f, -4.093f)
                close()
            }
        }
        .build()
        return _chatQuoteLine!!
    }

private var _chatQuoteLine: ImageVector? = null
