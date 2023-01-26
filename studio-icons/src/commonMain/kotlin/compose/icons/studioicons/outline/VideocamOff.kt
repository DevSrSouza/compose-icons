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

public val OutlineGroup.VideocamOff: ImageVector
    get() {
        if (_videocamOff != null) {
            return _videocamOff!!
        }
        _videocamOff = Builder(name = "VideocamOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.56f, 8.0f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-4.15f, -4.14f)
                lineTo(2.0f, 3.27f)
                lineTo(4.73f, 6.0f)
                lineTo(4.0f, 6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.21f, 0.0f, 0.39f, -0.08f, 0.55f, -0.18f)
                lineTo(19.73f, 21.0f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-8.86f, -8.86f)
                lineTo(9.56f, 8.0f)
                close()
                moveTo(5.0f, 16.0f)
                lineTo(5.0f, 8.0f)
                horizontalLineToRelative(1.73f)
                lineToRelative(8.0f, 8.0f)
                lineTo(5.0f, 16.0f)
                close()
                moveTo(15.0f, 8.0f)
                verticalLineToRelative(2.61f)
                lineToRelative(6.0f, 6.0f)
                lineTo(21.0f, 6.5f)
                lineToRelative(-4.0f, 4.0f)
                lineTo(17.0f, 7.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-5.61f)
                lineToRelative(2.0f, 2.0f)
                lineTo(15.0f, 8.0f)
                close()
            }
        }
        .build()
        return _videocamOff!!
    }

private var _videocamOff: ImageVector? = null
