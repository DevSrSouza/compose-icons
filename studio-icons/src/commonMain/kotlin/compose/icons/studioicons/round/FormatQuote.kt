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

public val RoundGroup.FormatQuote: ImageVector
    get() {
        if (_formatQuote != null) {
            return _formatQuote!!
        }
        _formatQuote = Builder(name = "FormatQuote", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.17f, 17.0f)
                curveToRelative(0.51f, 0.0f, 0.98f, -0.29f, 1.2f, -0.74f)
                lineToRelative(1.42f, -2.84f)
                curveToRelative(0.14f, -0.28f, 0.21f, -0.58f, 0.21f, -0.89f)
                lineTo(10.0f, 8.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(5.0f, 7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-1.03f, 2.06f)
                curveToRelative(-0.45f, 0.89f, 0.2f, 1.94f, 1.2f, 1.94f)
                close()
                moveTo(17.17f, 17.0f)
                curveToRelative(0.51f, 0.0f, 0.98f, -0.29f, 1.2f, -0.74f)
                lineToRelative(1.42f, -2.84f)
                curveToRelative(0.14f, -0.28f, 0.21f, -0.58f, 0.21f, -0.89f)
                lineTo(20.0f, 8.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-1.03f, 2.06f)
                curveToRelative(-0.45f, 0.89f, 0.2f, 1.94f, 1.2f, 1.94f)
                close()
            }
        }
        .build()
        return _formatQuote!!
    }

private var _formatQuote: ImageVector? = null
