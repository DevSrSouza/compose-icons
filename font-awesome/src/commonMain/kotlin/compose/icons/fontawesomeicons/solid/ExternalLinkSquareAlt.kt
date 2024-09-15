package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ExternalLinkSquareAlt: ImageVector
    get() {
        if (_externalLinkSquareAlt != null) {
            return _externalLinkSquareAlt!!
        }
        _externalLinkSquareAlt = Builder(name = "ExternalLinkSquareAlt", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                lineTo(0.0f, 80.0f)
                curveToRelative(0.0f, -26.51f, 21.49f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, 21.49f, 48.0f, 48.0f)
                close()
                moveTo(360.0f, 96.0f)
                lineTo(248.03f, 96.0f)
                curveToRelative(-21.31f, 0.0f, -32.08f, 25.86f, -16.97f, 40.97f)
                lineToRelative(31.98f, 31.99f)
                lineTo(67.51f, 364.48f)
                curveToRelative(-4.69f, 4.69f, -4.69f, 12.28f, 0.0f, 16.97f)
                lineToRelative(31.03f, 31.03f)
                curveToRelative(4.69f, 4.69f, 12.28f, 4.69f, 16.97f, 0.0f)
                lineToRelative(195.53f, -195.53f)
                lineToRelative(31.99f, 31.99f)
                curveTo(358.06f, 263.98f, 384.0f, 253.43f, 384.0f, 231.98f)
                lineTo(384.0f, 120.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _externalLinkSquareAlt!!
    }

private var _externalLinkSquareAlt: ImageVector? = null
