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

public val SolidGroup.Boxes: ImageVector
    get() {
        if (_boxes != null) {
            return _boxes!!
        }
        _boxes = Builder(name = "Boxes", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(560.0f, 288.0f)
                horizontalLineToRelative(-80.0f)
                verticalLineToRelative(96.0f)
                lineToRelative(-32.0f, -21.3f)
                lineToRelative(-32.0f, 21.3f)
                verticalLineToRelative(-96.0f)
                horizontalLineToRelative(-80.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(192.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(224.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(576.0f, 304.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(176.0f, 224.0f)
                horizontalLineToRelative(224.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(416.0f, 16.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-80.0f)
                verticalLineToRelative(96.0f)
                lineToRelative(-32.0f, -21.3f)
                lineTo(256.0f, 96.0f)
                lineTo(256.0f, 0.0f)
                horizontalLineToRelative(-80.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(192.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                close()
                moveTo(240.0f, 288.0f)
                horizontalLineToRelative(-80.0f)
                verticalLineToRelative(96.0f)
                lineToRelative(-32.0f, -21.3f)
                lineTo(96.0f, 384.0f)
                verticalLineToRelative(-96.0f)
                lineTo(16.0f, 288.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(192.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(224.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(256.0f, 304.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _boxes!!
    }

private var _boxes: ImageVector? = null
